package com.luxiaochun.recyclerviewhelper.cell;

import com.example.jun.jiuzhou.R;
import com.example.jun.jiuzhou.RVUtils.base.RVBaseViewHolder;


/**
 * ProjectName: JiuZhou
 * Author: jun
 * Date: 2018-01-10 16:06
 */
public class LoadingCell extends RVAbsStateCell {
    public static int DefaultResId = R.layout.rv_loading_layout;

    public LoadingCell(Object o) {
        super(o);
    }

    @Override
    public void setCustomView(int resId) {
        DefaultResId = resId;
    }


    @Override
    public int getItemType() {
        return DefaultResId;
    }

    @Override
    public void bindViewHolder(RVBaseViewHolder holder, int position) {

    }


}
