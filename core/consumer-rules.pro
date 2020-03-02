# 保持mvp不被混淆
-keep public class * implements com.thomas.core.mvp.IBaseMvpModel
-keep public class * implements com.thomas.core.mvp.IBaseMvpView
-keep public class * extends com.thomas.core.mvp.BaseMvpPresenter
-keep class com.thomas.core.**{*;}