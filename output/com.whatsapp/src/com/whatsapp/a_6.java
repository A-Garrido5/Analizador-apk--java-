// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class a_6 implements Runnable
{
    final vw a;
    
    a_6(final vw a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        App.d(this.a.a);
        while (true) {
            try {
                Thread.sleep(300L);
                SettingsChat.a(this.a.b).post((Runnable)new aqn(this));
            }
            catch (InterruptedException ex) {
                continue;
            }
            break;
        }
    }
}
