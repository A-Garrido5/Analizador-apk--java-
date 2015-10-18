// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.Preference$OnPreferenceClickListener;
import com.whatsapp.fieldstats.aq;
import android.os.Bundle;

public class Settings extends DialogToastPreferenceActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u001f\u0003{k\u001c\u0010\u0014Gm\u0007\u0018\u000f";
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
                        c2 = 'i';
                        break;
                    }
                    case 0: {
                        c2 = '~';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = '\u0018';
                        break;
                    }
                    case 3: {
                        c2 = '\u0004';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0010\u000flm\u000f\u0017\u0003yp\u0000\u0011\u000ek";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\r\u0005lp\u0000\u0010\u0007k[\u0001\u001b\fh";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000e\u0012wb\u0000\u0012\u0005Gm\u0007\u0018\u000f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001d\u000fvp\b\u001d\u0014Gm\u0007\u0018\u000f";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\r\u0005lp\u0000\u0010\u0007k[\n\u0016\u0001l";
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
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        aam.a(aq.SETTINGS);
        this.addPreferencesFromResource(2131099653);
        this.findPreference((CharSequence)Settings.z[2]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new lo(this));
        this.findPreference((CharSequence)Settings.z[4]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new a9i(this));
        this.findPreference((CharSequence)Settings.z[3]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new al4(this));
        this.findPreference((CharSequence)Settings.z[0]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new s4(this));
        this.findPreference((CharSequence)Settings.z[5]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new dd(this));
        this.findPreference((CharSequence)Settings.z[1]).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new tq(this));
    }
}
