// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.util;

import java.math.BigInteger;

public final class Arrays
{
    public static boolean areEqual(final byte[] array, final byte[] array2) {
        final boolean a = Pack.a;
        boolean b;
        if (array == array2) {
            b = true;
        }
        else {
            b = false;
            if (array != null) {
                b = false;
                if (array2 != null) {
                    final int length = array.length;
                    final int length2 = array2.length;
                    b = false;
                    if (length == length2) {
                        int i = 0;
                        while (i != array.length) {
                            final byte b2 = array[i];
                            final byte b3 = array2[i];
                            b = false;
                            if (b2 != b3) {
                                return b;
                            }
                            ++i;
                            if (a) {
                                break;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return b;
    }
    
    public static boolean areEqual(final int[] array, final int[] array2) {
        final boolean a = Pack.a;
        boolean b;
        if (array == array2) {
            b = true;
        }
        else {
            b = false;
            if (array != null) {
                b = false;
                if (array2 != null) {
                    final int length = array.length;
                    final int length2 = array2.length;
                    b = false;
                    if (length == length2) {
                        int i = 0;
                        while (i != array.length) {
                            final int n = array[i];
                            final int n2 = array2[i];
                            b = false;
                            if (n != n2) {
                                return b;
                            }
                            ++i;
                            if (a) {
                                break;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return b;
    }
    
    public static byte[] clone(final byte[] array) {
        if (array == null) {
            return null;
        }
        final byte[] array2 = new byte[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return array2;
    }
    
    public static byte[] clone(final byte[] array, final byte[] array2) {
        if (array == null) {
            return null;
        }
        if (array2 == null || array2.length != array.length) {
            return clone(array);
        }
        System.arraycopy(array, 0, array2, 0, array2.length);
        return array2;
    }
    
    public static int[] clone(final int[] array) {
        if (array == null) {
            return null;
        }
        final int[] array2 = new int[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return array2;
    }
    
    public static long[] clone(final long[] array) {
        if (array == null) {
            return null;
        }
        final long[] array2 = new long[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return array2;
    }
    
    public static long[] clone(final long[] array, final long[] array2) {
        if (array == null) {
            return null;
        }
        if (array2 == null || array2.length != array.length) {
            return clone(array);
        }
        System.arraycopy(array, 0, array2, 0, array2.length);
        return array2;
    }
    
    public static BigInteger[] clone(final BigInteger[] array) {
        if (array == null) {
            return null;
        }
        final BigInteger[] array2 = new BigInteger[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return array2;
    }
    
    public static short[] clone(final short[] array) {
        if (array == null) {
            return null;
        }
        final short[] array2 = new short[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return array2;
    }
    
    public static byte[][] clone(final byte[][] array) {
        final boolean a = Pack.a;
        if (array == null) {
            return null;
        }
        final byte[][] array2 = new byte[array.length][];
        int i = 0;
        while (i != array2.length) {
            array2[i] = clone(array[i]);
            ++i;
            if (a) {
                break;
            }
        }
        return array2;
    }
    
    public static byte[][][] clone(final byte[][][] array) {
        final boolean a = Pack.a;
        if (array == null) {
            return null;
        }
        final byte[][][] array2 = new byte[array.length][][];
        int i = 0;
        while (i != array2.length) {
            array2[i] = clone(array[i]);
            ++i;
            if (a) {
                break;
            }
        }
        return array2;
    }
    
    public static boolean constantTimeAreEqual(final byte[] array, final byte[] array2) {
        final boolean a = Pack.a;
        boolean b;
        if (array == array2) {
            b = true;
        }
        else {
            b = false;
            if (array != null) {
                b = false;
                if (array2 != null) {
                    final int length = array.length;
                    final int length2 = array2.length;
                    b = false;
                    if (length == length2) {
                        int i = 0;
                        byte b2 = 0;
                        while (i != array.length) {
                            b2 |= (byte)(array[i] ^ array2[i]);
                            ++i;
                            if (a) {
                                break;
                            }
                        }
                        b = false;
                        if (b2 == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return b;
    }
    
    public static void fill(final byte[] array, final byte b) {
        final boolean a = Pack.a;
        int i = 0;
        while (i < array.length) {
            array[i] = b;
            ++i;
            if (a) {
                break;
            }
        }
    }
}
