package com.example.qqweq.baselistmodel.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by qqweq on 2018/5/3.
 */

public abstract class BaseFragment extends Fragment {
    public abstract void fvb(View view);

    public abstract void init();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        if (view != null) {
            fvb(view);
        }
        init();
    }
}
