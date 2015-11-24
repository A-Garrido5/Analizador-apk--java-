// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

final class a_3 implements Runnable
{
    private static final String z;
    final uc a;
    private final boolean b;
    
    static {
        final char[] charArray = "bp\u0011<qdk\u0015#s!|\u001d qc~\u001f'=gp\u000elroX\u00198Msz7)dOp\u0012)'!".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001d';
                    break;
                }
                case 0: {
                    c2 = '\u0001';
                    break;
                }
                case 1: {
                    c2 = '\u001f';
                    break;
                }
                case 2: {
                    c2 = '|';
                    break;
                }
                case 3: {
                    c2 = 'L';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a_3(final uc a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        Log.i(a_3.z + this.b);
        _o.b(this.a.a).ap.remove(this.a.b);
        if (this.b) {
            App.az();
        }
    }
}
