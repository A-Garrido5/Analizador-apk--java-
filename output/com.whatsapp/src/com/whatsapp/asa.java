// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

class asa implements Runnable
{
    private static final String z;
    final App a;
    
    static {
        final char[] charArray = "P\u0000\u0011k\u0000E\u000bT\"\u0018\u0000\u001c\u001b?KY\u0017\u0000k\u0018E\u001c\u0000k\u001fOR\u0007.\u0019V\u0017\u0006pKS\u0011\u001c.\u000fU\u001e\u001d%\f\u0000\u0002\u0006.KK\u0017\rk\u0018E\u001c\u0010\"\u0005G".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'k';
                    break;
                }
                case 0: {
                    c2 = ' ';
                    break;
                }
                case 1: {
                    c2 = 'r';
                    break;
                }
                case 2: {
                    c2 = 't';
                    break;
                }
                case 3: {
                    c2 = 'K';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    asa(final App a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.a2.i()) {
            Log.i(asa.z);
            App.a4().post((Runnable)new aqp(this, this.a.a2.a(), this.a.a2.b(), this.a.a2.e(), this.a.a2.g().b()));
        }
    }
}
