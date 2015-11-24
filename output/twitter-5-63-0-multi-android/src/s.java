import java.math.BigDecimal;
import com.fasterxml.jackson.core.JsonGenerator$Feature;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.f;
import com.fasterxml.jackson.core.io.b;
import com.fasterxml.jackson.core.io.a;
import com.fasterxml.jackson.core.d;
import java.io.Writer;

// 
// Decompiled by Procyon v0.5.30
// 

public final class s extends m
{
    protected static final char[] n;
    protected final Writer o;
    protected char[] p;
    protected int q;
    protected int r;
    protected int s;
    protected char[] t;
    protected d u;
    
    static {
        n = a.g();
    }
    
    public s(final b b, final int n, final com.fasterxml.jackson.core.b b2, final Writer o) {
        super(b, n, b2);
        this.q = 0;
        this.r = 0;
        this.o = o;
        this.p = b.h();
        this.s = this.p.length;
    }
    
    private int a(final char[] array, final int n, final int n2, char c, final int n3) {
        if (n3 >= 0) {
            if (n > 1 && n < n2) {
                final int n4 = n - 2;
                array[n4] = '\\';
                array[n4 + 1] = (char)n3;
                return n4;
            }
            char[] array2 = this.t;
            if (array2 == null) {
                array2 = this.k();
            }
            array2[1] = (char)n3;
            this.o.write(array2, 0, 2);
            return n;
        }
        else if (n3 != -2) {
            if (n > 5 && n < n2) {
                final int n5 = n - 6;
                final int n6 = n5 + 1;
                array[n5] = '\\';
                final int n7 = n6 + 1;
                array[n6] = 'u';
                int n9;
                if (c > '\u00ff') {
                    final char c2 = (char)('\u00ff' & c >> 8);
                    final int n8 = n7 + 1;
                    array[n7] = s.n[c2 >> 4];
                    n9 = n8 + 1;
                    array[n8] = s.n[c2 & '\u000f'];
                    c &= '\u00ff';
                }
                else {
                    final int n10 = n7 + 1;
                    array[n7] = '0';
                    n9 = n10 + 1;
                    array[n10] = '0';
                }
                final int n11 = n9 + 1;
                array[n9] = s.n[c >> 4];
                array[n11] = s.n[c & '\u000f'];
                return n11 - 5;
            }
            char[] array3 = this.t;
            if (array3 == null) {
                array3 = this.k();
            }
            this.q = this.r;
            if (c > '\u00ff') {
                final char c3 = (char)('\u00ff' & c >> 8);
                final char c4 = (char)(c & '\u00ff');
                array3[10] = s.n[c3 >> 4];
                array3[11] = s.n[c3 & '\u000f'];
                array3[12] = s.n[c4 >> 4];
                array3[13] = s.n[c4 & '\u000f'];
                this.o.write(array3, 8, 6);
                return n;
            }
            array3[6] = s.n[c >> 4];
            array3[7] = s.n[c & '\u000f'];
            this.o.write(array3, 2, 6);
            return n;
        }
        else {
            String s;
            if (this.u == null) {
                s = this.l.a(c).a();
            }
            else {
                s = this.u.a();
                this.u = null;
            }
            final int length = s.length();
            if (n >= length && n < n2) {
                final int n12 = n - length;
                s.getChars(0, length, array, n12);
                return n12;
            }
            this.o.write(s);
            return n;
        }
    }
    
    private void a(char c, final int n) {
        if (n >= 0) {
            if (this.r >= 2) {
                final int q = -2 + this.r;
                this.q = q;
                final char[] p2 = this.p;
                final int n2 = q + 1;
                p2[q] = '\\';
                this.p[n2] = (char)n;
                return;
            }
            char[] array = this.t;
            if (array == null) {
                array = this.k();
            }
            this.q = this.r;
            array[1] = (char)n;
            this.o.write(array, 0, 2);
        }
        else if (n != -2) {
            if (this.r >= 6) {
                final char[] p3 = this.p;
                final int q2 = -6 + this.r;
                p3[this.q = q2] = '\\';
                final int n3 = q2 + 1;
                p3[n3] = 'u';
                int n5;
                if (c > '\u00ff') {
                    final char c2 = (char)('\u00ff' & c >> 8);
                    final int n4 = n3 + 1;
                    p3[n4] = s.n[c2 >> 4];
                    n5 = n4 + 1;
                    p3[n5] = s.n[c2 & '\u000f'];
                    c &= '\u00ff';
                }
                else {
                    final int n6 = n3 + 1;
                    p3[n6] = '0';
                    n5 = n6 + 1;
                    p3[n5] = '0';
                }
                final int n7 = n5 + 1;
                p3[n7] = s.n[c >> 4];
                p3[n7 + 1] = s.n[c & '\u000f'];
                return;
            }
            char[] array2 = this.t;
            if (array2 == null) {
                array2 = this.k();
            }
            this.q = this.r;
            if (c > '\u00ff') {
                final char c3 = (char)('\u00ff' & c >> 8);
                final char c4 = (char)(c & '\u00ff');
                array2[10] = s.n[c3 >> 4];
                array2[11] = s.n[c3 & '\u000f'];
                array2[12] = s.n[c4 >> 4];
                array2[13] = s.n[c4 & '\u000f'];
                this.o.write(array2, 8, 6);
                return;
            }
            array2[6] = s.n[c >> 4];
            array2[7] = s.n[c & '\u000f'];
            this.o.write(array2, 2, 6);
        }
        else {
            String s;
            if (this.u == null) {
                s = this.l.a(c).a();
            }
            else {
                s = this.u.a();
                this.u = null;
            }
            final int length = s.length();
            if (this.r >= length) {
                final int q3 = this.r - length;
                this.q = q3;
                s.getChars(0, length, this.p, q3);
                return;
            }
            this.q = this.r;
            this.o.write(s);
        }
    }
    
    private void a(final Object o) {
        if (this.r >= this.s) {
            this.i();
        }
        this.p[this.r++] = '\"';
        this.c(o.toString());
        if (this.r >= this.s) {
            this.i();
        }
        this.p[this.r++] = '\"';
    }
    
    private void b(final int n, final int n2) {
        final int n3 = n + this.r;
        final int[] j = this.j;
        final int min = Math.min(j.length, n2 + 1);
    Label_0024:
        while (this.r < n3) {
            do {
                final char c = this.p[this.r];
                int n4;
                if (c < min) {
                    n4 = j[c];
                    if (n4 == 0) {
                        continue;
                    }
                }
                else {
                    if (c <= n2) {
                        continue;
                    }
                    n4 = -1;
                }
                final int n5 = this.r - this.q;
                if (n5 > 0) {
                    this.o.write(this.p, this.q, n5);
                }
                ++this.r;
                this.a(c, n4);
                continue Label_0024;
            } while (++this.r < n3);
            break;
        }
    }
    
    private void b(final long n) {
        if (23 + this.r >= this.s) {
            this.i();
        }
        this.p[this.r++] = '\"';
        this.r = com.fasterxml.jackson.core.io.f.a(n, this.p, this.r);
        this.p[this.r++] = '\"';
    }
    
    private void c(final int n) {
        if (13 + this.r >= this.s) {
            this.i();
        }
        this.p[this.r++] = '\"';
        this.r = com.fasterxml.jackson.core.io.f.a(n, this.p, this.r);
        this.p[this.r++] = '\"';
    }
    
    private void c(final int n, final int n2) {
        int n3 = 0;
        final int[] j = this.j;
        final int min = Math.min(j.length, n2 + 1);
        int n4 = 0;
        int i = 0;
    Label_0059_Outer:
        while (i < n) {
            while (true) {
                do {
                    final char c = this.p[i];
                    int n5;
                    if (c < min) {
                        n5 = j[c];
                        if (n5 == 0) {
                            n3 = n5;
                            continue Label_0059_Outer;
                        }
                    }
                    else {
                        if (c <= n2) {
                            continue Label_0059_Outer;
                        }
                        n5 = -1;
                    }
                    final int n6 = i - n4;
                    if (n6 > 0) {
                        this.o.write(this.p, n4, n6);
                        if (i >= n) {
                            break Label_0059_Outer;
                        }
                    }
                    final int n7 = i + 1;
                    final int a = this.a(this.p, n7, n, c, n5);
                    i = n7;
                    n4 = a;
                    n3 = n5;
                    continue Label_0059_Outer;
                } while (++i < n);
                int n5 = n3;
                continue;
            }
        }
    }
    
    private void d(final int n) {
        final int n2 = n + this.r;
        final int[] j = this.j;
        final int length = j.length;
    Label_0016:
        while (this.r < n2) {
            do {
                final char c = this.p[this.r];
                if (c < length && j[c] != 0) {
                    final int n3 = this.r - this.q;
                    if (n3 > 0) {
                        this.o.write(this.p, this.q, n3);
                    }
                    final char c2 = this.p[this.r++];
                    this.a(c2, j[c2]);
                    continue Label_0016;
                }
            } while (++this.r < n2);
            break;
        }
    }
    
    private void e(final int n) {
        final int[] j = this.j;
        final int length = j.length;
        int i = 0;
        int a = 0;
        while (i < n) {
            char c;
            do {
                c = this.p[i];
            } while ((c >= length || j[c] == 0) && ++i < n);
            final int n2 = i - a;
            if (n2 > 0) {
                this.o.write(this.p, a, n2);
                if (i >= n) {
                    break;
                }
            }
            final int n3 = i + 1;
            a = this.a(this.p, n3, n, c, j[c]);
            i = n3;
        }
    }
    
    private void f(final int n) {
        final int n2 = n + this.r;
        final int[] j = this.j;
        int k;
        if (this.k < 1) {
            k = 65535;
        }
        else {
            k = this.k;
        }
        final int min = Math.min(j.length, k + '\u0001');
        final CharacterEscapes l = this.l;
    Label_0041:
        while (this.r < n2) {
            do {
                final char c = this.p[this.r];
                int n3;
                if (c < min) {
                    n3 = j[c];
                    if (n3 == 0) {
                        continue;
                    }
                }
                else if (c > k) {
                    n3 = -1;
                }
                else {
                    if ((this.u = l.a(c)) == null) {
                        continue;
                    }
                    n3 = -2;
                }
                final int n4 = this.r - this.q;
                if (n4 > 0) {
                    this.o.write(this.p, this.q, n4);
                }
                ++this.r;
                this.a(c, n3);
                continue Label_0041;
            } while (++this.r < n2);
            break;
        }
    }
    
    private void g(final int n) {
        int i = 0;
        final int[] j = this.j;
        int k;
        if (this.k < 1) {
            k = 65535;
        }
        else {
            k = this.k;
        }
        final int min = Math.min(j.length, k + '\u0001');
        final CharacterEscapes l = this.l;
        int n2 = 0;
        int n3 = 0;
    Label_0073_Outer:
        while (i < n) {
            while (true) {
                do {
                    final char c = this.p[i];
                    int n4;
                    if (c < min) {
                        n4 = j[c];
                        if (n4 == 0) {
                            n3 = n4;
                            continue Label_0073_Outer;
                        }
                    }
                    else if (c > k) {
                        n4 = -1;
                    }
                    else {
                        if ((this.u = l.a(c)) == null) {
                            continue Label_0073_Outer;
                        }
                        n4 = -2;
                    }
                    final int n5 = i - n2;
                    if (n5 > 0) {
                        this.o.write(this.p, n2, n5);
                        if (i >= n) {
                            break Label_0073_Outer;
                        }
                    }
                    final int n6 = i + 1;
                    final int a = this.a(this.p, n6, n, c, n4);
                    i = n6;
                    n2 = a;
                    n3 = n4;
                    continue Label_0073_Outer;
                } while (++i < n);
                int n4 = n3;
                continue;
            }
        }
    }
    
    private void i(final String s) {
        int n = this.s - this.r;
        s.getChars(0, n, this.p, this.r);
        this.r += n;
        this.i();
        int i;
        int s2;
        for (i = s.length() - n; i > this.s; i -= s2) {
            s2 = this.s;
            s.getChars(n, n + s2, this.p, 0);
            this.q = 0;
            this.r = s2;
            this.i();
            n += s2;
        }
        s.getChars(n, n + i, this.p, 0);
        this.q = 0;
        this.r = i;
    }
    
    private final void j() {
        if (4 + this.r >= this.s) {
            this.i();
        }
        final int r = this.r;
        final char[] p = this.p;
        p[r] = 'n';
        final int n = r + 1;
        p[n] = 'u';
        final int n2 = n + 1;
        p[n2] = 'l';
        final int n3 = n2 + 1;
        p[n3] = 'l';
        this.r = n3 + 1;
    }
    
    private void j(final String s) {
        final int length = s.length();
        if (length > this.s) {
            this.k(s);
            return;
        }
        if (length + this.r > this.s) {
            this.i();
        }
        s.getChars(0, length, this.p, this.r);
        if (this.l != null) {
            this.f(length);
            return;
        }
        if (this.k != 0) {
            this.b(length, this.k);
            return;
        }
        this.d(length);
    }
    
    private void k(final String s) {
        this.i();
        final int length = s.length();
        int n = 0;
        do {
            int s2 = this.s;
            if (n + s2 > length) {
                s2 = length - n;
            }
            s.getChars(n, n + s2, this.p, 0);
            if (this.l != null) {
                this.g(s2);
            }
            else if (this.k != 0) {
                this.c(s2, this.k);
            }
            else {
                this.e(s2);
            }
            n += s2;
        } while (n < length);
    }
    
    private char[] k() {
        return this.t = new char[] { '\\', '\0', '\\', 'u', '0', '0', '\0', '\0', '\\', 'u', '\0', '\0', '\0', '\0' };
    }
    
    @Override
    public void a() {
        this.g("start an array");
        this.f = this.f.g();
        if (this.a != null) {
            this.a.e(this);
            return;
        }
        if (this.r >= this.s) {
            this.i();
        }
        this.p[this.r++] = '[';
    }
    
    @Override
    public void a(final char c) {
        if (this.r >= this.s) {
            this.i();
        }
        this.p[this.r++] = c;
    }
    
    @Override
    public void a(final double n) {
        if (this.e || (this.a(JsonGenerator$Feature.d) && (Double.isNaN(n) || Double.isInfinite(n)))) {
            this.b(String.valueOf(n));
            return;
        }
        this.g("write number");
        this.c(String.valueOf(n));
    }
    
    @Override
    public void a(final float n) {
        if (this.e || (this.a(JsonGenerator$Feature.d) && (Float.isNaN(n) || Float.isInfinite(n)))) {
            this.b(String.valueOf(n));
            return;
        }
        this.g("write number");
        this.c(String.valueOf(n));
    }
    
    @Override
    public void a(final long n) {
        this.g("write number");
        if (this.e) {
            this.b(n);
            return;
        }
        if (21 + this.r >= this.s) {
            this.i();
        }
        this.r = com.fasterxml.jackson.core.io.f.a(n, this.p, this.r);
    }
    
    @Override
    public void a(final String s) {
        boolean b = true;
        final int a = this.f.a(s);
        if (a == 4) {
            this.f("Can not write a field name, expecting a value");
        }
        if (a != (b ? 1 : 0)) {
            b = false;
        }
        this.b(s, b);
    }
    
    @Override
    public void a(final BigDecimal bigDecimal) {
        this.g("write number");
        if (bigDecimal == null) {
            this.j();
            return;
        }
        if (this.e) {
            this.a((Object)bigDecimal);
            return;
        }
        if (this.a(JsonGenerator$Feature.f)) {
            this.c(bigDecimal.toPlainString());
            return;
        }
        this.c(bigDecimal.toString());
    }
    
    @Override
    public void a(final boolean b) {
        this.g("write boolean value");
        if (5 + this.r >= this.s) {
            this.i();
        }
        final int r = this.r;
        final char[] p = this.p;
        int n3;
        if (b) {
            p[r] = 't';
            final int n = r + 1;
            p[n] = 'r';
            final int n2 = n + 1;
            p[n2] = 'u';
            n3 = n2 + 1;
            p[n3] = 'e';
        }
        else {
            p[r] = 'f';
            final int n4 = r + 1;
            p[n4] = 'a';
            final int n5 = n4 + 1;
            p[n5] = 'l';
            final int n6 = n5 + 1;
            p[n6] = 's';
            n3 = n6 + 1;
            p[n3] = 'e';
        }
        this.r = n3 + 1;
    }
    
    @Override
    public void b() {
        if (!this.f.a()) {
            this.f("Current context not an ARRAY but " + this.f.d());
        }
        if (this.a != null) {
            this.a.b(this, this.f.e());
        }
        else {
            if (this.r >= this.s) {
                this.i();
            }
            this.p[this.r++] = ']';
        }
        this.f = this.f.i();
    }
    
    @Override
    public void b(final int n) {
        this.g("write number");
        if (this.e) {
            this.c(n);
            return;
        }
        if (11 + this.r >= this.s) {
            this.i();
        }
        this.r = com.fasterxml.jackson.core.io.f.a(n, this.p, this.r);
    }
    
    @Override
    public void b(final d d) {
        this.c(d.a());
    }
    
    @Override
    public void b(final String s) {
        this.g("write text value");
        if (s == null) {
            this.j();
            return;
        }
        if (this.r >= this.s) {
            this.i();
        }
        this.p[this.r++] = '\"';
        this.j(s);
        if (this.r >= this.s) {
            this.i();
        }
        this.p[this.r++] = '\"';
    }
    
    protected void b(final String s, final boolean b) {
        if (this.a != null) {
            this.c(s, b);
            return;
        }
        if (1 + this.r >= this.s) {
            this.i();
        }
        if (b) {
            this.p[this.r++] = ',';
        }
        if (!this.a(JsonGenerator$Feature.c)) {
            this.j(s);
            return;
        }
        this.p[this.r++] = '\"';
        this.j(s);
        if (this.r >= this.s) {
            this.i();
        }
        this.p[this.r++] = '\"';
    }
    
    @Override
    public void c() {
        this.g("start an object");
        this.f = this.f.h();
        if (this.a != null) {
            this.a.b(this);
            return;
        }
        if (this.r >= this.s) {
            this.i();
        }
        this.p[this.r++] = '{';
    }
    
    @Override
    public void c(final String s) {
        final int length = s.length();
        int n = this.s - this.r;
        if (n == 0) {
            this.i();
            n = this.s - this.r;
        }
        if (n >= length) {
            s.getChars(0, length, this.p, this.r);
            this.r += length;
            return;
        }
        this.i(s);
    }
    
    protected void c(final String s, final boolean b) {
        if (b) {
            this.a.c(this);
        }
        else {
            this.a.h(this);
        }
        if (this.a(JsonGenerator$Feature.c)) {
            if (this.r >= this.s) {
                this.i();
            }
            this.p[this.r++] = '\"';
            this.j(s);
            if (this.r >= this.s) {
                this.i();
            }
            this.p[this.r++] = '\"';
            return;
        }
        this.j(s);
    }
    
    @Override
    public void close() {
        super.close();
        if (this.p != null && this.a(JsonGenerator$Feature.b)) {
            while (true) {
                final o g = this.g();
                if (g.a()) {
                    this.b();
                }
                else {
                    if (!g.c()) {
                        break;
                    }
                    this.d();
                }
            }
        }
        this.i();
        if (this.o != null) {
            if (this.i.c() || this.a(JsonGenerator$Feature.a)) {
                this.o.close();
            }
            else if (this.a(JsonGenerator$Feature.g)) {
                this.o.flush();
            }
        }
        this.h();
    }
    
    @Override
    public void d() {
        if (!this.f.c()) {
            this.f("Current context not an object but " + this.f.d());
        }
        if (this.a != null) {
            this.a.a(this, this.f.e());
        }
        else {
            if (this.r >= this.s) {
                this.i();
            }
            this.p[this.r++] = '}';
        }
        this.f = this.f.i();
    }
    
    @Override
    public void e() {
        this.g("write null value");
        this.j();
    }
    
    @Override
    public void flush() {
        this.i();
        if (this.o != null && this.a(JsonGenerator$Feature.g)) {
            this.o.flush();
        }
    }
    
    @Override
    protected void g(final String s) {
        if (this.a == null) {
            final int j = this.f.j();
            if (j == 5) {
                this.f("Can not " + s + ", expecting field name");
            }
            char c = '\0';
            switch (j) {
                default: {
                    return;
                }
                case 1: {
                    c = ',';
                    break;
                }
                case 2: {
                    c = ':';
                    break;
                }
                case 3: {
                    if (this.m != null) {
                        this.c(this.m.a());
                    }
                    return;
                }
            }
            if (this.r >= this.s) {
                this.i();
            }
            this.p[this.r] = c;
            ++this.r;
            return;
        }
        this.h(s);
    }
    
    @Override
    protected void h() {
        final char[] p = this.p;
        if (p != null) {
            this.p = null;
            this.i.b(p);
        }
    }
    
    protected void h(final String s) {
        final int j = this.f.j();
        if (j == 5) {
            this.f("Can not " + s + ", expecting field name");
        }
        switch (j) {
            default: {
                this.f();
                break;
            }
            case 1: {
                this.a.f(this);
            }
            case 2: {
                this.a.d(this);
            }
            case 3: {
                this.a.a(this);
            }
            case 0: {
                if (this.f.a()) {
                    this.a.g(this);
                    return;
                }
                if (this.f.c()) {
                    this.a.h(this);
                    return;
                }
                break;
            }
        }
    }
    
    protected void i() {
        final int n = this.r - this.q;
        if (n > 0) {
            final int q = this.q;
            this.q = 0;
            this.r = 0;
            this.o.write(this.p, q, n);
        }
    }
}
