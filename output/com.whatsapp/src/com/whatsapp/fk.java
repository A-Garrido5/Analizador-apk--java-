// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Handler;

class fk implements Runnable
{
    final aac a;
    
    fk(final aac a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        new Handler().postDelayed((Runnable)new a9o(this), 60L);
    }
}
