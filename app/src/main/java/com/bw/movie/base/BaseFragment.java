package com.bw.movie.base;
/*
 *@auther:史陆杰
 *@Date: 2020/5/17
 *@Time:17:48
 *@Description:${DESCRIPTION}
 **/


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment<P extends BasePresenter> extends Fragment {
    public boolean mViewInflateFinished;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View inflate =  inflater.inflate(layoutId(), container, false);
        initView(inflate);
        mViewInflateFinished = true;
        doNetWork();
        return inflate;
    }

    protected abstract void initView(View inflate);
    protected abstract int layoutId();
    protected abstract void initData();
    private void doNetWork(){
        if(getUserVisibleHint()){
            initData();
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (mViewInflateFinished && isVisibleToUser) {
            initData();
        }
    }
}
