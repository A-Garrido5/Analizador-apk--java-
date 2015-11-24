// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.whatsapp.protocol.bi;

class asv implements aa0
{
    private static final String[] z;
    final CallsFragment a;
    
    static {
        final String[] z2 = new String[2];
        String s = "4o \\<xa\"s.;b\u0001Y<$k(";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'O';
                        break;
                    }
                    case 0: {
                        c2 = 'W';
                        break;
                    }
                    case 1: {
                        c2 = '\u000e';
                        break;
                    }
                    case 2: {
                        c2 = 'L';
                        break;
                    }
                    case 3: {
                        c2 = '0';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "4o \\<xa\"s.;b\t^+2j";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    asv(final CallsFragment a) {
        this.a = a;
    }
    
    @Override
    public void a(final bi bi) {
    }
    
    @Override
    public void a(final String s, final long n) {
    }
    
    @Override
    public void b(final bi bi) {
        Log.i(asv.z[1]);
        if (Voip.a(bi)) {
            return;
        }
        CallsFragment.d(this.a);
    }
    
    @Override
    public void c(final bi bi) {
        Log.i(asv.z[0]);
        CallsFragment.d(this.a);
    }
}
