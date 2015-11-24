// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.notification.w;

class a9c implements Runnable
{
    final HomeActivity a;
    
    a9c(final HomeActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (HomeActivity.h(this.a) == 0) {
            w.b().c();
        }
    }
}
