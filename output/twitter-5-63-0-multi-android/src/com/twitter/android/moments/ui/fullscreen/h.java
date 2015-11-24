// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import com.twitter.android.moments.viewmodels.MomentPage;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Context;
import android.widget.ProgressBar;
import android.view.ViewGroup;
import com.twitter.android.moments.viewmodels.HydratableMomentPage;
import com.twitter.util.n;
import com.twitter.android.moments.ui.sectionpager.a;

public class h implements a, n
{
    private final com.twitter.android.moments.ui.fullscreen.a a;
    private final HydratableMomentPage b;
    private final ViewGroup c;
    private final ProgressBar d;
    private a e;
    private boolean f;
    
    h(final com.twitter.android.moments.ui.fullscreen.a a, final HydratableMomentPage b, final ViewGroup c, final ProgressBar d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        b.a(this);
    }
    
    public static h a(final Context context, final com.twitter.android.moments.ui.fullscreen.a a, final HydratableMomentPage hydratableMomentPage) {
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(context).inflate(2130968890, (ViewGroup)null, false);
        return new h(a, hydratableMomentPage, viewGroup, (ProgressBar)viewGroup.findViewById(2131886418));
    }
    
    @Override
    public View a() {
        return (View)this.c;
    }
    
    @Override
    public void a(final float n) {
        if (this.e != null) {
            this.e.a(n);
        }
    }
    
    public void a(final HydratableMomentPage hydratableMomentPage) {
        this.e = this.a.b(this.b);
        this.c.addView(this.e.a());
        this.d.setVisibility(8);
        if (this.f) {
            this.e.b();
        }
    }
    
    @Override
    public void b() {
        this.f = true;
        if (this.e != null) {
            this.e.b();
        }
    }
    
    @Override
    public void c() {
        this.f = false;
        if (this.e != null) {
            this.e.c();
        }
    }
    
    @Override
    public void d() {
        if (this.e != null) {
            this.e.d();
        }
        this.b.b(this);
    }
}
