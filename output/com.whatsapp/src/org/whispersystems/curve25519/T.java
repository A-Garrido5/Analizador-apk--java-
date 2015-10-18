// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class T
{
    public static void a(final int[] array, final int[] array2) {
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
        final long n11 = 121666L * n;
        final long n12 = 121666L * n2;
        final long n13 = 121666L * n3;
        final long n14 = 121666L * n4;
        final long n15 = 121666L * n5;
        final long n16 = 121666L * n6;
        final long n17 = 121666L * n7;
        final long n18 = 121666L * n8;
        final long n19 = 121666L * n9;
        final long n20 = 121666L * n10;
        final long n21 = 16777216L + n20 >> 25;
        final long n22 = n11 + 19L * n21;
        final long n23 = n20 - (n21 << 25);
        final long n24 = 16777216L + n12 >> 25;
        final long n25 = n13 + n24;
        final long n26 = n12 - (n24 << 25);
        final long n27 = 16777216L + n14 >> 25;
        final long n28 = n15 + n27;
        final long n29 = n14 - (n27 << 25);
        final long n30 = 16777216L + n16 >> 25;
        final long n31 = n17 + n30;
        final long n32 = n16 - (n30 << 25);
        final long n33 = 16777216L + n18 >> 25;
        final long n34 = n19 + n33;
        final long n35 = n18 - (n33 << 25);
        final long n36 = 33554432L + n22 >> 26;
        final long n37 = n26 + n36;
        final long n38 = n22 - (n36 << 26);
        final long n39 = 33554432L + n25 >> 26;
        final long n40 = n29 + n39;
        final long n41 = n25 - (n39 << 26);
        final long n42 = 33554432L + n28 >> 26;
        final long n43 = n32 + n42;
        final long n44 = n28 - (n42 << 26);
        final long n45 = 33554432L + n31 >> 26;
        final long n46 = n35 + n45;
        final long n47 = n31 - (n45 << 26);
        final long n48 = 33554432L + n34 >> 26;
        final long n49 = n23 + n48;
        final long n50 = n34 - (n48 << 26);
        array[0] = (int)n38;
        array[1] = (int)n37;
        array[2] = (int)n41;
        array[3] = (int)n40;
        array[4] = (int)n44;
        array[5] = (int)n43;
        array[6] = (int)n47;
        array[7] = (int)n46;
        array[8] = (int)n50;
        array[9] = (int)n49;
    }
}
