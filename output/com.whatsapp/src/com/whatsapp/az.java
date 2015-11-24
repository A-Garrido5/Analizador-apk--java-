// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;

class az implements Runnable
{
    final ArrayList a;
    final ah0 b;
    
    az(final ah0 b, final ArrayList a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!this.b.isCancelled()) {
            GroupChatInfo.b(this.b.a, this.a);
        }
    }
}
