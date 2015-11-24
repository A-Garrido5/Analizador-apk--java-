// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.bm;
import android.os.Handler;
import android.accounts.AccountManagerCallback;
import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import android.accounts.AccountManager;
import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class bo implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final g a;
    
    static {
        final String[] z2 = new String[2];
        String s = "Yy0.L[0#$NWk+3C\u0011r,\"\u0017Jt/\"\u0017Mx62J\u001es-g]Qr%+_\u001ey0.L[= &YUh24\u001aXr7)^\u001e|,#\u001aKn'5\u001aZx!.^[yb3U\u001e|&#\u001a_=,\"M\u001e|!$UKs6i";
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
                        c2 = ':';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = '\u001d';
                        break;
                    }
                    case 2: {
                        c2 = 'B';
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
                    n2 = 1;
                    array = z2;
                    s = "]r/i]Qr%+_";
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
    
    bo(final g a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(bo.z[0]);
        bm.a(new n(this, AccountManager.get((Context)this.a.b).addAccount(bo.z[1], (String)null, (String[])null, (Bundle)null, (Activity)this.a.b, (AccountManagerCallback)null, (Handler)null)));
    }
}
