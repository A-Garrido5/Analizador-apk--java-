// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.util.Pair;
import android.os.Message;
import android.os.Handler;

class rh extends Handler
{
    final o6 a;
    
    rh(final o6 a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        Label_0160: {
            switch (message.what) {
                case 3: {
                    o6.a(this.a, (Runnable)message.obj);
                    if (i) {
                        break Label_0160;
                    }
                    break;
                }
                case 5: {
                    o6.d(this.a);
                    if (i) {
                        break Label_0160;
                    }
                    break;
                }
                case 4: {
                    o6.d(this.a);
                    if (i) {
                        break Label_0160;
                    }
                    break;
                }
                case 1: {
                    o6.a(this.a, (t7)((Pair)message.obj).first);
                    o6.a(this.a, 1);
                    final Runnable runnable = (Runnable)((Pair)message.obj).second;
                    if (runnable != null) {
                        runnable.run();
                    }
                    this.removeMessages(5);
                    this.sendEmptyMessageDelayed(5, 60000L);
                    if (i) {
                        break Label_0160;
                    }
                    break;
                }
                case 2: {
                    o6.a(this.a, (t7)null);
                    o6.a(this.a, 2);
                }
            }
        }
    }
}
