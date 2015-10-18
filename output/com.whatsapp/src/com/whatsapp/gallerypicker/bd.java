// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

public class bd
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "n+~8$ ";
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
                        c2 = 'K';
                        break;
                    }
                    case 0: {
                        c2 = '\u000f';
                        break;
                    }
                    case 1: {
                        c2 = '^';
                        break;
                    }
                    case 2: {
                        c2 = '\u001a';
                        break;
                    }
                    case 3: {
                        c2 = 'Q';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "y7~4$ ";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "f3{6. ";
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
    
    public static boolean a(final bj bj) {
        return c(bj.e());
    }
    
    public static boolean a(final String s) {
        return s != null && s.startsWith(bd.z[1]);
    }
    
    public static boolean b(final bj bj) {
        return a(bj.e());
    }
    
    public static boolean b(final String s) {
        return s != null && s.startsWith(bd.z[0]);
    }
    
    public static boolean c(final bj bj) {
        return b(bj.e());
    }
    
    public static boolean c(final String s) {
        return s != null && s.startsWith(bd.z[2]);
    }
}
