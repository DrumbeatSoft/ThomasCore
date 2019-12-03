package com.thomas.core.demo.base;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.thomas.core.demo.R;
import com.thomas.core.ui.BaseActivity;
import com.thomas.core.utils.ActivityUtils;
import com.thomas.core.utils.BarUtils;

/**
 * @author Thomas
 * @describe 继承了Core里的BaseActivity，实现统一的一些方法
 * @date 2019/10/8
 * @updatelog
 * @since 1.0.0
 */
public abstract class BaseDemoActivity extends BaseActivity {
    @Override
    protected boolean isNeedAdapt() {
        return false;
    }

    @Override
    protected int setAdaptScreen() {
        return 0;
    }

    @Override
    public boolean isNeedRegister() {
        return false;
    }

    @Override
    public boolean isTransparent() {
        return true;
    }


    @Override
    public void initStatusBar() {
        super.initStatusBar();
        BarUtils.setStatusBarLightMode(mActivity,true);
        BarUtils.setStatusBarColor(this, ContextCompat.getColor(mActivity, R.color.colorPrimary),true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            ActivityUtils.finishActivity(mActivity);
        }
        return super.onOptionsItemSelected(item);
    }

}
