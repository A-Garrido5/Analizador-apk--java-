// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.ListPreference;
import android.os.Build;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

class m4 implements Preference$OnPreferenceChangeListener
{
    private static final String[] z;
    final SettingsNotifications a;
    
    static {
        final String[] z2 = new String[3];
        String s = "ad2\u0003\u0019@";
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
                        c2 = 'k';
                        break;
                    }
                    case 0: {
                        c2 = '%';
                        break;
                    }
                    case 1: {
                        c2 = '\u0001';
                        break;
                    }
                    case 2: {
                        c2 = 'A';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u00151\u0007,[\u0015";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "rh-\u000e\rLs$";
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
    
    m4(final SettingsNotifications a) {
        this.a = a;
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        if ((Build.MODEL.contains(m4.z[0]) || Build.MODEL.contains(m4.z[2])) && !o.toString().equals(m4.z[1])) {
            this.a.showDialog(7);
        }
        final ListPreference listPreference = (ListPreference)preference;
        preference.setTitle((CharSequence)this.a.getString(2131231711, new Object[] { listPreference.getEntries()[listPreference.findIndexOfValue((String)o)].toString() }));
        return true;
    }
}
