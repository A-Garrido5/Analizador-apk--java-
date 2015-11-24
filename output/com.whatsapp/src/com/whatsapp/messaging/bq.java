// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.util.List;
import com.whatsapp.util.Log;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import android.os.Message;
import android.os.Handler;

final class bq extends Handler implements f
{
    private static final String[] z;
    final ae a;
    
    static {
        final String[] z2 = new String[15];
        String s = "^g!";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0407:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '0';
                        break;
                    }
                    case 0: {
                        c2 = '4';
                        break;
                    }
                    case 1: {
                        c2 = '\u000e';
                        break;
                    }
                    case 2: {
                        c2 = 'E';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Ux$\u000e\\Ul)\u0002";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Dy";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "]~$\u0003TFk6\u0014";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "[x \u0015B]j 8UL~,\u0015UP";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Ro)\u000bRUm.\u0014";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Lc5\u0017\u001fWa+\tUWz,\b^\u001b| \u0004F\u001bm*\t^Qm1";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "Um1\u000eFQQ&\b^Zk&\u0013Y[`";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Dy";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "]~$\u0003TFk6\u0014";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "^g!";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "Ux$\u000e\\Ul)\u0002";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "[x \u0015B]j 8UL~,\u0015UP";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "Um1\u000eFQQ&\b^Zk&\u0013Y[`";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "Ro)\u000bRUm.\u0014";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    break Label_0407;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public bq(final ae a) {
        this.a = a;
        super(a.getLooper());
    }
    
    public void a() {
        this.obtainMessage(2).sendToTarget();
    }
    
    public void a(final Message message) {
        message.what = 3;
        this.sendMessage(message);
    }
    
    public void a(final String s, final byte[] array, final String s2, final boolean b, final boolean b2, final ArrayList list, final boolean b3) {
        final Message obtainMessage = this.obtainMessage(0);
        final Bundle data = obtainMessage.getData();
        data.putString(bq.z[10], s);
        data.putByteArray(bq.z[8], array);
        data.putString(bq.z[9], s2);
        data.putBoolean(bq.z[11], b);
        data.putBoolean(bq.z[13], b2);
        data.putSerializable(bq.z[14], (Serializable)list);
        data.putBoolean(bq.z[12], b3);
        obtainMessage.sendToTarget();
    }
    
    public void a(final boolean b) {
        int n;
        if (b) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.obtainMessage(1, n, 0).sendToTarget();
    }
    
    public void b() {
        this.obtainMessage(6).sendToTarget();
    }
    
    public void c() {
        this.obtainMessage(7).sendToTarget();
    }
    
    public void d() {
        this.obtainMessage(5).sendToTarget();
    }
    
    public void e() {
        this.obtainMessage(4).sendToTarget();
    }
    
    public void handleMessage(final Message message) {
        final boolean a = e.a;
        Label_0239: {
            switch (message.what) {
                case 0: {
                    Log.i(bq.z[6]);
                    final Bundle data = message.getData();
                    ae.a(this.a, data.getString(bq.z[0]), data.getByteArray(bq.z[2]), data.getString(bq.z[3]), data.getBoolean(bq.z[1]), data.getBoolean(bq.z[7]), (List)data.getSerializable(bq.z[5]), data.getBoolean(bq.z[4]));
                    if (a) {
                        break Label_0239;
                    }
                    break;
                }
                case 1: {
                    ae.a(this.a, message.arg1 == 1);
                    if (a) {
                        break Label_0239;
                    }
                    break;
                }
                case 5: {
                    ae.k(this.a);
                    if (a) {
                        break Label_0239;
                    }
                    break;
                }
                case 6: {
                    ae.h(this.a);
                    if (a) {
                        break Label_0239;
                    }
                    break;
                }
                case 2: {
                    ae.b(this.a);
                    if (a) {
                        break Label_0239;
                    }
                    break;
                }
                case 3: {
                    ae.b(this.a, message);
                    if (a) {
                        break Label_0239;
                    }
                    break;
                }
                case 4: {
                    ae.l(this.a);
                    if (a) {
                        break Label_0239;
                    }
                    break;
                }
                case 7: {
                    ae.e(this.a);
                }
            }
        }
    }
}
