// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.util.Pair;
import com.android.vending.billing.IInAppBillingService$Stub;
import com.whatsapp.util.Log;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

class m_ implements ServiceConnection
{
    private static final String[] z;
    final o6 a;
    final Runnable b;
    
    static {
        final String[] z2 = new String[2];
        String s = ";3{7\u0017%&/7\u0013%3e?\u0000d=lw\u0001. t3\u0011.}f3\u0001(=l4\u0017(&g>";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'r';
                        break;
                    }
                    case 0: {
                        c2 = 'K';
                        break;
                    }
                    case 1: {
                        c2 = 'R';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = 'Z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = ";3{7\u0017%&/7\u0013%3e?\u0000d=lw\u0001. t3\u0011.}a5\u001c%7a.\u0017/";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    m_(final o6 a, final Runnable b) {
        this.a = a;
        this.b = b;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        Log.i(m_.z[1]);
        o6.e(this.a).sendMessageAtFrontOfQueue(o6.e(this.a).obtainMessage(1, 0, 0, (Object)Pair.create((Object)new t7(this.a, IInAppBillingService$Stub.asInterface(binder), (ServiceConnection)this), (Object)this.b)));
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        Log.i(m_.z[0]);
        o6.e(this.a).sendMessageAtFrontOfQueue(o6.e(this.a).obtainMessage(2, 0, 0, (Object)null));
    }
}
