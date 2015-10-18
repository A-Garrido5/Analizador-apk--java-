// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.os.Process;

class cd implements Runnable
{
    final p a;
    final Runnable b;
    
    cd(final p a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        Process.setThreadPriority(10);
        this.b.run();
    }
}
