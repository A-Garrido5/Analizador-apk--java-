// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.os.Bundle;

public class About extends DialogToastActivity
{
    private static final String z;
    
    static {
        final char[] charArray = "0uNKl3lI".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'B';
                    break;
                }
                case 0: {
                    c2 = '\u0002';
                    break;
                }
                case 1: {
                    c2 = '[';
                    break;
                }
                case 2: {
                    c2 = '\u007f';
                    break;
                }
                case 3: {
                    c2 = 'y';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130903065);
        ((TextView)this.findViewById(2131755124)).setText((CharSequence)(this.getString(2131231897) + " " + About.z));
    }
}
