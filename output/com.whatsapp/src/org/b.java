// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;
import java.io.Serializable;

public class b implements Serializable, Comparable
{
    protected static final long a = 2085978496000L;
    public static final String b;
    public static int f = 0;
    protected static final long g = -2208988800000L;
    private static final long serialVersionUID = 8139806907588338737L;
    private static final String[] z;
    private DateFormat c;
    private final long d;
    private DateFormat e;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "Bl\u0007-vJd\u000f!2c\t;x/~\t\nIljDxr%)z\u0011R".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'V';
                    break;
                }
                case 0: {
                    c2 = '\u0007';
                    break;
                }
                case 1: {
                    c2 = ')';
                    break;
                }
                case 2: {
                    c2 = 'B';
                    break;
                }
                case 3: {
                    c2 = '\u0001';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        b = new String(charArray).intern();
        final char[] charArray2 = "i\\.m".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'V';
                    break;
                }
                case 0: {
                    c4 = '\u0007';
                    break;
                }
                case 1: {
                    c4 = ')';
                    break;
                }
                case 2: {
                    c4 = 'B';
                    break;
                }
                case 3: {
                    c4 = '\u0001';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[0] = new String(charArray2).intern();
        final char[] charArray3 = "Bl\u0007-vJd\u000f!2c\t;x/~\t\nIljDxr%)z\u0011Rv |\u0016Bq".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'V';
                    break;
                }
                case 0: {
                    c6 = '\u0007';
                    break;
                }
                case 1: {
                    c6 = ')';
                    break;
                }
                case 2: {
                    c6 = 'B';
                    break;
                }
                case 3: {
                    c6 = '\u0001';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[1] = new String(charArray3).intern();
        final char[] charArray4 = "R}\u0001".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'V';
                    break;
                }
                case 0: {
                    c8 = '\u0007';
                    break;
                }
                case 1: {
                    c8 = ')';
                    break;
                }
                case 2: {
                    c8 = 'B';
                    break;
                }
                case 3: {
                    c8 = '\u0001';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[2] = new String(charArray4).intern();
        final char[] charArray5 = "Bl\u0007-vJd\u000f!2c\t;x/~\t\nIljDxr%)z\u0011R".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'V';
                    break;
                }
                case 0: {
                    c10 = '\u0007';
                    break;
                }
                case 1: {
                    c10 = ')';
                    break;
                }
                case 2: {
                    c10 = 'B';
                    break;
                }
                case 3: {
                    c10 = '\u0001';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[3] = new String(charArray5).intern();
        z = z2;
    }
    
    public b(final long d) {
        this.d = d;
    }
    
    public b(final String s) {
        this.d = b(s);
    }
    
    public b(final Date date) {
        long b;
        if (date == null) {
            b = 0L;
        }
        else {
            b = b(date.getTime());
        }
        this.d = b;
    }
    
    public static long a(final long n) {
        final long n2 = 0xFFFFFFFFL & n >>> 32;
        final long round = Math.round(1000.0 * (0xFFFFFFFFL & n) / 4.294967296E9);
        if ((0x80000000L & n2) == 0x0L) {
            return round + (2085978496000L + n2 * 1000L);
        }
        return round + (-2208988800000L + n2 * 1000L);
    }
    
    public static b a(final String s) {
        return new b(b(s));
    }
    
    private static void a(final StringBuilder sb, final long n) {
        final int f = org.b.f;
        final String hexString = Long.toHexString(n);
        int i = hexString.length();
        while (i < 8) {
            sb.append('0');
            ++i;
            if (f != 0) {
                break;
            }
        }
        sb.append(hexString);
    }
    
    protected static long b(final long n) {
        boolean b;
        if (n < 2085978496000L) {
            b = true;
        }
        else {
            b = false;
        }
        long n2 = 0L;
        Label_0032: {
            if (b) {
                n2 = n + 2208988800000L;
                if (org.b.f == 0) {
                    break Label_0032;
                }
            }
            n2 = n - 2085978496000L;
        }
        final long n3 = n2 / 1000L;
        final long n4 = 4294967296L * (n2 % 1000L) / 1000L;
        long n5;
        if (b) {
            n5 = (0x80000000L | n3);
        }
        else {
            n5 = n3;
        }
        return n4 | n5 << 32;
    }
    
    protected static long b(final String s) {
        if (s == null) {
            try {
                throw new NumberFormatException(org.b.z[0]);
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
        final int index = s.indexOf(46);
        if (index == -1) {
            try {
                if (s.length() == 0) {
                    return 0L;
                }
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
            return Long.parseLong(s, 16) << 32;
        }
        return Long.parseLong(s.substring(0, index), 16) << 32 | Long.parseLong(s.substring(index + 1), 16);
    }
    
    public static b c(final long n) {
        return new b(b(n));
    }
    
    public static String d(final long n) {
        final StringBuilder sb = new StringBuilder();
        a(sb, 0xFFFFFFFFL & n >>> 32);
        sb.append('.');
        a(sb, n & 0xFFFFFFFFL);
        return sb.toString();
    }
    
    public static b g() {
        return c(System.currentTimeMillis());
    }
    
    public int a(final b b) {
        final long d = this.d;
        final long d2 = b.d;
        if (d < d2) {
            return -1;
        }
        if (d == d2) {
            return 0;
        }
        return 1;
    }
    
    public long a() {
        return 0xFFFFFFFFL & this.d;
    }
    
    public long b() {
        return 0xFFFFFFFFL & this.d >>> 32;
    }
    
    public String c() {
        try {
            if (this.e == null) {
                (this.e = new SimpleDateFormat(org.b.z[3], Locale.US)).setTimeZone(TimeZone.getDefault());
            }
            return this.e.format(this.e());
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.a((b)o);
    }
    
    public String d() {
        try {
            if (this.c == null) {
                (this.c = new SimpleDateFormat(org.b.z[1], Locale.US)).setTimeZone(TimeZone.getTimeZone(org.b.z[2]));
            }
            return this.c.format(this.e());
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    public Date e() {
        return new Date(a(this.d));
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            if (!(o instanceof b)) {
                return false;
            }
            final b b = this;
            final long n = b.d;
            final Object o2 = o;
            final b b2 = (b)o2;
            final long n2 = b2.h();
            final long n3 = lcmp(n, n2);
            if (n3 == 0) {
                return true;
            }
            return false;
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            final b b = this;
            final long n = b.d;
            final Object o2 = o;
            final b b2 = (b)o2;
            final long n2 = b2.h();
            final long n3 = lcmp(n, n2);
            if (n3 == 0) {
                return true;
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public long f() {
        return a(this.d);
    }
    
    public long h() {
        return this.d;
    }
    
    @Override
    public int hashCode() {
        return (int)(this.d ^ this.d >>> 32);
    }
    
    @Override
    public String toString() {
        return d(this.d);
    }
}
