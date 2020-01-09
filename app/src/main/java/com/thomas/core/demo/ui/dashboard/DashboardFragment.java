package com.thomas.core.demo.ui.dashboard;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.ViewModelProviders;

import com.thomas.core.demo.R;
import com.thomas.core.demo.base.BaseDemoFragment;
import com.thomas.core.demo.ui.demo.ActivityDemoActivity;
import com.thomas.core.demo.ui.demo.AdaptDemoActivity;
import com.thomas.core.demo.ui.demo.AppDemoActivity;
import com.thomas.core.demo.ui.demo.VibrateDemoActivity;
import com.thomas.core.utils.ActivityUtils;
import com.thomas.core.utils.ToastUtils;

public class DashboardFragment extends BaseDemoFragment {

    private DashboardViewModel dashboardViewModel;
    private AppCompatButton btnActivity, btnAdapt, btnApp, btnBar, btnBrightness,
            btnClick, btnDevice, btnFlashlight, btnKeyboard, btnLog,
            btnMetaData, btnNetwork, btnPath, btnPermission, btnPhone, btnResource, btnRom,
            btnScreen, btnSP, btnSpan, btnToast, btnVibrate;


    @Override
    public void initData(@Nullable Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_dashboard;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState, @Nullable View contentView) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        btnActivity = findViewById(R.id.btn_activity);
        btnAdapt = findViewById(R.id.btn_adapt_screen);
        btnApp = findViewById(R.id.btn_app);
        btnBar = findViewById(R.id.btn_bar);
        btnBrightness = findViewById(R.id.btn_brightness);
        btnClick = findViewById(R.id.btn_click);
        btnDevice = findViewById(R.id.btn_device);
        btnFlashlight = findViewById(R.id.btn_flashlight);
        btnKeyboard = findViewById(R.id.btn_keyboard);
        btnLog = findViewById(R.id.btn_log);
        btnMetaData = findViewById(R.id.btn_meta_data);
        btnNetwork = findViewById(R.id.btn_network);
        btnPath = findViewById(R.id.btn_path);
        btnPermission = findViewById(R.id.btn_permission);
        btnPhone = findViewById(R.id.btn_phone);
        btnResource = findViewById(R.id.btn_resource);
        btnRom = findViewById(R.id.btn_rom);
        btnScreen = findViewById(R.id.btn_screen);
        btnSP = findViewById(R.id.btn_sp);
        btnSpan = findViewById(R.id.btn_span);
        btnToast = findViewById(R.id.btn_toast);
        btnVibrate = findViewById(R.id.btn_vibrate);
        applyThomasClickListener(btnActivity, btnAdapt, btnApp, btnBar, btnBrightness,
                btnClick, btnDevice, btnFlashlight, btnKeyboard, btnLog,
                btnMetaData, btnNetwork, btnPath, btnPermission, btnPhone, btnResource, btnRom,
                btnScreen, btnSP, btnSpan, btnToast, btnVibrate);

        dashboardViewModel.getTexts().observe(this, titles -> {
            btnActivity.setText(titles.get(0));
            btnAdapt.setText(titles.get(1));
            btnApp.setText(titles.get(2));
            btnBar.setText(titles.get(3));
            btnBrightness.setText(titles.get(4));
            btnClick.setText(titles.get(5));
            btnDevice.setText(titles.get(6));
            btnFlashlight.setText(titles.get(7));
            btnKeyboard.setText(titles.get(8));
            btnLog.setText(titles.get(9));
            btnMetaData.setText(titles.get(10));
            btnNetwork.setText(titles.get(11));
            btnPath.setText(titles.get(12));
            btnPermission.setText(titles.get(13));
            btnPhone.setText(titles.get(14));
            btnResource.setText(titles.get(15));
            btnRom.setText(titles.get(16));
            btnScreen.setText(titles.get(17));
            btnSP.setText(titles.get(18));
            btnSpan.setText(titles.get(19));
            btnToast.setText(titles.get(20));
            btnVibrate.setText(titles.get(21));
        });
    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onThomasClick(@NonNull View view) {
        int clickId = view.getId();
        switch (clickId) {
            case R.id.btn_activity:
                ActivityUtils.startActivity(ActivityDemoActivity.class);
                break;
            case R.id.btn_adapt_screen:
                ActivityUtils.startActivity(AdaptDemoActivity.class);
                break;
            case R.id.btn_app:
                ActivityUtils.startActivity(AppDemoActivity.class);
                break;

            case R.id.btn_vibrate:
                ActivityUtils.startActivity(VibrateDemoActivity.class);
                break;
            default:
                ToastUtils.showLong("待完善");
        }
    }
}