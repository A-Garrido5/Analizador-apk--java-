// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.accountsync;

import android.content.Intent;
import android.content.SyncResult;
import android.content.ContentProviderClient;
import android.os.Bundle;
import android.accounts.Account;
import android.content.Context;
import android.content.AbstractThreadedSyncAdapter;

class b extends AbstractThreadedSyncAdapter
{
    private static final String z;
    final ContactsSyncAdapterService a;
    
    static {
        final char[] charArray = "TKy2J_E`o\\GT:}^TKarID]z\u007f\u0013^J`ySC\nDYoqkFQbd}Z_".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '=';
                    break;
                }
                case 0: {
                    c2 = '7';
                    break;
                }
                case 1: {
                    c2 = '$';
                    break;
                }
                case 2: {
                    c2 = '\u0014';
                    break;
                }
                case 3: {
                    c2 = '\u001c';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    b(final ContactsSyncAdapterService a, final Context context, final boolean b) {
        this.a = a;
        super(context, b);
    }
    
    public void onPerformSync(final Account account, final Bundle bundle, final String s, final ContentProviderClient contentProviderClient, final SyncResult syncResult) {
        this.getContext().sendBroadcast(new Intent(b.z));
    }
}
