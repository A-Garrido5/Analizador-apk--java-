// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.RemoteException;
import com.whatsapp.util.Log;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.Bundle;
import com.whatsapp.protocol.cw;

class b2 implements cw
{
    private static final String[] z;
    final Bundle a;
    final Messenger b;
    final w c;
    
    static {
        final String[] z2 = new String[6];
        String s = "`+\u000bcjpe\u001en&f \u0004e&a*Jbgy)\b`e~e\u0007duf$\rd";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = '\u0015';
                        break;
                    }
                    case 1: {
                        c2 = 'E';
                        break;
                    }
                    case 2: {
                        c2 = 'j';
                        break;
                    }
                    case 3: {
                        c2 = '\u0001';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "`+\u000bcjpe\u001en&f \u0004e&a*Jbgy)\b`e~e\u0007duf$\rd";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "`+\u000bcjpe\u001en&f \u0004e&a*Jbgy)\b`e~e\u0007duf$\rd";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "f1\u000busf";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "a,\u0007dua$\u0007q";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "`+\u000bcjpe\u001en&f \u0004e&a*Jbgy)\b`e~e\u0007duf$\rd";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    b2(final w c, final Bundle a, final Messenger b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a() {
        try {
            this.b.send(Message.obtain((Handler)null, 2, (Object)this.a));
        }
        catch (RemoteException ex) {
            Log.b(b2.z[0], (Throwable)ex);
        }
    }
    
    @Override
    public void a(final int n) {
        try {
            this.b.send(Message.obtain((Handler)null, 0, n, 0, (Object)this.a));
        }
        catch (RemoteException ex) {
            Log.b(b2.z[1], (Throwable)ex);
        }
    }
    
    @Override
    public void a(final long n, final String s) {
        try {
            this.a.putString(b2.z[3], s);
            this.a.putLong(b2.z[4], n);
            this.b.send(Message.obtain((Handler)null, 1, (Object)this.a));
        }
        catch (RemoteException ex) {
            Log.b(b2.z[5], (Throwable)ex);
        }
    }
    
    @Override
    public void b() {
        try {
            this.b.send(Message.obtain((Handler)null, 3, (Object)this.a));
        }
        catch (RemoteException ex) {
            Log.b(b2.z[2], (Throwable)ex);
        }
    }
}
