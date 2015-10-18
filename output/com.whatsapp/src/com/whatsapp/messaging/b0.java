// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.protocol.cr;
import android.os.Message;
import android.os.Handler;

final class b0 extends Handler implements bc
{
    private boolean a;
    final ae b;
    
    public b0(final ae b) {
        this.b = b;
        super(b.getLooper());
    }
    
    public void a() {
        this.sendEmptyMessage(3);
    }
    
    public void a(final Message message) {
        message.what = 0;
        this.sendMessage(message);
    }
    
    public void a(final cr cr) {
        this.obtainMessage(5, (Object)cr).sendToTarget();
    }
    
    public void a(final String s) {
        this.obtainMessage(4, (Object)s).sendToTarget();
    }
    
    public void b() {
        this.sendEmptyMessage(2);
    }
    
    public void c() {
        this.sendEmptyMessage(1);
    }
    
    public void d() {
        this.a = true;
    }
    
    public void handleMessage(final Message message) {
        final boolean a = e.a;
        Label_0152: {
            switch (message.what) {
                case 0: {
                    ae.a(this.b, message);
                    if (a) {
                        break Label_0152;
                    }
                    break;
                }
                case 1: {
                    if (this.a) {
                        break;
                    }
                    ae.g(this.b);
                    if (a) {
                        break Label_0152;
                    }
                    break;
                }
                case 2: {
                    if (this.a) {
                        break;
                    }
                    if (ae.f(this.b)) {
                        ae.g(this.b);
                        if (!a) {
                            break;
                        }
                    }
                    ae.d(this.b);
                    if (a) {
                        break Label_0152;
                    }
                    break;
                }
                case 3: {
                    ae.i(this.b);
                    if (a) {
                        break Label_0152;
                    }
                    break;
                }
                case 4: {
                    ae.a(this.b).a((String)message.obj);
                    if (a) {
                        break Label_0152;
                    }
                    break;
                }
                case 5: {
                    ae.a(this.b).a((cr)message.obj);
                }
            }
        }
    }
}
