package com.thomas.core.demo.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.thomas.core.ui.BaseFragment;

/**
 * @author Thomas
 * @describe
 * @date 2019/10/8
 * @updatelog
 * @since
 */
public abstract class BaseDemoFragment extends BaseFragment {
    @Override
    public boolean isNeedRegister() {
        return false;
    }

    @Override
    public boolean isTransparent() {
        return false;
    }


}
