// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.sectionpager;

import java.util.Iterator;
import android.view.View;
import java.util.List;

public class c
{
    private final List a;
    private final d b;
    private View c;
    
    public c(final List a, final d b) {
        this.a = a;
        this.b = b;
        final Iterator<b> iterator = a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this);
        }
    }
    
    public View a() {
        return this.c = (View)this.b.b();
    }
    
    public View b() {
        return this.c;
    }
    
    public void c() {
        this.b.c();
        this.c = null;
    }
    
    public List d() {
        return this.a;
    }
}
