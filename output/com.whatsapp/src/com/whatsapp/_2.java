// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class _2
{
    private static final String[] z;
    public int a;
    public String b;
    public byte[] c;
    public int d;
    public byte[] e;
    
    static {
        final String[] z2 = new String[3];
        String s = "qYC)&d\\";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
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
                        c2 = '\u0001';
                        break;
                    }
                    case 1: {
                        c2 = '+';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = '_';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "hFG8*";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "hFG8*";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public _2(final String b, final int a, final int d) {
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public _2(final String b, final byte[] c, final byte[] e, final int a) {
        this.b = b;
        this.c = c;
        this.e = e;
        this.a = a;
    }
    
    public String a() {
        if (this.d == 1) {
            return _2.z[2];
        }
        if (this.d == 2) {
            return _2.z[0];
        }
        return _2.z[1];
    }
}
