// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class b7
{
    static final boolean e;
    private static final String[] z;
    private final Set a;
    private final Map b;
    private final Map c;
    private final Map d;
    
    static {
        char e2 = '\u0001';
        final String[] z2 = new String[15];
        final char[] charArray = "0`#\u000e[4s5O^!!2K_6!%]_<!9@\u001az".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ':';
                    break;
                }
                case 0: {
                    c2 = 'X';
                    break;
                }
                case 1: {
                    c2 = e2;
                    break;
                }
                case 2: {
                    c2 = 'P';
                    break;
                }
                case 3: {
                    c2 = '.';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "z/".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = ':';
                    break;
                }
                case 0: {
                    c4 = 'X';
                    break;
                }
                case 1: {
                    c4 = e2;
                    break;
                }
                case 2: {
                    c4 = 'P';
                    break;
                }
                case 3: {
                    c4 = '.';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[e2] = new String(charArray2).intern();
        final char[] charArray3 = "\u001eh5B^xo%CX=sp".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = ':';
                    break;
                }
                case 0: {
                    c6 = 'X';
                    break;
                }
                case 1: {
                    c6 = e2;
                    break;
                }
                case 2: {
                    c6 = 'P';
                    break;
                }
                case 3: {
                    c6 = '.';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "z!2W\u001a>h5B^x#".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = ':';
                    break;
                }
                case 0: {
                    c8 = 'X';
                    break;
                }
                case 1: {
                    c8 = e2;
                    break;
                }
                case 2: {
                    c8 = 'P';
                    break;
                }
                case 3: {
                    c8 = '.';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "z!9]\u001a9m\"K[<xpJ_>h>K^v".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = ':';
                    break;
                }
                case 0: {
                    c10 = 'X';
                    break;
                }
                case 1: {
                    c10 = e2;
                    break;
                }
                case 2: {
                    c10 = 'P';
                    break;
                }
                case 3: {
                    c10 = '.';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "z/".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = ':';
                    break;
                }
                case 0: {
                    c12 = 'X';
                    break;
                }
                case 1: {
                    c12 = e2;
                    break;
                }
                case 2: {
                    c12 = 'P';
                    break;
                }
                case 3: {
                    c12 = '.';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        final char[] charArray7 = "z!9]\u001a9m\"K[<xpJ_>h>K^xh>\u000e\\1m5\u000e\u0018".toCharArray();
        for (int length3 = charArray7.length, n7 = 0; length3 > n7; ++n7) {
            final char c13 = charArray7[n7];
            char c14 = '\0';
            switch (n7 % 5) {
                default: {
                    c14 = ':';
                    break;
                }
                case 0: {
                    c14 = 'X';
                    break;
                }
                case 1: {
                    c14 = e2;
                    break;
                }
                case 2: {
                    c14 = 'P';
                    break;
                }
                case 3: {
                    c14 = '.';
                    break;
                }
            }
            charArray7[n7] = (char)(c14 ^ c13);
        }
        z2[6] = new String(charArray7).intern();
        final char[] charArray8 = "z/".toCharArray();
        for (int length4 = charArray8.length, n8 = 0; length4 > n8; ++n8) {
            final char c15 = charArray8[n8];
            char c16 = '\0';
            switch (n8 % 5) {
                default: {
                    c16 = ':';
                    break;
                }
                case 0: {
                    c16 = 'X';
                    break;
                }
                case 1: {
                    c16 = e2;
                    break;
                }
                case 2: {
                    c16 = 'P';
                    break;
                }
                case 3: {
                    c16 = '.';
                    break;
                }
            }
            charArray8[n8] = (char)(c16 ^ c15);
        }
        z2[7] = new String(charArray8).intern();
        final char[] charArray9 = "z!9]\u001a9m\"K[<xpJ_>h>K^xh>\u000e\u0018".toCharArray();
        for (int length5 = charArray9.length, n9 = 0; length5 > n9; ++n9) {
            final char c17 = charArray9[n9];
            char c18 = '\0';
            switch (n9 % 5) {
                default: {
                    c18 = ':';
                    break;
                }
                case 0: {
                    c18 = 'X';
                    break;
                }
                case 1: {
                    c18 = e2;
                    break;
                }
                case 2: {
                    c18 = 'P';
                    break;
                }
                case 3: {
                    c18 = '.';
                    break;
                }
            }
            charArray9[n9] = (char)(c18 ^ c17);
        }
        z2[8] = new String(charArray9).intern();
        final char[] charArray10 = "z/".toCharArray();
        for (int length6 = charArray10.length, n10 = 0; length6 > n10; ++n10) {
            final char c19 = charArray10[n10];
            char c20 = '\0';
            switch (n10 % 5) {
                default: {
                    c20 = ':';
                    break;
                }
                case 0: {
                    c20 = 'X';
                    break;
                }
                case 1: {
                    c20 = e2;
                    break;
                }
                case 2: {
                    c20 = 'P';
                    break;
                }
                case 3: {
                    c20 = '.';
                    break;
                }
            }
            charArray10[n10] = (char)(c20 ^ c19);
        }
        z2[9] = new String(charArray10).intern();
        final char[] charArray11 = "(`3E[?dy\u000eS6!6GV=!r".toCharArray();
        for (int length7 = charArray11.length, n11 = 0; length7 > n11; ++n11) {
            final char c21 = charArray11[n11];
            char c22 = '\0';
            switch (n11 % 5) {
                default: {
                    c22 = ':';
                    break;
                }
                case 0: {
                    c22 = 'X';
                    break;
                }
                case 1: {
                    c22 = e2;
                    break;
                }
                case 2: {
                    c22 = 'P';
                    break;
                }
                case 3: {
                    c22 = '.';
                    break;
                }
            }
            charArray11[n11] = (char)(c22 ^ c21);
        }
        z2[10] = new String(charArray11).intern();
        final char[] charArray12 = "z!9]\u001a9m\"K[<xpJ_>h>K^x)1]\u001a+n=KN0h>I\u001a7u8KHxu8OTx`p".toCharArray();
        for (int length8 = charArray12.length, n12 = 0; length8 > n12; ++n12) {
            final char c23 = charArray12[n12];
            char c24 = '\0';
            switch (n12 % 5) {
                default: {
                    c24 = ':';
                    break;
                }
                case 0: {
                    c24 = 'X';
                    break;
                }
                case 1: {
                    c24 = e2;
                    break;
                }
                case 2: {
                    c24 = 'P';
                    break;
                }
                case 3: {
                    c24 = '.';
                    break;
                }
            }
            charArray12[n12] = (char)(c24 ^ c23);
        }
        z2[11] = new String(charArray12).intern();
        final char[] charArray13 = "z!9]\u001a6n$\u000e[xw1BS<!9J_6u9HS=s~".toCharArray();
        for (int length9 = charArray13.length, n13 = 0; length9 > n13; ++n13) {
            final char c25 = charArray13[n13];
            char c26 = '\0';
            switch (n13 % 5) {
                default: {
                    c26 = ':';
                    break;
                }
                case 0: {
                    c26 = 'X';
                    break;
                }
                case 1: {
                    c26 = e2;
                    break;
                }
                case 2: {
                    c26 = 'P';
                    break;
                }
                case 3: {
                    c26 = '.';
                    break;
                }
            }
            charArray13[n13] = (char)(c26 ^ c25);
        }
        z2[12] = new String(charArray13).intern();
        final char[] charArray14 = "\u0015h#]S6fp@[5d~".toCharArray();
        for (int length10 = charArray14.length, n14 = 0; length10 > n14; ++n14) {
            final char c27 = charArray14[n14];
            char c28 = '\0';
            switch (n14 % 5) {
                default: {
                    c28 = ':';
                    break;
                }
                case 0: {
                    c28 = 'X';
                    break;
                }
                case 1: {
                    c28 = e2;
                    break;
                }
                case 2: {
                    c28 = 'P';
                    break;
                }
                case 3: {
                    c28 = '.';
                    break;
                }
            }
            charArray14[n14] = (char)(c28 ^ c27);
        }
        z2[13] = new String(charArray14).intern();
        final char[] charArray15 = "z!9]\u001a6n$\u000e^=g9@_</".toCharArray();
        for (int length11 = charArray15.length, n15 = 0; length11 > n15; ++n15) {
            final char c29 = charArray15[n15];
            char c30 = '\0';
            switch (n15 % 5) {
                default: {
                    c30 = ':';
                    break;
                }
                case 0: {
                    c30 = 'X';
                    break;
                }
                case 1: {
                    c30 = e2;
                    break;
                }
                case 2: {
                    c30 = 'P';
                    break;
                }
                case 3: {
                    c30 = '.';
                    break;
                }
            }
            charArray15[n15] = (char)(c30 ^ c29);
        }
        z2[14] = new String(charArray15).intern();
        z = z2;
        if (cl.class.desiredAssertionStatus()) {
            e2 = '\0';
        }
        e = (e2 != '\0');
    }
    
    b7(final by[] array) {
        this.b = new HashMap();
        this.d = new HashMap();
        this.c = new HashMap();
        this.a = new HashSet();
        int i = 0;
        try {
            while (i < array.length) {
                this.a.add(array[i]);
                this.a(array[i]);
                ++i;
            }
        }
        catch (gG gg) {
            throw gg;
        }
        for (final by by : this.a) {
            try {
                this.a(by.d(), by);
                continue;
            }
            catch (gG gg3) {
                try {
                    if (!b7.e) {
                        throw new AssertionError();
                    }
                    continue;
                }
                catch (gG gg2) {
                    throw gg2;
                }
            }
            break;
        }
    }
    
    static Map a(final b7 b7) {
        return b7.d;
    }
    
    private void a(final by by) {
        for (final by by2 : by.b()) {
            if (this.a.add(by2)) {
                this.a(by2);
            }
        }
    }
    
    static Map b(final b7 b7) {
        return b7.c;
    }
    
    static void c(final cH ch) {
        final String c = ch.c();
        if (c.length() == 0) {
            throw new gG(ch, b7.z[13], (bO)null);
        }
        boolean b = true;
        for (int i = 0; i < c.length(); ++i) {
            final char char1 = c.charAt(i);
            if (char1 >= '\u0080') {
                b = false;
            }
            if (!Character.isLetter(char1) && char1 != '_' && (!Character.isDigit(char1) || i <= 0)) {
                b = false;
            }
        }
        if (!b) {
            throw new gG(ch, '\"' + c + b7.z[12], (bO)null);
        }
    }
    
    cH a(final String s) {
        return this.a(s, ag.ALL_SYMBOLS);
    }
    
    cH a(final String s, final ag ag) {
        cH ch = this.b.get(s);
        if (ch == null || (ag != ag.ALL_SYMBOLS && (ag != ag.TYPES_ONLY || !this.b(ch)) && (ag != ag.AGGREGATES_ONLY || !this.a(ch)))) {
            final Iterator<by> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ch = (cH)by.a(iterator.next()).b.get(s);
                if (ch != null) {
                    if (ag == ag.ALL_SYMBOLS || (ag == ag.TYPES_ONLY && this.b(ch))) {
                        return ch;
                    }
                    if (ag == ag.AGGREGATES_ONLY && this.a(ch)) {
                        return ch;
                    }
                    continue;
                }
            }
            return null;
        }
        return ch;
    }
    
    cH a(final String s, final cH ch, final ag ag) {
        cH ch2;
        if (s.startsWith(".")) {
            ch2 = this.a(s.substring(1), ag);
        }
        else {
            final int index = s.indexOf(46);
            String substring;
            if (index == -1) {
                substring = s;
            }
            else {
                substring = s.substring(0, index);
            }
            final StringBuilder sb = new StringBuilder(ch.a());
            while (true) {
                final int lastIndex = sb.lastIndexOf(".");
                if (lastIndex == -1) {
                    ch2 = this.a(s, ag);
                    break;
                }
                sb.setLength(lastIndex + 1);
                sb.append(substring);
                final cH a = this.a(sb.toString(), ag.AGGREGATES_ONLY);
                if (a != null) {
                    if (index != -1) {
                        sb.setLength(lastIndex + 1);
                        sb.append(s);
                        ch2 = this.a(sb.toString(), ag);
                        break;
                    }
                    ch2 = a;
                    break;
                }
                else {
                    sb.setLength(lastIndex);
                }
            }
        }
        if (ch2 == null) {
            throw new gG(ch, '\"' + s + b7.z[14], (bO)null);
        }
        return ch2;
    }
    
    void a(final dV dv) {
        final v v = new v(dv.a(), dv.getNumber());
        final dV dv2 = this.c.put(v, dv);
        if (dv2 != null) {
            this.c.put(v, dv2);
        }
    }
    
    void a(final hg hg) {
        final v v = new v(hg.m(), hg.c());
        final hg hg2 = this.d.put(v, hg);
        if (hg2 != null) {
            this.d.put(v, hg2);
            throw new gG(hg, b7.z[2] + hg.c() + b7.z[0] + hg.m().a() + b7.z[3] + hg2.c() + b7.z[1], (bO)null);
        }
    }
    
    void a(final String s, final by by) {
        final int lastIndex = s.lastIndexOf(46);
        String substring;
        if (lastIndex == -1) {
            substring = s;
        }
        else {
            this.a(s.substring(0, lastIndex), by);
            substring = s.substring(lastIndex + 1);
        }
        final b9 b9 = this.b.put(s, new b9(substring, s, by));
        if (b9 != null) {
            this.b.put(s, b9);
            if (!(b9 instanceof b9)) {
                throw new gG(by, '\"' + substring + b7.z[11] + b7.z[10] + b9.d().c() + b7.z[9], null);
            }
        }
    }
    
    boolean a(final cH ch) {
        return ch instanceof bl || ch instanceof E || ch instanceof b9 || ch instanceof bW;
    }
    
    boolean b(final cH ch) {
        return ch instanceof bl || ch instanceof E;
    }
    
    void d(final cH ch) {
        c(ch);
        final String a = ch.a();
        final int lastIndex = a.lastIndexOf(46);
        final cH ch2 = this.b.put(a, ch);
        if (ch2 == null) {
            return;
        }
        this.b.put(a, ch2);
        if (ch.d() != ch2.d()) {
            throw new gG(ch, '\"' + a + b7.z[6] + ch2.d().c() + b7.z[7], (bO)null);
        }
        if (lastIndex == -1) {
            throw new gG(ch, '\"' + a + b7.z[4], (bO)null);
        }
        throw new gG(ch, '\"' + a.substring(lastIndex + 1) + b7.z[8] + a.substring(0, lastIndex) + b7.z[5], (bO)null);
    }
}
