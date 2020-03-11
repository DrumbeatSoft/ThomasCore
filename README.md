# ThomasCore
[![](https://jitpack.io/v/ithomasoft/ThomasCore.svg)](https://jitpack.io/#ithomasoft/ThomasCore)
## Android开发基础工具类
* 封装常见的utils和base基类以及mvp模式的核心代码。
* fragment懒加载基类(ViewPager+Fragment)。
* 修复Android 9 以上 无法访问HTTP请求。
* 新增任务执行队列(常见逻辑：登录完成后才能进行收藏操作)。
* 提高开发效率。
* 本库采用Androidx支持库。
* 感谢AndroidUtilCode。
## 怎么使用
1. Add it in your root `build.gradle` at the end of repositories:

	`` 
	maven { url 'https://jitpack.io' }
    ``
2. Add the dependency in your module  `build.gradle`
    > 请把{$latestVersion}替换成上面的标签中所示版本


    `` 
    implementation 'com.github.ithomasoft:ThomasCore:{$latestVersion}'
    ``

