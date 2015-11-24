// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.accountsync;

import com.whatsapp.util.Log;
import android.os.Bundle;
import android.accounts.AccountManager;
import android.accounts.Account;
import android.content.Context;
import android.app.ProgressDialog;
import android.os.AsyncTask;

class c extends AsyncTask
{
    private static final String[] z;
    final ProgressDialog a;
    final LoginActivity b;
    
    static {
        final String[] z2 = new String[4];
        String s = "xE48gzS/%Hm";
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
                        c2 = '&';
                        break;
                    }
                    case 0: {
                        c2 = '\u0019';
                        break;
                    }
                    case 1: {
                        c2 = '0';
                        break;
                    }
                    case 2: {
                        c2 = '@';
                        break;
                    }
                    case 3: {
                        c2 = 'P';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u_'9HxS49PpD9\u007fBvy.\u0012Gz['\"Il^$";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "z_-~QqQ4#Gi@";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "xS#?SwD\u0014)V|";
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
    
    private c(final LoginActivity b, final Context context) {
        this.b = b;
        (this.a = ProgressDialog.show(context, (CharSequence)"", (CharSequence)b.getString(2131230782), true, false)).setCancelable(true);
    }
    
    c(final LoginActivity loginActivity, final Context context, final d d) {
        this(loginActivity, context);
    }
    
    public Boolean a(final Void[] array) {
        while (true) {
            try {
                Thread.sleep(2000L);
                final Account account = new Account(this.b.getString(2131231990), c.z[2]);
                if (AccountManager.get((Context)this.b).addAccountExplicitly(account, (String)null, (Bundle)null)) {
                    final Bundle accountAuthenticatorResult = new Bundle();
                    accountAuthenticatorResult.putString(c.z[0], account.name);
                    accountAuthenticatorResult.putString(c.z[3], account.type);
                    this.b.setAccountAuthenticatorResult(accountAuthenticatorResult);
                    return true;
                }
            }
            catch (Exception ex) {
                Log.b(c.z[1], ex);
                continue;
            }
            break;
        }
        return false;
    }
    
    public void a(final Boolean b) {
        this.a.dismiss();
        if (b) {
            this.b.finish();
        }
    }
    
    public Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    public void onPostExecute(final Object o) {
        this.a((Boolean)o);
    }
}
