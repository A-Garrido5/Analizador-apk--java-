// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class w0 implements Runnable
{
    private static final String z;
    final pr a;
    
    static {
        final char[] charArray = "&Y\u0018dO)Q\u0019jZ$S\u0018h\u0006 N\u000f}H\"Y\u000eo\u00063]\u0004cF$\u0011\u0019yH\"HGiK}N\u000f~]?N\u000f D9O\u0019dG7\u0011\u0001".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ')';
                    break;
                }
                case 0: {
                    c2 = 'P';
                    break;
                }
                case 1: {
                    c2 = '<';
                    break;
                }
                case 2: {
                    c2 = 'j';
                    break;
                }
                case 3: {
                    c2 = '\r';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    w0(final pr a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        Log.i(w0.z);
        pr.a(this.a).runOnUiThread((Runnable)new qv(this));
    }
}
