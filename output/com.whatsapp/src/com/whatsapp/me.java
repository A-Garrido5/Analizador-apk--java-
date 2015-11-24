// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class me implements Preference$OnPreferenceClickListener
{
    private static final String z;
    final SettingsChat a;
    
    static {
        final char[] charArray = "6WR(\u0015\fRZ2\r<HJ".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'y';
                    break;
                }
                case 0: {
                    c2 = 'S';
                    break;
                }
                case 1: {
                    c2 = ':';
                    break;
                }
                case 2: {
                    c2 = '3';
                    break;
                }
                case 3: {
                    c2 = 'A';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    me(final SettingsChat a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        if (App.o || App.G) {
            final SettingsChat a = this.a;
            int n;
            if (App.aw()) {
                n = 2131231383;
            }
            else {
                n = 2131231384;
            }
            a.a(n);
            if (!App.I) {
                return true;
            }
        }
        final Intent intent = new Intent((Context)this.a, (Class)ContactPicker.class);
        intent.putExtra(me.z, true);
        this.a.startActivityForResult(intent, 104);
        return true;
    }
}
