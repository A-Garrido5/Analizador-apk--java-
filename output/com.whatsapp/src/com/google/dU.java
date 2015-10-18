// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum dU implements gp
{
    public static final dU LABEL_OPTIONAL;
    public static final int LABEL_OPTIONAL_VALUE = 1;
    public static final dU LABEL_REPEATED;
    public static final int LABEL_REPEATED_VALUE = 3;
    public static final dU LABEL_REQUIRED;
    public static final int LABEL_REQUIRED_VALUE = 2;
    private static dw b;
    private static final dU[] c;
    private static final dU[] d;
    private static final String[] z;
    private final int a;
    private final int e;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "y~qo\u0002]|qg\u0010Ycgp=LdkptUc$l;H0bm&\u001cdlk'\u001cd}r1\u0012".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c2 = charArray[n];
            char c3 = '\0';
            switch (n % 5) {
                default: {
                    c3 = 'T';
                    break;
                }
                case 0: {
                    c3 = '<';
                    break;
                }
                case 1: {
                    c3 = '\u0010';
                    break;
                }
                case 2: {
                    c3 = '\u0004';
                    break;
                }
                case 3: {
                    c3 = '\u0002';
                    break;
                }
            }
            charArray[n] = (char)(c3 ^ c2);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "pQFG\u0018cBAR\u0011}DAF".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c4 = charArray2[n2];
            char c5 = '\0';
            switch (n2 % 5) {
                default: {
                    c5 = 'T';
                    break;
                }
                case 0: {
                    c5 = '<';
                    break;
                }
                case 1: {
                    c5 = '\u0010';
                    break;
                }
                case 2: {
                    c5 = '\u0004';
                    break;
                }
                case 3: {
                    c5 = '\u0002';
                    break;
                }
            }
            charArray2[n2] = (char)(c5 ^ c4);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "pQFG\u0018c_TV\u001ds^EN".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c6 = charArray3[n3];
            char c7 = '\0';
            switch (n3 % 5) {
                default: {
                    c7 = 'T';
                    break;
                }
                case 0: {
                    c7 = '<';
                    break;
                }
                case 1: {
                    c7 = '\u0010';
                    break;
                }
                case 2: {
                    c7 = '\u0004';
                    break;
                }
                case 3: {
                    c7 = '\u0002';
                    break;
                }
            }
            charArray3[n3] = (char)(c7 ^ c6);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "pQFG\u0018cBAS\u0001uBAF".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c8 = charArray4[n4];
            char c9 = '\0';
            switch (n4 % 5) {
                default: {
                    c9 = 'T';
                    break;
                }
                case 0: {
                    c9 = '<';
                    break;
                }
                case 1: {
                    c9 = '\u0010';
                    break;
                }
                case 2: {
                    c9 = '\u0004';
                    break;
                }
                case 3: {
                    c9 = '\u0002';
                    break;
                }
            }
            charArray4[n4] = (char)(c9 ^ c8);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
        LABEL_OPTIONAL = new dU(dU.z[2], 0, 0, 1);
        LABEL_REQUIRED = new dU(dU.z[3], 1, 1, 2);
        LABEL_REPEATED = new dU(dU.z[1], 2, 2, 3);
        d = new dU[] { dU.LABEL_OPTIONAL, dU.LABEL_REQUIRED, dU.LABEL_REPEATED };
        dU.b = new fV();
        c = values();
    }
    
    private dU(final String s, final int n, final int a, final int e) {
        this.a = a;
        this.e = e;
    }
    
    public static final E getDescriptor() {
        return dC.z().c().get(1);
    }
    
    public static dw internalGetValueMap() {
        return dU.b;
    }
    
    public static dU valueOf(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                try {
                    return dU.LABEL_OPTIONAL;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            case 2: {
                return dU.LABEL_REQUIRED;
            }
            case 3: {
                return dU.LABEL_REPEATED;
            }
        }
    }
    
    public static dU valueOf(final dV dv) {
        try {
            if (dv.a() != getDescriptor()) {
                throw new IllegalArgumentException(dU.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return dU.c[dv.c()];
    }
    
    public final E getDescriptorForType() {
        return getDescriptor();
    }
    
    @Override
    public final int getNumber() {
        return this.e;
    }
    
    public final dV getValueDescriptor() {
        return getDescriptor().b().get(this.a);
    }
}
