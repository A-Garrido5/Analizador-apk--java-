// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.util.r;

class j implements r
{
    private final LayoutInflater a;
    private final ViewGroup b;
    private final CharSequence c;
    private View d;
    
    public j(final LayoutInflater a, final ViewGroup b, final CharSequence c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public View a() {
        if (this.d == null) {
            final ViewGroup d = (ViewGroup)this.a.inflate(2130968897, this.b, false);
            ((TextView)d.findViewById(2131886950)).setText(this.c);
            this.d = (View)d;
        }
        return this.d;
    }
}
