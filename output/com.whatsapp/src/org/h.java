// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.util.Formatter;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.io.Serializable;

public class h implements Serializable
{
    public static final int d = 2;
    public static final int e = 1;
    public static final int g = 2;
    public static final int j = 3;
    public static final int k = 0;
    public static final int n = 2;
    public static final int p = 1;
    public static final int q = 0;
    public static boolean r = false;
    public static final int s = 0;
    private static final long serialVersionUID = 9010790363003271996L;
    public static final int t = 1;
    private static final String[] z;
    private String a;
    private int b;
    private String c;
    private int f;
    private String h;
    private final boolean[][] i;
    private Calendar l;
    private String m;
    private String o;
    private long u;
    
    static {
        final String[] z2 = new String[5];
        final char[] charArray = ")\u001e`s7S".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'C';
                    break;
                }
                case 0: {
                    c2 = '\t';
                    break;
                }
                case 1: {
                    c2 = ';';
                    break;
                }
                case 2: {
                    c2 = 'Q';
                    break;
                }
                case 3: {
                    c2 = 'W';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = ")\u001ei3".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'C';
                    break;
                }
                case 0: {
                    c4 = '\t';
                    break;
                }
                case 1: {
                    c4 = ';';
                    break;
                }
                case 2: {
                    c4 = 'Q';
                    break;
                }
                case 3: {
                    c4 = 'W';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = ")\u001ee3".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'C';
                    break;
                }
                case 0: {
                    c6 = '\t';
                    break;
                }
                case 1: {
                    c6 = ';';
                    break;
                }
                case 2: {
                    c6 = 'Q';
                    break;
                }
                case 3: {
                    c6 = 'W';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = ")\u001e|o0)\u001e|o0".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'C';
                    break;
                }
                case 0: {
                    c8 = '\t';
                    break;
                }
                case 1: {
                    c8 = ';';
                    break;
                }
                case 2: {
                    c8 = 'Q';
                    break;
                }
                case 3: {
                    c8 = 'W';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = ")\u001e`s7P\u0016tfg}V|rr-O5wf8\u001f%\u001fy,\nu#\u000e3\u001e`s7Z".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'C';
                    break;
                }
                case 0: {
                    c10 = '\t';
                    break;
                }
                case 1: {
                    c10 = ';';
                    break;
                }
                case 2: {
                    c10 = 'Q';
                    break;
                }
                case 3: {
                    c10 = 'W';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        z = z2;
    }
    
    public h() {
        final boolean r = org.h.r;
        this.i = (boolean[][])Array.newInstance(Boolean.TYPE, 3, 3);
        this.o = null;
        this.f = 3;
        this.b = 0;
        this.u = -1L;
        this.h = "";
        this.a = "";
        this.l = null;
        this.m = null;
        if (org.l.a != 0) {
            org.h.r = !r;
        }
    }
    
    private String c(final int n) {
        final boolean r = org.h.r;
        final StringBuilder sb = new StringBuilder();
        Label_0039: {
            if (this.a(n, 0)) {
                sb.append('r');
                if (!r) {
                    break Label_0039;
                }
            }
            sb.append('-');
        }
        Label_0066: {
            if (this.a(n, 1)) {
                sb.append('w');
                if (!r) {
                    break Label_0066;
                }
            }
            sb.append('-');
        }
        if (this.a(n, 2)) {
            sb.append('x');
            if (!r) {
                return sb.toString();
            }
        }
        sb.append('-');
        return sb.toString();
    }
    
    private char h() {
        switch (this.f) {
            default: {
                return '?';
            }
            case 0: {
                return '-';
            }
            case 1: {
                return 'd';
            }
            case 2: {
                return 'l';
            }
        }
    }
    
    public String a() {
        return this.o;
    }
    
    public void a(final int b) {
        this.b = b;
    }
    
    public void a(final int n, final int n2, final boolean b) {
        this.i[n][n2] = b;
    }
    
    public void a(final long u) {
        this.u = u;
    }
    
    public void a(final String a) {
        this.a = a;
    }
    
    public void a(final Calendar l) {
        this.l = l;
    }
    
    public boolean a(final int n, final int n2) {
        return this.i[n][n2];
    }
    
    public void b(final int f) {
        this.f = f;
    }
    
    public void b(final String h) {
        this.h = h;
    }
    
    public boolean b() {
        return this.f == 0;
    }
    
    public Calendar c() {
        return this.l;
    }
    
    public void c(final String c) {
        this.c = c;
    }
    
    public int d() {
        return this.f;
    }
    
    public void d(final String m) {
        this.m = m;
    }
    
    public void e(final String o) {
        this.o = o;
    }
    
    public boolean e() {
        return this.f == 1;
    }
    
    public boolean f() {
        return this.f == 2;
    }
    
    public String g() {
        final boolean r = org.h.r;
        final StringBuilder sb = new StringBuilder();
        final Formatter formatter = new Formatter(sb);
        sb.append(this.h());
        sb.append(this.c(0));
        sb.append(this.c(1));
        sb.append(this.c(2));
        formatter.format(org.h.z[2], this.k());
        formatter.format(org.h.z[3], this.i(), this.l());
        formatter.format(org.h.z[1], this.m());
        final Calendar c = this.c();
        if (c != null) {
            formatter.format(org.h.z[4], c);
            formatter.format(org.h.z[0], c);
            sb.append(' ');
        }
        sb.append(' ');
        sb.append(this.n());
        formatter.close();
        final String string = sb.toString();
        if (r) {
            ++org.l.a;
        }
        return string;
    }
    
    public String i() {
        return this.a;
    }
    
    public boolean j() {
        return this.f == 3;
    }
    
    public int k() {
        return this.b;
    }
    
    public String l() {
        return this.h;
    }
    
    public long m() {
        return this.u;
    }
    
    public String n() {
        return this.m;
    }
    
    public String o() {
        return this.c;
    }
    
    @Override
    public String toString() {
        return this.a();
    }
}
