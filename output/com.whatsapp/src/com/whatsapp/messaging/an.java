// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.protocol.cr;
import com.whatsapp.protocol.a4;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class an extends Handler implements ba
{
    final MessageService a;
    
    public an(final MessageService a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public void a() {
        this.sendEmptyMessage(7);
    }
    
    public void a(final Message message) {
        message.what = 5;
        this.sendMessage(message);
    }
    
    public void a(final f f) {
        this.obtainMessage(0, (Object)f).sendToTarget();
    }
    
    public void a(final a4 a4) {
        this.obtainMessage(2, (Object)a4).sendToTarget();
    }
    
    public void a(final cr cr) {
        this.obtainMessage(9, (Object)cr).sendToTarget();
    }
    
    public void a(final String s) {
        this.obtainMessage(8, (Object)s).sendToTarget();
    }
    
    public void a(final boolean b) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.obtainMessage(4, n, 0).sendToTarget();
    }
    
    public void b() {
        this.sendEmptyMessage(1);
    }
    
    public void c() {
        this.sendEmptyMessage(6);
    }
    
    public void d() {
        this.sendEmptyMessage(3);
    }
    
    public void handleMessage(final Message message) {
        final boolean a = e.a;
        Label_0201: {
            switch (message.what) {
                case 0: {
                    MessageService.a(this.a, (f)message.obj);
                    if (a) {
                        break Label_0201;
                    }
                    break;
                }
                case 1: {
                    MessageService.g(this.a);
                    if (a) {
                        break Label_0201;
                    }
                    break;
                }
                case 2: {
                    MessageService.a(this.a, (a4)message.obj);
                    if (a) {
                        break Label_0201;
                    }
                    break;
                }
                case 3: {
                    MessageService.d(this.a);
                    if (a) {
                        break Label_0201;
                    }
                    break;
                }
                case 4: {
                    MessageService.a(this.a, message.arg1 == 1);
                    if (a) {
                        break Label_0201;
                    }
                    break;
                }
                case 6: {
                    MessageService.c(this.a);
                    if (a) {
                        break Label_0201;
                    }
                    break;
                }
                case 7: {
                    MessageService.b(this.a);
                    if (a) {
                        break Label_0201;
                    }
                    break;
                }
                case 5: {
                    MessageService.a(this.a, message);
                    if (a) {
                        break Label_0201;
                    }
                    break;
                }
                case 8: {
                    MessageService.a(this.a, (String)message.obj);
                    if (a) {
                        break Label_0201;
                    }
                    break;
                }
                case 9: {
                    MessageService.a(this.a, (cr)message.obj);
                }
            }
        }
    }
}
