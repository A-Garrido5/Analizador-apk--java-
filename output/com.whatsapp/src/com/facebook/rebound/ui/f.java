// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound.ui;

import com.facebook.rebound.o;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

class f implements AdapterView$OnItemSelectedListener
{
    final SpringConfiguratorView a;
    
    private f(final SpringConfiguratorView a) {
        this.a = a;
    }
    
    f(final SpringConfiguratorView springConfiguratorView, final e e) {
        this(springConfiguratorView);
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        SpringConfiguratorView.a(this.a, SpringConfiguratorView.g(this.a).get(n));
        SpringConfiguratorView.b(this.a, SpringConfiguratorView.j(this.a));
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
}
