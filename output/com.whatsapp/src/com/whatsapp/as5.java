// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;

class as5 implements Runnable
{
    final w3 a;
    
    as5(final w3 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!this.a.b.isCancelled()) {
            a8s.a(this.a.b, new Void[0]);
            if (!App.I) {
                return;
            }
        }
        this.a.b.a(t8.CANCEL);
    }
}
