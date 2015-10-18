// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.preference.Preference;

class aqn implements Runnable
{
    private static final String z;
    final a_6 a;
    
    static {
        final char[] charArray = "\t&31A\u000b'1\u001dT\u00166<+C\u0001\n5.Y;6<#A\u0017".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '5';
                    break;
                }
                case 0: {
                    c2 = 'd';
                    break;
                }
                case 1: {
                    c2 = 'U';
                    break;
                }
                case 2: {
                    c2 = 'T';
                    break;
                }
                case 3: {
                    c2 = 'B';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aqn(final a_6 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a.b.removeDialog(6);
        final Preference preference = this.a.a.b.findPreference((CharSequence)aqn.z);
        final int h = z8.h();
        final int a = z8.a();
        int title;
        if (h > 0 || a == 0) {
            title = 2131230820;
        }
        else {
            title = 2131231863;
        }
        preference.setTitle(title);
    }
}
