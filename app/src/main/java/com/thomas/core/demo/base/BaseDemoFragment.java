package com.thomas.core.demo.base;

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
