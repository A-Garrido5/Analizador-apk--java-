// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

abstract class GCMUtil
{
    private static final int E1 = -520093696;
    private static final byte E1B = -31;
    private static final long E1L = 63331869759897600L;
    private static final int[] LOOKUP;
    
    static {
        LOOKUP = generateLookup();
    }
    
    static void asBytes(final int[] array, final byte[] array2) {
        Pack.intToBigEndian(array, array2, 0);
    }
    
    static void asBytes(final long[] array, final byte[] array2) {
        Pack.longToBigEndian(array, array2, 0);
    }
    
    static byte[] asBytes(final int[] array) {
        final byte[] array2 = new byte[16];
        Pack.intToBigEndian(array, array2, 0);
        return array2;
    }
    
    static byte[] asBytes(final long[] array) {
        final byte[] array2 = new byte[16];
        Pack.longToBigEndian(array, array2, 0);
        return array2;
    }
    
    static void asInts(final byte[] array, final int[] array2) {
        Pack.bigEndianToInt(array, 0, array2);
    }
    
    static int[] asInts(final byte[] array) {
        final int[] array2 = new int[4];
        Pack.bigEndianToInt(array, 0, array2);
        return array2;
    }
    
    static void asLongs(final byte[] array, final long[] array2) {
        Pack.bigEndianToLong(array, 0, array2);
    }
    
    static long[] asLongs(final byte[] array) {
        final long[] array2 = new long[2];
        Pack.bigEndianToLong(array, 0, array2);
        return array2;
    }
    
    private static int[] generateLookup() {
        final int[] array = new int[256];
        for (int i = 0; i < 256; ++i) {
            int j = 7;
            int n = 0;
            while (j >= 0) {
                if ((i & 1 << j) != 0x0) {
                    n ^= -520093696 >>> 7 - j;
                }
                --j;
            }
            array[i] = n;
        }
        return array;
    }
    
    static void multiply(final byte[] array, final byte[] array2) {
        final int a = Tables8kGCMMultiplier.a;
        final byte[] clone = Arrays.clone(array);
        final byte[] array3 = new byte[16];
        int n;
        for (int i = 0; i < 16; i = n) {
            final byte b = array2[i];
            int j = 7;
            while (j >= 0) {
                if ((b & 1 << j) != 0x0) {
                    xor(array3, clone);
                }
                if (shiftRight(clone) != 0) {
                    clone[0] ^= 0xFFFFFFE1;
                }
                --j;
                if (a != 0) {
                    break;
                }
            }
            n = i + 1;
            if (a != 0) {
                break;
            }
        }
        System.arraycopy(array3, 0, array, 0, 16);
    }
    
    static void multiply(final int[] array, final int[] array2) {
        final int a = Tables8kGCMMultiplier.a;
        final int[] clone = Arrays.clone(array);
        final int[] array3 = new int[4];
        int n2;
        for (int i = 0; i < 4; i = n2) {
            final int n = array2[i];
            int j = 31;
            while (j >= 0) {
                if ((n & 1 << j) != 0x0) {
                    xor(array3, clone);
                }
                if (shiftRight(clone) != 0) {
                    clone[0] ^= 0xE1000000;
                }
                --j;
                if (a != 0) {
                    break;
                }
            }
            n2 = i + 1;
            if (a != 0) {
                break;
            }
        }
        System.arraycopy(array3, 0, array, 0, 4);
    }
    
    static void multiply(final long[] array, final long[] array2) {
        final int a = Tables8kGCMMultiplier.a;
        final long[] array3 = { array[0], array[1] };
        final long[] array4 = new long[2];
        int n2;
        for (int i = 0; i < 2; i = n2) {
            final long n = array2[i];
            int j = 63;
            while (j >= 0) {
                if ((n & 1L << j) != 0x0L) {
                    xor(array4, array3);
                }
                if (shiftRight(array3) != 0L) {
                    array3[0] ^= 0xE1000000000000L;
                }
                --j;
                if (a != 0) {
                    break;
                }
            }
            n2 = i + 1;
            if (a != 0) {
                break;
            }
        }
        array[0] = array4[0];
        array[1] = array4[1];
    }
    
    static void multiplyP(final int[] array) {
        if (shiftRight(array) != 0) {
            array[0] ^= 0xE1000000;
        }
    }
    
    static void multiplyP(final int[] array, final int[] array2) {
        if (shiftRight(array, array2) != 0) {
            array2[0] ^= 0xE1000000;
        }
    }
    
    static void multiplyP8(final int[] array) {
        array[0] ^= GCMUtil.LOOKUP[shiftRightN(array, 8) >>> 24];
    }
    
    static void multiplyP8(final int[] array, final int[] array2) {
        array2[0] ^= GCMUtil.LOOKUP[shiftRightN(array, 8, array2) >>> 24];
    }
    
    static byte[] oneAsBytes() {
        final byte[] array = new byte[16];
        array[0] = -128;
        return array;
    }
    
    static int[] oneAsInts() {
        final int[] array = new int[4];
        array[0] = Integer.MIN_VALUE;
        return array;
    }
    
    static long[] oneAsLongs() {
        return new long[] { Long.MIN_VALUE, 0L };
    }
    
    static byte shiftRight(final byte[] array) {
        int n = 0;
        final int a = Tables8kGCMMultiplier.a;
        int i = 0;
        do {
            final int n2 = 0xFF & array[i];
            final int n3 = i + 1;
            array[i] = (byte)(n | n2 >>> 1);
            final int n4 = (n2 & 0x1) << 7;
            final int n5 = 0xFF & array[n3];
            final int n6 = n3 + 1;
            array[n3] = (byte)(n4 | n5 >>> 1);
            final int n7 = (n5 & 0x1) << 7;
            final int n8 = 0xFF & array[n6];
            final int n9 = n6 + 1;
            array[n6] = (byte)(n7 | n8 >>> 1);
            final int n10 = (n8 & 0x1) << 7;
            final int n11 = 0xFF & array[n9];
            i = n9 + 1;
            array[n9] = (byte)(n10 | n11 >>> 1);
            n = (n11 & 0x1) << 7;
        } while (i < 16);
        final byte b = (byte)n;
        if (BaseKeyGenerator.a) {
            Tables8kGCMMultiplier.a = a + 1;
        }
        return b;
    }
    
    static byte shiftRight(final byte[] array, final byte[] array2) {
        final int a = Tables8kGCMMultiplier.a;
        int n = 0;
        int i = 0;
        do {
            final int n2 = 0xFF & array[i];
            final int n3 = i + 1;
            array2[i] = (byte)(n | n2 >>> 1);
            final int n4 = (n2 & 0x1) << 7;
            final int n5 = 0xFF & array[n3];
            final int n6 = n3 + 1;
            array2[n3] = (byte)(n4 | n5 >>> 1);
            final int n7 = (n5 & 0x1) << 7;
            final int n8 = 0xFF & array[n6];
            final int n9 = n6 + 1;
            array2[n6] = (byte)(n7 | n8 >>> 1);
            final int n10 = (n8 & 0x1) << 7;
            final int n11 = 0xFF & array[n9];
            i = n9 + 1;
            array2[n9] = (byte)(n10 | n11 >>> 1);
            n = (n11 & 0x1) << 7;
        } while (i < 16);
        final byte b = (byte)n;
        if (a != 0) {
            final boolean a2 = BaseKeyGenerator.a;
            boolean a3 = false;
            if (!a2) {
                a3 = true;
            }
            BaseKeyGenerator.a = a3;
        }
        return b;
    }
    
    static int shiftRight(final int[] array) {
        final int n = array[0];
        array[0] = n >>> 1;
        final int n2 = n << 31;
        final int n3 = array[1];
        array[1] = (n2 | n3 >>> 1);
        final int n4 = n3 << 31;
        final int n5 = array[2];
        array[2] = (n4 | n5 >>> 1);
        final int n6 = n5 << 31;
        final int n7 = array[3];
        array[3] = (n6 | n7 >>> 1);
        return n7 << 31;
    }
    
    static int shiftRight(final int[] array, final int[] array2) {
        final int n = array[0];
        array2[0] = n >>> 1;
        final int n2 = n << 31;
        final int n3 = array[1];
        array2[1] = (n2 | n3 >>> 1);
        final int n4 = n3 << 31;
        final int n5 = array[2];
        array2[2] = (n4 | n5 >>> 1);
        final int n6 = n5 << 31;
        final int n7 = array[3];
        array2[3] = (n6 | n7 >>> 1);
        return n7 << 31;
    }
    
    static long shiftRight(final long[] array) {
        final long n = array[0];
        array[0] = n >>> 1;
        final long n2 = n << 63;
        final long n3 = array[1];
        array[1] = (n2 | n3 >>> 1);
        return n3 << 63;
    }
    
    static long shiftRight(final long[] array, final long[] array2) {
        final long n = array[0];
        array2[0] = n >>> 1;
        final long n2 = n << 63;
        final long n3 = array[1];
        array2[1] = (n2 | n3 >>> 1);
        return n3 << 63;
    }
    
    static int shiftRightN(final int[] array, final int n) {
        final int n2 = array[0];
        final int n3 = 32 - n;
        array[0] = n2 >>> n;
        final int n4 = n2 << n3;
        final int n5 = array[1];
        array[1] = (n4 | n5 >>> n);
        final int n6 = n5 << n3;
        final int n7 = array[2];
        array[2] = (n6 | n7 >>> n);
        final int n8 = n7 << n3;
        final int n9 = array[3];
        array[3] = (n8 | n9 >>> n);
        return n9 << n3;
    }
    
    static int shiftRightN(final int[] array, final int n, final int[] array2) {
        final int n2 = array[0];
        final int n3 = 32 - n;
        array2[0] = n2 >>> n;
        final int n4 = n2 << n3;
        final int n5 = array[1];
        array2[1] = (n4 | n5 >>> n);
        final int n6 = n5 << n3;
        final int n7 = array[2];
        array2[2] = (n6 | n7 >>> n);
        final int n8 = n7 << n3;
        final int n9 = array[3];
        array2[3] = (n8 | n9 >>> n);
        return n9 << n3;
    }
    
    static void xor(final byte[] array, final byte[] array2) {
        int i = 0;
        do {
            array[i] ^= array2[i];
            final int n = i + 1;
            array[n] ^= array2[n];
            final int n2 = n + 1;
            array[n2] ^= array2[n2];
            final int n3 = n2 + 1;
            array[n3] ^= array2[n3];
            i = n3 + 1;
        } while (i < 16);
    }
    
    static void xor(final byte[] array, final byte[] array2, final int n, int n2) {
        final int a = Tables8kGCMMultiplier.a;
        while (true) {
            final int n3 = n2 - 1;
            if (n2 <= 0) {
                break;
            }
            array[n3] ^= array2[n + n3];
            if (a != 0) {
                break;
            }
            n2 = n3;
        }
    }
    
    static void xor(final byte[] array, final byte[] array2, final byte[] array3) {
        int i = 0;
        do {
            array3[i] = (byte)(array[i] ^ array2[i]);
            final int n = i + 1;
            array3[n] = (byte)(array[n] ^ array2[n]);
            final int n2 = n + 1;
            array3[n2] = (byte)(array[n2] ^ array2[n2]);
            final int n3 = n2 + 1;
            array3[n3] = (byte)(array[n3] ^ array2[n3]);
            i = n3 + 1;
        } while (i < 16);
    }
    
    static void xor(final int[] array, final int[] array2) {
        array[0] ^= array2[0];
        array[1] ^= array2[1];
        array[2] ^= array2[2];
        array[3] ^= array2[3];
    }
    
    static void xor(final int[] array, final int[] array2, final int[] array3) {
        array3[0] = (array[0] ^ array2[0]);
        array3[1] = (array[1] ^ array2[1]);
        array3[2] = (array[2] ^ array2[2]);
        array3[3] = (array[3] ^ array2[3]);
    }
    
    static void xor(final long[] array, final long[] array2) {
        array[0] ^= array2[0];
        array[1] ^= array2[1];
    }
    
    static void xor(final long[] array, final long[] array2, final long[] array3) {
        array3[0] = (array[0] ^ array2[0]);
        array3[1] = (array[1] ^ array2[1]);
    }
}
