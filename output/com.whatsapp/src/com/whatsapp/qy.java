// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

abstract class qy implements w2
{
    private static final String z;
    protected final a_9 a;
    
    static {
        final char[] charArray = "x\u0019S-<{\u0019S6}z\bT#&j\u001b_,&n\u001bDm;a\u000eQ.;k".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'R';
                    break;
                }
                case 0: {
                    c2 = '\u000f';
                    break;
                }
                case 1: {
                    c2 = 'x';
                    break;
                }
                case 2: {
                    c2 = '0';
                    break;
                }
                case 3: {
                    c2 = 'B';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public qy(final a_9 a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final a_9 a_9) {
        if (a_9 != this.a) {
            if (this.a.u == null) {
                Log.e(qy.z);
                return false;
            }
            if (!this.a.u.equals(a_9.u) || !this.b(a_9)) {
                return false;
            }
        }
        return true;
    }
    
    protected abstract boolean b(final a_9 p0);
}
