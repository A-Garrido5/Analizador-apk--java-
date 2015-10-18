// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.Preference$OnPreferenceClickListener;
import com.whatsapp.fieldstats.aq;
import android.os.Bundle;

public class SettingsAccount extends DialogToastPreferenceActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "V,,\u007f3Y;\u0010y(Q ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
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
                        c2 = '7';
                        break;
                    }
                    case 1: {
                        c2 = 'O';
                        break;
                    }
                    case 2: {
                        c2 = 'O';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "G=&f'T6";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "S*#u2R\u0010.s%X:!d";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "Y*;g)E$\u0010e5V(*";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "T'.~!R\u0010!e+U*=";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        aam.a(aq.ACCOUNT);
        this.addPreferencesFromResource(2131099654);
        this.findPreference((CharSequence)SettingsAccount.z[0]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new a8c(this));
        this.findPreference((CharSequence)SettingsAccount.z[3]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new gs(this));
        this.findPreference((CharSequence)SettingsAccount.z[4]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new bb(this));
        this.findPreference((CharSequence)SettingsAccount.z[2]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new ch(this));
        this.findPreference((CharSequence)SettingsAccount.z[1]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new al0(this));
    }
}
