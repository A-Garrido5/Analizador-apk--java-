// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

enum h
{
    public static final h DEFERRED;
    public static final h FAILURE;
    public static final h SUCCESS;
    private static final h[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "+:\u0015km?>";
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
                        c2 = '8';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = '{';
                        break;
                    }
                    case 2: {
                        c2 = '\\';
                        break;
                    }
                    case 3: {
                        c2 = '\'';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ">.\u001fd}>(";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ")>\u001abj?>\u0018";
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
        SUCCESS = new h(h.z[1], 0);
        FAILURE = new h(h.z[0], 1);
        DEFERRED = new h(h.z[2], 2);
        a = new h[] { h.SUCCESS, h.FAILURE, h.DEFERRED };
    }
    
    private h(final String s, final int n) {
    }
}
