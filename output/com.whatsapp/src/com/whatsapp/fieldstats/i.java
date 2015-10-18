// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum i
{
    public static final i AUDIO;
    public static final i CONTACT;
    public static final i LOCATION;
    public static final i NONE;
    public static final i PHOTO;
    public static final i PTT;
    public static final i VIDEO;
    private static final i[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[7];
        String s = "a\"uN\u0018a9";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Y';
                        break;
                    }
                    case 0: {
                        c2 = '\"';
                        break;
                    }
                    case 1: {
                        c2 = 'm';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = '\u001a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "t$\u007f_\u0016";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "r9o";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "n\"x[\rk\"u";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "r%tN\u0016";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "c8\u007fS\u0016";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "l\"u_";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        NONE = new i(i.z[6], 0, 1);
        PHOTO = new i(i.z[4], 1, 2);
        VIDEO = new i(i.z[1], 2, 3);
        AUDIO = new i(i.z[5], 3, 4);
        PTT = new i(i.z[2], 4, 5);
        LOCATION = new i(i.z[3], 5, 6);
        CONTACT = new i(i.z[0], 6, 7);
        b = new i[] { i.NONE, i.PHOTO, i.VIDEO, i.AUDIO, i.PTT, i.LOCATION, i.CONTACT };
    }
    
    private i(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
