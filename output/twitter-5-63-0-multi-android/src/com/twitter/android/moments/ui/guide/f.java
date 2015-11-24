// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import java.util.List;
import android.widget.BaseAdapter;

abstract class f extends BaseAdapter
{
    private final List a;
    
    public f(final List a) {
        this.a = a;
    }
    
    public int getCount() {
        return this.a.size();
    }
    
    public Object getItem(final int n) {
        return this.a.get(n);
    }
    
    public long getItemId(final int n) {
        return n;
    }
}
