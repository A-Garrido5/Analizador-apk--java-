// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.TimerTask;

public class e extends TimerTask
{
    n9 a;
    
    public e(final n9 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (n9.a(this.a)) {
            return;
        }
        n9.b(this.a);
    }
}
