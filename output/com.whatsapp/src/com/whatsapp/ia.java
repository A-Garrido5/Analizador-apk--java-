// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.os.Message;
import android.os.Looper;
import android.annotation.SuppressLint;
import android.os.Handler;

@SuppressLint({ "HandlerLeak" })
final class ia extends Handler
{
    final vy a;
    
    private ia(final vy a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    ia(final vy vy, final Looper looper, final hs hs) {
        this(vy, looper);
    }
    
    public void handleMessage(final Message message) {
        final boolean k = a_9.k;
        Label_0429: {
            switch (message.what) {
                case 1: {
                    vy.a(this.a, message.arg1, (bi)message.obj);
                    if (k) {
                        break Label_0429;
                    }
                    return;
                }
                case 3: {
                    this.a.e((bi)message.obj);
                    if (k) {
                        break Label_0429;
                    }
                    return;
                }
                case 2: {
                    final bi bi = (bi)message.obj;
                    if (!vy.a(this.a, bi, message.arg1)) {
                        return;
                    }
                    Message.obtain(vy.e(this.a), 2, message.arg1, message.arg2, (Object)bi).sendToTarget();
                    if (k) {
                        break Label_0429;
                    }
                    return;
                }
                case 11: {
                    bi bi2 = (bi)message.obj;
                    final bi a = vy.a(this.a, bi2);
                    final Handler e = vy.e(this.a);
                    int n;
                    if (a == null) {
                        n = 0;
                    }
                    else {
                        n = 1;
                    }
                    if (a != null) {
                        bi2 = a;
                    }
                    Message.obtain(e, 10, n, 0, (Object)bi2).sendToTarget();
                    if (k) {
                        break Label_0429;
                    }
                    return;
                }
                case 5: {
                    final String s = (String)message.obj;
                    Message.obtain(vy.h(this.a), 1, (Object)s).sendToTarget();
                    if (!vy.a(this.a, s)) {
                        return;
                    }
                    Message.obtain(vy.h(this.a), 2, (Object)s).sendToTarget();
                    if (k) {
                        break Label_0429;
                    }
                    return;
                }
                case 6: {
                    final String s2 = (String)message.obj;
                    Message.obtain(vy.h(this.a), 1, (Object)s2).sendToTarget();
                    if (!vy.b(this.a, s2)) {
                        return;
                    }
                    Message.obtain(vy.h(this.a), 2, (Object)s2).sendToTarget();
                    if (k) {
                        break Label_0429;
                    }
                    return;
                }
                case 7: {
                    vy.i(this.a);
                    Message.obtain(vy.h(this.a), 8).sendToTarget();
                    if (k) {
                        break Label_0429;
                    }
                    return;
                }
                case 8: {
                    vy.d(this.a);
                    Message.obtain(vy.h(this.a), 9).sendToTarget();
                    if (k) {
                        break Label_0429;
                    }
                    return;
                }
                case 10: {
                    final adi adi = (adi)message.obj;
                    vy.a(this.a, adi.a, adi.b, adi.c);
                    if (k) {
                        break Label_0429;
                    }
                    return;
                }
                case 12: {
                    Message.obtain(vy.b(this.a), 7).sendToTarget();
                    if (k) {
                        break;
                    }
                    return;
                }
            }
        }
        super.handleMessage(message);
    }
}
