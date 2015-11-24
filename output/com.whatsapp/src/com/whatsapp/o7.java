// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum o7 implements b7
{
    public static final o7 ALLOW;
    public static final o7 FORWARD;
    public static final o7 NONE;
    public static final o7 UPGRADE;
    private static final String[] z;
    private final String b;
    
    static {
        final String[] z2 = new String[8];
        String s = "\u0002\u0012 T\u001a";
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
                        c2 = 'M';
                        break;
                    }
                    case 0: {
                        c2 = 'C';
                        break;
                    }
                    case 1: {
                        c2 = '^';
                        break;
                    }
                    case 2: {
                        c2 = 'l';
                        break;
                    }
                    case 3: {
                        c2 = '\u001b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0005\u0011>L\f\u0011\u001a";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "%1\u001el,1:";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "-1\u0002~";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\"2\u0000t:";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\r\u0011\"^";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0016\u000e+I\f\u0007\u001b";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "6.\u000bi,';";
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
        ALLOW = new o7(o7.z[0], 0, o7.z[4]);
        UPGRADE = new o7(o7.z[6], 1, o7.z[7]);
        FORWARD = new o7(o7.z[1], 2, o7.z[2]);
        NONE = new o7(o7.z[5], 3, o7.z[3]);
    }
    
    private o7(final String s, final int n, final String b) {
        this.b = b;
    }
    
    public static o7 fromText(final String s) {
        final boolean k = a_9.k;
        final o7[] values = values();
        int n;
        for (int length = values.length, i = 0; i < length; i = n) {
            final o7 o7 = values[i];
            if (o7.getText().equals(s)) {
                return o7;
            }
            n = i + 1;
            if (k) {
                break;
            }
        }
        return getDefault();
    }
    
    public static o7 getDefault() {
        return o7.NONE;
    }
    
    @Override
    public String getText() {
        return this.b;
    }
}
