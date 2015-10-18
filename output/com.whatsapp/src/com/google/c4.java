// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class c4
{
    private final bp a;
    
    public c4() {
        this.a = bp.b;
    }
    
    private int[] a(final aR ar) {
        final int c = bp.c;
        final int c2 = ar.c();
        final int[] array = new int[c2];
        int n = 0;
        int n2 = 1;
        while (n2 < this.a.a() && n < c2) {
            if (ar.c(n2) == 0) {
                array[n] = this.a.c(n2);
                ++n;
            }
            ++n2;
            if (c != 0) {
                break;
            }
        }
        if (n != c2) {
            throw fh.a();
        }
        return array;
    }
    
    private int[] a(final aR ar, final aR ar2, final int[] array) {
        final int c = bp.c;
        final int c2 = ar2.c();
        final int[] array2 = new int[c2];
        int i = 1;
        while (i <= c2) {
            array2[c2 - i] = this.a.c(i, ar2.b(i));
            ++i;
            if (c != 0) {
                break;
            }
        }
        final aR ar3 = new aR(this.a, array2);
        final int length = array.length;
        final int[] array3 = new int[length];
        int j = 0;
        while (j < length) {
            final int c3 = this.a.c(array[j]);
            array3[j] = this.a.c(this.a.b(0, ar.c(c3)), this.a.c(ar3.c(c3)));
            ++j;
            if (c != 0) {
                break;
            }
        }
        return array3;
    }
    
    private aR[] a(aR ar, aR c, final int n) {
        final int c2 = bp.c;
        if (ar.c() >= c.c()) {
            final aR ar2 = c;
            c = ar;
            ar = ar2;
        }
        aR c3 = this.a.c();
        aR b = this.a.b();
        while (true) {
            while (ar.c() >= n / 2) {
                if (ar.b()) {
                    throw fh.a();
                }
                aR ar3 = this.a.c();
                final int c4 = this.a.c(ar.b(ar.c()));
                while (c.c() >= ar.c() && !c.b()) {
                    final int n2 = c.c() - ar.c();
                    final int c5 = this.a.c(c.b(c.c()), c4);
                    ar3 = ar3.a(this.a.a(n2, c5));
                    c = c.c(ar.a(n2, c5));
                    if (c2 != 0) {
                        break;
                    }
                }
                final aR ar4 = ar3;
                final aR ar5 = c;
                final aR a = ar4.b(b).c(c3).a();
                if (c2 != 0) {
                    final int b2 = a.b(0);
                    if (b2 == 0) {
                        throw fh.a();
                    }
                    final int c6 = this.a.c(b2);
                    return new aR[] { a.a(c6), ar5.a(c6) };
                }
                else {
                    c = ar;
                    ar = ar5;
                    final aR ar6 = b;
                    b = a;
                    c3 = ar6;
                }
            }
            final aR a = b;
            final aR ar5 = ar;
            continue;
        }
    }
    
    public int a(final int[] array, final int n, final int[] array2) {
        int i = 0;
        final int c = bp.c;
        final aR ar = new aR(this.a, array);
        final int[] array3 = new int[n];
        int j = n;
        boolean b = false;
        while (j > 0) {
            if ((array3[n - j] = ar.c(this.a.b(j))) != 0) {
                b = true;
            }
            --j;
            if (c != 0) {
                ++fN.a;
                break;
            }
        }
        if (!b) {
            return 0;
        }
        final aR b2 = this.a.b();
        if (array2 != null) {
            final int length = array2.length;
            aR b3 = b2;
            int k = 0;
            while (k < length) {
                b3 = b3.b(new aR(this.a, new int[] { this.a.b(0, this.a.b(-1 + array.length - array2[k])), 1 }));
                ++k;
                if (c != 0) {
                    break;
                }
            }
        }
        final aR[] a = this.a(this.a.a(n, 1), new aR(this.a, array3), n);
        final aR ar2 = a[0];
        final aR ar3 = a[1];
        final int[] a2 = this.a(ar2);
        final int[] a3 = this.a(ar3, ar2, a2);
        while (i < a2.length) {
            final int n2 = -1 + array.length - this.a.a(a2[i]);
            if (n2 < 0) {
                throw fh.a();
            }
            array[n2] = this.a.b(array[n2], a3[i]);
            ++i;
            if (c != 0) {
                break;
            }
        }
        return a2.length;
    }
}
