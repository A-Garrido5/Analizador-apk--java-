// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.App;
import com.whatsapp.a_9;

class p implements Runnable
{
    final String a;
    final AndroidWear b;
    final a_9 c;
    
    p(final AndroidWear b, final a_9 c, final String a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void run() {
        App.a(this.c, this.a);
        App.a(this.c, false, true);
        App.a(false, true, true, true);
    }
}
