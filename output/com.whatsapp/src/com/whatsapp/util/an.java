// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import com.whatsapp.DialogToastActivity;
import java.io.RandomAccessFile;

public class an
{
    public static final an b;
    public static final an c;
    public static final an h;
    public static final an i;
    private static final String[] z;
    double a;
    double d;
    double e;
    double f;
    double g;
    double j;
    double k;
    double l;
    double m;
    
    static {
        String[] array = new String[13];
        int n = 0;
        String s = "mpS!\u0014Z?\u001ep\u00d0";
        int n2 = -1;
        final String[] z2 = array;
        String intern = null;
    Label_0345:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int j = charArray.length, n3 = 0; j > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '`';
                        break;
                    }
                    case 0: {
                        c3 = '?';
                        break;
                    }
                    case 1: {
                        c3 = '\u001f';
                        break;
                    }
                    case 2: {
                        c3 = '\'';
                        break;
                    }
                    case 3: {
                        c3 = '@';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n] = intern;
                    n = 1;
                    s = "mpS!\u0014Z?\u0016xP\u008f";
                    array = z2;
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n] = intern;
                    n = 2;
                    s = "\u0013?E}";
                    n2 = 1;
                    array = z2;
                    continue;
                }
                case 1: {
                    array[n] = intern;
                    n = 3;
                    s = "mpS!\u0014Z?\u0017\u00f0";
                    n2 = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n] = intern;
                    n = 4;
                    s = "mpS!\u0014Z?\u0015wP\u008f";
                    n2 = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n] = intern;
                    n = 5;
                    s = "\u0013?C}";
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n] = intern;
                    n = 6;
                    s = "\u0013?S9]";
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n] = intern;
                    n = 7;
                    s = "\u0013?P}";
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n] = intern;
                    n = 8;
                    s = "\u0013?S8]";
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n] = intern;
                    n = 9;
                    s = "\u0013?D}";
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n] = intern;
                    n = 10;
                    s = "r~S2\tGdR}";
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n] = intern;
                    n = 11;
                    s = "\u0013?Q}";
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n] = intern;
                    n = 12;
                    s = "\u0013?F}";
                    n2 = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0345;
                }
            }
        }
        array[n] = intern;
        z = z2;
        c = new an(1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        i = new an(0.0, 1.0, -1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        b = new an(-1.0, 0.0, 0.0, -1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        h = new an(0.0, -1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
    }
    
    public an(final double f, final double d, final double e, final double j, final double m, final double g, final double l, final double k, final double a) {
        this.m = m;
        this.g = g;
        this.l = l;
        this.f = f;
        this.d = d;
        this.e = e;
        this.j = j;
        this.k = k;
        this.a = a;
    }
    
    public static an a(final RandomAccessFile randomAccessFile) {
        return new an(bb.g(randomAccessFile), bb.g(randomAccessFile), bb.g(randomAccessFile), bb.g(randomAccessFile), bb.c(randomAccessFile), bb.c(randomAccessFile), bb.c(randomAccessFile), bb.g(randomAccessFile), bb.g(randomAccessFile));
    }
    
    public int a() {
        if (this.f == 0.0 && this.d == 1.0 && this.e == -1.0 && this.j == 0.0) {
            return 90;
        }
        if (this.f == -1.0 && this.d == 0.0 && this.e == 0.0 && this.j == -1.0) {
            return 180;
        }
        if (this.f == 0.0 && this.d == -1.0 && this.e == 1.0 && this.j == 0.0) {
            return 270;
        }
        return 0;
    }
    
    public boolean b() {
        return this.k != 0.0 || this.a != 0.0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final an an = (an)o;
            if (Double.compare(an.f, this.f) != 0) {
                return false;
            }
            if (Double.compare(an.d, this.d) != 0) {
                return false;
            }
            if (Double.compare(an.e, this.e) != 0) {
                return false;
            }
            if (Double.compare(an.j, this.j) != 0) {
                return false;
            }
            if (Double.compare(an.k, this.k) != 0) {
                return false;
            }
            if (Double.compare(an.a, this.a) != 0) {
                return false;
            }
            if (Double.compare(an.m, this.m) != 0) {
                return false;
            }
            if (Double.compare(an.g, this.g) != 0) {
                return false;
            }
            if (Double.compare(an.l, this.l) != 0) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int b = bi.b;
        final long doubleToLongBits = Double.doubleToLongBits(this.m);
        final int n = (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
        final long doubleToLongBits2 = Double.doubleToLongBits(this.g);
        final int n2 = n * 31 + (int)(doubleToLongBits2 ^ doubleToLongBits2 >>> 32);
        final long doubleToLongBits3 = Double.doubleToLongBits(this.l);
        final int n3 = n2 * 31 + (int)(doubleToLongBits3 ^ doubleToLongBits3 >>> 32);
        final long doubleToLongBits4 = Double.doubleToLongBits(this.f);
        final int n4 = n3 * 31 + (int)(doubleToLongBits4 ^ doubleToLongBits4 >>> 32);
        final long doubleToLongBits5 = Double.doubleToLongBits(this.d);
        final int n5 = n4 * 31 + (int)(doubleToLongBits5 ^ doubleToLongBits5 >>> 32);
        final long doubleToLongBits6 = Double.doubleToLongBits(this.e);
        final int n6 = n5 * 31 + (int)(doubleToLongBits6 ^ doubleToLongBits6 >>> 32);
        final long doubleToLongBits7 = Double.doubleToLongBits(this.j);
        final int n7 = n6 * 31 + (int)(doubleToLongBits7 ^ doubleToLongBits7 >>> 32);
        final long doubleToLongBits8 = Double.doubleToLongBits(this.k);
        final int n8 = n7 * 31 + (int)(doubleToLongBits8 ^ doubleToLongBits8 >>> 32);
        final long doubleToLongBits9 = Double.doubleToLongBits(this.a);
        final int n9 = n8 * 31 + (int)(doubleToLongBits9 ^ doubleToLongBits9 >>> 32);
        if (b != 0) {
            DialogToastActivity.h = !DialogToastActivity.h;
        }
        return n9;
    }
    
    @Override
    public String toString() {
        if (this.equals(an.c)) {
            return an.z[3];
        }
        if (this.equals(an.i)) {
            return an.z[0];
        }
        if (this.equals(an.b)) {
            return an.z[1];
        }
        if (this.equals(an.h)) {
            return an.z[4];
        }
        return an.z[10] + this.m + an.z[11] + this.g + an.z[7] + this.l + an.z[12] + this.f + an.z[2] + this.d + an.z[9] + this.e + an.z[5] + this.j + an.z[8] + this.k + an.z[6] + this.a + '}';
    }
}
