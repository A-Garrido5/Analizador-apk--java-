// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import com.twitter.util.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

final class o
{
    public final TextView a;
    public final ViewGroup b;
    public long c;
    public int d;
    
    public o(final View view) {
        this.a = (TextView)view.findViewById(2131886239);
        this.b = (ViewGroup)view.findViewById(2131886238);
        if (this.b != null) {
            com.twitter.util.a.a((View)this.b, 4);
        }
    }
    
    public static View a(final LayoutInflater layoutInflater, final View$OnClickListener onClickListener, final int n) {
        final View inflate = layoutInflater.inflate(n, (ViewGroup)null);
        inflate.setTag((Object)new o(inflate));
        inflate.setOnClickListener(onClickListener);
        return inflate;
    }
    
    public static void a(final View view, final int n, final long c, final int d) {
        final o o = (o)view.getTag();
        o.c = c;
        o.d = d;
    }
}
