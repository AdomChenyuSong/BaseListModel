package com.example.qqweq.baselistmodel;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import com.example.qqweq.baselistmodel.base.BaseListFragment;
import com.example.qqweq.baselistmodel.bean.FinishedDataBean;
import com.example.qqweq.baselistmodel.connection.BaseListProvider;
import com.example.qqweq.baselistmodel.connection.DefaultListProvider;
import com.example.qqweq.baselistmodel.connection.MyProvider;
import com.zhy.adapter.recyclerview.CommonAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

/**
 * Created by benben on 2017/8/6.
 */

public class ChatListFragment extends BaseListFragment {
    private MyProvider myProvider;

    public static ChatListFragment newInstance() {
        ChatListFragment chatMessageFragment = new ChatListFragment();
        return chatMessageFragment;
    }

    @Override
    public RecyclerView.Adapter createAdapter() {
        return new MyAdapter(getContext(), R.layout.scolleraty, (DefaultListProvider) getProvider());
    }

    @Override
    public BaseListProvider createProvider() {
        myProvider = new MyProvider();
        return myProvider;
    }

    public class MyAdapter extends CommonAdapter<FinishedDataBean> {

        public MyAdapter(Context context, int layoutId, DefaultListProvider defaultListProvider) {
            super(context, layoutId, defaultListProvider.getData());
        }

        @Override
        protected void convert(ViewHolder holder, FinishedDataBean bean, int position) {
            holder.setText(R.id.button1, bean.getStartTime()+"");
        }
    }
}
