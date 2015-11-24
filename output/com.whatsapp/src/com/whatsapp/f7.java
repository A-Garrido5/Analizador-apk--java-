// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class f7 implements View$OnClickListener
{
    private static final String z;
    final InsufficientStorageSpaceActivity a;
    
    static {
        final char[] charArray = "T?\u00184\u000f\\5R5\u0005A%\u0015(\u0007F\u007f5\b4p\u00032\u0007,j\u0002(\t2t\u00169\u00193p\u0005(\u000f.r\u0002".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '`';
                    break;
                }
                case 0: {
                    c2 = '5';
                    break;
                }
                case 1: {
                    c2 = 'Q';
                    break;
                }
                case 2: {
                    c2 = '|';
                    break;
                }
                case 3: {
                    c2 = 'F';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    f7(final InsufficientStorageSpaceActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent(f7.z));
    }
}
