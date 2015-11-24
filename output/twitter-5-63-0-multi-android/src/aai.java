// 
// Decompiled by Procyon v0.5.30
// 

public final class aai
{
    public static String a(String s) {
        int i = 0;
        final char[] charArray = s.toCharArray();
        boolean b = false;
        while (i != charArray.length) {
            final char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                b = true;
                charArray[i] = (char)('a' + (c - 'A'));
            }
            ++i;
        }
        if (b) {
            s = new String(charArray);
        }
        return s;
    }
    
    public static String a(final byte[] array) {
        int n = 0;
        int n2 = 0;
        int i = 0;
        while (i < array.length) {
            ++n2;
            if ((0xF0 & array[i]) == 0xF0) {
                ++n2;
                i += 4;
            }
            else if ((0xE0 & array[i]) == 0xE0) {
                i += 3;
            }
            else if ((0xC0 & array[i]) == 0xC0) {
                i += 2;
            }
            else {
                ++i;
            }
        }
        final char[] array2 = new char[n2];
        int j = 0;
        while (j < array.length) {
            char c2;
            int n4;
            if ((0xF0 & array[j]) == 0xF0) {
                final int n3 = ((0x3 & array[j]) << 18 | (0x3F & array[j + 1]) << 12 | (0x3F & array[j + 2]) << 6 | (0x3F & array[j + 3])) - 65536;
                final char c = (char)(0xD800 | n3 >> 10);
                c2 = (char)(0xDC00 | (n3 & 0x3FF));
                n4 = n + 1;
                array2[n] = c;
                j += 4;
            }
            else if ((0xE0 & array[j]) == 0xE0) {
                c2 = (char)((0xF & array[j]) << 12 | (0x3F & array[j + 1]) << 6 | (0x3F & array[j + 2]));
                j += 3;
                n4 = n;
            }
            else if ((0xD0 & array[j]) == 0xD0) {
                c2 = (char)((0x1F & array[j]) << 6 | (0x3F & array[j + 1]));
                j += 2;
                n4 = n;
            }
            else if ((0xC0 & array[j]) == 0xC0) {
                c2 = (char)((0x1F & array[j]) << 6 | (0x3F & array[j + 1]));
                j += 2;
                n4 = n;
            }
            else {
                c2 = (char)(0xFF & array[j]);
                ++j;
                n4 = n;
            }
            n = n4 + 1;
            array2[n4] = c2;
        }
        return new String(array2);
    }
    
    public static String b(final byte[] array) {
        return new String(c(array));
    }
    
    public static char[] c(final byte[] array) {
        final char[] array2 = new char[array.length];
        for (int i = 0; i != array2.length; ++i) {
            array2[i] = (char)(0xFF & array[i]);
        }
        return array2;
    }
}
