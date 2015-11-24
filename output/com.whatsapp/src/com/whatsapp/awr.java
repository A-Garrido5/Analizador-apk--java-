// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.util.undobar.a;

class awr implements a
{
    private static final String z;
    final tg a;
    
    static {
        final char[] charArray = "\u00008\u0005".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Z';
                    break;
                }
                case 0: {
                    c2 = 'j';
                    break;
                }
                case 1: {
                    c2 = 'Q';
                    break;
                }
                case 2: {
                    c2 = 'a';
                    break;
                }
                case 3: {
                    c2 = '`';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    awr(final tg a) {
        this.a = a;
    }
    
    @Override
    public void b(final Parcelable parcelable) {
        if (parcelable != null) {
            final String string = ((Bundle)parcelable).getString(awr.z);
            ConversationsFragment.a(this.a.a.a, string);
            App.ak.c(string, false);
        }
    }
}
