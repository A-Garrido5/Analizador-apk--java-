// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.Bitmap;

class aqb implements Runnable
{
    final c5 a;
    final Bitmap b;
    
    aqb(final c5 a, final Bitmap b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (!this.a.isCancelled()) {
            this.a.a.a(this.b, 2130837601, 2131623951);
        }
    }
}
