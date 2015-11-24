// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class arl implements Runnable
{
    private static final String z;
    final ig a;
    
    static {
        final char[] charArray = "5cC_\u007f$\u007fL]s9b^\u0004}2~D_\u007f{cOZ\u007f$zH[5%iY\u0004w3\u007f^H}3#^Au!!CFn>eCN".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001a';
                    break;
                }
                case 0: {
                    c2 = 'V';
                    break;
                }
                case 1: {
                    c2 = '\f';
                    break;
                }
                case 2: {
                    c2 = '-';
                    break;
                }
                case 3: {
                    c2 = ')';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    arl(final ig a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(arl.z);
        ConversationsFragment.a(this.a.c).setVisibility(8);
    }
}
