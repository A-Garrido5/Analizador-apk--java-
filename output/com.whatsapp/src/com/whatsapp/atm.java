// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.RemoteException;
import com.whatsapp.util.Log;

class atm implements Runnable
{
    private static final String z;
    aqq a;
    final o6 b;
    
    static {
        final char[] charArray = ".(c:\\0=7:X0(}2Kq;\u007f:V*,72A=,j#P1':".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '9';
                    break;
                }
                case 0: {
                    c2 = '^';
                    break;
                }
                case 1: {
                    c2 = 'I';
                    break;
                }
                case 2: {
                    c2 = '\u001a';
                    break;
                }
                case 3: {
                    c2 = 'W';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    atm(final o6 b, final aqq a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (o6.c(this.b) == 1) {
            try {
                this.a.a();
                o6.e(this.b).removeMessages(5);
                o6.e(this.b).sendEmptyMessageDelayed(5, 60000L);
                return;
            }
            catch (RemoteException ex) {
                Log.e(atm.z + ex.toString());
                o6.e(this.b).sendMessageAtFrontOfQueue(o6.e(this.b).obtainMessage(3, 0, 0, (Object)this));
                o6.e(this.b).sendMessageAtFrontOfQueue(o6.e(this.b).obtainMessage(4, 0, 0, (Object)null));
                if (!App.I) {
                    return;
                }
            }
        }
        o6.e(this.b).sendMessageAtFrontOfQueue(o6.e(this.b).obtainMessage(3, 0, 0, (Object)this));
    }
}
