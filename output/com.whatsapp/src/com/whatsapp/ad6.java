// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum ad6 implements b7
{
    public static final ad6 ALLOW;
    public static final ad6 FORWARD;
    public static final ad6 NONE;
    public static final ad6 UPGRADE;
    private static final String[] z;
    private final String a;
    
    static {
        final String[] z2 = new String[8];
        String s = "6G\u0002Y";
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
                        c2 = '\u0013';
                        break;
                    }
                    case 0: {
                        c2 = 'X';
                        break;
                    }
                    case 1: {
                        c2 = '(';
                        break;
                    }
                    case 2: {
                        c2 = 'l';
                        break;
                    }
                    case 3: {
                        c2 = '<';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ">G\u001eKr*L";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001eg>kR\nl";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0019d sD";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "9D\u0000Sd";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0016g\"y";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "-X\u000bNr<M";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\rx+nR\u001cm";
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
        ALLOW = new ad6(ad6.z[3], 0, ad6.z[4]);
        UPGRADE = new ad6(ad6.z[7], 1, ad6.z[6]);
        FORWARD = new ad6(ad6.z[2], 2, ad6.z[1]);
        NONE = new ad6(ad6.z[5], 3, ad6.z[0]);
    }
    
    private ad6(final String s, final int n, final String a) {
        this.a = a;
    }
    
    public static ad6 fromText(final String s) {
        final boolean k = a_9.k;
        final ad6[] values = values();
        int n;
        for (int length = values.length, i = 0; i < length; i = n) {
            final ad6 ad6 = values[i];
            if (ad6.getText().equals(s)) {
                return ad6;
            }
            n = i + 1;
            if (k) {
                break;
            }
        }
        return getDefault();
    }
    
    public static ad6 getDefault() {
        return ad6.ALLOW;
    }
    
    @Override
    public String getText() {
        return this.a;
    }
}
