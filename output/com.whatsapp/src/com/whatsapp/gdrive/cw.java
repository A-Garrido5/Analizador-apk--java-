// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class cw implements View$OnClickListener
{
    private static final String[] z;
    final GoogleDriveNewUserSetupActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\nN\\\u007fH_\\\u001dzQO]HyMIU\u001duP\n";
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
                        c2 = '#';
                        break;
                    }
                    case 0: {
                        c2 = '*';
                        break;
                    }
                    case 1: {
                        c2 = ',';
                        break;
                    }
                    case 2: {
                        c2 = '=';
                        break;
                    }
                    case 3: {
                        c2 = '\u001c';
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
                    s = "MHOuUO\u0001SyT\u0007YNyQ\u0007_XhVZ\u0003^nFKXX<EE^\u001d}@ICHrW\n";
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
    
    cw(final GoogleDriveNewUserSetupActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final String o = GoogleDriveService.o();
        final int ae = GoogleDriveService.ae();
        Log.i(cw.z[1] + a7.a(o) + cw.z[0] + ae);
        if (ae != 0 && o == null) {
            new AlertDialog$Builder((Context)this.a).setMessage(2131231993).setTitle(2131232127).setPositiveButton(2131231435, null).show();
            if (GoogleDriveService.F == 0) {
                return;
            }
        }
        this.a.setResult(-1);
        this.a.finish();
    }
}
