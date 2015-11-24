// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.fieldstats.aq;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class nk implements Preference$OnPreferenceClickListener
{
    private static final String[] z;
    final SettingsHelp a;
    
    static {
        final String[] z2 = new String[2];
        String s = "{\u0019Z)\u001es\u0013\u00102\u001fn\u0012P/_{\u0014J2\u001etYh\u00124M";
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
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = '\u001a';
                        break;
                    }
                    case 1: {
                        c2 = 'w';
                        break;
                    }
                    case 2: {
                        c2 = '>';
                        break;
                    }
                    case 3: {
                        c2 = '[';
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
                    s = "r\u0003J+\u0002 X\u0011,\u0006mYI3\u0010n\u0004_+\u00014\u0014Q6^|\u0016Ot";
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
    
    nk(final SettingsHelp a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        aam.a(aq.FAQ);
        this.a.startActivity(new Intent(nk.z[0], Uri.parse(nk.z[1])));
        return true;
    }
}
