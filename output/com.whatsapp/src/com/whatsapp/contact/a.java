// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

public enum a
{
    public static final a CHUNKED;
    public static final a DELTA;
    public static final a FULL;
    public static final a QUERY;
    private static final String[] z;
    private final String a;
    
    static {
        final String[] z2 = new String[8];
        String s = "\"\u001e\u001ai#";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'B';
                        break;
                    }
                    case 0: {
                        c2 = 'F';
                        break;
                    }
                    case 1: {
                        c2 = '{';
                        break;
                    }
                    case 2: {
                        c2 = 'v';
                        break;
                    }
                    case 3: {
                        c2 = '\u001d';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u00053#S\t\u0003?";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0000.:Q";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0002>:I\u0003";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "%\u0013\u0003s)#\u001f";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = " \u000e\u001aq";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0017.3O\u001b";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "7\u000e\u0013o;";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        FULL = new a(a.z[2], 0, a.z[5]);
        DELTA = new a(a.z[3], 1, a.z[0]);
        QUERY = new a(a.z[6], 2, a.z[7]);
        CHUNKED = new a(a.z[1], 3, a.z[4]);
    }
    
    private a(final String s, final int n, final String a) {
        this.a = a;
    }
    
    public String getModeString() {
        return this.a;
    }
}
