// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.util.Pack;
import org.spongycastle.util.Arrays;
import java.lang.reflect.Array;

public class Tables8kGCMMultiplier implements GCMMultiplier
{
    public static int a;
    private byte[] H;
    private int[][][] M;
    
    @Override
    public void init(final byte[] array) {
        final int a = Tables8kGCMMultiplier.a;
        Label_0059: {
            if (this.M == null) {
                this.M = (int[][][])Array.newInstance(Integer.TYPE, 32, 16, 4);
                if (a == 0) {
                    break Label_0059;
                }
            }
            if (!Arrays.areEqual(this.H, array)) {
                break Label_0059;
            }
            return;
        }
        this.H = Arrays.clone(array);
        GCMUtil.asInts(array, this.M[1][8]);
        int i = 4;
        while (i >= 1) {
            GCMUtil.multiplyP(this.M[1][i + i], this.M[1][i]);
            i >>= 1;
            if (a != 0) {
                break;
            }
        }
        GCMUtil.multiplyP(this.M[1][1], this.M[0][8]);
        int j = 4;
        while (j >= 1) {
            GCMUtil.multiplyP(this.M[0][j + j], this.M[0][j]);
            j >>= 1;
            if (a != 0) {
                break;
            }
        }
        int n = 0;
        while (true) {
            int n2;
            for (int k = 2; k < 16; k = n2) {
                int l = 1;
                while (l < k) {
                    GCMUtil.xor(this.M[n][k], this.M[n][l], this.M[n][k + l]);
                    ++l;
                    if (a != 0) {
                        break;
                    }
                }
                n2 = k + k;
                if (a != 0) {
                    break;
                }
            }
            if (++n == 32) {
                return;
            }
            if (n <= 1) {
                continue;
            }
            int n3 = 8;
            while (n3 > 0) {
                GCMUtil.multiplyP8(this.M[n - 2][n3], this.M[n][n3]);
                n3 >>= 1;
                if (a != 0) {
                    break;
                }
            }
        }
    }
    
    @Override
    public void multiplyH(final byte[] array) {
        final int a = Tables8kGCMMultiplier.a;
        final int[] array2 = new int[4];
        int i = 15;
        while (i >= 0) {
            final int[] array3 = this.M[i + i][0xF & array[i]];
            array2[0] ^= array3[0];
            array2[1] ^= array3[1];
            array2[2] ^= array3[2];
            array2[3] ^= array3[3];
            final int[] array4 = this.M[1 + (i + i)][(0xF0 & array[i]) >>> 4];
            array2[0] ^= array4[0];
            array2[1] ^= array4[1];
            array2[2] ^= array4[2];
            array2[3] ^= array4[3];
            --i;
            if (a != 0) {
                break;
            }
        }
        Pack.intToBigEndian(array2, array, 0);
    }
}
