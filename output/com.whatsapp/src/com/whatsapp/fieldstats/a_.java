// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum a_
{
    public static final a_ DELIVERED;
    public static final a_ PLAYED;
    public static final a_ READ;
    private static final a_[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[3];
        String s = "{pqvkzgx{";
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
                        c2 = '=';
                        break;
                    }
                    case 0: {
                        c2 = '?';
                        break;
                    }
                    case 1: {
                        c2 = '5';
                        break;
                    }
                    case 2: {
                        c2 = '=';
                        break;
                    }
                    case 3: {
                        c2 = '?';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "oy|fx{";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "mp|{";
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
        DELIVERED = new a_(a_.z[0], 0, 1);
        READ = new a_(a_.z[2], 1, 2);
        PLAYED = new a_(a_.z[1], 2, 3);
        a = new a_[] { a_.DELIVERED, a_.READ, a_.PLAYED };
    }
    
    private a_(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
