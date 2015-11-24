// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import com.whatsapp.util.Log;

class bl implements Runnable
{
    private static final String z;
    final ac a;
    
    static {
        final char[] charArray = "9\u0000\u000bXA$\u0002\f\u0001O.\u0017\u0016ZMe\u0004\nX@g\u0017\u001a]]/\u0016\u000b\f]$\u0004\u001d@Mj\u0011\u0010\fI)\u0006\u001a_[j".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '(';
                    break;
                }
                case 0: {
                    c2 = 'J';
                    break;
                }
                case 1: {
                    c2 = 'e';
                    break;
                }
                case 2: {
                    c2 = '\u007f';
                    break;
                }
                case 3: {
                    c2 = ',';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    bl(final ac a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.e(bl.z + this.a.b);
        if (!this.a.a.isFinishing()) {
            new AlertDialog$Builder((Context)this.a.a).setTitle(2131232127).setTitle(2131232140).setPositiveButton(2131231435, null).show();
        }
        GoogleDriveService.c(0);
        SettingsGoogleDrive.p(this.a.a).setText((CharSequence)SettingsGoogleDrive.f(this.a.a)[SettingsGoogleDrive.j(this.a.a)]);
    }
}
