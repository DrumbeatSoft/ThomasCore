package com.thomas.core.demo.ui.demo;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;

import com.thomas.core.demo.R;
import com.thomas.core.demo.base.BaseDemoActivity;
import com.thomas.core.utils.BarUtils;
import com.thomas.core.utils.VibrateUtils;

public class VibrateDemoActivity extends BaseDemoActivity {
    Group groupCode;

    @Override
    public void initData(@Nullable Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_vibrate_demo;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState, @Nullable View contentView) {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        BarUtils.setStatusBarLightMode(this, false);

        groupCode = findViewById(R.id.group_code);
        applyThomasClickListener(findViewById(R.id.btn_vibrate_default), findViewById(R.id.btn_vibrate_custom), findViewById(R.id.btn_vibrate_cancel), findViewById(R.id.fab));
    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onThomasClick(@NonNull View view) {
        int clickId = view.getId();
        if (clickId == R.id.btn_vibrate_default) {
            VibrateUtils.vibrate(1000);
        }
        if (clickId == R.id.btn_vibrate_custom) {
            VibrateUtils.vibrate(new long[]{0, 100, 2000, 100}, 1);
        }
        if (clickId == R.id.btn_vibrate_cancel) {
            VibrateUtils.cancel();
        }
        if (clickId == R.id.fab) {
            if (groupCode.getVisibility() == View.VISIBLE) {
                groupCode.setVisibility(View.GONE);
            } else {
                groupCode.setVisibility(View.VISIBLE);
            }
        }
    }
}
