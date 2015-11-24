// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.bf;
import android.os.Message;
import android.os.Handler;

final class p extends Handler implements y
{
    private static final String z;
    final a4 a;
    
    static {
        final char[] charArray = ",^P\rm#AI\t'&\u001cR\u0018!\"\u001cC\u0012,:VC\t'0".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'B';
                    break;
                }
                case 0: {
                    c2 = 'T';
                    break;
                }
                case 1: {
                    c2 = '3';
                    break;
                }
                case 2: {
                    c2 = ' ';
                    break;
                }
                case 3: {
                    c2 = '}';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public p(final a4 a) {
        this.a = a;
        super(a.getLooper());
    }
    
    public void a() {
        this.sendEmptyMessage(1);
    }
    
    public void a(final Message message) {
        message.what = 2;
        this.sendMessage(message);
    }
    
    public void a(final bf bf) {
        this.obtainMessage(0, (Object)bf).sendToTarget();
    }
    
    public void handleMessage(final Message message) {
        final boolean a = e.a;
        Label_0072: {
            switch (message.what) {
                case 0: {
                    Log.i(p.z);
                    a4.a(this.a, (bf)message.obj);
                    if (a) {
                        break Label_0072;
                    }
                    break;
                }
                case 1: {
                    a4.a(this.a);
                    if (a) {
                        break Label_0072;
                    }
                    break;
                }
                case 2: {
                    a4.a(this.a, message);
                }
            }
        }
    }
}
