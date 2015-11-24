// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.accountsync;

import android.os.IBinder;
import android.content.Intent;
import android.content.Context;
import android.app.Service;

public class AccountAuthenticatorService extends Service
{
    private static e a;
    private static final String z;
    
    static {
        final char[] charArray = "yH\u001b8.qBQ+\"{I\n$5k\b>)\"wS\u0011>\u0000mR\u0017//lO\u001c+5wT".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'A';
                    break;
                }
                case 0: {
                    c2 = '\u0018';
                    break;
                }
                case 1: {
                    c2 = '&';
                    break;
                }
                case 2: {
                    c2 = '\u007f';
                    break;
                }
                case 3: {
                    c2 = 'J';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        AccountAuthenticatorService.a = null;
    }
    
    private e a() {
        if (AccountAuthenticatorService.a == null) {
            AccountAuthenticatorService.a = new e((Context)this);
        }
        return AccountAuthenticatorService.a;
    }
    
    public IBinder onBind(final Intent intent) {
        final boolean equals = intent.getAction().equals(AccountAuthenticatorService.z);
        IBinder iBinder = null;
        if (equals) {
            iBinder = this.a().getIBinder();
        }
        return iBinder;
    }
}
