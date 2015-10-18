// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

public abstract class cv extends da
{
    protected cx m;
    
    @Override
    public void a(final qp qp) {
        if (this.m != null) {
            for (int i = 0; i < this.m.a(); ++i) {
                this.m.a(i).a(qp);
            }
        }
    }
    
    protected final boolean a(final cv cv) {
        if (this.m == null || this.m.b()) {
            return cv.m == null || cv.m.b();
        }
        return this.m.equals(cv.m);
    }
    
    @Override
    protected int c() {
        int i = 0;
        int n;
        if (this.m != null) {
            n = 0;
            while (i < this.m.a()) {
                n += this.m.a(i).a();
                ++i;
            }
        }
        else {
            n = 0;
        }
        return n;
    }
    
    protected final int d() {
        if (this.m == null || this.m.b()) {
            return 0;
        }
        return this.m.hashCode();
    }
}
