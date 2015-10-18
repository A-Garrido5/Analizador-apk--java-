// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.util.Log;

class cr implements Runnable
{
    private static final String z;
    final b0 a;
    
    static {
        final char[] charArray = "\"LW\u0004}?NP]s5[J\u0006q~ZF\u00049<LP\u0003u6L\f\u0003|>^\u000e\u001e{%AJ\u001es".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0014';
                    break;
                }
                case 0: {
                    c2 = 'Q';
                    break;
                }
                case 1: {
                    c2 = ')';
                    break;
                }
                case 2: {
                    c2 = '#';
                    break;
                }
                case 3: {
                    c2 = 'p';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    cr(final b0 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(cr.z);
        SettingsGoogleDrive.r(this.a.b).setVisibility(8);
        SettingsGoogleDrive.c(this.a.b).setVisibility(8);
        SettingsGoogleDrive.l(this.a.b).setVisibility(8);
        SettingsGoogleDrive.g(this.a.b).setVisibility(8);
    }
}
