// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.bo;
import android.view.ViewGroup;
import android.view.View;
import android.content.Intent;
import android.widget.ListAdapter;
import android.content.Context;
import com.twitter.android.widget.ct;

class an extends ct
{
    private final sy b;
    private final sy c;
    
    public an(final Context context, final am am) {
        super((ListAdapter)am, 3);
        this.b = new sy(context.getString(2131296729), null);
        this.c = new sy(context.getString(2131297030), null);
    }
    
    @Override
    protected View a(final View view, final ViewGroup viewGroup) {
        return sz.a(2130969099, view, viewGroup, this.b, bo.a);
    }
    
    @Override
    protected Object a() {
        return this.b;
    }
    
    @Override
    protected View b(final View view, final ViewGroup viewGroup) {
        return sz.a(2130969099, view, viewGroup, this.c, bo.a);
    }
    
    @Override
    protected Object b() {
        return this.c;
    }
}
