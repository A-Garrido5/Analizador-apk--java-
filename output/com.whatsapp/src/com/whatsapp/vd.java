// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;

class vd implements Runnable
{
    final ar6 a;
    final ArrayList b;
    
    vd(final ar6 a, final ArrayList b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (!this.a.a.isCancelled()) {
            ListChatInfo.a(this.a.a.a, this.b);
        }
    }
}
