// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.analytics;

import android.util.Log;

class e implements b
{
    private int a;
    
    e() {
        this.a = 2;
    }
    
    private String c(final String s) {
        return Thread.currentThread().toString() + ": " + s;
    }
    
    @Override
    public void a(final String s) {
        if (this.a <= 0) {
            Log.v("GAV4", this.c(s));
        }
    }
    
    @Override
    public void b(final String s) {
        if (this.a <= 3) {
            Log.e("GAV4", this.c(s));
        }
    }
}
