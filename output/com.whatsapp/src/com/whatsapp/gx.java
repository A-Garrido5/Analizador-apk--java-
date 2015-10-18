// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceClickListener;

class gx implements Preference$OnPreferenceClickListener
{
    private static final String z;
    final SettingsContacts a;
    
    static {
        final char[] charArray = "l\u001c\t&[l\u0007".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ':';
                    break;
                }
                case 0: {
                    c2 = '\u000f';
                    break;
                }
                case 1: {
                    c2 = 's';
                    break;
                }
                case 2: {
                    c2 = 'g';
                    break;
                }
                case 3: {
                    c2 = 'R';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    gx(final SettingsContacts a) {
        this.a = a;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        final Intent intent = new Intent((Context)this.a, (Class)AccountInfoActivity.class);
        intent.putExtra(gx.z, true);
        this.a.startActivity(intent);
        return true;
    }
}
