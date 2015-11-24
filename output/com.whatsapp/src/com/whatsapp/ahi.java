// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ahi implements DialogInterface$OnClickListener
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "\u001a\u001frv5\u0012\u00158w?\u000f\u0005\u007fj=\b_ZK\u0019:%_K\u0014$\"YQ\b84IW\u001f/%_J\u001d(".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Z';
                    break;
                }
                case 0: {
                    c2 = '{';
                    break;
                }
                case 1: {
                    c2 = 'q';
                    break;
                }
                case 2: {
                    c2 = '\u0016';
                    break;
                }
                case 3: {
                    c2 = '\u0004';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ahi(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.startActivity(new Intent(ahi.z));
        Conversation.a_ = false;
        this.a.removeDialog(2);
    }
}
