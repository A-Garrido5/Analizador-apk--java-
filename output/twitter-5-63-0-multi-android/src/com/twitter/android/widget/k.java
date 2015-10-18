// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.database.DataSetObserver;
import android.widget.BaseAdapter;

public class k extends cv
{
    public k(final BaseAdapter baseAdapter, final BaseAdapter baseAdapter2) {
        super(baseAdapter, baseAdapter2, baseAdapter.getCount());
        baseAdapter.registerDataSetObserver((DataSetObserver)new l(this));
    }
    
    @Override
    protected int a() {
        final int count = this.b.getCount();
        if (this.c.getCount() > 0 && count > 0) {
            return 1;
        }
        return 0;
    }
}
