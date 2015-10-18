// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum bb implements gp
{
    public static final bb CORD;
    public static final int CORD_VALUE = 1;
    public static final bb STRING;
    public static final bb STRING_PIECE;
    public static final int STRING_PIECE_VALUE = 2;
    public static final int STRING_VALUE;
    private static final bb[] a;
    private static dw b;
    private static final bb[] c;
    private static final String[] z;
    private final int d;
    private final int e;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "w\u0001\bF=S\u0003\bN/W\u001c\u001eY\u0002B\u001b\u0012YK[\u001c]E\u0004FO\u001bD\u0019\u0012\u001b\u0015B\u0018\u0012\u001b\u0004[\u000e\u001c".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c2 = charArray[n];
            char c3 = '\0';
            switch (n % 5) {
                default: {
                    c3 = 'k';
                    break;
                }
                case 0: {
                    c3 = '2';
                    break;
                }
                case 1: {
                    c3 = 'o';
                    break;
                }
                case 2: {
                    c3 = '}';
                    break;
                }
                case 3: {
                    c3 = '+';
                    break;
                }
            }
            charArray[n] = (char)(c3 ^ c2);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "a;/b%u".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c4 = charArray2[n2];
            char c5 = '\0';
            switch (n2 % 5) {
                default: {
                    c5 = 'k';
                    break;
                }
                case 0: {
                    c5 = '2';
                    break;
                }
                case 1: {
                    c5 = 'o';
                    break;
                }
                case 2: {
                    c5 = '}';
                    break;
                }
                case 3: {
                    c5 = '+';
                    break;
                }
            }
            charArray2[n2] = (char)(c5 ^ c4);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "q /o".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c6 = charArray3[n3];
            char c7 = '\0';
            switch (n3 % 5) {
                default: {
                    c7 = 'k';
                    break;
                }
                case 0: {
                    c7 = '2';
                    break;
                }
                case 1: {
                    c7 = 'o';
                    break;
                }
                case 2: {
                    c7 = '}';
                    break;
                }
                case 3: {
                    c7 = '+';
                    break;
                }
            }
            charArray3[n3] = (char)(c7 ^ c6);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "a;/b%u0-b.q*".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c8 = charArray4[n4];
            char c9 = '\0';
            switch (n4 % 5) {
                default: {
                    c9 = 'k';
                    break;
                }
                case 0: {
                    c9 = '2';
                    break;
                }
                case 1: {
                    c9 = 'o';
                    break;
                }
                case 2: {
                    c9 = '}';
                    break;
                }
                case 3: {
                    c9 = '+';
                    break;
                }
            }
            charArray4[n4] = (char)(c9 ^ c8);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
        STRING = new bb(bb.z[1], 0, 0, 0);
        CORD = new bb(bb.z[2], 1, 1, 1);
        STRING_PIECE = new bb(bb.z[3], 2, 2, 2);
        a = new bb[] { bb.STRING, bb.CORD, bb.STRING_PIECE };
        bb.b = new d8();
        c = values();
    }
    
    private bb(final String s, final int n, final int d, final int e) {
        this.d = d;
        this.e = e;
    }
    
    public static final E getDescriptor() {
        return ds.o().c().get(0);
    }
    
    public static dw internalGetValueMap() {
        return bb.b;
    }
    
    public static bb valueOf(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                try {
                    return bb.STRING;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            case 1: {
                return bb.CORD;
            }
            case 2: {
                return bb.STRING_PIECE;
            }
        }
    }
    
    public static bb valueOf(final dV dv) {
        try {
            if (dv.a() != getDescriptor()) {
                throw new IllegalArgumentException(bb.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return bb.c[dv.c()];
    }
    
    public final E getDescriptorForType() {
        return getDescriptor();
    }
    
    @Override
    public final int getNumber() {
        return this.e;
    }
    
    public final dV getValueDescriptor() {
        return getDescriptor().b().get(this.d);
    }
}
