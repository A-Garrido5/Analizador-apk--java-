// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;

class als implements Runnable
{
    final a28 a;
    
    als(final a28 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        pr.b(this.a.c).removeMessages(1);
        a8s.a(new jl(this.a.c, this.a.b, this.a.c.a, this.a.a), new Object[0]);
    }
}
