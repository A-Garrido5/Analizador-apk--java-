// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.App;
import com.whatsapp.a_9;

class aq implements Runnable
{
    final a_9 a;
    final AndroidWear b;
    
    aq(final AndroidWear b, final a_9 a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        App.a(this.a, false, true);
        App.a(false, true, true, true);
    }
}
