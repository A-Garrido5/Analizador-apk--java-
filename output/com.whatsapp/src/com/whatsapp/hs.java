// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.os.Message;
import android.os.Handler;

class hs extends Handler
{
    final vy a;
    
    hs(final vy a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final boolean k = a_9.k;
        final bi bi = (bi)message.obj;
        Label_0162: {
            switch (message.what) {
                case 3: {
                    vy.f(this.a).b(bi);
                    if (k) {
                        break Label_0162;
                    }
                    break;
                }
                case 4: {
                    vy.g(this.a).b(bi.a.a);
                    vy.f(this.a).a(bi, message.arg1);
                    if (k) {
                        break Label_0162;
                    }
                    break;
                }
                case 5: {
                    vy.f(this.a).a(bi, message.arg1);
                    vy.g(this.a).a(bi.a.a);
                    if (k) {
                        break Label_0162;
                    }
                    break;
                }
                case 6: {
                    vy.g(this.a).a(bi.a.a, false);
                    if (k) {
                        break Label_0162;
                    }
                    break;
                }
                case 7: {
                    vy.f(this.a).a();
                }
            }
        }
    }
}
