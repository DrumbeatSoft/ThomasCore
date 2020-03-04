package com.thomas.core.component;

import com.thomas.core.BaseApplication;
import com.thomas.core.utils.ProcessUtils;
import com.thomas.core.utils.Utils;

import java.util.List;

/**
 * 组件化开发使用的Application，各个组件module可以实现必要的组件初始化
 */
public abstract class ComponentApplication extends BaseApplication {

    private List<ModuleConfig> mModules;

    @Override
    public void onCreate() {
        super.onCreate();
        if (ProcessUtils.isMainProcess()) {
            modulesApplicationInit();
        }
    }


    /**
     * 组件化开发中各个模块中需要进行初始化的操作
     */
    protected void modulesApplicationInit() {
        //用反射, 将 AndroidManifest.xml 中带有 ConfigModule 标签的 class 转成对象集合（List<ConfigModule>）
        mModules = new ManifestParser(Utils.getApp()).parse();
        //遍历之前获得的集合, 执行每一个 ConfigModule 实现类的某些方法
        for (ModuleConfig module : mModules) {
            module.onCreate(Utils.getApp());
        }
    }
}
