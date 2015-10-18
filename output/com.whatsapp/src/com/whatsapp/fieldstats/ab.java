// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum ab
{
    public static final ab EMAIL_SEND;
    public static final ab PROBLEM_DESCRIPTION;
    public static final ab SUGGESTED_FAQ;
    private static final ab[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[3];
        String s = "q\u0001\u0002;5k\u001f\u0006<=";
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
                        c2 = 'y';
                        break;
                    }
                    case 0: {
                        c2 = '4';
                        break;
                    }
                    case 1: {
                        c2 = 'L';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = 'r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "d\u001e\f05q\u0001\u001c6<g\u000f\u0011;)`\u0005\f<";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "g\u0019\u00045<g\u0018\u00066&r\r\u0012";
                    n2 = 2;
                    array = z2;
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
        PROBLEM_DESCRIPTION = new ab(ab.z[1], 0, 1);
        SUGGESTED_FAQ = new ab(ab.z[2], 1, 2);
        EMAIL_SEND = new ab(ab.z[0], 2, 3);
        b = new ab[] { ab.PROBLEM_DESCRIPTION, ab.SUGGESTED_FAQ, ab.EMAIL_SEND };
    }
    
    private ab(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
