// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

class ContainerHelpers
{
    static final int[] EMPTY_INTS;
    static final long[] EMPTY_LONGS;
    static final Object[] EMPTY_OBJECTS;
    
    static {
        EMPTY_INTS = new int[0];
        EMPTY_LONGS = new long[0];
        EMPTY_OBJECTS = new Object[0];
    }
    
    static int binarySearch(final int[] array, final int n, final int n2) {
        final int a = LruCache.a;
        int i = 0;
        int n6 = 0;
        for (int n3 = n - 1; i <= n3; n3 = n6) {
            final int n4 = i + n3 >>> 1;
            final int n5 = array[n4];
            Label_0081: {
                if (n5 < n2) {
                    i = n4 + 1;
                    if (a == 0) {
                        n6 = n3;
                        break Label_0081;
                    }
                }
                final int n7 = i;
                if (n5 > n2) {
                    final int n8 = n4 - 1;
                    if (a == 0) {
                        n6 = n8;
                        i = n7;
                        break Label_0081;
                    }
                }
                return n4;
            }
            if (a != 0) {
                break;
            }
        }
        return ~i;
    }
    
    public static boolean equal(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
    
    public static int idealByteArraySize(int n) {
        final int a = LruCache.a;
        int i = 4;
        while (i < 32) {
            if (n <= -12 + (1 << i)) {
                n = -12 + (1 << i);
                break;
            }
            ++i;
            if (a != 0) {
                return n;
            }
        }
        return n;
    }
    
    public static int idealIntArraySize(final int n) {
        return idealByteArraySize(n * 4) / 4;
    }
}
