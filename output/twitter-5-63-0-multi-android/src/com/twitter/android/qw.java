// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.RadioButton;
import android.view.View;
import com.twitter.internal.android.widget.DockLayout;
import android.content.res.Resources;
import android.view.View$OnClickListener;

class qw implements View$OnClickListener, rc
{
    private final Resources a;
    private final DockLayout b;
    private final View c;
    private final RadioButton d;
    private final SearchFragment e;
    private final boolean f;
    private final boolean g;
    
    public qw(final Resources a, final DockLayout b, final View c, final RadioButton d, final SearchFragment e, final boolean f, final boolean g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.d.setOnClickListener((View$OnClickListener)this);
    }
    
    public void a() {
        if (this.f) {
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            return;
        }
        if (this.g) {
            this.e.S();
            return;
        }
        this.d.setText((CharSequence)this.a.getQuantityString(2131427339, 0, new Object[] { 0 }));
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.e.R();
    }
    
    public void a(final int n) {
        if (this.f) {
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 2130839141);
        }
        else if (this.g) {
            this.e.S();
        }
        else {
            this.d.setText((CharSequence)this.a.getQuantityString(2131427339, n, new Object[] { n }));
            this.d.setVisibility(0);
            this.c.setVisibility(0);
            this.e.S();
        }
        this.b.b();
    }
    
    public void onClick(final View view) {
        this.e.r();
    }
}
