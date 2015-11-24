// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import android.os.Message;
import com.whatsapp.protocol.c6;
import com.whatsapp.protocol.bf;
import android.os.Handler;

final class ao extends Handler implements b7
{
    private static final String z;
    final ae a;
    
    static {
        final char[] charArray = "LEuV&WGkHlW\\lIg\u001bZ`E\u007f\u001b[`Hm]Fbyj\\IkHlXwwChPQ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\t';
                    break;
                }
                case 0: {
                    c2 = '4';
                    break;
                }
                case 1: {
                    c2 = '(';
                    break;
                }
                case 2: {
                    c2 = '\u0005';
                    break;
                }
                case 3: {
                    c2 = '&';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ao(final ae a) {
        this.a = a;
        super(a.getLooper());
    }
    
    public void a(final y y) {
        this.obtainMessage(0, (Object)y).sendToTarget();
    }
    
    public void a(final bf bf) {
        this.obtainMessage(1, (Object)bf).sendToTarget();
    }
    
    public void a(final c6 c6) {
        this.obtainMessage(2, (Object)c6).sendToTarget();
    }
    
    public void handleMessage(final Message message) {
        final boolean a = e.a;
        Label_0079: {
            switch (message.what) {
                case 0: {
                    Log.i(ao.z);
                    ae.a(this.a, (y)message.obj);
                    if (a) {
                        break Label_0079;
                    }
                    break;
                }
                case 1: {
                    ae.a(this.a, (bf)message.obj);
                    if (a) {
                        break Label_0079;
                    }
                    break;
                }
                case 2: {
                    ae.a(this.a, (c6)message.obj);
                }
            }
        }
    }
}
