// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

class az extends ay
{
    private static final Object a;
    private static az k;
    private w b;
    private volatile v c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private x i;
    private boolean j;
    
    static {
        a = new Object();
    }
    
    private az() {
        this.d = 1800000;
        this.e = true;
        this.f = false;
        this.g = true;
        this.h = true;
        this.i = new ba(this);
        this.j = false;
    }
    
    public static az b() {
        if (az.k == null) {
            az.k = new az();
        }
        return az.k;
    }
    
    public void a() {
        synchronized (this) {
            if (!this.f) {
                z.d("Dispatch call queued. Dispatch will run once initialization is complete.");
                this.e = true;
            }
            else {
                this.c.a(new bb(this));
            }
        }
    }
}
