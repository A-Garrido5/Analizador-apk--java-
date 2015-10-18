// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.preference.WaPrivacyPreference;
import android.content.Context;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;

class aq2 implements Preference$OnPreferenceChangeListener
{
    private static final String[] z;
    final SettingsPrivacy a;
    
    static {
        final String[] z2 = new String[6];
        String s = ",wt\u0007'?|B\u001d'/qB\u0002#9k";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = '\\';
                        break;
                    }
                    case 1: {
                        c2 = '\u0005';
                        break;
                    }
                    case 2: {
                        c2 = '\u001d';
                        break;
                    }
                    case 3: {
                        c2 = 'q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "0dn\u0005";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "/q|\u00053/";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ",wt\u0007'?|B\u000143ct\u001d#\u0003uu\u001e23";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ",wr\u0017/0`";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ",wt\u0007'?|B\u00022=qh\u0002";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    aq2(final SettingsPrivacy a) {
        this.a = a;
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        if (!App.O()) {
            App.a((Context)this.a, 2131230906, 0);
            return false;
        }
        final WaPrivacyPreference waPrivacyPreference = (WaPrivacyPreference)preference;
        final int indexOfValue = waPrivacyPreference.findIndexOfValue((String)o);
        waPrivacyPreference.setSummary((CharSequence)waPrivacyPreference.getEntries()[indexOfValue].toString());
        waPrivacyPreference.a(true);
        waPrivacyPreference.setEnabled(false);
        final String key = preference.getKey();
        String s;
        if (aq2.z[0].equals(key)) {
            s = aq2.z[1];
        }
        else if (aq2.z[3].equals(key)) {
            s = aq2.z[4];
        }
        else {
            final boolean equals = aq2.z[5].equals(key);
            s = null;
            if (equals) {
                s = aq2.z[2];
            }
        }
        final String a = SettingsPrivacy.a(indexOfValue);
        SettingsPrivacy.e().put(s, new db(s, a));
        App.av();
        App.a(s, a);
        SettingsPrivacy.b().removeCallbacks(SettingsPrivacy.d());
        SettingsPrivacy.b().postDelayed(SettingsPrivacy.d(), 20000L);
        return true;
    }
}
