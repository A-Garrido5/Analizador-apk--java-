// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.sectionpager;

import com.twitter.util.r;

public class b
{
    private final r a;
    private c b;
    private a c;
    
    public b(final r a) {
        this.a = a;
    }
    
    public a a() {
        return this.c = (a)this.a.b();
    }
    
    public void a(final c b) {
        this.b = b;
    }
    
    public a b() {
        return this.c;
    }
    
    public void c() {
        if (this.c != null) {
            this.c.d();
            this.c = null;
        }
    }
    
    public c d() {
        return this.b;
    }
}
