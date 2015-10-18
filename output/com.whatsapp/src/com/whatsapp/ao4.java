// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.math.BigDecimal;

enum ao4
{
    public static final ao4 BIG_DECIMAL;
    public static final ao4 BYTE;
    public static final ao4 DOUBLE;
    public static final ao4 FLOAT;
    public static final ao4 INTEGER;
    public static final ao4 LONG;
    public static final ao4 SHORT;
    private static final ao4[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[11];
        String s = "_l\u0001h\u0004_V\u001b%\u0007\u001ajN'\u0007\u0015}\r<";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'e';
                        break;
                    }
                    case 0: {
                        c2 = '\u007f';
                        break;
                    }
                    case 1: {
                        c2 = '\u0018';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001cy\u0000o\u0011_{\u0001&\u0013\u001aj\u001ah";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "1m\u0003*\u0000\r8\r$\u0004\fkNo";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "X8\u0007;E\u0011w\u001ah\u0016\nh\u001e'\u0017\u000b}\n";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ",P!\u001a1";
                    n = 3;
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    s = "=Q)\u0017!:['\u0005$3";
                    n2 = 5;
                    array = z2;
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    s = "6V:\r\":J";
                    n2 = 6;
                    array = z2;
                    n = 5;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    array = z2;
                    s = "3W \u000f";
                    n = 6;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "=A:\r";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = ";W;\n):";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "9T!\t1";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        LONG = new ao4(ao4.z[7], 0);
        DOUBLE = new ao4(ao4.z[9], 1);
        INTEGER = new ao4(ao4.z[6], 2);
        FLOAT = new ao4(ao4.z[10], 3);
        SHORT = new ao4(ao4.z[4], 4);
        BYTE = new ao4(ao4.z[8], 5);
        BIG_DECIMAL = new ao4(ao4.z[5], 6);
        a = new ao4[] { ao4.LONG, ao4.DOUBLE, ao4.INTEGER, ao4.FLOAT, ao4.SHORT, ao4.BYTE, ao4.BIG_DECIMAL };
    }
    
    private ao4(final String s, final int n) {
    }
    
    public static ao4 fromNumber(final Number n) {
        try {
            if (n instanceof Long) {
                return ao4.LONG;
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (n instanceof Double) {
                return ao4.DOUBLE;
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            if (n instanceof Integer) {
                return ao4.INTEGER;
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        try {
            if (n instanceof Float) {
                return ao4.FLOAT;
            }
        }
        catch (IllegalArgumentException ex4) {
            throw ex4;
        }
        try {
            if (n instanceof Short) {
                return ao4.SHORT;
            }
        }
        catch (IllegalArgumentException ex5) {
            throw ex5;
        }
        try {
            if (n instanceof Byte) {
                return ao4.BYTE;
            }
        }
        catch (IllegalArgumentException ex6) {
            throw ex6;
        }
        try {
            if (n instanceof BigDecimal) {
                return ao4.BIG_DECIMAL;
            }
        }
        catch (IllegalArgumentException ex7) {
            throw ex7;
        }
        throw new IllegalArgumentException(ao4.z[2] + n.getClass().getName() + ao4.z[3]);
    }
    
    public Number toNumber(final double n) {
        try {
            switch (h8.a[this.ordinal()]) {
                default: {
                    throw new InstantiationError(ao4.z[1] + this + ao4.z[0]);
                }
                case 1: {
                    return new Long((long)n);
                }
                case 2: {
                    break;
                }
                case 3: {
                    return new Integer((int)n);
                }
                case 4: {
                    return new Float(n);
                }
                case 5: {
                    return new Short((short)n);
                }
                case 6: {
                    return new Byte((byte)n);
                }
                case 7: {
                    return new BigDecimal(n);
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return n;
    }
}
