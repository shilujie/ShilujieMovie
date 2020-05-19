package com.bw.movie.base;
/*
 *@auther:史陆杰
 *@Date: 2020/5/17
 *@Time:17:48
 *@Description:${DESCRIPTION}
 **/


public abstract class BasePresenter<V> {
    protected V view;

    public BasePresenter() {
        initModel();
    }

    public void detach() {
        view = null;
    }

    public void attach(V view) {
        this.view = view;
    }

    protected abstract void initModel();
}
