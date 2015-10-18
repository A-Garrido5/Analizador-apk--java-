// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import android.view.View;
import java.util.Iterator;
import android.net.Uri;
import java.util.List;

class ll extends mn
{
    public ll(final List list) {
        super(list);
    }
    
    @Override
    int a() {
        return 2130968867;
    }
    
    public gm a(final Uri uri) {
        for (final gm gm : this.a) {
            if (gm.c != null && gm.c.equals((Object)uri)) {
                return gm;
            }
        }
        return null;
    }
    
    @Override
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        int b;
        if (this.a.get(n).j) {
            b = 2;
        }
        else {
            b = 1;
        }
        this.b = b;
        return super.getView(n, view, viewGroup);
    }
}
