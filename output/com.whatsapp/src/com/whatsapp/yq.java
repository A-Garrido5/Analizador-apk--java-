// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;

public class yq
{
    private static final String[] z;
    public boolean a;
    public String b;
    
    static {
        final String[] z2 = new String[2];
        String s = "n[an\u0018k[l|\u001fwVql\u001ekVg}\tqDma\u001fg\\ca\bnQp \u001fwWaj\u001fq\u0014";
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
                        c2 = 'l';
                        break;
                    }
                    case 0: {
                        c2 = '\u0002';
                        break;
                    }
                    case 1: {
                        c2 = '4';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = '\u000f';
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
                    s = "n[an\u0018k[l|\u001fwVql\u001ekVg}\tqDma\u001fg\\ca\bnQp \tpFm}L";
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
    
    yq(final String b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    public void a(final int n) {
        Log.i(yq.z[0] + n);
    }
    
    public void b(final int n) {
        Log.e(yq.z[1] + n);
    }
}
