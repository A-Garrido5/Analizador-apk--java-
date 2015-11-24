// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.accountsync;

import android.accounts.Account;
import android.content.Intent;
import com.whatsapp.Main;
import android.os.AsyncTask;
import com.whatsapp.a8s;
import com.whatsapp.App;
import android.widget.Toast;
import com.whatsapp.DialogToastActivity;
import android.content.Context;
import android.accounts.AccountManager;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.accounts.AccountAuthenticatorActivity;

public class LoginActivity extends AccountAuthenticatorActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0011w\u000b\u0007 \u0010z\u0003\u0019\f\u0016m\u0005\u0004\u0016\rq;\u0016\u0016\u0010l\u0010/\u001b\u000ex";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u007f';
                        break;
                    }
                    case 0: {
                        c2 = 'b';
                        break;
                    }
                    case 1: {
                        c2 = '\u001f';
                        break;
                    }
                    case 2: {
                        c2 = 'd';
                        break;
                    }
                    case 3: {
                        c2 = 'p';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0001p\t^\b\n~\u0010\u0003\u001e\u0012o";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u000ep\u0003\u0019\u0011\u0003|\u0010\u0019\t\u000bk\u001d_\u001c\u0010z\u0005\u0004\u001a";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public void onCreate(final Bundle bundle) {
        final boolean a = PerformSyncManager.a;
        super.onCreate(bundle);
        this.setContentView(2130903178);
        Log.i(LoginActivity.z[2]);
        final Account[] accounts = AccountManager.get((Context)this).getAccounts();
        final int length = accounts.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            int n2;
            if (LoginActivity.z[1].contains(accounts[i].type)) {
                n2 = 1;
            }
            else {
                n2 = n;
            }
            final int n3 = i + 1;
            if (a) {
                DialogToastActivity.h = !DialogToastActivity.h;
                n = n2;
                break;
            }
            i = n3;
            n = n2;
        }
        if (n != 0) {
            Toast.makeText(this.getApplicationContext(), (CharSequence)this.getString(2131230780), 1).show();
            this.finish();
            if (!a) {
                return;
            }
        }
        if (App.au() != null) {
            a8s.a(new c(this, (Context)this, null), new Void[0]);
            return;
        }
        final Intent intent = new Intent((Context)this, (Class)Main.class);
        intent.putExtra(LoginActivity.z[0], true);
        this.startActivity(intent);
        this.finish();
    }
}
