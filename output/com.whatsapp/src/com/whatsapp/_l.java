// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import com.whatsapp.messaging.e;
import android.os.Looper;
import java.util.HashMap;
import android.os.Handler;

final class _l extends Handler
{
    private final HashMap a;
    
    _l(final Looper looper) {
        super(looper);
        this.a = new HashMap();
    }
    
    private void a(final String s, final boolean b) {
        if (!this.hasMessages(0, (Object)s) && !this.hasMessages(3, (Object)s)) {
            if (!this.hasMessages(5, (Object)s) && App.a3() && b) {
                App.Y().b(e.k(s));
            }
            this.removeMessages(1, (Object)s);
            this.removeMessages(2, (Object)s);
        }
    }
    
    private void a(final String s, final boolean b, final int n) {
        int n2 = 1;
        if (!this.hasMessages(n2, (Object)s) && !this.hasMessages(4, (Object)s)) {
            if (!this.hasMessages(2, (Object)s) && App.a3() && b) {
                App.Y().b(e.a(s, n));
            }
            if (!b) {
                n2 = 0;
            }
            this.sendMessageDelayed(this.obtainMessage(5, n2, 0, (Object)s), 30000L);
        }
    }
    
    private void a(final String s, final boolean b, final boolean b2) {
        if (!this.hasMessages(0, (Object)s) && !this.hasMessages(3, (Object)s)) {
            if (!this.hasMessages(2, (Object)s) && App.a3() && b && (b2 || this.hasMessages(5, (Object)s))) {
                App.Y().b(e.k(s));
            }
            this.removeMessages(4, (Object)s);
            this.removeMessages(5, (Object)s);
        }
    }
    
    private void b(final String s, final boolean b, final int n) {
        if (!this.hasMessages(1, (Object)s) && !this.hasMessages(4, (Object)s)) {
            this.removeMessages(0, (Object)s);
            Label_0157: {
                if (!this.hasMessages(2, (Object)s) && !this.hasMessages(5, (Object)s)) {
                    if (!App.a3()) {
                        break Label_0157;
                    }
                    if (b) {
                        App.Y().b(e.a(s, n));
                    }
                    this.a.put(s, System.currentTimeMillis());
                    if (!App.I) {
                        break Label_0157;
                    }
                }
                final Long n2 = this.a.get(s);
                final long currentTimeMillis = System.currentTimeMillis();
                if (n2 != null && currentTimeMillis - n2 > 10000L && App.a3()) {
                    if (b) {
                        App.Y().b(e.a(s, n));
                    }
                    this.a.put(s, currentTimeMillis);
                }
            }
            this.removeMessages(2, (Object)s);
            int n3;
            if (b) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            this.sendMessageDelayed(this.obtainMessage(2, n3, 0, (Object)s), 2000L);
        }
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        Label_0186: {
            switch (message.what) {
                case 0: {
                    this.b((String)message.obj, message.arg1 == 1, message.arg2);
                    if (i) {
                        break Label_0186;
                    }
                    break;
                }
                case 3: {
                    this.a((String)message.obj, message.arg1 == 1, message.arg2);
                    if (i) {
                        break Label_0186;
                    }
                    break;
                }
                case 1:
                case 2: {
                    this.a((String)message.obj, message.arg1 == 1);
                    if (i) {
                        break Label_0186;
                    }
                    break;
                }
                case 4: {
                    this.a((String)message.obj, message.arg1 == 1, false);
                    if (i) {
                        break Label_0186;
                    }
                    break;
                }
                case 5: {
                    final String s = (String)message.obj;
                    final int arg1 = message.arg1;
                    boolean b = false;
                    if (arg1 == 1) {
                        b = true;
                    }
                    this.a(s, b, true);
                }
            }
        }
    }
}
