// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class a9
{
    private static final c0 B;
    private static final String[] C;
    private static final Pattern g;
    private static final Pattern j;
    private static final Pattern m;
    private static final Pattern q;
    private static final Pattern r;
    private boolean A;
    private int a;
    private StringBuilder b;
    private StringBuilder c;
    private c0 d;
    private c6 e;
    private int f;
    private List h;
    private StringBuilder i;
    private StringBuilder k;
    private c0 l;
    private int n;
    private boolean o;
    private final e6 p;
    private boolean s;
    private boolean t;
    private boolean u;
    private String v;
    private String w;
    private String x;
    private StringBuilder y;
    private String z;
    
    static {
        final String[] c = new String[5];
        String s = "E1C";
        int n = -1;
        String[] array = c;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = '\r';
                        break;
                    }
                    case 0: {
                        c3 = '\u0019';
                        break;
                    }
                    case 1: {
                        c3 = 'm';
                        break;
                    }
                    case 2: {
                        c3 = '\'';
                        break;
                    }
                    case 3: {
                        c3 = 'q';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "E1C";
                    n2 = 1;
                    array = c;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = " T\u001eH4 T\u001eH4 T\u001eH4";
                    n2 = 2;
                    array = c;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = c;
                    s = ")]\u0016";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "EF[";
                    n = 3;
                    array = c;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        C = c;
        final c0 c4 = new c0();
        final char[] charArray2 = "W,".toCharArray();
        for (int k = charArray2.length, n4 = 0; k > n4; ++n4) {
            final char c5 = charArray2[n4];
            char c6 = '\0';
            switch (n4 % 5) {
                default: {
                    c6 = '\r';
                    break;
                }
                case 0: {
                    c6 = '\u0019';
                    break;
                }
                case 1: {
                    c6 = 'm';
                    break;
                }
                case 2: {
                    c6 = '\'';
                    break;
                }
                case 3: {
                    c6 = 'q';
                    break;
                }
            }
            charArray2[n4] = (char)(c6 ^ c5);
        }
        B = c4.e(new String(charArray2).intern());
        String s2 = "E6\u000f*SE6{,P0G{,";
        int n5 = -1;
        String intern2 = null;
    Label_0617:
        while (true) {
            final char[] charArray3 = s2.toCharArray();
            for (int l = charArray3.length, n6 = 0; l > n6; ++n6) {
                final char c7 = charArray3[n6];
                char c8 = '\0';
                switch (n6 % 5) {
                    default: {
                        c8 = '\r';
                        break;
                    }
                    case 0: {
                        c8 = '\u0019';
                        break;
                    }
                    case 1: {
                        c8 = 'm';
                        break;
                    }
                    case 2: {
                        c8 = '\'';
                        break;
                    }
                    case 3: {
                        c8 = 'q';
                        break;
                    }
                }
                charArray3[n6] = (char)(c8 ^ c7);
            }
            intern2 = new String(charArray3).intern();
            switch (n5) {
                default: {
                    g = Pattern.compile(intern2);
                    s2 = "E\t\u000fN0B3\u000b\fPB3\u000b\fP0";
                    n5 = 0;
                    continue;
                }
                case 0: {
                    j = Pattern.compile(intern2);
                    s2 = "B@_\u2061 \u200c\u227f\u30db\uff7c \uff16M\u0087\u00dc\u2006\u2079\u306d\u000fX\uff05\uff10\uff56\uff1a_QB1z^s\u204a\u2251\uff79,'11\u0003-iB@_\u2061 \u200c\u227f\u30db\uff7c \uff16M\u0087\u00dc\u2006\u2079\u306d\u000fX\uff05\uff10\uff56\uff1a_QB1z^s\u204a\u2251\uff79,'0F";
                    n5 = 1;
                    continue;
                }
                case 1: {
                    q = Pattern.compile(intern2);
                    s2 = "B@\u0007,";
                    n5 = 2;
                    continue;
                }
                case 2: {
                    break Label_0617;
                }
            }
        }
        m = Pattern.compile(intern2);
        r = Pattern.compile("\u2008");
    }
    
    a9(final String w) {
        this.v = "";
        this.y = new StringBuilder();
        this.x = "";
        this.c = new StringBuilder();
        this.i = new StringBuilder();
        this.s = true;
        this.A = false;
        this.u = false;
        this.o = false;
        this.p = e6.a();
        this.n = 0;
        this.a = 0;
        this.f = 0;
        this.b = new StringBuilder();
        this.t = false;
        this.z = "";
        this.k = new StringBuilder();
        this.h = new ArrayList();
        this.e = new c6(64);
        this.w = w;
        this.l = this.b(this.w);
        this.d = this.l;
    }
    
    private char a(char forDigit, final boolean b) {
        Label_0051: {
            if (forDigit == '+') {
                this.i.append(forDigit);
                if (e6.a == 0) {
                    break Label_0051;
                }
            }
            forDigit = Character.forDigit(Character.digit(forDigit, 10), 10);
            this.i.append(forDigit);
            this.k.append(forDigit);
        }
        if (b) {
            this.f = this.i.length();
        }
        return forDigit;
    }
    
    private String a(final String s, final String s2) {
        final Matcher matcher = this.e.a(s).matcher(a9.C[2]);
        matcher.find();
        final String group = matcher.group();
        if (group.length() < this.k.length()) {
            return "";
        }
        return group.replaceAll(s, s2).replaceAll("9", "\u2008");
    }
    
    private void a(final String s) {
        final int a = e6.a;
        List list;
        if (this.u && this.l.S() > 0) {
            list = this.l.r();
        }
        else {
            list = this.l.x();
        }
        final boolean y = this.l.y();
        for (final fw fw : list) {
            Label_0128: {
                if (y && !this.u && !fw.k()) {
                    final e6 p = this.p;
                    if (!e6.e(fw.b())) {
                        break Label_0128;
                    }
                }
                if (this.d(fw.c())) {
                    this.h.add(fw);
                }
            }
            if (a != 0) {
                break;
            }
        }
        this.e(s);
    }
    
    private boolean a() {
        final int a = e6.a;
        final Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            final fw fw = iterator.next();
            final String l = fw.l();
            if (this.x.equals(l)) {
                return false;
            }
            if (this.a(fw)) {
                this.x = l;
                this.t = a9.m.matcher(fw.b()).find();
                this.n = 0;
                return true;
            }
            iterator.remove();
            if (a != 0) {
                break;
            }
        }
        return this.s = false;
    }
    
    private boolean a(final fw fw) {
        final String l = fw.l();
        if (l.indexOf(124) == -1) {
            final String replaceAll = a9.j.matcher(a9.g.matcher(l).replaceAll(a9.C[0])).replaceAll(a9.C[1]);
            this.y.setLength(0);
            final String a = this.a(replaceAll, fw.c());
            if (a.length() > 0) {
                this.y.append(a);
                return true;
            }
        }
        return false;
    }
    
    private c0 b(final String s) {
        final c0 l = this.p.l(this.p.b(this.p.a(s)));
        if (l != null) {
            return l;
        }
        return a9.B;
    }
    
    private String b() {
        if (this.k.length() < 3) {
            return this.c(this.k.toString());
        }
        this.a(this.k.substring(0, 3));
        if (this.a()) {
            return this.h();
        }
        return this.c.toString();
    }
    
    private String b(char a, final boolean b) {
        final int a2 = e6.a;
        this.c.append(a);
        if (b) {
            this.a = this.c.length();
        }
        Label_0057: {
            if (!this.c(a)) {
                this.s = false;
                this.A = true;
                if (a2 == 0) {
                    break Label_0057;
                }
            }
            a = this.a(a, b);
        }
        String s;
        if (!this.s) {
            if (!this.A) {
                if (this.j()) {
                    if (this.g()) {
                        return this.e();
                    }
                }
                else if (this.f()) {
                    this.b.append(' ');
                    return this.e();
                }
                return this.c.toString();
            }
            s = this.c.toString();
        }
        else {
            switch (this.i.length()) {
                case 0:
                case 1:
                case 2: {
                    return this.c.toString();
                }
                case 3: {
                    if (this.j()) {
                        this.o = true;
                        if (a2 == 0) {
                            break;
                        }
                    }
                    this.z = this.k();
                    return this.b();
                }
            }
            if (this.o) {
                if (this.g()) {
                    this.o = false;
                }
                return (Object)this.b + this.k.toString();
            }
            if (this.h.size() <= 0) {
                return this.b();
            }
            final String d = this.d(a);
            s = this.c();
            if (s.length() <= 0) {
                this.e(this.k.toString());
                if (this.a()) {
                    return this.h();
                }
                if (this.s) {
                    return this.c(d);
                }
                return this.c.toString();
            }
        }
        return s;
    }
    
    private String c(final String s) {
        final int length = this.b.length();
        if (this.t && length > 0 && this.b.charAt(length - 1) != ' ') {
            return new String(this.b) + ' ' + s;
        }
        return (Object)this.b + s;
    }
    
    private boolean c(final char c) {
        return Character.isDigit(c) || (this.c.length() == 1 && e6.y.matcher(Character.toString(c)).matches());
    }
    
    private String d(final char c) {
        final Matcher matcher = a9.r.matcher(this.y);
        if (matcher.find(this.n)) {
            final String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.y.replace(0, replaceFirst.length(), replaceFirst);
            this.n = matcher.start();
            return this.y.substring(0, 1 + this.n);
        }
        if (this.h.size() == 1) {
            this.s = false;
        }
        this.x = "";
        return this.c.toString();
    }
    
    private boolean d(final String s) {
        return a9.q.matcher(s).matches();
    }
    
    private String e() {
        this.s = true;
        this.o = false;
        this.h.clear();
        return this.b();
    }
    
    private void e(final String s) {
        final int a = e6.a;
        final int n = -3 + s.length();
        final Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            final fw fw = iterator.next();
            if (fw.g() > n && !this.e.a(fw.a(n)).matcher(s).lookingAt()) {
                iterator.remove();
            }
            if (a != 0) {
                break;
            }
        }
    }
    
    private boolean f() {
        if (this.z.length() > 0) {
            this.k.insert(0, this.z);
            this.b.setLength(this.b.lastIndexOf(this.z));
        }
        final boolean equals = this.z.equals(this.k());
        boolean b = false;
        if (!equals) {
            b = true;
        }
        return b;
    }
    
    private boolean g() {
        if (this.k.length() != 0) {
            final StringBuilder sb = new StringBuilder();
            final int a = this.p.a(this.k, sb);
            if (a != 0) {
                this.k.setLength(0);
                this.k.append((CharSequence)sb);
                final String b = this.p.b(a);
                Label_0117: {
                    if (a9.C[3].equals(b)) {
                        this.l = this.p.c(a);
                        if (e6.a == 0) {
                            break Label_0117;
                        }
                    }
                    if (!b.equals(this.w)) {
                        this.l = this.b(b);
                    }
                }
                this.b.append(Integer.toString(a)).append(' ');
                return true;
            }
        }
        return false;
    }
    
    private String h() {
        final int a = e6.a;
        final int length = this.k.length();
        if (length <= 0) {
            return this.b.toString();
        }
        String d = "";
        int i = 0;
        while (i < length) {
            d = this.d(this.k.charAt(i));
            ++i;
            if (a != 0) {
                break;
            }
        }
        if (this.s) {
            return this.c(d);
        }
        return this.c.toString();
    }
    
    private boolean j() {
        final Matcher matcher = this.e.a(a9.C[4] + this.l.q()).matcher(this.i);
        if (matcher.lookingAt()) {
            this.u = true;
            final int end = matcher.end();
            this.k.setLength(0);
            this.k.append(this.i.substring(end));
            this.b.setLength(0);
            this.b.append(this.i.substring(0, end));
            if (this.i.charAt(0) != '+') {
                this.b.append(' ');
            }
            return true;
        }
        return false;
    }
    
    private String k() {
        int end = 0;
        Label_0104: {
            if (this.l()) {
                this.b.append('1').append(' ');
                this.u = true;
                if (e6.a == 0) {
                    end = 1;
                    break Label_0104;
                }
                end = 1;
            }
            else {
                end = 0;
            }
            if (this.l.C()) {
                final Matcher matcher = this.e.a(this.l.i()).matcher(this.k);
                if (matcher.lookingAt()) {
                    this.u = true;
                    end = matcher.end();
                    this.b.append(this.k.substring(0, end));
                }
            }
        }
        final String substring = this.k.substring(0, end);
        this.k.delete(0, end);
        return substring;
    }
    
    private boolean l() {
        return this.l.K() == 1 && this.k.charAt(0) == '1' && this.k.charAt(1) != '0' && this.k.charAt(1) != '1';
    }
    
    public String a(final char c) {
        return this.v = this.b(c, true);
    }
    
    public String b(final char c) {
        return this.v = this.b(c, false);
    }
    
    String c() {
        final int a = e6.a;
        for (final fw fw : this.h) {
            final Matcher matcher = this.e.a(fw.l()).matcher(this.k);
            if (matcher.matches()) {
                this.t = a9.m.matcher(fw.b()).find();
                return this.c(matcher.replaceAll(fw.c()));
            }
            if (a != 0) {
                break;
            }
        }
        return "";
    }
    
    public void d() {
        this.v = "";
        this.c.setLength(0);
        this.i.setLength(0);
        this.y.setLength(0);
        this.n = 0;
        this.x = "";
        this.b.setLength(0);
        this.z = "";
        this.k.setLength(0);
        this.s = true;
        this.A = false;
        this.f = 0;
        this.a = 0;
        this.u = false;
        this.o = false;
        this.h.clear();
        this.t = false;
        if (!this.l.equals(this.d)) {
            this.l = this.b(this.w);
        }
    }
    
    public int i() {
        int a = 0;
        final int a2 = e6.a;
        if (!this.s) {
            a = this.a;
        }
        else {
            int n = 0;
            while (n < this.f && a < this.v.length()) {
                if (this.i.charAt(n) == this.v.charAt(a)) {
                    ++n;
                }
                ++a;
                if (a2 != 0) {
                    return a;
                }
            }
        }
        return a;
    }
}
