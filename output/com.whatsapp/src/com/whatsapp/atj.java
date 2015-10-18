// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Process;

final class atj extends Thread
{
    private atj() {
    }
    
    atj(final j5 j5) {
        this();
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000L);
                Process.killProcess(Process.myPid());
            }
            catch (InterruptedException ex) {
                continue;
            }
            break;
        }
    }
}
