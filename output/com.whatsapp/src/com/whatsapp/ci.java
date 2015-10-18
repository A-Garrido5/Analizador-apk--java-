// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import android.app.Activity;
import android.content.Context;
import com.whatsapp.util.Log;
import com.whatsapp.fieldstats.aq;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class ci implements Preference$OnPreferenceClickListener
{
    private static final String[] z;
    final SettingsHelp a;
    
    static {
        final String[] z2 = new String[3];
        String s = "\t\u0000m\u0016\u000bG\fmN\u001c\u0007\fl\u0006\u001c\u001c\u000bt\n\u000b\u0011";
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
                        c2 = '\u007f';
                        break;
                    }
                    case 0: {
                        c2 = 'h';
                        break;
                    }
                    case 1: {
                        c2 = 'b';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001b\u0007v\u0017\u0016\u0006\u0005qL\u001e\n\rw\u0017";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001b\u0007v\u0017\u0016\u0006\u0005qL\u001e\n\rw\u0017P\u000b\nl\u0016\u0012H";
                    n2 = 2;
                    array = z2;
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
    
    ci(final SettingsHelp a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        aam.a(aq.CONTACT_US);
        if (!App.O()) {
            Log.i(ci.z[0]);
            if (this.a.isFinishing()) {
                return true;
            }
            this.a.showDialog(102);
            if (!App.I) {
                return true;
            }
        }
        final String e = ChangeNumber.e((Context)this.a);
        String string;
        if (e == null) {
            string = ci.z[1];
        }
        else {
            string = ci.z[2] + e;
        }
        a8s.a(new y5((Activity)this.a, this.a, false, true, string), new String[0]);
        return true;
    }
}
