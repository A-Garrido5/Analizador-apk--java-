// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import android.os.Environment;
import com.whatsapp.fieldstats.aq;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class bd implements Preference$OnPreferenceClickListener
{
    private static final String[] z;
    final SettingsChat a;
    
    static {
        final String[] z2 = new String[2];
        String s = "0E5O&8N";
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
                        c2 = 'R';
                        break;
                    }
                    case 0: {
                        c2 = ']';
                        break;
                    }
                    case 1: {
                        c2 = '*';
                        break;
                    }
                    case 2: {
                        c2 = '@';
                        break;
                    }
                    case 3: {
                        c2 = '!';
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
                    s = "0E5O&8N\u001fS=";
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
    
    bd(final SettingsChat a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        aam.a(aq.BACKUP_CONVERSATIONS);
        final String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals(bd.z[1])) {
            this.a.showDialog(601);
            return true;
        }
        if (!externalStorageState.equals(bd.z[0])) {
            this.a.showDialog(602);
            return true;
        }
        a8s.a(new wq(this.a, new ar8(this)), new Void[0]);
        return true;
    }
}
