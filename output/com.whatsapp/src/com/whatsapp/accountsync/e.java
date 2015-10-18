// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.accountsync;

import java.util.Arrays;
import android.accounts.Account;
import android.os.Parcelable;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.accounts.AbstractAccountAuthenticator;

class e extends AbstractAccountAuthenticator
{
    private static final String[] z;
    private final Context a;
    
    static {
        final String[] z2 = new String[9];
        String s = "l\u001c\"}-c\u000bna!c\u001cng(i\u001e5w\u001b\u007f\u001a%w6y\u0016 ~+";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'X';
                        break;
                    }
                    case 0: {
                        c2 = '\r';
                        break;
                    }
                    case 1: {
                        c2 = '\u007f';
                        break;
                    }
                    case 2: {
                        c2 = 'A';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "l\u001c\"}-c\u000bna!c\u001cnq7c\u0019(`5N\r$v=c\u000b(s4~";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "l\u001c\"}-c\u000bna!c\u001cnw<d\u000b\u0011`7}\u001a3f1h\f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "l\u001c\"}-c\u000b\u0000g,e\u001a/f1n\u001e5}*_\u001a2b7c\f$";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "l\u001c\"}-c\u000bna!c\u001cns<i>\"q7x\u00115";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "d\u00115w6y";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "l\u001c\"}-c\u000bna!c\u001cnu=y>4f0Y\u0010*w6";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "l\u001c\"}-c\u000bna!c\u001cnz9~9$s,x\r$ab-";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "l\u001c\"}-c\u000bna!c\u001cnu=y>4f0Y\u0010*w6A\u001e#w4";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public e(final Context a) {
        super(a);
        this.a = a;
    }
    
    public Bundle addAccount(final AccountAuthenticatorResponse accountAuthenticatorResponse, final String s, final String s2, final String[] array, final Bundle bundle) {
        Log.i(e.z[4]);
        final Bundle bundle2 = new Bundle();
        final Intent intent = new Intent(this.a, (Class)LoginActivity.class);
        intent.putExtra(e.z[3], (Parcelable)accountAuthenticatorResponse);
        bundle2.putParcelable(e.z[5], (Parcelable)intent);
        return bundle2;
    }
    
    public Bundle confirmCredentials(final AccountAuthenticatorResponse accountAuthenticatorResponse, final Account account, final Bundle bundle) {
        Log.i(e.z[1]);
        return null;
    }
    
    public Bundle editProperties(final AccountAuthenticatorResponse accountAuthenticatorResponse, final String s) {
        Log.i(e.z[2]);
        return null;
    }
    
    public Bundle getAuthToken(final AccountAuthenticatorResponse accountAuthenticatorResponse, final Account account, final String s, final Bundle bundle) {
        Log.i(e.z[6]);
        return null;
    }
    
    public String getAuthTokenLabel(final String s) {
        Log.i(e.z[8]);
        return null;
    }
    
    public Bundle hasFeatures(final AccountAuthenticatorResponse accountAuthenticatorResponse, final Account account, final String[] array) {
        Log.i(e.z[7] + Arrays.toString(array));
        return null;
    }
    
    public Bundle updateCredentials(final AccountAuthenticatorResponse accountAuthenticatorResponse, final Account account, final String s, final Bundle bundle) {
        Log.i(e.z[0]);
        return null;
    }
}
