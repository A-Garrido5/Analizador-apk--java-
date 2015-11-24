// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import com.twitter.library.api.moments.Moment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.android.moments.viewmodels.Capsule;
import android.content.Context;
import com.twitter.android.moments.ui.sectionpager.d;

class l implements d
{
    private final Context a;
    private final Capsule b;
    
    l(final Context a, final Capsule b) {
        this.a = a;
        this.b = b;
    }
    
    public View a() {
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(this.a).inflate(2130968887, (ViewGroup)null, false);
        final g g = new g(viewGroup);
        final Moment a = this.b.a();
        g.a().setText((CharSequence)this.b.a().b);
        g.b().setText((CharSequence)a.h);
        g.c().setText((CharSequence)"Starts at 9 PM");
        return (View)viewGroup;
    }
    
    @Override
    public void c() {
    }
}
