// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class aay implements p5
{
    private static final String z;
    final CallsFragment a;
    
    static {
        final char[] charArray = "\u0018\n\u000fS)T\u0004\r|;\u0017\u0007/P=?\u000e\u000fZ.\u001e\u000f".toCharArray();
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
                    c2 = 'k';
                    break;
                }
                case 2: {
                    c2 = 'c';
                    break;
                }
                case 3: {
                    c2 = '?';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aay(final CallsFragment a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        Log.i(aay.z);
        CallsFragment.d(this.a);
    }
}
