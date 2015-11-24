// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.CountDownTimer;

class ari extends CountDownTimer
{
    final String a;
    final WebSessionsActivity b;
    
    ari(final WebSessionsActivity b, final long n, final long n2, final String a) {
        this.b = b;
        this.a = a;
        super(n, n2);
    }
    
    public void onFinish() {
        l7.h(this.a);
        WebSessionsActivity.b(this.b).remove(this.a);
        WebSessionsActivity.c(this.b).a(l7.z());
    }
    
    public void onTick(final long n) {
    }
}
