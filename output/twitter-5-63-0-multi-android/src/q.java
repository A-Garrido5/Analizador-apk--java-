import java.math.BigDecimal;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.f;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.JsonGenerator$Feature;
import com.fasterxml.jackson.core.io.b;
import com.fasterxml.jackson.core.io.a;
import java.io.OutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

public class q extends m
{
    static final byte[] n;
    private static final byte[] x;
    private static final byte[] y;
    private static final byte[] z;
    protected final OutputStream o;
    protected byte[] p;
    protected int q;
    protected final int r;
    protected final int s;
    protected char[] t;
    protected final int u;
    protected boolean v;
    protected boolean w;
    
    static {
        n = a.h();
        x = new byte[] { 110, 117, 108, 108 };
        y = new byte[] { 116, 114, 117, 101 };
        z = new byte[] { 102, 97, 108, 115, 101 };
    }
    
    public q(final b b, final int n, final com.fasterxml.jackson.core.b b2, final OutputStream o) {
        boolean b3 = true;
        super(b, n, b2);
        this.q = 0;
        this.o = o;
        this.v = b3;
        this.p = b.f();
        this.r = this.p.length;
        this.s = this.r >> 3;
        this.t = b.h();
        this.u = this.t.length;
        if (this.a(JsonGenerator$Feature.h)) {
            this.a(127);
        }
        if (JsonGenerator$Feature.c.a(n)) {
            b3 = false;
        }
        this.w = b3;
    }
    
    private final int a(final int n, final char[] array, final int n2, final int n3) {
        if (n >= 55296 && n <= 57343) {
            if (n2 >= n3 || array == null) {
                this.f("Split surrogate on writeRaw() input (last character)");
            }
            this.b(n, array[n2]);
            return n2 + 1;
        }
        final byte[] p4 = this.p;
        p4[this.q++] = (byte)(0xE0 | n >> 12);
        p4[this.q++] = (byte)(0x80 | (0x3F & n >> 6));
        p4[this.q++] = (byte)(0x80 | (n & 0x3F));
        return n2;
    }
    
    private final int a(final byte[] array, final int q, final int n, final byte[] array2, final int n2) {
        final int length = array2.length;
        int q2 = 0;
        Label_0068: {
            if (q + length <= n) {
                q2 = q;
                break Label_0068;
            }
            this.q = q;
            this.i();
            q2 = this.q;
            if (length <= array.length) {
                System.arraycopy(array2, 0, array, q2, length);
                q2 += length;
                break Label_0068;
            }
            this.o.write(array2, 0, length);
            return q2;
        }
        if (q2 + n2 * 6 > n) {
            this.i();
            return this.q;
        }
        return q2;
    }
    
    private final int a(final byte[] array, final int n, final d d, final int n2) {
        final byte[] b = d.b();
        final int length = b.length;
        if (length > 6) {
            return this.a(array, n, this.r, b, n2);
        }
        System.arraycopy(b, 0, array, n, length);
        return length + n;
    }
    
    private final void a(final Object o) {
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
        this.c(o.toString());
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
    }
    
    private final void a(final byte[] array) {
        final int length = array.length;
        if (length + this.q > this.r) {
            this.i();
            if (length > 512) {
                this.o.write(array, 0, length);
                return;
            }
        }
        System.arraycopy(array, 0, this.p, this.q, length);
        this.q += length;
    }
    
    private final void b(final long n) {
        if (23 + this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
        this.q = com.fasterxml.jackson.core.io.f.a(n, this.p, this.q);
        this.p[this.q++] = 34;
    }
    
    private final void b(final String s, final boolean b) {
        if (b) {
            if (this.q >= this.r) {
                this.i();
            }
            this.p[this.q++] = 34;
        }
        final int length = s.length();
        final char[] t = this.t;
        int i = length;
        int n = 0;
        while (i > 0) {
            final int min = Math.min(this.s, i);
            s.getChars(n, n + min, t, 0);
            if (min + this.q > this.r) {
                this.i();
            }
            this.e(t, 0, min);
            n += min;
            i -= min;
        }
        if (b) {
            if (this.q >= this.r) {
                this.i();
            }
            this.p[this.q++] = 34;
        }
    }
    
    private void b(final char[] array, final int n, final int n2) {
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
        this.d(this.t, 0, n2);
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
    }
    
    private final int c(final int n, final int n2) {
        final byte[] p2 = this.p;
        if (n >= 55296 && n <= 57343) {
            final int n3 = n2 + 1;
            p2[n2] = 92;
            final int n4 = n3 + 1;
            p2[n3] = 117;
            final int n5 = n4 + 1;
            p2[n4] = q.n[0xF & n >> 12];
            final int n6 = n5 + 1;
            p2[n5] = q.n[0xF & n >> 8];
            final int n7 = n6 + 1;
            p2[n6] = q.n[0xF & n >> 4];
            final int n8 = n7 + 1;
            p2[n7] = q.n[n & 0xF];
            return n8;
        }
        final int n9 = n2 + 1;
        p2[n2] = (byte)(0xE0 | n >> 12);
        final int n10 = n9 + 1;
        p2[n9] = (byte)(0x80 | (0x3F & n >> 6));
        final int n11 = n10 + 1;
        p2[n10] = (byte)(0x80 | (n & 0x3F));
        return n11;
    }
    
    private final void c(final int n) {
        if (13 + this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
        this.q = com.fasterxml.jackson.core.io.f.a(n, this.p, this.q);
        this.p[this.q++] = 34;
    }
    
    private final void c(final char[] array, final int n, final int n2) {
        final int r = this.r;
        final byte[] p3 = this.p;
        int i = n;
    Label_0015:
        while (i < n2) {
            do {
                final char c = array[i];
                if (c >= '\u0080') {
                    if (3 + this.q >= this.r) {
                        this.i();
                    }
                    final int n3 = i + 1;
                    final char c2 = array[i];
                    if (c2 < '\u0800') {
                        p3[this.q++] = (byte)('\u00c0' | c2 >> 6);
                        p3[this.q++] = (byte)('\u0080' | (c2 & '?'));
                        i = n3;
                        continue Label_0015;
                    }
                    i = this.a(c2, array, n3, n2);
                    continue Label_0015;
                }
                else {
                    if (this.q >= r) {
                        this.i();
                    }
                    p3[this.q++] = (byte)c;
                }
            } while (++i < n2);
            break;
        }
    }
    
    private int d(int n, final int n2) {
        final byte[] p2 = this.p;
        final int n3 = n2 + 1;
        p2[n2] = 92;
        final int n4 = n3 + 1;
        p2[n3] = 117;
        int n7;
        if (n > 255) {
            final int n5 = 0xFF & n >> 8;
            final int n6 = n4 + 1;
            p2[n4] = q.n[n5 >> 4];
            n7 = n6 + 1;
            p2[n6] = q.n[n5 & 0xF];
            n &= 0xFF;
        }
        else {
            final int n8 = n4 + 1;
            p2[n4] = 48;
            n7 = n8 + 1;
            p2[n8] = 48;
        }
        final int n9 = n7 + 1;
        p2[n7] = q.n[n >> 4];
        final int n10 = n9 + 1;
        p2[n9] = q.n[n & 0xF];
        return n10;
    }
    
    private final void d(final char[] array, int n, int i) {
        do {
            final int min = Math.min(this.s, i);
            if (min + this.q > this.r) {
                this.i();
            }
            this.e(array, n, min);
            n += min;
            i -= min;
        } while (i > 0);
    }
    
    private final void e(final char[] array, int i, final int n) {
        final int n2 = n + i;
        int q = this.q;
        final byte[] p3 = this.p;
        final int[] j = this.j;
        while (i < n2) {
            final char c = array[i];
            if (c > '\u007f' || j[c] != 0) {
                break;
            }
            final int n3 = q + 1;
            p3[q] = (byte)c;
            ++i;
            q = n3;
        }
        this.q = q;
        if (i < n2) {
            if (this.l != null) {
                this.h(array, i, n2);
            }
            else {
                if (this.k == 0) {
                    this.f(array, i, n2);
                    return;
                }
                this.g(array, i, n2);
            }
        }
    }
    
    private final void f(final char[] array, int i, final int n) {
        if (this.q + 6 * (n - i) > this.r) {
            this.i();
        }
        int q = this.q;
        final byte[] p3 = this.p;
        final int[] j = this.j;
        while (i < n) {
            final int n2 = i + 1;
            final char c = array[i];
            if (c <= '\u007f') {
                if (j[c] == 0) {
                    final int n3 = q + 1;
                    p3[q] = (byte)c;
                    q = n3;
                    i = n2;
                }
                else {
                    final int n4 = j[c];
                    if (n4 > 0) {
                        final int n5 = q + 1;
                        p3[q] = 92;
                        q = n5 + 1;
                        p3[n5] = (byte)n4;
                        i = n2;
                    }
                    else {
                        q = this.d(c, q);
                        i = n2;
                    }
                }
            }
            else {
                if (c <= '\u07ff') {
                    final int n6 = q + 1;
                    p3[q] = (byte)('\u00c0' | c >> 6);
                    q = n6 + 1;
                    p3[n6] = (byte)('\u0080' | (c & '?'));
                }
                else {
                    q = this.c(c, q);
                }
                i = n2;
            }
        }
        this.q = q;
    }
    
    private final void g(final char[] array, int i, final int n) {
        if (this.q + 6 * (n - i) > this.r) {
            this.i();
        }
        int q = this.q;
        final byte[] p3 = this.p;
        final int[] j = this.j;
        final int k = this.k;
        while (i < n) {
            final int n2 = i + 1;
            final char c = array[i];
            if (c <= '\u007f') {
                if (j[c] == 0) {
                    final int n3 = q + 1;
                    p3[q] = (byte)c;
                    q = n3;
                    i = n2;
                }
                else {
                    final int n4 = j[c];
                    if (n4 > 0) {
                        final int n5 = q + 1;
                        p3[q] = 92;
                        q = n5 + 1;
                        p3[n5] = (byte)n4;
                        i = n2;
                    }
                    else {
                        q = this.d(c, q);
                        i = n2;
                    }
                }
            }
            else if (c > k) {
                q = this.d(c, q);
                i = n2;
            }
            else {
                if (c <= '\u07ff') {
                    final int n6 = q + 1;
                    p3[q] = (byte)('\u00c0' | c >> 6);
                    q = n6 + 1;
                    p3[n6] = (byte)('\u0080' | (c & '?'));
                }
                else {
                    q = this.c(c, q);
                }
                i = n2;
            }
        }
        this.q = q;
    }
    
    private final void h(final char[] array, int i, final int n) {
        if (this.q + 6 * (n - i) > this.r) {
            this.i();
        }
        int q = this.q;
        final byte[] p3 = this.p;
        final int[] j = this.j;
        int k;
        if (this.k <= 0) {
            k = 65535;
        }
        else {
            k = this.k;
        }
        final CharacterEscapes l = this.l;
        while (i < n) {
            final int n2 = i + 1;
            final char c = array[i];
            if (c <= '\u007f') {
                if (j[c] == 0) {
                    final int n3 = q + 1;
                    p3[q] = (byte)c;
                    q = n3;
                    i = n2;
                }
                else {
                    final int n4 = j[c];
                    if (n4 > 0) {
                        final int n5 = q + 1;
                        p3[q] = 92;
                        q = n5 + 1;
                        p3[n5] = (byte)n4;
                        i = n2;
                    }
                    else if (n4 == -2) {
                        final d a = l.a(c);
                        if (a == null) {
                            this.f("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c) + ", although was supposed to have one");
                        }
                        q = this.a(p3, q, a, n - n2);
                        i = n2;
                    }
                    else {
                        q = this.d(c, q);
                        i = n2;
                    }
                }
            }
            else if (c > k) {
                q = this.d(c, q);
                i = n2;
            }
            else {
                final d a2 = l.a(c);
                if (a2 != null) {
                    q = this.a(p3, q, a2, n - n2);
                    i = n2;
                }
                else {
                    if (c <= '\u07ff') {
                        final int n6 = q + 1;
                        p3[q] = (byte)('\u00c0' | c >> 6);
                        q = n6 + 1;
                        p3[n6] = (byte)('\u0080' | (c & '?'));
                    }
                    else {
                        q = this.c(c, q);
                    }
                    i = n2;
                }
            }
        }
        this.q = q;
    }
    
    private final void j() {
        if (4 + this.q >= this.r) {
            this.i();
        }
        System.arraycopy(q.x, 0, this.p, this.q, 4);
        this.q += 4;
    }
    
    @Override
    public final void a() {
        this.g("start an array");
        this.f = this.f.g();
        if (this.a != null) {
            this.a.e(this);
            return;
        }
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 91;
    }
    
    @Override
    public void a(final char c) {
        if (3 + this.q >= this.r) {
            this.i();
        }
        final byte[] p = this.p;
        if (c <= '\u007f') {
            p[this.q++] = (byte)c;
            return;
        }
        if (c < '\u0800') {
            p[this.q++] = (byte)('\u00c0' | c >> 6);
            p[this.q++] = (byte)('\u0080' | (c & '?'));
            return;
        }
        this.a(c, null, 0, 0);
    }
    
    @Override
    public void a(final double n) {
        if (this.e || ((Double.isNaN(n) || Double.isInfinite(n)) && this.a(JsonGenerator$Feature.d))) {
            this.b(String.valueOf(n));
            return;
        }
        this.g("write number");
        this.c(String.valueOf(n));
    }
    
    @Override
    public void a(final float n) {
        if (this.e || ((Float.isNaN(n) || Float.isInfinite(n)) && this.a(JsonGenerator$Feature.d))) {
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
        if (21 + this.q >= this.r) {
            this.i();
        }
        this.q = com.fasterxml.jackson.core.io.f.a(n, this.p, this.q);
    }
    
    @Override
    public void a(final String s) {
        if (this.a != null) {
            this.h(s);
            return;
        }
        final int a = this.f.a(s);
        if (a == 4) {
            this.f("Can not write a field name, expecting a value");
        }
        if (a == 1) {
            if (this.q >= this.r) {
                this.i();
            }
            this.p[this.q++] = 44;
        }
        if (this.w) {
            this.b(s, false);
            return;
        }
        final int length = s.length();
        if (length > this.u) {
            this.b(s, true);
            return;
        }
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
        s.getChars(0, length, this.t, 0);
        if (length <= this.s) {
            if (length + this.q > this.r) {
                this.i();
            }
            this.e(this.t, 0, length);
        }
        else {
            this.d(this.t, 0, length);
        }
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
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
        if (5 + this.q >= this.r) {
            this.i();
        }
        byte[] array;
        if (b) {
            array = q.y;
        }
        else {
            array = q.z;
        }
        final int length = array.length;
        System.arraycopy(array, 0, this.p, this.q, length);
        this.q += length;
    }
    
    public final void a(final char[] array, final int n, final int n2) {
        final int n3 = n2 + (n2 + n2);
        Label_0042: {
            if (n3 + this.q <= this.r) {
                break Label_0042;
            }
            if (this.r >= n3) {
                this.i();
                break Label_0042;
            }
            this.c(array, n, n2);
            return;
        }
        final int n4 = n2 + n;
        int i = n;
    Label_0050:
        while (i < n4) {
            do {
                final char c = array[i];
                if (c > '\u007f') {
                    final int n5 = i + 1;
                    final char c2 = array[i];
                    if (c2 < '\u0800') {
                        this.p[this.q++] = (byte)('\u00c0' | c2 >> 6);
                        this.p[this.q++] = (byte)('\u0080' | (c2 & '?'));
                        i = n5;
                        continue Label_0050;
                    }
                    i = this.a(c2, array, n5, n4);
                    continue Label_0050;
                }
                else {
                    this.p[this.q++] = (byte)c;
                }
            } while (++i < n4);
        }
    }
    
    @Override
    public final void b() {
        if (!this.f.a()) {
            this.f("Current context not an ARRAY but " + this.f.d());
        }
        if (this.a != null) {
            this.a.b(this, this.f.e());
        }
        else {
            if (this.q >= this.r) {
                this.i();
            }
            this.p[this.q++] = 93;
        }
        this.f = this.f.i();
    }
    
    @Override
    public void b(final int n) {
        this.g("write number");
        if (11 + this.q >= this.r) {
            this.i();
        }
        if (this.e) {
            this.c(n);
            return;
        }
        this.q = com.fasterxml.jackson.core.io.f.a(n, this.p, this.q);
    }
    
    protected final void b(final int n, final int n2) {
        final int a = this.a(n, n2);
        if (4 + this.q > this.r) {
            this.i();
        }
        final byte[] p2 = this.p;
        p2[this.q++] = (byte)(0xF0 | a >> 18);
        p2[this.q++] = (byte)(0x80 | (0x3F & a >> 12));
        p2[this.q++] = (byte)(0x80 | (0x3F & a >> 6));
        p2[this.q++] = (byte)(0x80 | (a & 0x3F));
    }
    
    @Override
    public void b(final d d) {
        final byte[] b = d.b();
        if (b.length > 0) {
            this.a(b);
        }
    }
    
    @Override
    public void b(final String s) {
        this.g("write text value");
        if (s == null) {
            this.j();
            return;
        }
        final int length = s.length();
        if (length > this.u) {
            this.b(s, true);
            return;
        }
        s.getChars(0, length, this.t, 0);
        if (length > this.s) {
            this.b(this.t, 0, length);
            return;
        }
        if (length + this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
        this.e(this.t, 0, length);
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
    }
    
    protected final void b(final String s, final int n) {
        switch (n) {
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
    
    @Override
    public final void c() {
        this.g("start an object");
        this.f = this.f.h();
        if (this.a != null) {
            this.a.b(this);
            return;
        }
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 123;
    }
    
    @Override
    public void c(final String s) {
        int i = s.length();
        int n = 0;
        while (i > 0) {
            final char[] t = this.t;
            int length = t.length;
            if (i < length) {
                length = i;
            }
            s.getChars(n, n + length, t, 0);
            this.a(t, 0, length);
            n += length;
            i -= length;
        }
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
    public final void d() {
        if (!this.f.c()) {
            this.f("Current context not an object but " + this.f.d());
        }
        if (this.a != null) {
            this.a.a(this, this.f.e());
        }
        else {
            if (this.q >= this.r) {
                this.i();
            }
            this.p[this.q++] = 125;
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
    protected final void g(final String s) {
        final int j = this.f.j();
        if (j == 5) {
            this.f("Can not " + s + ", expecting field name");
        }
        if (this.a == null) {
            byte b = 0;
            Label_0081: {
                switch (j) {
                    case 1: {
                        b = 44;
                        break Label_0081;
                    }
                    case 2: {
                        b = 58;
                        break Label_0081;
                    }
                    case 3: {
                        if (this.m == null) {
                            break;
                        }
                        final byte[] b2 = this.m.b();
                        if (b2.length > 0) {
                            this.a(b2);
                            return;
                        }
                        break;
                    }
                }
                return;
            }
            if (this.q >= this.r) {
                this.i();
            }
            this.p[this.q] = b;
            ++this.q;
            return;
        }
        this.b(s, j);
    }
    
    @Override
    protected void h() {
        final byte[] p = this.p;
        if (p != null && this.v) {
            this.p = null;
            this.i.b(p);
        }
        final char[] t = this.t;
        if (t != null) {
            this.t = null;
            this.i.b(t);
        }
    }
    
    protected final void h(final String s) {
        final int a = this.f.a(s);
        if (a == 4) {
            this.f("Can not write a field name, expecting a value");
        }
        if (a == 1) {
            this.a.c(this);
        }
        else {
            this.a.h(this);
        }
        if (this.w) {
            this.b(s, false);
            return;
        }
        final int length = s.length();
        if (length > this.u) {
            this.b(s, true);
            return;
        }
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
        s.getChars(0, length, this.t, 0);
        if (length <= this.s) {
            if (length + this.q > this.r) {
                this.i();
            }
            this.e(this.t, 0, length);
        }
        else {
            this.d(this.t, 0, length);
        }
        if (this.q >= this.r) {
            this.i();
        }
        this.p[this.q++] = 34;
    }
    
    protected final void i() {
        final int q = this.q;
        if (q > 0) {
            this.q = 0;
            this.o.write(this.p, 0, q);
        }
    }
}
