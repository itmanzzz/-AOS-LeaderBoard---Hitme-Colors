package com.f5live.projtemplate.feature.home.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.f5live.projtemplate.R;
import com.f5live.projtemplate.common.base.BaseActivity;
import com.f5live.projtemplate.databinding.AActivityHomeBinding;
import com.f5live.projtemplate.feature.home.presenter.HomeViewPersenterImpl;
import com.f5live.projtemplate.feature.home.presenter.HomeViewPresenter;

public class HomeActivity extends BaseActivity implements HomeView {

    private AActivityHomeBinding mRootView;
    private HomeViewPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mRootView = DataBindingUtil.setContentView(this, R.layout.a_activity_home);
        this.mPresenter = new HomeViewPersenterImpl(this, this);
    }

    private void initViews() {
        // TODO - Initializing your views
    }

    @Override
    public void onShowLoading() {
        super.showLoading();
    }

    @Override
    public void onDismissLoading() {
        super.dismissLoading();
    }

    @Override
    public void onShowMsgError(String msg) {
        super.showDialogError(msg);
    }
}
