// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.google.android.gms.auth.GoogleAuthException;
import java.io.IOException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.whatsapp.util.Log;

class ac implements Runnable
{
    private static final String[] z;
    final SettingsGoogleDrive a;
    final String b;
    
    static {
        final String[] z2 = new String[9];
        String s = "/\u007f-nc2}*7m8h0los{,nbqh<k\u007f9i-";
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
                        c2 = '\n';
                        break;
                    }
                    case 0: {
                        c2 = '\\';
                        break;
                    }
                    case 1: {
                        c2 = '\u001a';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = '\u001a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "/\u007f-nc2}*7m8h0los{,nbqh<k\u007f9i-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "=o-r~3q<t";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "/\u007f-nc2}*7m8h0los{,nbqh<k\u007f9i-:l3hy{i?u,t~|";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "=o-rK?y6od(";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "/\u007f-nc2}*7m8h0los})i')t8lk5v8xf9";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "3{,nbn 1n~,ic5%+m.4m3u>vo=j0i$?u45k)n15n.s/\u007f$=j)~k({";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "/\u007f-nc2}*7m8h0los{,nbqh<k\u007f9i-:k/q0tm|]6um0\u007f\u0018o~4O-sf||6h*(u2\u007fd||6h*";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "p:-ua9tyrk/:;\u007fo2:+\u007fi9s/\u007fnr";
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
    
    ac(final SettingsGoogleDrive a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        try {
            Log.i(ac.z[7] + a7.a(this.b));
            SettingsGoogleDrive.a(this.a, GoogleAuthUtil.getToken((Context)this.a, this.b, ac.z[6], null));
            Log.i(ac.z[3] + a7.a(this.b) + ac.z[8]);
            final Intent intent = new Intent();
            intent.putExtra(ac.z[2], SettingsGoogleDrive.o(this.a));
            intent.putExtra(ac.z[4], this.b);
            this.a.onActivityResult(1, -1, intent);
            SettingsGoogleDrive.a(this.a).open();
        }
        catch (GooglePlayServicesAvailabilityException ex) {
            this.a.runOnUiThread((Runnable)new cl(this));
            Log.b(ac.z[5], ex);
            SettingsGoogleDrive.a(this.a, (String)null);
        }
        catch (UserRecoverableAuthException ex2) {
            SettingsGoogleDrive.a(this.a).close();
            SettingsGoogleDrive.a(this.a, (String)null);
            this.a.startActivityForResult(ex2.getIntent(), 1);
        }
        catch (IOException ex3) {
            try {
                Log.b(ac.z[1], ex3);
                SettingsGoogleDrive.a(this.a, (String)null);
                SettingsGoogleDrive.a(this.a).open();
                if (!this.a.isFinishing()) {
                    this.a.runOnUiThread((Runnable)new c2(this));
                }
            }
            catch (GooglePlayServicesAvailabilityException ex4) {
                throw ex4;
            }
        }
        catch (GoogleAuthException ex5) {
            Log.b(ac.z[0], ex5);
            SettingsGoogleDrive.a(this.a, (String)null);
            SettingsGoogleDrive.a(this.a).open();
            this.a.runOnUiThread((Runnable)new bl(this));
        }
    }
}
