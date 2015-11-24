// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum cF implements gp
{
    public static final cF CODE_SIZE;
    public static final int CODE_SIZE_VALUE = 2;
    public static final cF LITE_RUNTIME;
    public static final int LITE_RUNTIME_VALUE = 3;
    public static final cF SPEED;
    public static final int SPEED_VALUE = 1;
    private static dw a;
    private static final cF[] d;
    private static final cF[] e;
    private static final String[] z;
    private final int b;
    private final int c;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "<ky\u0010 \u0018iy\u00182\u001cvo\u000f\u001f\tqc\u000fV\u0010v,\u0013\u0019\r%j\u0012\u0004Yqd\u0014\u0005Yqu\r\u0013W".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'v';
                    break;
                }
                case 0: {
                    c2 = 'y';
                    break;
                }
                case 1: {
                    c2 = '\u0005';
                    break;
                }
                case 2: {
                    c2 = '\f';
                    break;
                }
                case 3: {
                    c2 = '}';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "5LX8)+PB)?4@".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'v';
                    break;
                }
                case 0: {
                    c4 = 'y';
                    break;
                }
                case 1: {
                    c4 = '\u0005';
                    break;
                }
                case 2: {
                    c4 = '\f';
                    break;
                }
                case 3: {
                    c4 = '}';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "*UI82".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'v';
                    break;
                }
                case 0: {
                    c6 = 'y';
                    break;
                }
                case 1: {
                    c6 = '\u0005';
                    break;
                }
                case 2: {
                    c6 = '\f';
                    break;
                }
                case 3: {
                    c6 = '}';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = ":JH8)*LV8".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'v';
                    break;
                }
                case 0: {
                    c8 = 'y';
                    break;
                }
                case 1: {
                    c8 = '\u0005';
                    break;
                }
                case 2: {
                    c8 = '\f';
                    break;
                }
                case 3: {
                    c8 = '}';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
        SPEED = new cF(cF.z[2], 0, 0, 1);
        CODE_SIZE = new cF(cF.z[3], 1, 1, 2);
        LITE_RUNTIME = new cF(cF.z[1], 2, 2, 3);
        d = new cF[] { cF.SPEED, cF.CODE_SIZE, cF.LITE_RUNTIME };
        cF.a = new b1();
        e = values();
    }
    
    private cF(final String s, final int n, final int c, final int b) {
        this.c = c;
        this.b = b;
    }
    
    public static final E getDescriptor() {
        return dZ.s().c().get(0);
    }
    
    public static dw internalGetValueMap() {
        return cF.a;
    }
    
    public static cF valueOf(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                try {
                    return cF.SPEED;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            case 2: {
                return cF.CODE_SIZE;
            }
            case 3: {
                return cF.LITE_RUNTIME;
            }
        }
    }
    
    public static cF valueOf(final dV dv) {
        try {
            if (dv.a() != getDescriptor()) {
                throw new IllegalArgumentException(cF.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return cF.e[dv.c()];
    }
    
    public final E getDescriptorForType() {
        return getDescriptor();
    }
    
    @Override
    public final int getNumber() {
        return this.b;
    }
    
    public final dV getValueDescriptor() {
        return getDescriptor().b().get(this.c);
    }
}
