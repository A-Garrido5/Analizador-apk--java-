// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class a
{
    private static final Phonemetadata$PhoneMetadata l;
    private static final Pattern o;
    private static final Pattern p;
    private static final Pattern q;
    private static final Pattern r;
    private static final Pattern s;
    private List A;
    private f B;
    private String a;
    private StringBuilder b;
    private String c;
    private StringBuilder d;
    private StringBuilder e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final PhoneNumberUtil j;
    private String k;
    private Phonemetadata$PhoneMetadata m;
    private Phonemetadata$PhoneMetadata n;
    private int t;
    private int u;
    private int v;
    private StringBuilder w;
    private boolean x;
    private String y;
    private StringBuilder z;
    
    static {
        l = new Phonemetadata$PhoneMetadata().b("NA");
        o = Pattern.compile("\\[([^\\[\\]])*\\]");
        p = Pattern.compile("\\d(?=[^,}][^,}])");
        q = Pattern.compile("[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f  \u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e]*(\\$\\d[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f  \u00ad\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e]*)+");
        r = Pattern.compile("[- ]");
        s = Pattern.compile("\u2008");
    }
    
    a(final String k) {
        this.a = "";
        this.b = new StringBuilder();
        this.c = "";
        this.d = new StringBuilder();
        this.e = new StringBuilder();
        this.f = true;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = PhoneNumberUtil.a();
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = new StringBuilder();
        this.x = false;
        this.y = "";
        this.z = new StringBuilder();
        this.A = new ArrayList();
        this.B = new f(64);
        this.k = k;
        this.n = this.a(this.k);
        this.m = this.n;
    }
    
    private Phonemetadata$PhoneMetadata a(final String s) {
        final Phonemetadata$PhoneMetadata f = this.j.f(this.j.b(this.j.g(s)));
        if (f != null) {
            return f;
        }
        return com.google.i18n.phonenumbers.a.l;
    }
    
    private String a(char b, final boolean b2) {
        this.d.append(b);
        if (b2) {
            this.u = this.d.length();
        }
        if (!this.c(b)) {
            this.f = false;
            this.g = true;
        }
        else {
            b = this.b(b, b2);
        }
        String s;
        if (!this.f) {
            if (!this.g) {
                if (this.k()) {
                    if (this.l()) {
                        return this.e();
                    }
                }
                else if (this.f()) {
                    this.w.append(' ');
                    return this.e();
                }
                return this.d.toString();
            }
            s = this.d.toString();
        }
        else {
            switch (this.e.length()) {
                case 0:
                case 1:
                case 2: {
                    return this.d.toString();
                }
                case 3: {
                    if (this.k()) {
                        this.i = true;
                        break;
                    }
                    this.y = this.j();
                    return this.g();
                }
            }
            if (this.i) {
                if (this.l()) {
                    this.i = false;
                }
                final String value = String.valueOf(String.valueOf(this.w));
                final String value2 = String.valueOf(String.valueOf(this.z.toString()));
                return new StringBuilder(0 + value.length() + value2.length()).append(value).append(value2).toString();
            }
            if (this.A.size() <= 0) {
                return this.g();
            }
            final String d = this.d(b);
            s = this.b();
            if (s.length() <= 0) {
                this.d(this.z.toString());
                if (this.d()) {
                    return this.h();
                }
                if (this.f) {
                    return this.e(d);
                }
                return this.d.toString();
            }
        }
        return s;
    }
    
    private String a(final String s, final String s2) {
        final Matcher matcher = this.B.a(s).matcher("999999999999999");
        matcher.find();
        final String group = matcher.group();
        if (group.length() < this.z.length()) {
            return "";
        }
        return group.replaceAll(s, s2).replaceAll("9", "\u2008");
    }
    
    private boolean a(final Phonemetadata$NumberFormat phonemetadata$NumberFormat) {
        final String a = phonemetadata$NumberFormat.a();
        if (a.indexOf(124) == -1) {
            final String replaceAll = com.google.i18n.phonenumbers.a.p.matcher(com.google.i18n.phonenumbers.a.o.matcher(a).replaceAll("\\\\d")).replaceAll("\\\\d");
            this.b.setLength(0);
            final String a2 = this.a(replaceAll, phonemetadata$NumberFormat.b());
            if (a2.length() > 0) {
                this.b.append(a2);
                return true;
            }
        }
        return false;
    }
    
    private char b(char forDigit, final boolean b) {
        if (forDigit == '+') {
            this.e.append(forDigit);
        }
        else {
            forDigit = Character.forDigit(Character.digit(forDigit, 10), 10);
            this.e.append(forDigit);
            this.z.append(forDigit);
        }
        if (b) {
            this.v = this.e.length();
        }
        return forDigit;
    }
    
    private void b(final String s) {
        List list;
        if (this.h && this.n.x() > 0) {
            list = this.n.w();
        }
        else {
            list = this.n.u();
        }
        final boolean n = this.n.n();
        for (final Phonemetadata$NumberFormat phonemetadata$NumberFormat : list) {
            if ((!n || this.h || phonemetadata$NumberFormat.e() || PhoneNumberUtil.e(phonemetadata$NumberFormat.d())) && this.c(phonemetadata$NumberFormat.b())) {
                this.A.add(phonemetadata$NumberFormat);
            }
        }
        this.d(s);
    }
    
    private boolean c(final char c) {
        return Character.isDigit(c) || (this.d.length() == 1 && PhoneNumberUtil.b.matcher(Character.toString(c)).matches());
    }
    
    private boolean c(final String s) {
        return com.google.i18n.phonenumbers.a.q.matcher(s).matches();
    }
    
    private String d(final char c) {
        final Matcher matcher = com.google.i18n.phonenumbers.a.s.matcher(this.b);
        if (matcher.find(this.t)) {
            final String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.b.replace(0, replaceFirst.length(), replaceFirst);
            this.t = matcher.start();
            return this.b.substring(0, 1 + this.t);
        }
        if (this.A.size() == 1) {
            this.f = false;
        }
        this.c = "";
        return this.d.toString();
    }
    
    private void d(final String s) {
        final int n = -3 + s.length();
        final Iterator<Phonemetadata$NumberFormat> iterator = (Iterator<Phonemetadata$NumberFormat>)this.A.iterator();
        while (iterator.hasNext()) {
            final Phonemetadata$NumberFormat phonemetadata$NumberFormat = iterator.next();
            if (phonemetadata$NumberFormat.c() != 0 && !this.B.a(phonemetadata$NumberFormat.a(Math.min(n, -1 + phonemetadata$NumberFormat.c()))).matcher(s).lookingAt()) {
                iterator.remove();
            }
        }
    }
    
    private boolean d() {
        final Iterator<Phonemetadata$NumberFormat> iterator = (Iterator<Phonemetadata$NumberFormat>)this.A.iterator();
        while (iterator.hasNext()) {
            final Phonemetadata$NumberFormat phonemetadata$NumberFormat = iterator.next();
            final String a = phonemetadata$NumberFormat.a();
            if (this.c.equals(a)) {
                return false;
            }
            if (this.a(phonemetadata$NumberFormat)) {
                this.c = a;
                this.x = com.google.i18n.phonenumbers.a.r.matcher(phonemetadata$NumberFormat.d()).find();
                this.t = 0;
                return true;
            }
            iterator.remove();
        }
        return this.f = false;
    }
    
    private String e() {
        this.f = true;
        this.i = false;
        this.A.clear();
        return this.g();
    }
    
    private String e(final String s) {
        final int length = this.w.length();
        if (this.x && length > 0 && this.w.charAt(length - 1) != ' ') {
            final String value = String.valueOf(String.valueOf(new String(this.w)));
            final String value2 = String.valueOf(String.valueOf(s));
            return new StringBuilder(1 + value.length() + value2.length()).append(value).append(' ').append(value2).toString();
        }
        final String value3 = String.valueOf(String.valueOf(this.w));
        final String value4 = String.valueOf(String.valueOf(s));
        return new StringBuilder(0 + value3.length() + value4.length()).append(value3).append(value4).toString();
    }
    
    private boolean f() {
        if (this.y.length() > 0) {
            this.z.insert(0, this.y);
            this.w.setLength(this.w.lastIndexOf(this.y));
        }
        final boolean equals = this.y.equals(this.j());
        boolean b = false;
        if (!equals) {
            b = true;
        }
        return b;
    }
    
    private String g() {
        if (this.z.length() < 3) {
            return this.e(this.z.toString());
        }
        this.b(this.z.toString());
        final String b = this.b();
        if (b.length() > 0) {
            return b;
        }
        if (this.d()) {
            return this.h();
        }
        return this.d.toString();
    }
    
    private String h() {
        final int length = this.z.length();
        if (length <= 0) {
            return this.w.toString();
        }
        String d = "";
        for (int i = 0; i < length; ++i) {
            d = this.d(this.z.charAt(i));
        }
        if (this.f) {
            return this.e(d);
        }
        return this.d.toString();
    }
    
    private boolean i() {
        return this.n.l() == 1 && this.z.charAt(0) == '1' && this.z.charAt(1) != '0' && this.z.charAt(1) != '1';
    }
    
    private String j() {
        int end = 1;
        Label_0029: {
            if (this.i()) {
                this.w.append('1').append(' ');
                this.h = (end != 0);
            }
            else {
                if (this.n.q()) {
                    final Matcher matcher = this.B.a(this.n.r()).matcher(this.z);
                    if (matcher.lookingAt() && matcher.end() > 0) {
                        this.h = (end != 0);
                        end = matcher.end();
                        this.w.append(this.z.substring(0, end));
                        break Label_0029;
                    }
                }
                end = 0;
            }
        }
        final String substring = this.z.substring(0, end);
        this.z.delete(0, end);
        return substring;
    }
    
    private boolean k() {
        final f b = this.B;
        final String value = String.valueOf("\\+|");
        final String value2 = String.valueOf(this.n.m());
        String concat;
        if (value2.length() != 0) {
            concat = value.concat(value2);
        }
        else {
            concat = new String(value);
        }
        final Matcher matcher = b.a(concat).matcher(this.e);
        if (matcher.lookingAt()) {
            this.h = true;
            final int end = matcher.end();
            this.z.setLength(0);
            this.z.append(this.e.substring(end));
            this.w.setLength(0);
            this.w.append(this.e.substring(0, end));
            if (this.e.charAt(0) != '+') {
                this.w.append(' ');
            }
            return true;
        }
        return false;
    }
    
    private boolean l() {
        if (this.z.length() != 0) {
            final StringBuilder sb = new StringBuilder();
            final int a = this.j.a(this.z, sb);
            if (a != 0) {
                this.z.setLength(0);
                this.z.append((CharSequence)sb);
                final String b = this.j.b(a);
                if ("001".equals(b)) {
                    this.n = this.j.a(a);
                }
                else if (!b.equals(this.k)) {
                    this.n = this.a(b);
                }
                this.w.append(Integer.toString(a)).append(' ');
                this.y = "";
                return true;
            }
        }
        return false;
    }
    
    public String a(final char c) {
        return this.a = this.a(c, false);
    }
    
    public void a() {
        this.a = "";
        this.d.setLength(0);
        this.e.setLength(0);
        this.b.setLength(0);
        this.t = 0;
        this.c = "";
        this.w.setLength(0);
        this.y = "";
        this.z.setLength(0);
        this.f = true;
        this.g = false;
        this.v = 0;
        this.u = 0;
        this.h = false;
        this.i = false;
        this.A.clear();
        this.x = false;
        if (!this.n.equals(this.m)) {
            this.n = this.a(this.k);
        }
    }
    
    String b() {
        for (final Phonemetadata$NumberFormat phonemetadata$NumberFormat : this.A) {
            final Matcher matcher = this.B.a(phonemetadata$NumberFormat.a()).matcher(this.z);
            if (matcher.matches()) {
                this.x = com.google.i18n.phonenumbers.a.r.matcher(phonemetadata$NumberFormat.d()).find();
                return this.e(matcher.replaceAll(phonemetadata$NumberFormat.b()));
            }
        }
        return "";
    }
    
    public String b(final char c) {
        return this.a = this.a(c, true);
    }
    
    public int c() {
        int u = 0;
        if (!this.f) {
            u = this.u;
        }
        else {
            for (int n = 0; n < this.v && u < this.a.length(); ++u) {
                if (this.e.charAt(n) == this.a.charAt(u)) {
                    ++n;
                }
            }
        }
        return u;
    }
}
