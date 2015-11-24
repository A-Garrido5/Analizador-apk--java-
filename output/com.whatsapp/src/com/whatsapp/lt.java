// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class lt implements View$OnClickListener
{
    private static final String z;
    final ContactInfo a;
    final adg b;
    
    static {
        final char[] charArray = "{S\t".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '0';
                    break;
                }
                case 0: {
                    c2 = '\u0011';
                    break;
                }
                case 1: {
                    c2 = ':';
                    break;
                }
                case 2: {
                    c2 = 'm';
                    break;
                }
                case 3: {
                    c2 = '>';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    lt(final ContactInfo a, final adg b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent(App.aq.getApplicationContext(), (Class)Conversation.class).putExtra(lt.z, adg.d(this.b)).addFlags(335544320));
    }
}
