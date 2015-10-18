// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;

class a9o implements Runnable
{
    final fk a;
    
    a9o(final fk a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (Build$VERSION.SDK_INT >= 21) {
            this.a.a.a.getWindow().setStatusBarColor(0);
        }
        this.a.a.a.finish();
    }
}
