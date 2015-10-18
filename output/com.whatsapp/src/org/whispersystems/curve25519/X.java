// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class X
{
    public static void a(final byte[] array, final int[] array2) {
        final int n = array2[0];
        final int n2 = array2[1];
        final int n3 = array2[2];
        final int n4 = array2[3];
        final int n5 = array2[4];
        final int n6 = array2[5];
        final int n7 = array2[6];
        final int n8 = array2[7];
        final int n9 = array2[8];
        final int n10 = array2[9];
        final int n11 = n + 19 * (n10 + (n9 + (n8 + (n7 + (n6 + (n5 + (n4 + (n3 + (n2 + (n + (16777216 + n10 * 19 >> 25) >> 26) >> 25) >> 26) >> 25) >> 26) >> 25) >> 26) >> 25) >> 26) >> 25);
        final int n12 = n11 >> 26;
        final int n13 = n2 + n12;
        final int n14 = n11 - (n12 << 26);
        final int n15 = n13 >> 25;
        final int n16 = n3 + n15;
        final int n17 = n13 - (n15 << 25);
        final int n18 = n16 >> 26;
        final int n19 = n4 + n18;
        final int n20 = n16 - (n18 << 26);
        final int n21 = n19 >> 25;
        final int n22 = n5 + n21;
        final int n23 = n19 - (n21 << 25);
        final int n24 = n22 >> 26;
        final int n25 = n6 + n24;
        final int n26 = n22 - (n24 << 26);
        final int n27 = n25 >> 25;
        final int n28 = n7 + n27;
        final int n29 = n25 - (n27 << 25);
        final int n30 = n28 >> 26;
        final int n31 = n8 + n30;
        final int n32 = n28 - (n30 << 26);
        final int n33 = n31 >> 25;
        final int n34 = n9 + n33;
        final int n35 = n31 - (n33 << 25);
        final int n36 = n34 >> 26;
        final int n37 = n10 + n36;
        final int n38 = n34 - (n36 << 26);
        final int n39 = n37 - (n37 >> 25 << 25);
        array[0] = (byte)(n14 >> 0);
        array[1] = (byte)(n14 >> 8);
        array[2] = (byte)(n14 >> 16);
        array[3] = (byte)(n14 >> 24 | n17 << 2);
        array[4] = (byte)(n17 >> 6);
        array[5] = (byte)(n17 >> 14);
        array[6] = (byte)(n17 >> 22 | n20 << 3);
        array[7] = (byte)(n20 >> 5);
        array[8] = (byte)(n20 >> 13);
        array[9] = (byte)(n20 >> 21 | n23 << 5);
        array[10] = (byte)(n23 >> 3);
        array[11] = (byte)(n23 >> 11);
        array[12] = (byte)(n23 >> 19 | n26 << 6);
        array[13] = (byte)(n26 >> 2);
        array[14] = (byte)(n26 >> 10);
        array[15] = (byte)(n26 >> 18);
        array[16] = (byte)(n29 >> 0);
        array[17] = (byte)(n29 >> 8);
        array[18] = (byte)(n29 >> 16);
        array[19] = (byte)(n29 >> 24 | n32 << 1);
        array[20] = (byte)(n32 >> 7);
        array[21] = (byte)(n32 >> 15);
        array[22] = (byte)(n32 >> 23 | n35 << 3);
        array[23] = (byte)(n35 >> 5);
        array[24] = (byte)(n35 >> 13);
        array[25] = (byte)(n35 >> 21 | n38 << 4);
        array[26] = (byte)(n38 >> 4);
        array[27] = (byte)(n38 >> 12);
        array[28] = (byte)(n38 >> 20 | n39 << 6);
        array[29] = (byte)(n39 >> 2);
        array[30] = (byte)(n39 >> 10);
        array[31] = (byte)(n39 >> 18);
    }
}
