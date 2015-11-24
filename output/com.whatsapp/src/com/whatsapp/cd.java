// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

final class cd
{
    private static final String[] z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    
    static {
        final String[] z2 = new String[4];
        String s = "N;[\u0014(\u0017k^\u000e\u000f\u0003oWZ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
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
                        c2 = 'b';
                        break;
                    }
                    case 1: {
                        c2 = '\u001b';
                        break;
                    }
                    case 2: {
                        c2 = '2';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "#\u007fV5\t\u0011n^\u0013\u0017\u0015zA4\u0019\u0001xW\u0014\u001f_";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "N;Q\u000f\r\u0016ZV\u0003\t\u0006&";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "N;Q\u000f\r\u0016N\\\u0006\u001e\u0001s[\u0011\t\u0006&";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public cd(final boolean c, final boolean d, final boolean b, final boolean a) {
        this.c = c;
        this.d = d;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public String toString() {
        return cd.z[1] + this.c + cd.z[2] + this.d + cd.z[0] + this.a + cd.z[3] + this.b + '}';
    }
}
