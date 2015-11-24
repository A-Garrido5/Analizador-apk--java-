// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class P
{
    public static long a(final byte[] array, final int n) {
        return (0xFFL & array[n + 0]) | (0xFF00L & array[n + 1] << 8) | (0xFF0000L & array[n + 2] << 16);
    }
    
    public static void a(final int[] array, final byte[] array2) {
        final long b = b(array2, 0);
        final long n = a(array2, 4) << 6;
        final long n2 = a(array2, 7) << 5;
        final long n3 = a(array2, 10) << 3;
        final long n4 = a(array2, 13) << 2;
        final long b2 = b(array2, 16);
        final long n5 = a(array2, 20) << 7;
        final long n6 = a(array2, 23) << 5;
        final long n7 = a(array2, 26) << 4;
        final long n8 = (0x7FFFFFL & a(array2, 29)) << 2;
        final long n9 = 16777216L + n8 >> 25;
        final long n10 = b + 19L * n9;
        final long n11 = n8 - (n9 << 25);
        final long n12 = 16777216L + n >> 25;
        final long n13 = n2 + n12;
        final long n14 = n - (n12 << 25);
        final long n15 = 16777216L + n3 >> 25;
        final long n16 = n4 + n15;
        final long n17 = n3 - (n15 << 25);
        final long n18 = 16777216L + b2 >> 25;
        final long n19 = n5 + n18;
        final long n20 = b2 - (n18 << 25);
        final long n21 = 16777216L + n6 >> 25;
        final long n22 = n7 + n21;
        final long n23 = n6 - (n21 << 25);
        final long n24 = 33554432L + n10 >> 26;
        final long n25 = n14 + n24;
        final long n26 = n10 - (n24 << 26);
        final long n27 = 33554432L + n13 >> 26;
        final long n28 = n17 + n27;
        final long n29 = n13 - (n27 << 26);
        final long n30 = 33554432L + n16 >> 26;
        final long n31 = n20 + n30;
        final long n32 = n16 - (n30 << 26);
        final long n33 = 33554432L + n19 >> 26;
        final long n34 = n23 + n33;
        final long n35 = n19 - (n33 << 26);
        final long n36 = 33554432L + n22 >> 26;
        final long n37 = n11 + n36;
        final long n38 = n22 - (n36 << 26);
        array[0] = (int)n26;
        array[1] = (int)n25;
        array[2] = (int)n29;
        array[3] = (int)n28;
        array[4] = (int)n32;
        array[5] = (int)n31;
        array[6] = (int)n35;
        array[7] = (int)n34;
        array[8] = (int)n38;
        array[9] = (int)n37;
    }
    
    public static long b(final byte[] array, final int n) {
        return (0xFFL & array[n + 0]) | (0xFF00L & array[n + 1] << 8) | (0xFF0000L & array[n + 2] << 16) | (0xFF000000L & array[n + 3] << 24);
    }
}
