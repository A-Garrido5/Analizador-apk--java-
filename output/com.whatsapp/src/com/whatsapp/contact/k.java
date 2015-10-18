// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

public enum k
{
    public static final k DELAYED;
    public static final k FAILED;
    public static final k IN_PROGRESS;
    public static final k NETWORK_UNAVAILABLE;
    public static final k UP_TO_DATE;
    public static final k USER_IS_EXPIRED;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "MtR<VK}_)WW";
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
                        c2 = '\u0004';
                        break;
                    }
                    case 0: {
                        c2 = '\u0004';
                        break;
                    }
                    case 1: {
                        c2 = ':';
                        break;
                    }
                    case 2: {
                        c2 = '\r';
                        break;
                    }
                    case 3: {
                        c2 = 'l';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "QjR8K[~L8A";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "J\u007fY;KVqR9JElL%HExA)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "@\u007fA-]A~";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "B{D A@";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "QiH>[MiR)\\Ts_)@";
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
        NETWORK_UNAVAILABLE = new k(k.z[2], 0);
        IN_PROGRESS = new k(k.z[0], 1);
        UP_TO_DATE = new k(k.z[1], 2);
        FAILED = new k(k.z[4], 3);
        DELAYED = new k(k.z[3], 4);
        USER_IS_EXPIRED = new k(k.z[5], 5);
    }
    
    private k(final String s, final int n) {
    }
    
    public boolean isFailure() {
        return this != k.IN_PROGRESS && !this.isSuccess();
    }
    
    public boolean isSuccess() {
        return this == k.UP_TO_DATE;
    }
}
