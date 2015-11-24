import java.io.IOException;
import com.fasterxml.jackson.core.JsonLocation;
import java.util.Arrays;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.JsonParser$Feature;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.a;
import java.io.InputStream;
import com.fasterxml.jackson.core.b;

// 
// Decompiled by Procyon v0.5.30
// 

public class r extends i
{
    protected static final int[] L;
    private static final int[] T;
    protected b M;
    protected final t N;
    protected int[] O;
    protected boolean P;
    protected InputStream Q;
    protected byte[] R;
    protected boolean S;
    private int U;
    
    static {
        T = a.b();
        L = a.a();
    }
    
    public r(final com.fasterxml.jackson.core.io.b b, final int n, final InputStream q, final b m, final t n2, final byte[] r, final int n3, final int e, final boolean s) {
        super(b, n);
        this.O = new int[16];
        this.P = false;
        this.Q = q;
        this.M = m;
        this.N = n2;
        this.R = r;
        this.d = n3;
        this.e = e;
        this.h = n3;
        this.f = -n3;
        this.S = s;
    }
    
    private final JsonToken O() {
        this.p = false;
        final JsonToken m = this.m;
        this.m = null;
        if (m == JsonToken.d) {
            this.l = this.l.a(this.j, this.k);
        }
        else if (m == JsonToken.b) {
            this.l = this.l.b(this.j, this.k);
        }
        return this.K = m;
    }
    
    private final int P() {
        int n;
        if (this.d >= this.e && !this.t()) {
            n = 48;
        }
        else {
            n = (0xFF & this.R[this.d]);
            if (n < 48 || n > 57) {
                return 48;
            }
            if (!this.a(JsonParser$Feature.h)) {
                this.c("Leading zeroes not allowed");
            }
            ++this.d;
            if (n == 48) {
                while (this.d < this.e || this.t()) {
                    n = (0xFF & this.R[this.d]);
                    if (n < 48 || n > 57) {
                        return 48;
                    }
                    ++this.d;
                    if (n != 48) {
                        return n;
                    }
                }
            }
        }
        return n;
    }
    
    private final int Q() {
        while (this.d < this.e) {
            int r = 0xFF & this.R[this.d++];
            if (r > 32) {
                if (r == 47 || r == 35) {
                    --this.d;
                    r = this.R();
                }
                return r;
            }
            if (r == 32) {
                continue;
            }
            if (r == 10) {
                ++this.g;
                this.h = this.d;
            }
            else if (r == 13) {
                this.N();
            }
            else {
                if (r == 9) {
                    continue;
                }
                this.d(r);
            }
        }
        return this.R();
    }
    
    private final int R() {
        while (this.d < this.e || this.t()) {
            final int n = 0xFF & this.R[this.d++];
            if (n > 32) {
                if (n == 47) {
                    this.V();
                }
                else {
                    if (n != 35 || !this.X()) {
                        return n;
                    }
                    continue;
                }
            }
            else {
                if (n == 32) {
                    continue;
                }
                if (n == 10) {
                    ++this.g;
                    this.h = this.d;
                }
                else if (n == 13) {
                    this.N();
                }
                else {
                    if (n == 9) {
                        continue;
                    }
                    this.d(n);
                }
            }
        }
        throw this.b("Unexpected end-of-input within/between " + this.l.d() + " entries");
    }
    
    private final int S() {
        int y;
        if (this.d >= this.e && !this.t()) {
            y = this.y();
        }
        else {
            y = (0xFF & this.R[this.d++]);
            if (y <= 32) {
                if (y != 32) {
                    if (y == 10) {
                        ++this.g;
                        this.h = this.d;
                    }
                    else if (y == 13) {
                        this.N();
                    }
                    else if (y != 9) {
                        this.d(y);
                    }
                }
                while (this.d < this.e) {
                    y = (0xFF & this.R[this.d++]);
                    if (y > 32) {
                        if (y == 47 || y == 35) {
                            --this.d;
                            return this.T();
                        }
                        return y;
                    }
                    else {
                        if (y == 32) {
                            continue;
                        }
                        if (y == 10) {
                            ++this.g;
                            this.h = this.d;
                        }
                        else if (y == 13) {
                            this.N();
                        }
                        else {
                            if (y == 9) {
                                continue;
                            }
                            this.d(y);
                        }
                    }
                }
                return this.T();
            }
            if (y == 47 || y == 35) {
                --this.d;
                return this.T();
            }
        }
        return y;
    }
    
    private final int T() {
        while (this.d < this.e || this.t()) {
            final int n = 0xFF & this.R[this.d++];
            if (n > 32) {
                if (n == 47) {
                    this.V();
                }
                else {
                    if (n != 35 || !this.X()) {
                        return n;
                    }
                    continue;
                }
            }
            else {
                if (n == 32) {
                    continue;
                }
                if (n == 10) {
                    ++this.g;
                    this.h = this.d;
                }
                else if (n == 13) {
                    this.N();
                }
                else {
                    if (n == 9) {
                        continue;
                    }
                    this.d(n);
                }
            }
        }
        return this.y();
    }
    
    private final int U() {
        if (4 + this.d >= this.e) {
            return this.b(false);
        }
        byte b = this.R[this.d];
        if (b == 58) {
            final byte[] r = this.R;
            final int d = 1 + this.d;
            this.d = d;
            final byte b2 = r[d];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    final byte[] r2 = this.R;
                    final int d2 = 1 + this.d;
                    this.d = d2;
                    final byte b3 = r2[d2];
                    if (b3 > 32) {
                        if (b3 == 47 || b3 == 35) {
                            return this.b(true);
                        }
                        ++this.d;
                        return b3;
                    }
                }
                return this.b(true);
            }
            if (b2 == 47 || b2 == 35) {
                return this.b(true);
            }
            ++this.d;
            return b2;
        }
        else {
            if (b == 32 || b == 9) {
                final byte[] r3 = this.R;
                final int d3 = 1 + this.d;
                this.d = d3;
                b = r3[d3];
            }
            if (b != 58) {
                return this.b(false);
            }
            final byte[] r4 = this.R;
            final int d4 = 1 + this.d;
            this.d = d4;
            final byte b4 = r4[d4];
            if (b4 <= 32) {
                if (b4 == 32 || b4 == 9) {
                    final byte[] r5 = this.R;
                    final int d5 = 1 + this.d;
                    this.d = d5;
                    final byte b5 = r5[d5];
                    if (b5 > 32) {
                        if (b5 == 47 || b5 == 35) {
                            return this.b(true);
                        }
                        ++this.d;
                        return b5;
                    }
                }
                return this.b(true);
            }
            if (b4 == 47 || b4 == 35) {
                return this.b(true);
            }
            ++this.d;
            return b4;
        }
    }
    
    private final void V() {
        if (!this.a(JsonParser$Feature.b)) {
            this.b(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.d >= this.e && !this.t()) {
            this.e(" in a comment");
        }
        final int n = 0xFF & this.R[this.d++];
        if (n == 47) {
            this.Y();
            return;
        }
        if (n == 42) {
            this.W();
            return;
        }
        this.b(n, "was expecting either '*' or '/' for a comment");
    }
    
    private final void W() {
        final int[] e = com.fasterxml.jackson.core.io.a.e();
    Label_0147:
        while (this.d < this.e || this.t()) {
            final int n = 0xFF & this.R[this.d++];
            final int n2 = e[n];
            if (n2 != 0) {
                switch (n2) {
                    default: {
                        this.l(n);
                        continue;
                    }
                    case 42: {
                        if (this.d >= this.e && !this.t()) {
                            break Label_0147;
                        }
                        if (this.R[this.d] == 47) {
                            ++this.d;
                            return;
                        }
                        continue;
                    }
                    case 10: {
                        ++this.g;
                        this.h = this.d;
                        continue;
                    }
                    case 13: {
                        this.N();
                        continue;
                    }
                    case 2: {
                        this.w(n);
                        continue;
                    }
                    case 3: {
                        this.x(n);
                        continue;
                    }
                    case 4: {
                        this.y(n);
                        continue;
                    }
                }
            }
        }
        this.e(" in a comment");
    }
    
    private final boolean X() {
        if (!this.a(JsonParser$Feature.c)) {
            return false;
        }
        this.Y();
        return true;
    }
    
    private final void Y() {
        final int[] e = com.fasterxml.jackson.core.io.a.e();
    Label_0152:
        while (this.d < this.e || this.t()) {
            final int n = 0xFF & this.R[this.d++];
            final int n2 = e[n];
            if (n2 != 0) {
                switch (n2) {
                    case 4: {
                        this.y(n);
                        continue;
                    }
                    case 3: {
                        this.x(n);
                        continue;
                    }
                    case 2: {
                        this.w(n);
                    }
                    case 42: {
                        continue;
                    }
                    default: {
                        if (n2 < 0) {
                            this.l(n);
                            continue;
                        }
                        continue;
                    }
                    case 10: {
                        ++this.g;
                        this.h = this.d;
                        break Label_0152;
                    }
                    case 13: {
                        this.N();
                        return;
                    }
                }
            }
        }
    }
    
    private int Z() {
        if (this.d >= this.e) {
            this.s();
        }
        return 0xFF & this.R[this.d++];
    }
    
    private final JsonToken a(char[] m, final int n, int n2, final boolean b, final int n3) {
        int n4 = 0;
        int n7 = 0;
        boolean b2 = false;
        int n8 = 0;
        int n9 = 0;
        char[] array = null;
        Label_0067: {
            if (n2 == 46) {
                int n5 = n + 1;
                m[n] = (char)n2;
                while (true) {
                    while (this.d < this.e || this.t()) {
                        n2 = (0xFF & this.R[this.d++]);
                        if (n2 >= 48) {
                            if (n2 <= 57) {
                                ++n4;
                                int n6;
                                if (n5 >= m.length) {
                                    m = this.n.m();
                                    n6 = 0;
                                }
                                else {
                                    n6 = n5;
                                }
                                n5 = n6 + 1;
                                m[n6] = (char)n2;
                                continue;
                            }
                            n7 = n2;
                            b2 = false;
                        }
                        else {
                            n7 = n2;
                            b2 = false;
                        }
                        if (n4 == 0) {
                            this.a(n7, "Decimal point not followed by a digit");
                        }
                        n8 = n4;
                        n9 = n5;
                        array = m;
                        break Label_0067;
                    }
                    b2 = true;
                    n7 = n2;
                    continue;
                }
            }
            n7 = n2;
            array = m;
            n9 = n;
            b2 = false;
            n8 = 0;
        }
        int n10 = 0;
        int n15 = 0;
        int n18 = 0;
        int n19 = 0;
        int n20 = 0;
        Label_0355: {
            if (n7 == 101 || n7 == 69) {
                if (n9 >= array.length) {
                    array = this.n.m();
                    n9 = 0;
                }
                final int n11 = n9 + 1;
                array[n9] = (char)n7;
                if (this.d >= this.e) {
                    this.s();
                }
                final int n12 = 0xFF & this.R[this.d++];
                int n16;
                if (n12 == 45 || n12 == 43) {
                    int n13;
                    if (n11 >= array.length) {
                        array = this.n.m();
                        n13 = 0;
                    }
                    else {
                        n13 = n11;
                    }
                    final int n14 = n13 + 1;
                    array[n13] = (char)n12;
                    if (this.d >= this.e) {
                        this.s();
                    }
                    n15 = (0xFF & this.R[this.d++]);
                    n16 = n14;
                }
                else {
                    n16 = n11;
                    n15 = n12;
                    n10 = 0;
                }
                while (true) {
                    while (n15 <= 57 && n15 >= 48) {
                        ++n10;
                        if (n16 >= array.length) {
                            array = this.n.m();
                            n16 = 0;
                        }
                        final int n17 = n16 + 1;
                        array[n16] = (char)n15;
                        if (this.d >= this.e && !this.t()) {
                            n18 = n10;
                            n19 = 1;
                            n20 = n17;
                            if (n18 == 0) {
                                this.a(n15, "Exponent indicator not followed by a digit");
                            }
                            break Label_0355;
                        }
                        else {
                            n15 = (0xFF & this.R[this.d++]);
                            n16 = n17;
                        }
                    }
                    n19 = (b2 ? 1 : 0);
                    final int n21 = n10;
                    n20 = n16;
                    n18 = n21;
                    continue;
                }
            }
            n19 = (b2 ? 1 : 0);
            n15 = n7;
            n20 = n9;
            n18 = 0;
        }
        if (n19 == 0) {
            --this.d;
            if (this.l.b()) {
                this.r(n15);
            }
        }
        this.n.a(n20);
        return this.b(b, n3, n8, n18);
    }
    
    private final JsonToken a(final char[] array, final int n, final boolean b, final int n2) {
        int n3 = n2;
        int n4 = n;
        char[] m = array;
        while (this.d < this.e || this.t()) {
            final int n5 = 0xFF & this.R[this.d++];
            if (n5 > 57 || n5 < 48) {
                if (n5 == 46 || n5 == 101 || n5 == 69) {
                    return this.a(m, n4, n5, b, n3);
                }
                --this.d;
                this.n.a(n4);
                if (this.l.b()) {
                    this.r(0xFF & this.R[this.d++]);
                }
                return this.a(b, n3);
            }
            else {
                int n6;
                if (n4 >= m.length) {
                    m = this.n.m();
                    n6 = 0;
                }
                else {
                    n6 = n4;
                }
                n4 = n6 + 1;
                m[n6] = (char)n5;
                ++n3;
            }
        }
        this.n.a(n4);
        return this.a(b, n3);
    }
    
    private final y a(final int n, final int n2, final int n3) {
        return this.a(this.O, 0, n, n2, n3);
    }
    
    private final y a(final int n, final int n2, final int n3, final int n4) {
        this.O[0] = n;
        return this.a(this.O, 1, n2, n3, n4);
    }
    
    private final y a(final int[] array, final int n, final int n2) {
        final int n3 = n2 + (-4 + (n << 2));
        int n4;
        if (n2 < 4) {
            n4 = array[n - 1];
            array[n - 1] = n4 << (4 - n2 << 3);
        }
        else {
            n4 = 0;
        }
        char[] array2 = this.n.k();
        int n5 = 0;
        int i = 0;
    Label_0375_Outer:
        while (i < n3) {
            int n6 = 0xFF & array[i >> 2] >> (3 - (i & 0x3) << 3);
            int n7 = i + 1;
            while (true) {
                Label_0527: {
                    if (n6 <= 127) {
                        break Label_0527;
                    }
                    int n8;
                    int n9;
                    if ((n6 & 0xE0) == 0xC0) {
                        n8 = (n6 & 0x1F);
                        n9 = 1;
                    }
                    else if ((n6 & 0xF0) == 0xE0) {
                        n8 = (n6 & 0xF);
                        n9 = 2;
                    }
                    else if ((n6 & 0xF8) == 0xF0) {
                        n8 = (n6 & 0x7);
                        n9 = 3;
                    }
                    else {
                        this.m(n6);
                        n8 = (n9 = 1);
                    }
                    if (n7 + n9 > n3) {
                        this.e(" in field name");
                    }
                    final int n10 = array[n7 >> 2] >> (3 - (n7 & 0x3) << 3);
                    ++n7;
                    if ((n10 & 0xC0) != 0x80) {
                        this.n(n10);
                    }
                    n6 = (n8 << 6 | (n10 & 0x3F));
                    if (n9 > 1) {
                        final int n11 = array[n7 >> 2] >> (3 - (n7 & 0x3) << 3);
                        ++n7;
                        if ((n11 & 0xC0) != 0x80) {
                            this.n(n11);
                        }
                        n6 = (n6 << 6 | (n11 & 0x3F));
                        if (n9 > 2) {
                            final int n12 = array[n7 >> 2] >> (3 - (n7 & 0x3) << 3);
                            ++n7;
                            if ((n12 & 0xC0) != 0x80) {
                                this.n(n12 & 0xFF);
                            }
                            n6 = (n6 << 6 | (n12 & 0x3F));
                        }
                    }
                    if (n9 <= 2) {
                        break Label_0527;
                    }
                    final int n13 = n6 - 65536;
                    if (n5 >= array2.length) {
                        array2 = this.n.n();
                    }
                    final int n14 = n5 + 1;
                    array2[n5] = (char)(55296 + (n13 >> 10));
                    final int n15 = 0xDC00 | (n13 & 0x3FF);
                    final int n16 = n7;
                    final int n17 = n14;
                    char[] n18 = array2;
                    final int n19 = n15;
                    if (n17 >= n18.length) {
                        n18 = this.n.n();
                    }
                    n5 = n17 + 1;
                    n18[n17] = (char)n19;
                    i = n16;
                    array2 = n18;
                    continue Label_0375_Outer;
                }
                char[] n18 = array2;
                final int n19 = n6;
                final int n16 = n7;
                final int n17 = n5;
                continue;
            }
        }
        final String s = new String(array2, 0, n5);
        if (n2 < 4) {
            array[n - 1] = n4;
        }
        return this.N.a(s, array, n);
    }
    
    private final y a(int[] a, final int n, final int n2, final int n3) {
        if (n >= a.length) {
            a = a(a, a.length);
            this.O = a;
        }
        final int n4 = n + 1;
        a[n] = d(n2, n3);
        y y = this.N.a(a, n4);
        if (y == null) {
            y = this.a(a, n4, n3);
        }
        return y;
    }
    
    private final void a(final String s, final int n, final int n2) {
        if (Character.isJavaIdentifierPart((char)this.k(n2))) {
            this.g(s.substring(0, n));
        }
    }
    
    private final void a(char[] array, int n) {
        final int[] t = r.T;
        final byte[] r = this.R;
    Block_5:
        while (true) {
            int i = this.d;
            if (i >= this.e) {
                this.s();
                i = this.d;
            }
            if (n >= array.length) {
                array = this.n.m();
                n = 0;
            }
            while (i < Math.min(this.e, i + (array.length - n))) {
                final int d = i + 1;
                int n2 = 0xFF & r[i];
                if (t[n2] != 0) {
                    this.d = d;
                    if (n2 == 34) {
                        break Block_5;
                    }
                    switch (t[n2]) {
                        default: {
                            if (n2 < 32) {
                                this.c(n2, "string value");
                                break;
                            }
                            this.l(n2);
                            break;
                        }
                        case 1: {
                            n2 = this.E();
                            break;
                        }
                        case 2: {
                            n2 = this.s(n2);
                            break;
                        }
                        case 3: {
                            if (this.e - this.d >= 2) {
                                n2 = this.u(n2);
                                break;
                            }
                            n2 = this.t(n2);
                            break;
                        }
                        case 4: {
                            final int v = this.v(n2);
                            int n3 = n + 1;
                            array[n] = (char)(0xD800 | v >> 10);
                            if (n3 >= array.length) {
                                array = this.n.m();
                                n3 = 0;
                            }
                            final int n4 = 0xDC00 | (v & 0x3FF);
                            n = n3;
                            n2 = n4;
                            break;
                        }
                    }
                    int n5;
                    if (n >= array.length) {
                        array = this.n.m();
                        n5 = 0;
                    }
                    else {
                        n5 = n;
                    }
                    n = n5 + 1;
                    array[n5] = (char)n2;
                    continue Block_5;
                }
                else {
                    final int n6 = n + 1;
                    array[n] = (char)n2;
                    i = d;
                    n = n6;
                }
            }
            this.d = i;
        }
        this.n.a(n);
    }
    
    private final boolean a(final int n, final d d) {
        final String a = this.g(n).a();
        this.l.a(a);
        final boolean equals = a.equals(d.a());
        this.K = JsonToken.f;
        final int u = this.U();
        if (u == 34) {
            this.P = true;
            this.m = JsonToken.h;
            return equals;
        }
        JsonToken m = null;
        switch (u) {
            default: {
                m = this.j(u);
                break;
            }
            case 91: {
                m = JsonToken.d;
                break;
            }
            case 123: {
                m = JsonToken.b;
                break;
            }
            case 116: {
                this.a("true", 1);
                m = JsonToken.k;
                break;
            }
            case 102: {
                this.a("false", 1);
                m = JsonToken.l;
                break;
            }
            case 110: {
                this.a("null", 1);
                m = JsonToken.m;
                break;
            }
            case 45: {
                m = this.I();
                break;
            }
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57: {
                m = this.f(u);
                break;
            }
        }
        this.m = m;
        return equals;
    }
    
    public static int[] a(final int[] array, final int n) {
        if (array == null) {
            return new int[n];
        }
        return Arrays.copyOf(array, n + array.length);
    }
    
    private final int b(boolean b) {
        while (this.d < this.e || this.t()) {
            final int n = 0xFF & this.R[this.d++];
            if (n > 32) {
                if (n == 47) {
                    this.V();
                }
                else {
                    if (n == 35 && this.X()) {
                        continue;
                    }
                    if (b) {
                        return n;
                    }
                    if (n != 58) {
                        if (n < 32) {
                            this.d(n);
                        }
                        this.b(n, "was expecting a colon to separate field name and value");
                    }
                    b = true;
                }
            }
            else {
                if (n == 32) {
                    continue;
                }
                if (n == 10) {
                    ++this.g;
                    this.h = this.d;
                }
                else if (n == 13) {
                    this.N();
                }
                else {
                    if (n == 9) {
                        continue;
                    }
                    this.d(n);
                }
            }
        }
        throw this.b("Unexpected end-of-input within/between " + this.l.d() + " entries");
    }
    
    private final y b(final int n, final int n2, final int n3) {
        final int d = d(n2, n3);
        final y a = this.N.a(n, d);
        if (a != null) {
            return a;
        }
        this.O[0] = n;
        this.O[1] = d;
        return this.a(this.O, 2, n3);
    }
    
    private final void b(final String s, int n) {
        do {
            if ((this.d >= this.e && !this.t()) || this.R[this.d] != s.charAt(n)) {
                this.g(s.substring(0, n));
            }
            ++this.d;
        } while (++n < s.length());
        if (this.d < this.e || this.t()) {
            final int n2 = 0xFF & this.R[this.d];
            if (n2 >= 48 && n2 != 93 && n2 != 125) {
                this.a(s, n, n2);
            }
        }
    }
    
    private final y c(final int n, final int n2) {
        final int d = d(n, n2);
        final y c = this.N.c(d);
        if (c != null) {
            return c;
        }
        this.O[0] = d;
        return this.a(this.O, 1, n2);
    }
    
    private static final int d(final int n, final int n2) {
        if (n2 == 4) {
            return n;
        }
        return n | -1 << (n2 << 3);
    }
    
    private final JsonToken o(final int n) {
        if (n == 34) {
            this.P = true;
            return this.K = JsonToken.h;
        }
        switch (n) {
            default: {
                return this.K = this.j(n);
            }
            case 91: {
                this.l = this.l.a(this.j, this.k);
                return this.K = JsonToken.d;
            }
            case 123: {
                this.l = this.l.b(this.j, this.k);
                return this.K = JsonToken.b;
            }
            case 116: {
                this.a("true", 1);
                return this.K = JsonToken.k;
            }
            case 102: {
                this.a("false", 1);
                return this.K = JsonToken.l;
            }
            case 110: {
                this.a("null", 1);
                return this.K = JsonToken.m;
            }
            case 45: {
                return this.K = this.I();
            }
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57: {
                return this.K = this.f(n);
            }
        }
    }
    
    private final int p(final int n) {
        final byte[] r = this.R;
        int d = n + 1;
        byte b = r[n];
        if (b == 58) {
            final byte[] r2 = this.R;
            int d2 = d + 1;
            final byte b2 = r2[d];
            if (b2 > 32) {
                if (b2 != 47 && b2 != 35) {
                    this.d = d2;
                    return b2;
                }
            }
            else if (b2 == 32 || b2 == 9) {
                final byte[] r3 = this.R;
                final int d3 = d2 + 1;
                final byte b3 = r3[d2];
                if (b3 > 32 && b3 != 47 && b3 != 35) {
                    this.d = d3;
                    return b3;
                }
                d2 = d3;
            }
            this.d = d2 - 1;
            return this.b(true);
        }
        if (b == 32 || b == 9) {
            final byte[] r4 = this.R;
            final int n2 = d + 1;
            b = r4[d];
            d = n2;
        }
        int d4 = 0;
        Label_0301: {
            if (b == 58) {
                final byte[] r5 = this.R;
                d4 = d + 1;
                final byte b4 = r5[d];
                if (b4 > 32) {
                    if (b4 != 47 && b4 != 35) {
                        this.d = d4;
                        return b4;
                    }
                    break Label_0301;
                }
                else {
                    if (b4 != 32 && b4 != 9) {
                        break Label_0301;
                    }
                    final byte[] r6 = this.R;
                    d = d4 + 1;
                    final byte b5 = r6[d4];
                    if (b5 > 32 && b5 != 47 && b5 != 35) {
                        this.d = d;
                        return b5;
                    }
                }
            }
            d4 = d;
        }
        this.d = d4 - 1;
        return this.b(false);
    }
    
    private final void q(final int n) {
        this.K = JsonToken.f;
        switch (n) {
            default: {
                this.m = this.j(n);
            }
            case 34: {
                this.P = true;
                this.m = JsonToken.h;
            }
            case 91: {
                this.m = JsonToken.d;
            }
            case 123: {
                this.m = JsonToken.b;
            }
            case 116: {
                this.a("true", 1);
                this.m = JsonToken.k;
            }
            case 102: {
                this.a("false", 1);
                this.m = JsonToken.l;
            }
            case 110: {
                this.a("null", 1);
                this.m = JsonToken.m;
            }
            case 45: {
                this.m = this.I();
            }
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57: {
                this.m = this.f(n);
            }
        }
    }
    
    private final void r(final int n) {
        ++this.d;
        switch (n) {
            default: {
                this.c(n);
            }
            case 9:
            case 32: {}
            case 13: {
                this.N();
            }
            case 10: {
                ++this.g;
                this.h = this.d;
            }
        }
    }
    
    private final int s(final int n) {
        if (this.d >= this.e) {
            this.s();
        }
        final byte b = this.R[this.d++];
        if ((b & 0xC0) != 0x80) {
            this.b(b & 0xFF, this.d);
        }
        return (n & 0x1F) << 6 | (b & 0x3F);
    }
    
    private final int t(final int n) {
        if (this.d >= this.e) {
            this.s();
        }
        final int n2 = n & 0xF;
        final byte b = this.R[this.d++];
        if ((b & 0xC0) != 0x80) {
            this.b(b & 0xFF, this.d);
        }
        final int n3 = n2 << 6 | (b & 0x3F);
        if (this.d >= this.e) {
            this.s();
        }
        final byte b2 = this.R[this.d++];
        if ((b2 & 0xC0) != 0x80) {
            this.b(b2 & 0xFF, this.d);
        }
        return n3 << 6 | (b2 & 0x3F);
    }
    
    private final int u(final int n) {
        final int n2 = n & 0xF;
        final byte b = this.R[this.d++];
        if ((b & 0xC0) != 0x80) {
            this.b(b & 0xFF, this.d);
        }
        final int n3 = n2 << 6 | (b & 0x3F);
        final byte b2 = this.R[this.d++];
        if ((b2 & 0xC0) != 0x80) {
            this.b(b2 & 0xFF, this.d);
        }
        return n3 << 6 | (b2 & 0x3F);
    }
    
    private final int v(final int n) {
        if (this.d >= this.e) {
            this.s();
        }
        final byte b = this.R[this.d++];
        if ((b & 0xC0) != 0x80) {
            this.b(b & 0xFF, this.d);
        }
        final int n2 = (n & 0x7) << 6 | (b & 0x3F);
        if (this.d >= this.e) {
            this.s();
        }
        final byte b2 = this.R[this.d++];
        if ((b2 & 0xC0) != 0x80) {
            this.b(b2 & 0xFF, this.d);
        }
        final int n3 = n2 << 6 | (b2 & 0x3F);
        if (this.d >= this.e) {
            this.s();
        }
        final byte b3 = this.R[this.d++];
        if ((b3 & 0xC0) != 0x80) {
            this.b(b3 & 0xFF, this.d);
        }
        return (n3 << 6 | (b3 & 0x3F)) - 65536;
    }
    
    private final void w(final int n) {
        if (this.d >= this.e) {
            this.s();
        }
        final byte b = this.R[this.d++];
        if ((b & 0xC0) != 0x80) {
            this.b(b & 0xFF, this.d);
        }
    }
    
    private final void x(final int n) {
        if (this.d >= this.e) {
            this.s();
        }
        final byte b = this.R[this.d++];
        if ((b & 0xC0) != 0x80) {
            this.b(b & 0xFF, this.d);
        }
        if (this.d >= this.e) {
            this.s();
        }
        final byte b2 = this.R[this.d++];
        if ((b2 & 0xC0) != 0x80) {
            this.b(b2 & 0xFF, this.d);
        }
    }
    
    private final void y(final int n) {
        if (this.d >= this.e) {
            this.s();
        }
        final byte b = this.R[this.d++];
        if ((b & 0xC0) != 0x80) {
            this.b(b & 0xFF, this.d);
        }
        if (this.d >= this.e) {
            this.s();
        }
        final byte b2 = this.R[this.d++];
        if ((b2 & 0xC0) != 0x80) {
            this.b(b2 & 0xFF, this.d);
        }
        if (this.d >= this.e) {
            this.s();
        }
        final byte b3 = this.R[this.d++];
        if ((b3 & 0xC0) != 0x80) {
            this.b(b3 & 0xFF, this.d);
        }
    }
    
    @Override
    protected char E() {
        int i = 0;
        if (this.d >= this.e && !this.t()) {
            this.e(" in character escape sequence");
        }
        final byte b = this.R[this.d++];
        switch (b) {
            default: {
                return this.a((char)this.k(b));
            }
            case 98: {
                return '\b';
            }
            case 116: {
                return '\t';
            }
            case 110: {
                return '\n';
            }
            case 102: {
                return '\f';
            }
            case 114: {
                return '\r';
            }
            case 34:
            case 47:
            case 92: {
                return (char)b;
            }
            case 117: {
                int n = 0;
                while (i < 4) {
                    if (this.d >= this.e && !this.t()) {
                        this.e(" in character escape sequence");
                    }
                    final byte b2 = this.R[this.d++];
                    final int a = com.fasterxml.jackson.core.io.a.a(b2);
                    if (a < 0) {
                        this.b(b2, "expected a hex-digit for character escape sequence");
                    }
                    n = (a | n << 4);
                    ++i;
                }
                return (char)n;
            }
        }
    }
    
    protected JsonToken I() {
        final char[] k = this.n.k();
        k[0] = '-';
        if (this.d >= this.e) {
            this.s();
        }
        int p = 0xFF & this.R[this.d++];
        if (p < 48 || p > 57) {
            return this.a(p, true);
        }
        if (p == 48) {
            p = this.P();
        }
        int n = 2;
        k[1] = (char)p;
        int e = -2 + (this.d + k.length);
        int n2;
        if (e > this.e) {
            e = this.e;
            n2 = 1;
        }
        else {
            n2 = 1;
        }
        while (this.d < e) {
            final int n3 = 0xFF & this.R[this.d++];
            if (n3 < 48 || n3 > 57) {
                if (n3 == 46 || n3 == 101 || n3 == 69) {
                    return this.a(k, n, n3, true, n2);
                }
                --this.d;
                this.n.a(n);
                if (this.l.b()) {
                    this.r(n3);
                }
                return this.a(true, n2);
            }
            else {
                ++n2;
                final int n4 = n + 1;
                k[n] = (char)n3;
                n = n4;
            }
        }
        return this.a(k, n, true, n2);
    }
    
    protected y J() {
        if (this.d >= this.e && !this.t()) {
            this.e(": was expecting closing '\"' for name");
        }
        final int n = 0xFF & this.R[this.d++];
        if (n == 34) {
            return t.d();
        }
        return this.a(this.O, 0, 0, n, 0);
    }
    
    protected y K() {
        if (this.d >= this.e && !this.t()) {
            this.e(": was expecting closing ''' for name");
        }
        int i = 0xFF & this.R[this.d++];
        if (i == 39) {
            return t.d();
        }
        int[] array = this.O;
        final int[] l = r.L;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
    Label_0323_Outer:
        while (i != 39) {
            while (true) {
                Label_0668: {
                    if (i == 34 || l[i] == 0) {
                        break Label_0668;
                    }
                    if (i != 92) {
                        this.c(i, "name");
                    }
                    else {
                        i = this.E();
                    }
                    if (i <= 127) {
                        break Label_0668;
                    }
                    int n5;
                    int n6;
                    int n7;
                    if (n >= 4) {
                        if (n3 >= array.length) {
                            array = a(array, array.length);
                            this.O = array;
                        }
                        final int n4 = n3 + 1;
                        array[n3] = n2;
                        n5 = 0;
                        n6 = n4;
                        n7 = 0;
                    }
                    else {
                        final int n8 = n;
                        n7 = n2;
                        n6 = n3;
                        n5 = n8;
                    }
                    int n11;
                    int[] array2;
                    int n12;
                    if (i < 2048) {
                        final int n9 = n7 << 8 | (0xC0 | i >> 6);
                        final int n10 = n5 + 1;
                        n11 = n9;
                        array2 = array;
                        n12 = n10;
                    }
                    else {
                        final int n13 = n7 << 8 | (0xE0 | i >> 12);
                        final int n14 = n5 + 1;
                        int n16;
                        int[] array3;
                        int n17;
                        int n18;
                        if (n14 >= 4) {
                            if (n6 >= array.length) {
                                array = a(array, array.length);
                                this.O = array;
                            }
                            final int n15 = n6 + 1;
                            array[n6] = n13;
                            n16 = n15;
                            array3 = array;
                            n17 = 0;
                            n18 = 0;
                        }
                        else {
                            n18 = n13;
                            n16 = n6;
                            array3 = array;
                            n17 = n14;
                        }
                        n11 = (n18 << 8 | (0x80 | (0x3F & i >> 6)));
                        n12 = n17 + 1;
                        final int n19 = n16;
                        array2 = array3;
                        n6 = n19;
                    }
                    final int n20 = 0x80 | (i & 0x3F);
                    final int n21 = n11;
                    final int n22 = n12;
                    array = array2;
                    final int n23 = n20;
                    int n25;
                    int n26;
                    int[] array4;
                    int n27;
                    if (n22 < 4) {
                        final int n24 = n22 + 1;
                        n25 = (n23 | n21 << 8);
                        n26 = n6;
                        array4 = array;
                        n27 = n24;
                    }
                    else {
                        if (n6 >= array.length) {
                            array = a(array, array.length);
                            this.O = array;
                        }
                        final int n28 = n6 + 1;
                        array[n6] = n21;
                        array4 = array;
                        n27 = 1;
                        n25 = n23;
                        n26 = n28;
                    }
                    if (this.d >= this.e && !this.t()) {
                        this.e(" in field name");
                    }
                    i = (0xFF & this.R[this.d++]);
                    final int n29 = n27;
                    array = array4;
                    n2 = n25;
                    n3 = n26;
                    n = n29;
                    continue Label_0323_Outer;
                }
                final int n21 = n2;
                int n6 = n3;
                final int n22 = n;
                final int n23 = i;
                continue;
            }
        }
        int[] array5;
        int n31;
        if (n > 0) {
            if (n3 >= array.length) {
                array = a(array, array.length);
                this.O = array;
            }
            final int n30 = n3 + 1;
            array[n3] = d(n2, n);
            array5 = array;
            n31 = n30;
        }
        else {
            array5 = array;
            n31 = n3;
        }
        final y a = this.N.a(array5, n31);
        if (a == null) {
            return this.a(array5, n31, n);
        }
        return a;
    }
    
    protected void L() {
        this.P = false;
        final int[] t = r.T;
        final byte[] r = this.R;
    Block_4:
        while (true) {
            int i = this.d;
            int n = this.e;
            if (i >= n) {
                this.s();
                i = this.d;
                n = this.e;
            }
            while (i < n) {
                final int d = i + 1;
                final int n2 = 0xFF & r[i];
                if (t[n2] != 0) {
                    this.d = d;
                    if (n2 == 34) {
                        break Block_4;
                    }
                    switch (t[n2]) {
                        default: {
                            if (n2 < 32) {
                                this.c(n2, "string value");
                                continue Block_4;
                            }
                            this.l(n2);
                            continue Block_4;
                        }
                        case 1: {
                            this.E();
                            continue Block_4;
                        }
                        case 2: {
                            this.w(n2);
                            continue Block_4;
                        }
                        case 3: {
                            this.x(n2);
                            continue Block_4;
                        }
                        case 4: {
                            this.y(n2);
                            continue Block_4;
                        }
                    }
                }
                else {
                    i = d;
                }
            }
            this.d = i;
        }
    }
    
    protected JsonToken M() {
        char[] array = this.n.k();
        final int[] t = r.T;
        final byte[] r = this.R;
        int n = 0;
    Block_5:
        while (true) {
            if (this.d >= this.e) {
                this.s();
            }
            if (n >= array.length) {
                array = this.n.m();
                n = 0;
            }
            final int e = this.e;
            int n2 = this.d + (array.length - n);
            if (n2 >= e) {
                n2 = e;
            }
            while (this.d < n2) {
                final int n3 = 0xFF & r[this.d++];
                if (n3 == 39 || t[n3] != 0) {
                    if (n3 == 39) {
                        break Block_5;
                    }
                    int n4 = 0;
                    Label_0226: {
                        switch (t[n3]) {
                            default: {
                                if (n3 < 32) {
                                    this.c(n3, "string value");
                                }
                                this.l(n3);
                                break;
                            }
                            case 1: {
                                if (n3 != 39) {
                                    n4 = this.E();
                                    break Label_0226;
                                }
                                break;
                            }
                            case 2: {
                                n4 = this.s(n3);
                                break Label_0226;
                            }
                            case 3: {
                                if (this.e - this.d >= 2) {
                                    n4 = this.u(n3);
                                    break Label_0226;
                                }
                                n4 = this.t(n3);
                                break Label_0226;
                            }
                            case 4: {
                                final int v = this.v(n3);
                                final int n5 = n + 1;
                                array[n] = (char)(0xD800 | v >> 10);
                                if (n5 >= array.length) {
                                    array = this.n.m();
                                    n = 0;
                                }
                                else {
                                    n = n5;
                                }
                                n4 = (0xDC00 | (v & 0x3FF));
                                break Label_0226;
                            }
                        }
                        n4 = n3;
                    }
                    int n6;
                    if (n >= array.length) {
                        array = this.n.m();
                        n6 = 0;
                    }
                    else {
                        n6 = n;
                    }
                    n = n6 + 1;
                    array[n6] = (char)n4;
                    break;
                }
                else {
                    final int n7 = n + 1;
                    array[n] = (char)n3;
                    n = n7;
                }
            }
        }
        this.n.a(n);
        return JsonToken.h;
    }
    
    protected final void N() {
        if ((this.d < this.e || this.t()) && this.R[this.d] == 10) {
            ++this.d;
        }
        ++this.g;
        this.h = this.d;
    }
    
    @Override
    public JsonToken a() {
        this.A = 0;
        if (this.K == JsonToken.f) {
            return this.O();
        }
        if (this.P) {
            this.L();
        }
        int n = this.S();
        if (n < 0) {
            this.close();
            return this.K = null;
        }
        this.i = this.f + this.d - 1L;
        this.j = this.g;
        this.k = -1 + (this.d - this.h);
        this.r = null;
        if (n == 93) {
            if (!this.l.a()) {
                this.a(n, '}');
            }
            this.l = this.l.h();
            return this.K = JsonToken.e;
        }
        if (n == 125) {
            if (!this.l.c()) {
                this.a(n, ']');
            }
            this.l = this.l.h();
            return this.K = JsonToken.c;
        }
        if (this.l.i()) {
            if (n != 44) {
                this.b(n, "was expecting comma to separate " + this.l.d() + " entries");
            }
            n = this.Q();
        }
        if (!this.l.c()) {
            return this.o(n);
        }
        this.l.a(this.g(n).a());
        this.K = JsonToken.f;
        final int u = this.U();
        if (u == 34) {
            this.P = true;
            this.m = JsonToken.h;
            return this.K;
        }
        JsonToken m = null;
        switch (u) {
            default: {
                m = this.j(u);
                break;
            }
            case 45: {
                m = this.I();
                break;
            }
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57: {
                m = this.f(u);
                break;
            }
            case 102: {
                this.a("false", 1);
                m = JsonToken.l;
                break;
            }
            case 110: {
                this.a("null", 1);
                m = JsonToken.m;
                break;
            }
            case 116: {
                this.a("true", 1);
                m = JsonToken.k;
                break;
            }
            case 91: {
                m = JsonToken.d;
                break;
            }
            case 123: {
                m = JsonToken.b;
                break;
            }
        }
        this.m = m;
        return this.K;
    }
    
    protected JsonToken a(final int n, final boolean b) {
        int i;
        byte b2;
        for (i = n; i == 73; i = b2) {
            if (this.d >= this.e && !this.t()) {
                this.G();
            }
            b2 = this.R[this.d++];
            String s;
            if (b2 == 78) {
                if (b) {
                    s = "-INF";
                }
                else {
                    s = "+INF";
                }
            }
            else {
                if (b2 != 110) {
                    i = b2;
                    break;
                }
                if (b) {
                    s = "-Infinity";
                }
                else {
                    s = "+Infinity";
                }
            }
            this.a(s, 3);
            if (this.a(JsonParser$Feature.i)) {
                double n2;
                if (b) {
                    n2 = Double.NEGATIVE_INFINITY;
                }
                else {
                    n2 = Double.POSITIVE_INFINITY;
                }
                return this.a(s, n2);
            }
            this.f("Non-standard token '" + s + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
        this.a(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }
    
    protected final String a(final JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        switch (jsonToken.a()) {
            default: {
                return jsonToken.b();
            }
            case 5: {
                return this.l.g();
            }
            case 6:
            case 7:
            case 8: {
                return this.n.f();
            }
        }
    }
    
    @Override
    public String a(final String s) {
        if (this.K == JsonToken.h) {
            if (this.P) {
                this.P = false;
                this.u();
            }
            return this.n.f();
        }
        return super.a(s);
    }
    
    protected final y a(final int n, final int n2) {
        this.O[0] = this.U;
        this.O[1] = n2;
        final byte[] r = this.R;
        final int[] l = r.L;
        int n3 = 2;
        int n4 = n;
        while (4 + this.d <= this.e) {
            final int n5 = 0xFF & r[this.d++];
            if (l[n5] != 0) {
                if (n5 == 34) {
                    return this.a(this.O, n3, n4, 1);
                }
                return this.a(this.O, n3, n4, n5, 1);
            }
            else {
                final int n6 = n5 | n4 << 8;
                final int n7 = 0xFF & r[this.d++];
                if (l[n7] != 0) {
                    if (n7 == 34) {
                        return this.a(this.O, n3, n6, 2);
                    }
                    return this.a(this.O, n3, n6, n7, 2);
                }
                else {
                    final int n8 = n7 | n6 << 8;
                    final int n9 = 0xFF & r[this.d++];
                    if (l[n9] != 0) {
                        if (n9 == 34) {
                            return this.a(this.O, n3, n8, 3);
                        }
                        return this.a(this.O, n3, n8, n9, 3);
                    }
                    else {
                        final int n10 = n9 | n8 << 8;
                        final int n11 = 0xFF & r[this.d++];
                        if (l[n11] != 0) {
                            if (n11 == 34) {
                                return this.a(this.O, n3, n10, 4);
                            }
                            return this.a(this.O, n3, n10, n11, 4);
                        }
                        else {
                            if (n3 >= this.O.length) {
                                this.O = a(this.O, n3);
                            }
                            final int[] o = this.O;
                            final int n12 = n3 + 1;
                            o[n3] = n10;
                            n3 = n12;
                            n4 = n11;
                        }
                    }
                }
            }
        }
        return this.a(this.O, n3, 0, n4, 0);
    }
    
    protected final y a(int[] array, int n, int n2, int e, int n3) {
        final int[] l = r.L;
    Label_0220_Outer:
        while (true) {
            while (true) {
                Label_0501: {
                    if (l[e] == 0) {
                        break Label_0501;
                    }
                    if (e == 34) {
                        break;
                    }
                    if (e != 92) {
                        this.c(e, "name");
                    }
                    else {
                        e = this.E();
                    }
                    if (e <= 127) {
                        break Label_0501;
                    }
                    int n4;
                    int[] a;
                    if (n3 >= 4) {
                        if (n >= array.length) {
                            array = a(array, array.length);
                            this.O = array;
                        }
                        n4 = n + 1;
                        array[n] = n2;
                        n3 = 0;
                        n2 = 0;
                        a = array;
                    }
                    else {
                        n4 = n;
                        a = array;
                    }
                    int n7;
                    int[] array2;
                    int n8;
                    if (e < 2048) {
                        final int n5 = n2 << 8 | (0xC0 | e >> 6);
                        final int n6 = n3 + 1;
                        n7 = n5;
                        array2 = a;
                        n8 = n6;
                    }
                    else {
                        final int n9 = n2 << 8 | (0xE0 | e >> 12);
                        final int n10 = n3 + 1;
                        int n12;
                        int[] array3;
                        int n13;
                        int n14;
                        if (n10 >= 4) {
                            if (n4 >= a.length) {
                                a = a(a, a.length);
                                this.O = a;
                            }
                            final int n11 = n4 + 1;
                            a[n4] = n9;
                            n12 = n11;
                            array3 = a;
                            n13 = 0;
                            n14 = 0;
                        }
                        else {
                            n14 = n9;
                            n12 = n4;
                            array3 = a;
                            n13 = n10;
                        }
                        n7 = (n14 << 8 | (0x80 | (0x3F & e >> 6)));
                        n8 = n13 + 1;
                        final int n15 = n12;
                        array2 = array3;
                        n4 = n15;
                    }
                    n2 = (0x80 | (e & 0x3F));
                    n3 = n8;
                    n = n4;
                    int[] a2 = array2;
                    final int n16 = n7;
                    if (n3 < 4) {
                        ++n3;
                        n2 |= n16 << 8;
                        array = a2;
                    }
                    else {
                        if (n >= a2.length) {
                            a2 = a(a2, a2.length);
                            this.O = a2;
                        }
                        final int n17 = n + 1;
                        a2[n] = n16;
                        n3 = 1;
                        n = n17;
                        array = a2;
                    }
                    if (this.d >= this.e && !this.t()) {
                        this.e(" in field name");
                    }
                    e = (0xFF & this.R[this.d++]);
                    continue Label_0220_Outer;
                }
                final int n16 = n2;
                int[] a2 = array;
                n2 = e;
                continue;
            }
        }
        if (n3 > 0) {
            if (n >= array.length) {
                array = a(array, array.length);
                this.O = array;
            }
            final int n18 = n + 1;
            array[n] = d(n2, n3);
            n = n18;
        }
        y y = this.N.a(array, n);
        if (y == null) {
            y = this.a(array, n, n3);
        }
        return y;
    }
    
    protected final void a(final String s, int n) {
        final int length = s.length();
        if (length + this.d >= this.e) {
            this.b(s, n);
        }
        else {
            do {
                if (this.R[this.d] != s.charAt(n)) {
                    this.g(s.substring(0, n));
                }
                ++this.d;
            } while (++n < length);
            final int n2 = 0xFF & this.R[this.d];
            if (n2 >= 48 && n2 != 93 && n2 != 125) {
                this.a(s, n, n2);
            }
        }
    }
    
    protected void a(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder(s);
        while (this.d < this.e || this.t()) {
            final char c = (char)this.k(this.R[this.d++]);
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            sb.append(c);
        }
        this.f("Unrecognized token '" + sb.toString() + "': was expecting " + s2);
    }
    
    @Override
    public boolean a(final d d) {
        this.A = 0;
        if (this.K == JsonToken.f) {
            this.O();
            return false;
        }
        if (this.P) {
            this.L();
        }
        int n = this.S();
        if (n < 0) {
            this.close();
            this.K = null;
            return false;
        }
        this.i = this.f + this.d - 1L;
        this.j = this.g;
        this.k = -1 + (this.d - this.h);
        this.r = null;
        if (n == 93) {
            if (!this.l.a()) {
                this.a(n, '}');
            }
            this.l = this.l.h();
            this.K = JsonToken.e;
            return false;
        }
        if (n == 125) {
            if (!this.l.c()) {
                this.a(n, ']');
            }
            this.l = this.l.h();
            this.K = JsonToken.c;
            return false;
        }
        if (this.l.i()) {
            if (n != 44) {
                this.b(n, "was expecting comma to separate " + this.l.d() + " entries");
            }
            n = this.Q();
        }
        if (!this.l.c()) {
            this.o(n);
            return false;
        }
        if (n == 34) {
            final byte[] c = d.c();
            final int length = c.length;
            if (4 + (length + this.d) < this.e) {
                final int n2 = length + this.d;
                if (this.R[n2] == 34) {
                    final int d2 = this.d;
                    int n3 = 0;
                    int i;
                    for (i = d2; i != n2; ++i) {
                        if (c[n3] != this.R[i]) {
                            return this.a(n, d);
                        }
                        ++n3;
                    }
                    this.l.a(d.a());
                    this.q(this.p(i + 1));
                    return true;
                }
            }
        }
        return this.a(n, d);
    }
    
    @Override
    public String b() {
        String f;
        if (this.K == JsonToken.f) {
            this.p = false;
            final JsonToken m = this.m;
            this.m = null;
            if ((this.K = m) == JsonToken.h) {
                if (this.P) {
                    this.P = false;
                    this.u();
                }
                f = this.n.f();
            }
            else {
                if (m == JsonToken.d) {
                    this.l = this.l.a(this.j, this.k);
                    return null;
                }
                final JsonToken b = JsonToken.b;
                f = null;
                if (m == b) {
                    this.l = this.l.b(this.j, this.k);
                    return null;
                }
            }
        }
        else {
            final JsonToken a = this.a();
            final JsonToken h = JsonToken.h;
            f = null;
            if (a == h) {
                return this.g();
            }
        }
        return f;
    }
    
    protected void b(final int n, final int d) {
        this.d = d;
        this.n(n);
    }
    
    @Override
    public JsonLocation f() {
        return new JsonLocation(this.b.a(), this.f + this.d, -1L, this.g, 1 + (this.d - this.h));
    }
    
    protected JsonToken f(int p) {
        int n = 1;
        final char[] k = this.n.k();
        if (p == 48) {
            p = this.P();
        }
        k[0] = (char)p;
        int e = -1 + (this.d + k.length);
        int n2;
        if (e > this.e) {
            e = this.e;
            n2 = n;
        }
        else {
            n2 = n;
        }
        while (this.d < e) {
            final int n3 = 0xFF & this.R[this.d++];
            if (n3 < 48 || n3 > 57) {
                if (n3 == 46 || n3 == 101 || n3 == 69) {
                    return this.a(k, n, n3, false, n2);
                }
                --this.d;
                this.n.a(n);
                if (this.l.b()) {
                    this.r(n3);
                }
                return this.a(false, n2);
            }
            else {
                final int n4 = n2 + 1;
                final int n5 = n + 1;
                k[n] = (char)n3;
                n = n5;
                n2 = n4;
            }
        }
        return this.a(k, n, false, n2);
    }
    
    @Override
    public String g() {
        if (this.K == JsonToken.h) {
            if (this.P) {
                this.P = false;
                this.u();
            }
            return this.n.f();
        }
        return this.a(this.K);
    }
    
    protected final y g(final int n) {
        if (n != 34) {
            return this.i(n);
        }
        if (9 + this.d > this.e) {
            return this.J();
        }
        final byte[] r = this.R;
        final int[] l = r.L;
        final int n2 = 0xFF & r[this.d++];
        if (l[n2] == 0) {
            final int n3 = 0xFF & r[this.d++];
            if (l[n3] == 0) {
                final int n4 = n3 | n2 << 8;
                final int n5 = 0xFF & r[this.d++];
                if (l[n5] == 0) {
                    final int n6 = n5 | n4 << 8;
                    final int n7 = 0xFF & r[this.d++];
                    if (l[n7] == 0) {
                        final int u = n7 | n6 << 8;
                        final int n8 = 0xFF & r[this.d++];
                        if (l[n8] == 0) {
                            this.U = u;
                            return this.h(n8);
                        }
                        if (n8 == 34) {
                            return this.c(u, 4);
                        }
                        return this.a(u, n8, 4);
                    }
                    else {
                        if (n7 == 34) {
                            return this.c(n6, 3);
                        }
                        return this.a(n6, n7, 3);
                    }
                }
                else {
                    if (n5 == 34) {
                        return this.c(n4, 2);
                    }
                    return this.a(n4, n5, 2);
                }
            }
            else {
                if (n3 == 34) {
                    return this.c(n2, 1);
                }
                return this.a(n2, n3, 1);
            }
        }
        else {
            if (n2 == 34) {
                return t.d();
            }
            return this.a(0, n2, 0);
        }
    }
    
    protected void g(final String s) {
        this.a(s, "'null', 'true', 'false' or NaN");
    }
    
    protected final y h(final int n) {
        final byte[] r = this.R;
        final int[] l = r.L;
        final int n2 = 0xFF & r[this.d++];
        if (l[n2] != 0) {
            if (n2 == 34) {
                return this.b(this.U, n, 1);
            }
            return this.a(this.U, n, n2, 1);
        }
        else {
            final int n3 = n2 | n << 8;
            final int n4 = 0xFF & r[this.d++];
            if (l[n4] != 0) {
                if (n4 == 34) {
                    return this.b(this.U, n3, 2);
                }
                return this.a(this.U, n3, n4, 2);
            }
            else {
                final int n5 = n4 | n3 << 8;
                final int n6 = 0xFF & r[this.d++];
                if (l[n6] != 0) {
                    if (n6 == 34) {
                        return this.b(this.U, n5, 3);
                    }
                    return this.a(this.U, n5, n6, 3);
                }
                else {
                    final int n7 = n6 | n5 << 8;
                    final int n8 = 0xFF & r[this.d++];
                    if (l[n8] == 0) {
                        return this.a(n8, n7);
                    }
                    if (n8 == 34) {
                        return this.b(this.U, n7, 4);
                    }
                    return this.a(this.U, n7, n8, 4);
                }
            }
        }
    }
    
    protected y i(final int n) {
        if (n == 39 && this.a(JsonParser$Feature.e)) {
            return this.K();
        }
        if (!this.a(JsonParser$Feature.d)) {
            this.b((char)this.k(n), "was expecting double-quote to start field name");
        }
        final int[] d = com.fasterxml.jackson.core.io.a.d();
        if (d[n] != 0) {
            this.b(n, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        final int[] o = this.O;
        int n2 = 0;
        int n3 = 0;
        int n4 = n;
        int n5 = 0;
        int[] a = o;
        int n7;
        int n8;
        int[] a2;
        int n9;
        while (true) {
            if (n2 < 4) {
                final int n6 = n2 + 1;
                n7 = (n4 | n3 << 8);
                n8 = n5;
                a2 = a;
                n9 = n6;
            }
            else {
                if (n5 >= a.length) {
                    a = a(a, a.length);
                    this.O = a;
                }
                final int n10 = n5 + 1;
                a[n5] = n3;
                a2 = a;
                n9 = 1;
                n7 = n4;
                n8 = n10;
            }
            if (this.d >= this.e && !this.t()) {
                this.e(" in field name");
            }
            final int n11 = 0xFF & this.R[this.d];
            if (d[n11] != 0) {
                break;
            }
            ++this.d;
            n3 = n7;
            n2 = n9;
            a = a2;
            n5 = n8;
            n4 = n11;
        }
        if (n9 > 0) {
            if (n8 >= a2.length) {
                a2 = a(a2, a2.length);
                this.O = a2;
            }
            final int n12 = n8 + 1;
            a2[n8] = n7;
            n8 = n12;
        }
        final y a3 = this.N.a(a2, n8);
        if (a3 == null) {
            return this.a(a2, n8, n9);
        }
        return a3;
    }
    
    protected JsonToken j(final int n) {
        switch (n) {
            case 93:
            case 125: {
                this.b(n, "expected a value");
            }
            case 39: {
                if (this.a(JsonParser$Feature.e)) {
                    return this.M();
                }
                break;
            }
            case 78: {
                this.a("NaN", 1);
                if (this.a(JsonParser$Feature.i)) {
                    return this.a("NaN", Double.NaN);
                }
                this.f("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
                break;
            }
            case 73: {
                this.a("Infinity", 1);
                if (this.a(JsonParser$Feature.i)) {
                    return this.a("Infinity", Double.POSITIVE_INFINITY);
                }
                this.f("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
                break;
            }
            case 43: {
                if (this.d >= this.e && !this.t()) {
                    this.G();
                }
                return this.a(0xFF & this.R[this.d++], false);
            }
        }
        if (Character.isJavaIdentifierStart(n)) {
            this.a("" + (char)n, "('true', 'false' or 'null')");
        }
        this.b(n, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }
    
    protected int k(final int n) {
        int n2 = n & 0xFF;
        if (n2 > 127) {
            int n3;
            int n4;
            if ((n2 & 0xE0) == 0xC0) {
                n3 = (n2 & 0x1F);
                n4 = 1;
            }
            else if ((n2 & 0xF0) == 0xE0) {
                n3 = (n2 & 0xF);
                n4 = 2;
            }
            else if ((n2 & 0xF8) == 0xF0) {
                n3 = (n2 & 0x7);
                n4 = 3;
            }
            else {
                this.m(n2 & 0xFF);
                n3 = n2;
                n4 = 1;
            }
            final int z = this.Z();
            if ((z & 0xC0) != 0x80) {
                this.n(z & 0xFF);
            }
            final int n5 = n3 << 6 | (z & 0x3F);
            if (n4 <= 1) {
                return n5;
            }
            final int z2 = this.Z();
            if ((z2 & 0xC0) != 0x80) {
                this.n(z2 & 0xFF);
            }
            final int n6 = n5 << 6 | (z2 & 0x3F);
            if (n4 <= 2) {
                return n6;
            }
            final int z3 = this.Z();
            if ((z3 & 0xC0) != 0x80) {
                this.n(z3 & 0xFF);
            }
            n2 = (n6 << 6 | (z3 & 0x3F));
        }
        return n2;
    }
    
    protected void l(final int n) {
        if (n < 32) {
            this.d(n);
        }
        this.m(n);
    }
    
    protected void m(final int n) {
        this.f("Invalid UTF-8 start byte 0x" + Integer.toHexString(n));
    }
    
    protected void n(final int n) {
        this.f("Invalid UTF-8 middle byte 0x" + Integer.toHexString(n));
    }
    
    @Override
    public String r() {
        if (this.K == JsonToken.h) {
            if (this.P) {
                this.P = false;
                this.u();
            }
            return this.n.f();
        }
        return super.a((String)null);
    }
    
    @Override
    protected final boolean t() {
        this.f += this.e;
        this.h -= this.e;
        if (this.Q != null) {
            final int length = this.R.length;
            if (length != 0) {
                final int read = this.Q.read(this.R, 0, length);
                if (read > 0) {
                    this.d = 0;
                    this.e = read;
                    return true;
                }
                this.v();
                if (read == 0) {
                    throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.R.length + " bytes");
                }
            }
        }
        return false;
    }
    
    @Override
    protected void u() {
        int n = this.d;
        if (n >= this.e) {
            this.s();
            n = this.d;
        }
        final char[] k = this.n.k();
        final int[] t = r.T;
        final int min = Math.min(this.e, n + k.length);
        final byte[] r = this.R;
        int i = n;
        int n2 = 0;
        while (i < min) {
            final int n3 = 0xFF & r[i];
            if (t[n3] != 0) {
                if (n3 == 34) {
                    this.d = i + 1;
                    this.n.a(n2);
                    return;
                }
                break;
            }
            else {
                final int n4 = i + 1;
                final int n5 = n2 + 1;
                k[n2] = (char)n3;
                n2 = n5;
                i = n4;
            }
        }
        this.d = i;
        this.a(k, n2);
    }
    
    @Override
    protected void v() {
        if (this.Q != null) {
            if (this.b.c() || this.a(JsonParser$Feature.a)) {
                this.Q.close();
            }
            this.Q = null;
        }
    }
    
    @Override
    protected void w() {
        super.w();
        this.N.b();
        if (this.S) {
            final byte[] r = this.R;
            if (r != null) {
                this.R = com.fasterxml.jackson.core.util.b.a;
                this.b.a(r);
            }
        }
    }
}
