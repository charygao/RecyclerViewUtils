package com.luxiaochun.recyclerviewhelper.cell;

import com.example.jun.jiuzhou.R;
import com.example.jun.jiuzhou.RVUtils.base.RVBaseViewHolder;


/**
 * ProjectName: JiuZhou
 * Author: jun
 * Date: 2018-01-10 16:06
 */
public class LoadMoreCell extends RVAbsStateCell {
    public static int DefaultResId = R.layout.rv_load_more_layout;
    public LoadMoreCell(Object o) {
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
