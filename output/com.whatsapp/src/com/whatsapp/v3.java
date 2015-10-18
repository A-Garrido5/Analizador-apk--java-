// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class v3 implements Runnable
{
    final DialogToastActivity$ProgressDialogFragment a;
    final a6_ b;
    
    v3(final a6_ b, final DialogToastActivity$ProgressDialogFragment a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final long currentTimeMillis = System.currentTimeMillis();
        App.ak.t();
        final long n = System.currentTimeMillis() - currentTimeMillis;
        while (true) {
            if (n >= 3000L) {
                break Label_0036;
            }
            final long n2 = 3000L - n;
            try {
                Thread.sleep(n2);
                App.aq.a5().post((Runnable)new ze(this));
            }
            catch (InterruptedException ex) {
                Log.b(ex);
                continue;
            }
            break;
        }
    }
}
