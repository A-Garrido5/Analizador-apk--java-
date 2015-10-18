// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

class a6 implements Runnable
{
    final PopupNotification a;
    
    a6(final PopupNotification a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (PopupNotification.h(this.a) != null && PopupNotification.h(this.a).isHeld()) {
            PopupNotification.h(this.a).release();
        }
    }
}
