package com.thomas.core.demo.ui.notifications;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.thomas.core.demo.R;
import com.thomas.core.demo.base.BaseDemoFragment;
import com.thomas.core.utils.LogUtils;

public class NotificationsFragment extends BaseDemoFragment {

    private NotificationsViewModel notificationsViewModel;
    private TextView textView;

    @Override
    public void initData(@Nullable Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.fragment_notifications;
    }

    @Override
    public void initView(@Nullable Bundle savedInstanceState, @Nullable View contentView) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        textView = findViewById(R.id.text_notifications);
        notificationsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
    }


    @Override
    public void doBusiness() {
        LogUtils.e(getClass().getSimpleName()+"可见");
    }

    @Override
    public void onThomasClick(@NonNull View view) {

    }
}