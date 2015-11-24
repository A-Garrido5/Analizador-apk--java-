// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

public class bt
{
    public static int b;
    public static int g;
    public static float j;
    private static final String[] z;
    public int a;
    public double c;
    public long d;
    public String e;
    public double f;
    public float h;
    public int i;
    
    static {
        final String[] z2 = new String[7];
        int n = 0;
        String[] array = z2;
        String s = "\u001f[\u0001\u001c\u0004M[\u0001\u0006L";
        int n2 = -1;
        String intern = null;
    Label_0201:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = '?';
                        break;
                    }
                    case 1: {
                        c2 = ':';
                        break;
                    }
                    case 2: {
                        c2 = 'b';
                        break;
                    }
                    case 3: {
                        c2 = '\u007f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n] = intern;
                    s = "\u001fN\u000b\u0012\u0014LN\u0003\u0012\u0001\u0002";
                    n = 1;
                    array = z2;
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n] = intern;
                    s = "do\u0011\u001a\u0003sU\u0001\u001e\u0005VU\f_\u001bV^_";
                    n = 2;
                    array = z2;
                    n2 = 1;
                    continue;
                }
                case 1: {
                    array[n] = intern;
                    s = "\u001fV\r\u0011\u0016VN\u0017\u001b\u0014\u0002";
                    n = 3;
                    array = z2;
                    n2 = 2;
                    continue;
                }
                case 2: {
                    array[n] = intern;
                    n = 4;
                    array = z2;
                    s = "\u001fX\u0007\u001e\u0003VT\u0005B";
                    n2 = 3;
                    continue;
                }
                case 3: {
                    array[n] = intern;
                    n = 5;
                    s = "\u001fV\u0003\u000b\u0018KO\u0006\u001aL";
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n] = intern;
                    n = 6;
                    s = "\u001fI\u0012\u001a\u0014[\u0007";
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0201;
                }
            }
        }
        array[n] = intern;
        z = z2;
        bt.g = -1;
        bt.j = -1.0f;
        bt.b = -1;
    }
    
    public bt() {
        this.a = bt.g;
        this.h = bt.j;
        this.i = bt.b;
    }
    
    public boolean a() {
        return this.d > 0L;
    }
    
    @Override
    public String toString() {
        return bt.z[2] + this.e + bt.z[5] + this.f + bt.z[3] + this.c + bt.z[0] + this.a + bt.z[6] + this.h + bt.z[4] + this.i + bt.z[1] + this.d + "]";
    }
}
