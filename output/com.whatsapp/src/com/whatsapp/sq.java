// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import android.app.Activity;
import com.whatsapp.util.Log;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class sq implements Preference$OnPreferenceClickListener
{
    private static final String z;
    final SettingsHelp a;
    
    static {
        final char[] charArray = "{E~\u0017/fGyL%`Ei\b5qS~\u0006+{Tk\u00173{\u000fd\fkkOd\r#kTc\u0015/|Y".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'F';
                    break;
                }
                case 0: {
                    c2 = '\b';
                    break;
                }
                case 1: {
                    c2 = ' ';
                    break;
                }
                case 2: {
                    c2 = '\n';
                    break;
                }
                case 3: {
                    c2 = 'c';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    sq(final SettingsHelp a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        if (!App.O()) {
            Log.i(sq.z);
            this.a.f(this.a.getString(2131231532, new Object[] { this.a.getString(2131230921) }));
            if (!App.I) {
                return true;
            }
        }
        a8s.a(new y5((Activity)this.a, this.a, true, true, ""), new String[0]);
        return true;
    }
}
