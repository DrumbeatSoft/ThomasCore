package com.thomas.core.demo.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<List<String>> mTexts;

    public DashboardViewModel() {
        mTexts = new MutableLiveData<>();
        List<String> mTitles = new ArrayList<>();
        mTitles.add("ActivityUtils");
        mTitles.add("AdaptScreenUtils");
        mTitles.add("AppUtils");
        mTitles.add("BarUtils");
        mTitles.add("BrightnessUtils");
        mTitles.add("ClickUtils");
        mTitles.add("DeviceUtils");
        mTitles.add("FlashlightUtils");
        mTitles.add("KeyboardUtils");
        mTitles.add("LogUtils");
        mTitles.add("MetaDataUtils");
        mTitles.add("NetworkUtils");
        mTitles.add("PathUtils");
        mTitles.add("PermissionUtils");
        mTitles.add("PhoneUtils");
        mTitles.add("ResourceUtils");
        mTitles.add("RomUtils");
        mTitles.add("ScreenUtils");
        mTitles.add("SPUtils");
        mTitles.add("SpanUtils");
        mTitles.add("ToastUtils");
        mTitles.add("VibrateUtils");
        mTexts.setValue(mTitles);
    }

    public LiveData<List<String>> getTexts() {
        return mTexts;
    }
}