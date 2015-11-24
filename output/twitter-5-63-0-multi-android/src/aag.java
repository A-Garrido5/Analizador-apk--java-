// 
// Decompiled by Procyon v0.5.30
// 

public final class aag
{
    public static int a(final byte[] array) {
        int n;
        if (array == null) {
            n = 0;
        }
        else {
            int length = array.length;
            n = length + 1;
            while (--length >= 0) {
                n = (n * 257 ^ array[length]);
            }
        }
        return n;
    }
    
    public static int a(final char[] array) {
        int n;
        if (array == null) {
            n = 0;
        }
        else {
            int length = array.length;
            n = length + 1;
            while (--length >= 0) {
                n = (n * 257 ^ array[length]);
            }
        }
        return n;
    }
    
    public static boolean a(final byte[] array, final byte[] array2) {
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
                        for (int i = 0; i != array.length; ++i) {
                            final byte b2 = array[i];
                            final byte b3 = array2[i];
                            b = false;
                            if (b2 != b3) {
                                return b;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return b;
    }
    
    public static boolean a(final char[] array, final char[] array2) {
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
                        for (int i = 0; i != array.length; ++i) {
                            final char c = array[i];
                            final char c2 = array2[i];
                            b = false;
                            if (c != c2) {
                                return b;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return b;
    }
    
    public static byte[] b(final byte[] array) {
        if (array == null) {
            return null;
        }
        final byte[] array2 = new byte[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        return array2;
    }
}
