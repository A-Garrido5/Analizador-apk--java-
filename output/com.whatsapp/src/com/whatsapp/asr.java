// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class asr implements View$OnClickListener
{
    private static final String z;
    final ahs a;
    
    static {
        final char[] charArray = "^c\\pSVi\u0016kRKhVv\u0012^nLkSQ#nKyh".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '<';
                    break;
                }
                case 0: {
                    c2 = '?';
                    break;
                }
                case 1: {
                    c2 = '\r';
                    break;
                }
                case 2: {
                    c2 = '8';
                    break;
                }
                case 3: {
                    c2 = '\u0002';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    asr(final ahs a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final Intent intent = new Intent(asr.z);
        intent.setData(aah.i());
        this.a.c.startActivity(intent);
        this.a.c.finish();
    }
}
