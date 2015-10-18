// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.ViewGroup;
import android.view.View;
import android.widget.BaseAdapter;

public class fb extends BaseAdapter
{
    private final View a;
    
    public fb(final View a) {
        this.a = a;
    }
    
    public int getCount() {
        if (this.a != null) {
            return 1;
        }
        return 0;
    }
    
    public Object getItem(final int n) {
        return this.a;
    }
    
    public long getItemId(final int n) {
        return 0L;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        return this.a;
    }
}
