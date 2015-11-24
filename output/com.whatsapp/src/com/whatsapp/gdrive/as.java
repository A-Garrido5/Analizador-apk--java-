// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.os.AsyncTask;
import com.whatsapp.a8s;
import com.whatsapp.wq;
import android.os.Environment;
import com.whatsapp.aam;
import com.whatsapp.fieldstats.aq;
import android.view.View;
import android.view.View$OnClickListener;

class as implements View$OnClickListener
{
    private static final String[] z;
    final SettingsGoogleDrive a;
    
    static {
        final String[] z2 = new String[2];
        String s = "88cAq03I]j";
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
                        c2 = '\u0005';
                        break;
                    }
                    case 0: {
                        c2 = 'U';
                        break;
                    }
                    case 1: {
                        c2 = 'W';
                        break;
                    }
                    case 2: {
                        c2 = '\u0016';
                        break;
                    }
                    case 3: {
                        c2 = '/';
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
                    s = "88cAq03";
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
    
    as(final SettingsGoogleDrive a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        aam.a(aq.BACKUP_CONVERSATIONS);
        final String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals(as.z[0])) {
            this.a.showDialog(601);
            return;
        }
        if (!externalStorageState.equals(as.z[1])) {
            this.a.showDialog(602);
            return;
        }
        a8s.a(new wq(this.a, new cj(this)), new Void[0]);
    }
}
