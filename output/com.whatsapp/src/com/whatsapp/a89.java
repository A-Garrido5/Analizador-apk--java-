// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.os.Message;
import android.os.Handler;

class a89 extends Handler
{
    final vy a;
    
    a89(final vy a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        boolean b = true;
        final boolean k = a_9.k;
        final bi bi = (bi)message.obj;
        Label_0086: {
            switch (message.what) {
                case 2: {
                    this.a.b(bi, message.arg1);
                    if (k) {
                        break Label_0086;
                    }
                    break;
                }
                case 11: {
                    vy.f(this.a).c(bi);
                    if (k) {
                        break Label_0086;
                    }
                    break;
                }
                case 10: {
                    final t5 f = vy.f(this.a);
                    if (message.arg1 != (b ? 1 : 0)) {
                        b = false;
                    }
                    f.a(bi, b);
                }
            }
        }
    }
}
