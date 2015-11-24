// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound.ui;

import com.facebook.rebound.m;
import com.facebook.rebound.j;

class b implements j
{
    final SpringConfiguratorView a;
    
    private b(final SpringConfiguratorView a) {
        this.a = a;
    }
    
    b(final SpringConfiguratorView springConfiguratorView, final e e) {
        this(springConfiguratorView);
    }
    
    @Override
    public void a(final m m) {
        final float n = (float)m.e();
        final float f = SpringConfiguratorView.f(this.a);
        this.a.setTranslationY(f + n * (SpringConfiguratorView.h(this.a) - f));
    }
    
    @Override
    public void b(final m m) {
    }
    
    @Override
    public void c(final m m) {
    }
    
    @Override
    public void d(final m m) {
    }
}
