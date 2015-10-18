import java.io.UnsupportedEncodingException;

// 
// Decompiled by Procyon v0.5.30
// 

final class bh
{
    private static final byte[] a;
    
    static {
        a = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
    }
    
    public static String a(final byte[] array) {
        int n = 0;
        final byte[] array2 = new byte[4 * (2 + array.length) / 3];
        final int n2 = array.length - array.length % 3;
        int n6;
        for (int i = 0; i < n2; i += 3, n = n6) {
            final int n3 = n + 1;
            array2[n] = bh.a[(0xFF & array[i]) >> 2];
            final int n4 = n3 + 1;
            array2[n3] = bh.a[(0x3 & array[i]) << 4 | (0xFF & array[i + 1]) >> 4];
            final int n5 = n4 + 1;
            array2[n4] = bh.a[(0xF & array[i + 1]) << 2 | (0xFF & array[i + 2]) >> 6];
            n6 = n5 + 1;
            array2[n5] = bh.a[0x3F & array[i + 2]];
        }
        Label_0184: {
            while (true) {
                switch (array.length % 3) {
                    default: {
                        break Label_0184;
                    }
                    case 1: {
                        Label_0201: {
                            break Label_0201;
                            try {
                                return new String(array2, 0, n, "US-ASCII");
                                final int n7 = n + 1;
                                array2[n] = bh.a[(0xFF & array[n2]) >> 2];
                                final int n8 = n7 + 1;
                                array2[n7] = bh.a[(0x3 & array[n2]) << 4];
                                final int n9 = n8 + 1;
                                array2[n8] = 61;
                                n = n9 + 1;
                                array2[n9] = 61;
                                return new String(array2, 0, n, "US-ASCII");
                                final int n10 = n + 1;
                                array2[n] = bh.a[(0xFF & array[n2]) >> 2];
                                final int n11 = n10 + 1;
                                array2[n10] = bh.a[(0x3 & array[n2]) << 4 | (0xFF & array[n2 + 1]) >> 4];
                                final int n12 = n11 + 1;
                                array2[n11] = bh.a[(0xF & array[n2 + 1]) << 2];
                                n = n12 + 1;
                                array2[n12] = 61;
                                return new String(array2, 0, n, "US-ASCII");
                            }
                            catch (UnsupportedEncodingException ex) {
                                throw new AssertionError((Object)ex);
                            }
                        }
                        break;
                    }
                    case 2: {
                        continue;
                    }
                }
                break;
            }
        }
    }
}
