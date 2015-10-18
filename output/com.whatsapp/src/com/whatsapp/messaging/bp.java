// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.protocol.bi;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.b7;
import com.whatsapp.App;
import android.os.Message;
import com.whatsapp.protocol.c6;
import android.os.Handler;

final class bp extends Handler
{
    private static final String[] z;
    final ae a;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0002tw\nNJ'p N\u0017'e&_L',";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '+';
                        break;
                    }
                    case 0: {
                        c2 = '9';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = '\u0011';
                        break;
                    }
                    case 3: {
                        c2 = 'G';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Z;\u007f)NZ x(E\u00195r3BO113BT1~2_\u00192x5N]";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Z5}+\u000bV2w\"Y\u0019 x*NV!egMP&t#";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "T1b4J^115NZ1x7_\u0019 x*NV!egMP&t#\u0010\u00199t4XX3t\fN@i";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private bp(final ae a) {
        this.a = a;
    }
    
    bp(final ae ae, final ah ah) {
        this(ae);
    }
    
    public void a() {
        this.sendEmptyMessageDelayed(0, 10000L);
    }
    
    public void a(final c6 c6) {
        this.sendMessageDelayed(this.obtainMessage(1, (Object)c6), 45000L);
    }
    
    public void b() {
        this.sendEmptyMessageDelayed(2, 32000L);
    }
    
    public void c() {
        this.removeMessages(0);
    }
    
    public void d() {
        this.removeCallbacksAndMessages((Object)null);
    }
    
    public boolean e() {
        return this.hasMessages(0);
    }
    
    public void f() {
        this.removeMessages(3);
    }
    
    public void g() {
        this.removeMessages(2);
    }
    
    public void h() {
        this.sendEmptyMessageDelayed(3, 20000L);
    }
    
    public void handleMessage(final Message message) {
        final boolean a = e.a;
        Label_0168: {
            switch (message.what) {
                case 0: {
                    ae.j(this.a);
                    if (a) {
                        break Label_0168;
                    }
                    break;
                }
                case 1: {
                    final c6 c6 = (c6)message.obj;
                    final bi a2 = App.ak.a(c6);
                    if (a2 == null || b7.a(a2.c, 4) >= 0) {
                        break;
                    }
                    Log.w(bp.z[3] + c6 + bp.z[0] + a2.c);
                    this.removeMessages(1);
                    ae.a(this.a, true);
                    if (a) {
                        break Label_0168;
                    }
                    break;
                }
                case 2: {
                    Log.w(bp.z[1]);
                    this.g();
                    ae.a(this.a, true);
                    if (a) {
                        break Label_0168;
                    }
                    break;
                }
                case 3: {
                    Log.w(bp.z[2]);
                    this.f();
                    ae.a(this.a, true);
                }
            }
        }
    }
}
