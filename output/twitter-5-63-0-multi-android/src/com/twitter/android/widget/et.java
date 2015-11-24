// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.util.collection.i;
import android.widget.BaseAdapter;

public class et extends cv
{
    public et(final BaseAdapter baseAdapter, final BaseAdapter baseAdapter2, final int n) {
        super(baseAdapter, baseAdapter2, n);
    }
    
    @Override
    protected int a() {
        final int count = this.b.getCount();
        if (this.c.getCount() > 0 && count != 0 && count > this.a) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public i c(final int n) {
        final int count = this.b.getCount();
        if (count <= 0) {
            return new i(this.c, n);
        }
        final int count2 = this.c.getCount();
        final int min = Math.min(count, this.a);
        if (n < min || count2 == 0) {
            return new i(this.b, n);
        }
        if (n == min + count2) {
            return null;
        }
        if (n == min || n < min + count2) {
            return new i(this.c, n - min);
        }
        return new i(this.b, -1 + (n - count2));
    }
}
