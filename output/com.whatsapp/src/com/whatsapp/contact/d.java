// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

public enum d
{
    public static final d BACKGROUND;
    public static final d INTERACTIVE;
    public static final d REGISTRATION;
    private static final String[] z;
    private final String b;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u000bL\u0014d|\u0003A\u0014hx\u0007";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '.';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = '\u0002';
                        break;
                    }
                    case 2: {
                        c2 = '@';
                        break;
                    }
                    case 3: {
                        c2 = '!';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0000C\u0003ji\u0010M\u0015oj";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = " c#JI0m5OJ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0010G\u0007h}\u0016P\u0001ug\rL";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "0g'H]6p!UG-l";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "+l4D\\#a4HX'";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        REGISTRATION = new d(d.z[3], 0, d.z[4]);
        INTERACTIVE = new d(d.z[0], 1, d.z[5]);
        BACKGROUND = new d(d.z[1], 2, d.z[2]);
    }
    
    private d(final String s, final int n, final String b) {
        this.b = b;
    }
    
    public String getContextString() {
        return this.b;
    }
}
