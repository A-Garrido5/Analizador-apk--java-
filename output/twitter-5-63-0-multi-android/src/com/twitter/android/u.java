// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import com.twitter.util.a;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;

class u
{
    public final ViewGroup a;
    public final ImageView b;
    public final TextView c;
    public final View d;
    public long e;
    public int f;
    
    public u(final View view) {
        this.b = (ImageView)view.findViewById(2131886127);
        this.d = view.findViewById(2131886236);
        this.c = (TextView)view.findViewById(2131886237);
        this.a = (ViewGroup)view.findViewById(2131886238);
        if (this.a != null) {
            com.twitter.util.a.a((View)this.a, 4);
        }
    }
    
    public static View a(final LayoutInflater layoutInflater, final View$OnClickListener onClickListener, final int n) {
        final View inflate = layoutInflater.inflate(n, (ViewGroup)null);
        inflate.setTag((Object)new u(inflate));
        inflate.setOnClickListener(onClickListener);
        return inflate;
    }
    
    public static void a(final View view, final int imageResource, final long e, final int f) {
        final u u = (u)view.getTag();
        u.b.setImageResource(imageResource);
        u.e = e;
        u.f = f;
    }
}
