// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class cV
{
    private final cO a;
    
    public cV() {
        this.a = new cO(gN.o);
    }
    
    private void a(final byte[] array, final int n) {
        int i = 0;
        final int f = ef.f;
        final int length = array.length;
        final int[] array2 = new int[length];
        int j = 0;
        while (j < length) {
            array2[j] = (0xFF & array[j]);
            ++j;
            if (f != 0) {
                break;
            }
        }
        final int n2 = array.length - n;
        try {
            this.a.a(array2, n2);
            while (i < n) {
                array[i] = (byte)array2[i];
                ++i;
                if (f != 0) {
                    break;
                }
            }
        }
        catch (dA da) {
            throw fh.a();
        }
    }
    
    public aS a(final L l) {
        final int f = ef.f;
        final dK dk = new dK(l);
        final ei[] a = ei.a(dk.b(), dk.a());
        final int length = a.length;
        final int length2 = a.length;
        int i = 0;
        int n = 0;
        while (i < length2) {
            n += a[i].a();
            ++i;
            if (f != 0) {
                break;
            }
        }
        final byte[] array = new byte[n];
        int j = 0;
        while (j < length) {
            final ei ei = a[j];
            final byte[] b = ei.b();
            final int a2 = ei.a();
            this.a(b, a2);
            int k = 0;
            while (k < a2) {
                array[j + k * length] = b[k];
                ++k;
                if (f != 0) {
                    break;
                }
            }
            ++j;
            if (f != 0) {
                break;
            }
        }
        return dJ.a(array);
    }
}
