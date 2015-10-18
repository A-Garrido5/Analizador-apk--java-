// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

public class sz
{
    public final TextView a;
    public final TextView b;
    public final TextView c;
    
    public sz(final View view) {
        this.a = (TextView)view.findViewById(2131886291);
        this.b = (TextView)view.findViewById(2131886391);
        this.c = (TextView)view.findViewById(2131886578);
    }
    
    public static View a(final int n, View a, final ViewGroup viewGroup, final sy sy, final float n2) {
        if (a == null) {
            a = a(n, viewGroup, n2);
        }
        a(a, sy);
        return a;
    }
    
    public static View a(final int n, final ViewGroup viewGroup, final float n2) {
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(n, viewGroup, false);
        final sz tag = new sz(inflate);
        inflate.setTag((Object)tag);
        if (n2 > 0.0f) {
            tag.a.setTextSize(0, n2);
        }
        return inflate;
    }
    
    public static void a(final View view, final sy sy) {
        final sz sz = (sz)view.getTag();
        sz.a.setText((CharSequence)sy.b);
        if (sz.c != null) {
            final int a = sy.a;
            if (a <= 0) {
                sz.c.setVisibility(8);
                return;
            }
            sz.c.setText((CharSequence)String.valueOf(a));
            sz.c.setVisibility(0);
        }
    }
}
