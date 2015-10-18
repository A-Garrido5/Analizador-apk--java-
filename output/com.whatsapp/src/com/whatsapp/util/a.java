// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.os.Process;

class a implements Runnable
{
    final Runnable a;
    final a_ b;
    
    a(final a_ b, final Runnable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
