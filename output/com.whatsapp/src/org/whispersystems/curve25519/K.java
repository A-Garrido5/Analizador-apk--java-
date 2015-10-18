// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.curve25519;

public class K
{
    public static void a(final int[] array, final int[] array2, final int n) {
        final int n2 = array[0];
        final int n3 = array[1];
        final int n4 = array[2];
        final int n5 = array[3];
        final int n6 = array[4];
        final int n7 = array[5];
        final int n8 = array[6];
        final int n9 = array[7];
        final int n10 = array[8];
        final int n11 = array[9];
        final int n12 = array2[0];
        final int n13 = array2[1];
        final int n14 = array2[2];
        final int n15 = array2[3];
        final int n16 = array2[4];
        final int n17 = array2[5];
        final int n18 = array2[6];
        final int n19 = array2[7];
        final int n20 = array2[8];
        final int n21 = array2[9];
        final int n22 = n2 ^ n12;
        final int n23 = n3 ^ n13;
        final int n24 = n4 ^ n14;
        final int n25 = n5 ^ n15;
        final int n26 = n6 ^ n16;
        final int n27 = n7 ^ n17;
        final int n28 = n8 ^ n18;
        final int n29 = n9 ^ n19;
        final int n30 = n10 ^ n20;
        final int n31 = n11 ^ n21;
        final int n32 = -n;
        final int n33 = n22 & n32;
        final int n34 = n23 & n32;
        final int n35 = n24 & n32;
        final int n36 = n25 & n32;
        final int n37 = n26 & n32;
        final int n38 = n27 & n32;
        final int n39 = n28 & n32;
        final int n40 = n29 & n32;
        final int n41 = n30 & n32;
        final int n42 = n31 & n32;
        array[0] = (n2 ^ n33);
        array[1] = (n3 ^ n34);
        array[2] = (n4 ^ n35);
        array[3] = (n5 ^ n36);
        array[4] = (n6 ^ n37);
        array[5] = (n7 ^ n38);
        array[6] = (n8 ^ n39);
        array[7] = (n9 ^ n40);
        array[8] = (n10 ^ n41);
        array[9] = (n11 ^ n42);
        array2[0] = (n12 ^ n33);
        array2[1] = (n13 ^ n34);
        array2[2] = (n14 ^ n35);
        array2[3] = (n15 ^ n36);
        array2[4] = (n16 ^ n37);
        array2[5] = (n17 ^ n38);
        array2[6] = (n18 ^ n39);
        array2[7] = (n19 ^ n40);
        array2[8] = (n20 ^ n41);
        array2[9] = (n21 ^ n42);
    }
}
