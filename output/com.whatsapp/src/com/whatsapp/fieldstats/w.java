// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum w
{
    public static final w APNS_PUSH;
    public static final w GCM_PUSH;
    public static final w IOS_VOIP_PUSH;
    public static final w NONE;
    public static final w ONLINE;
    public static final w UNKNOWN;
    private static final w[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u0019{]kY\u000bkX";
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
                        c2 = '\t';
                        break;
                    }
                    case 0: {
                        c2 = '^';
                        break;
                    }
                    case 1: {
                        c2 = '8';
                        break;
                    }
                    case 2: {
                        c2 = '\u0010';
                        break;
                    }
                    case 3: {
                        c2 = '4';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001fh^gV\u000emC|";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0011v\\}G\u001b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0010w^q";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0017wCk_\u0011q@kY\u000bkX";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u000bv[zF\tv";
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
        NONE = new w(w.z[3], 0, 0);
        UNKNOWN = new w(w.z[5], 1, 1);
        APNS_PUSH = new w(w.z[1], 2, 2);
        IOS_VOIP_PUSH = new w(w.z[4], 3, 3);
        GCM_PUSH = new w(w.z[0], 4, 4);
        ONLINE = new w(w.z[2], 5, 5);
        b = new w[] { w.NONE, w.UNKNOWN, w.APNS_PUSH, w.IOS_VOIP_PUSH, w.GCM_PUSH, w.ONLINE };
    }
    
    private w(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
