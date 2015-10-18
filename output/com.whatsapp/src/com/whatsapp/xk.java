// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum xk implements b7
{
    public static final xk ALLOW;
    public static final xk FORWARD;
    public static final xk NONE;
    public static final xk UPGRADE;
    private static final String[] z;
    private final String a;
    
    static {
        final String[] z2 = new String[8];
        String s = "<p>!\b({";
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
                        c2 = 'I';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = '?';
                        break;
                    }
                    case 2: {
                        c2 = 'l';
                        break;
                    }
                    case 3: {
                        c2 = 'v';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0014P\u0002\u0013";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001bS\u0000\u0019>";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u000fO\u000b\u0004(\u001eZ";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ";s 9\u001e";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "4p\"3";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "/o+$\b>z";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u001cP\u001e\u0001(\b[";
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
        ALLOW = new xk(xk.z[4], 0, xk.z[2]);
        UPGRADE = new xk(xk.z[6], 1, xk.z[3]);
        FORWARD = new xk(xk.z[0], 2, xk.z[7]);
        NONE = new xk(xk.z[5], 3, xk.z[1]);
    }
    
    private xk(final String s, final int n, final String a) {
        this.a = a;
    }
    
    public static xk fromText(final String s) {
        final boolean k = a_9.k;
        final xk[] values = values();
        int n;
        for (int length = values.length, i = 0; i < length; i = n) {
            final xk xk = values[i];
            if (xk.getText().equals(s)) {
                return xk;
            }
            n = i + 1;
            if (k) {
                break;
            }
        }
        return getDefault();
    }
    
    public static xk getDefault() {
        return xk.NONE;
    }
    
    @Override
    public String getText() {
        return this.a;
    }
}
