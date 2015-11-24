// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Map;
import java.util.Iterator;
import java.util.List;

final class f3
{
    private static final String[] z;
    boolean a;
    boolean b;
    
    static {
        final String[] z2 = new String[10];
        final char[] charArray = "G-".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'c';
                    break;
                }
                case 0: {
                    c2 = '}';
                    break;
                }
                case 1: {
                    c2 = '\r';
                    break;
                }
                case 2: {
                    c2 = '+';
                    break;
                }
                case 3: {
                    c2 = 'k';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "]v!".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'c';
                    break;
                }
                case 0: {
                    c4 = '}';
                    break;
                }
                case 1: {
                    c4 = '\r';
                    break;
                }
                case 2: {
                    c4 = '+';
                    break;
                }
                case 3: {
                    c4 = 'k';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u0000-".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'c';
                    break;
                }
                case 0: {
                    c6 = '}';
                    break;
                }
                case 1: {
                    c6 = '\r';
                    break;
                }
                case 2: {
                    c6 = '+';
                    break;
                }
                case 3: {
                    c6 = 'k';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u0000\u0007".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'c';
                    break;
                }
                case 0: {
                    c8 = '}';
                    break;
                }
                case 1: {
                    c8 = '\r';
                    break;
                }
                case 2: {
                    c8 = '+';
                    break;
                }
                case 3: {
                    c8 = 'k';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "]v\u000b".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'c';
                    break;
                }
                case 0: {
                    c10 = '}';
                    break;
                }
                case 1: {
                    c10 = '\r';
                    break;
                }
                case 2: {
                    c10 = '+';
                    break;
                }
                case 3: {
                    c10 = 'k';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "G-".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'c';
                    break;
                }
                case 0: {
                    c12 = '}';
                    break;
                }
                case 1: {
                    c12 = '\r';
                    break;
                }
                case 2: {
                    c12 = '+';
                    break;
                }
                case 3: {
                    c12 = 'k';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "\u0000\u0007".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = 'c';
                    break;
                }
                case 0: {
                    c14 = '}';
                    break;
                }
                case 1: {
                    c14 = '\r';
                    break;
                }
                case 2: {
                    c14 = '+';
                    break;
                }
                case 3: {
                    c14 = 'k';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "]v!".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = 'c';
                    break;
                }
                case 0: {
                    c16 = '}';
                    break;
                }
                case 1: {
                    c16 = '\r';
                    break;
                }
                case 2: {
                    c16 = '+';
                    break;
                }
                case 3: {
                    c16 = 'k';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "\u0000-".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = 'c';
                    break;
                }
                case 0: {
                    c18 = '}';
                    break;
                }
                case 1: {
                    c18 = '\r';
                    break;
                }
                case 2: {
                    c18 = '+';
                    break;
                }
                case 3: {
                    c18 = 'k';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "]v\u000b".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = 'c';
                    break;
                }
                case 0: {
                    c20 = '}';
                    break;
                }
                case 1: {
                    c20 = '\r';
                    break;
                }
                case 2: {
                    c20 = '+';
                    break;
                }
                case 3: {
                    c20 = 'k';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        z = z2;
    }
    
    private f3() {
        this.a = false;
        this.b = true;
    }
    
    f3(final be be) {
        this();
    }
    
    static f3 a(final f3 f3, final boolean b) {
        return f3.a(b);
    }
    
    private f3 a(final boolean a) {
        this.a = a;
        return this;
    }
    
    private void a(final int n, final int n2, final List list, final C c) {
        final boolean b = dt.b;
        for (final Object next : list) {
            c.a(String.valueOf(n));
            c.a(f3.z[0]);
            com.google.a.b(n2, next, c);
            String s;
            if (this.a) {
                s = " ";
            }
            else {
                s = "\n";
            }
            c.a(s);
            if (b) {
                break;
            }
        }
    }
    
    private void a(final cT ct, final C c) {
        final boolean b = dt.b;
        for (final Map.Entry<hg, V> entry : ct.a().entrySet()) {
            this.b(entry.getKey(), entry.getValue(), c);
            if (b) {
                break;
            }
        }
        this.a(ct.getUnknownFields(), c);
    }
    
    private void a(final ce ce, final C c) {
        final boolean b = dt.b;
        for (final Map.Entry<Integer, V> entry : ce.e().entrySet()) {
            final int intValue = entry.getKey();
            final am am = (am)entry.getValue();
            this.a(intValue, 0, am.a(), c);
            this.a(intValue, 5, am.g(), c);
            this.a(intValue, 1, am.f(), c);
            this.a(intValue, 2, am.b(), c);
            for (final ce ce2 : am.d()) {
                c.a(entry.getKey().toString());
                Label_0205: {
                    if (this.a) {
                        c.a(f3.z[4]);
                        if (!b) {
                            break Label_0205;
                        }
                    }
                    c.a(f3.z[1]);
                    c.b();
                }
                this.a(ce2, c);
                Label_0245: {
                    if (this.a) {
                        c.a(f3.z[2]);
                        if (!b) {
                            break Label_0245;
                        }
                    }
                    c.a();
                    c.a(f3.z[3]);
                }
                if (b) {
                    break;
                }
            }
            if (b) {
                break;
            }
        }
    }
    
    static void a(final f3 f3, final cT ct, final C c) {
        f3.a(ct, c);
    }
    
    static void a(final f3 f3, final ce ce, final C c) {
        f3.a(ce, c);
    }
    
    private void a(final hg hg, final Object o, final C c) {
        final boolean b = dt.b;
        Label_0306: {
            switch (be.a[hg.d().ordinal()]) {
                case 1:
                case 2:
                case 3: {
                    c.a(((Integer)o).toString());
                    if (b) {
                        break Label_0306;
                    }
                    break;
                }
                case 4:
                case 5:
                case 6: {
                    c.a(((Long)o).toString());
                    if (b) {
                        break Label_0306;
                    }
                    break;
                }
                case 7: {
                    c.a(((Boolean)o).toString());
                    if (b) {
                        break Label_0306;
                    }
                    break;
                }
                case 8: {
                    c.a(((Float)o).toString());
                    if (b) {
                        break Label_0306;
                    }
                    break;
                }
                case 9: {
                    c.a(((Double)o).toString());
                    if (b) {
                        break Label_0306;
                    }
                    break;
                }
                case 10:
                case 11: {
                    c.a(com.google.a.b((int)o));
                    if (b) {
                        break Label_0306;
                    }
                    break;
                }
                case 12:
                case 13: {
                    c.a(com.google.a.a((long)o));
                    if (b) {
                        break Label_0306;
                    }
                    break;
                }
                case 14: {
                    c.a("\"");
                    String a;
                    if (this.b) {
                        a = com.google.a.a((String)o);
                    }
                    else {
                        a = (String)o;
                    }
                    c.a(a);
                    c.a("\"");
                    if (b) {
                        break Label_0306;
                    }
                    break;
                }
                case 15: {
                    c.a("\"");
                    c.a(com.google.a.a((hv)o));
                    c.a("\"");
                    if (b) {
                        break Label_0306;
                    }
                    break;
                }
                case 16: {
                    c.a(((dV)o).c());
                    if (b) {
                        break Label_0306;
                    }
                    break;
                }
                case 17:
                case 18: {
                    this.a((cT)o, c);
                }
            }
        }
    }
    
    static f3 b(final f3 f3, final boolean b) {
        return f3.b(b);
    }
    
    private f3 b(final boolean b) {
        this.b = b;
        return this;
    }
    
    private void b(final hg hg, final Object o, final C c) {
        final boolean b = dt.b;
        if (hg.b()) {
            final Iterator<Object> iterator = (Iterator<Object>)((List)o).iterator();
            while (iterator.hasNext()) {
                this.c(hg, iterator.next(), c);
                if (b) {
                    break;
                }
            }
            if (!b) {
                return;
            }
        }
        this.c(hg, o, c);
    }
    
    private void c(final hg hg, final Object o, final C c) {
        final boolean b = dt.b;
        Label_0128: {
            if (hg.e()) {
                c.a("[");
                Label_0083: {
                    if (hg.m().e().a() && hg.d() == bq.MESSAGE && hg.g() && hg.h() == hg.f()) {
                        c.a(hg.f().a());
                        if (!b) {
                            break Label_0083;
                        }
                    }
                    c.a(hg.a());
                }
                c.a("]");
                if (!b) {
                    break Label_0128;
                }
            }
            if (hg.d() == bq.GROUP) {
                c.a(hg.f().c());
                if (!b) {
                    break Label_0128;
                }
            }
            c.a(hg.c());
        }
        Label_0188: {
            if (hg.n() == hD.MESSAGE) {
                if (this.a) {
                    c.a(f3.z[9]);
                    if (!b) {
                        break Label_0188;
                    }
                }
                c.a(f3.z[7]);
                c.b();
                if (!b) {
                    break Label_0188;
                }
            }
            c.a(f3.z[5]);
        }
        this.a(hg, o, c);
        if (hg.n() == hD.MESSAGE) {
            if (this.a) {
                c.a(f3.z[8]);
                if (!b) {
                    return;
                }
            }
            c.a();
            c.a(f3.z[6]);
            if (!b) {
                return;
            }
        }
        if (this.a) {
            c.a(" ");
            if (!b) {
                return;
            }
        }
        c.a("\n");
    }
}
