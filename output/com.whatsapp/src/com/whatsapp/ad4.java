// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Process;

class ad4 implements Runnable
{
    final Runnable a;
    final aa4 b;
    
    ad4(final aa4 b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        Process.setThreadPriority(9);
        this.a.run();
    }
}
