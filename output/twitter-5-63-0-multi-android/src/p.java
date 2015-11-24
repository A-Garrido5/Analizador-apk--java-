import java.io.IOException;
import com.fasterxml.jackson.core.util.d;
import com.fasterxml.jackson.core.JsonParser$Feature;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.a;
import com.fasterxml.jackson.core.b;
import java.io.Reader;

// 
// Decompiled by Procyon v0.5.30
// 

public class p extends i
{
    protected static final int[] L;
    protected Reader M;
    protected char[] N;
    protected boolean O;
    protected b P;
    protected final w Q;
    protected final int R;
    protected boolean S;
    
    static {
        L = a.a();
    }
    
    public p(final com.fasterxml.jackson.core.io.b b, final int n, final Reader m, final b p5, final w q) {
        super(b, n);
        this.S = false;
        this.M = m;
        this.N = b.g();
        this.d = 0;
        this.e = 0;
        this.P = p5;
        this.Q = q;
        this.R = q.e();
        this.O = true;
    }
    
    public p(final com.fasterxml.jackson.core.io.b b, final int n, final Reader m, final b p9, final w q, final char[] n2, final int d, final int e, final boolean o) {
        super(b, n);
        this.S = false;
        this.M = m;
        this.N = n2;
        this.d = d;
        this.e = e;
        this.P = p9;
        this.Q = q;
        this.R = q.e();
        this.O = o;
    }
    
    private final JsonToken P() {
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
    
    private final char Q() {
        if (this.d < this.e) {
            final char c = this.N[this.d];
            if (c < '0' || c > '9') {
                return '0';
            }
        }
        return this.R();
    }
    
    private char R() {
        char c;
        if (this.d >= this.e && !this.t()) {
            c = '0';
        }
        else {
            c = this.N[this.d];
            if (c < '0' || c > '9') {
                return '0';
            }
            if (!this.a(JsonParser$Feature.h)) {
                this.c("Leading zeroes not allowed");
            }
            ++this.d;
            if (c == '0') {
                while (this.d < this.e || this.t()) {
                    c = this.N[this.d];
                    if (c < '0' || c > '9') {
                        return '0';
                    }
                    ++this.d;
                    if (c != '0') {
                        return c;
                    }
                }
            }
        }
        return c;
    }
    
    private final int S() {
        if (4 + this.d >= this.e) {
            return this.b(false);
        }
        char c = this.N[this.d];
        if (c == ':') {
            final char[] n = this.N;
            final int d = 1 + this.d;
            this.d = d;
            final char c2 = n[d];
            if (c2 <= ' ') {
                if (c2 == ' ' || c2 == '\t') {
                    final char[] n2 = this.N;
                    final int d2 = 1 + this.d;
                    this.d = d2;
                    final char c3 = n2[d2];
                    if (c3 > ' ') {
                        if (c3 == '/' || c3 == '#') {
                            return this.b(true);
                        }
                        ++this.d;
                        return c3;
                    }
                }
                return this.b(true);
            }
            if (c2 == '/' || c2 == '#') {
                return this.b(true);
            }
            ++this.d;
            return c2;
        }
        else {
            if (c == ' ' || c == '\t') {
                final char[] n3 = this.N;
                final int d3 = 1 + this.d;
                this.d = d3;
                c = n3[d3];
            }
            if (c != ':') {
                return this.b(false);
            }
            final char[] n4 = this.N;
            final int d4 = 1 + this.d;
            this.d = d4;
            final char c4 = n4[d4];
            if (c4 <= ' ') {
                if (c4 == ' ' || c4 == '\t') {
                    final char[] n5 = this.N;
                    final int d5 = 1 + this.d;
                    this.d = d5;
                    final char c5 = n5[d5];
                    if (c5 > ' ') {
                        if (c5 == '/' || c5 == '#') {
                            return this.b(true);
                        }
                        ++this.d;
                        return c5;
                    }
                }
                return this.b(true);
            }
            if (c4 == '/' || c4 == '#') {
                return this.b(true);
            }
            ++this.d;
            return c4;
        }
    }
    
    private final int T() {
        while (this.d < this.e || this.t()) {
            final char c = this.N[this.d++];
            if (c > ' ') {
                if (c == '/') {
                    this.W();
                }
                else {
                    if (c != '#' || !this.Y()) {
                        return c;
                    }
                    continue;
                }
            }
            else {
                if (c >= ' ') {
                    continue;
                }
                if (c == '\n') {
                    ++this.g;
                    this.h = this.d;
                }
                else if (c == '\r') {
                    this.O();
                }
                else {
                    if (c == '\t') {
                        continue;
                    }
                    this.d(c);
                }
            }
        }
        throw this.b("Unexpected end-of-input within/between " + this.l.d() + " entries");
    }
    
    private final int U() {
        int y;
        if (this.d >= this.e && !this.t()) {
            y = this.y();
        }
        else {
            y = this.N[this.d++];
            if (y <= 32) {
                if (y != 32) {
                    if (y == 10) {
                        ++this.g;
                        this.h = this.d;
                    }
                    else if (y == 13) {
                        this.O();
                    }
                    else if (y != 9) {
                        this.d(y);
                    }
                }
                while (this.d < this.e) {
                    y = this.N[this.d++];
                    if (y > 32) {
                        if (y == 47 || y == 35) {
                            --this.d;
                            return this.V();
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
                            this.O();
                        }
                        else {
                            if (y == 9) {
                                continue;
                            }
                            this.d(y);
                        }
                    }
                }
                return this.V();
            }
            if (y == 47 || y == 35) {
                --this.d;
                return this.V();
            }
        }
        return y;
    }
    
    private int V() {
        while (this.d < this.e || this.t()) {
            final int y = this.N[this.d++];
            if (y > 32) {
                if (y == 47) {
                    this.W();
                }
                else {
                    if (y == 35 && this.Y()) {
                        continue;
                    }
                    return y;
                }
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
                    this.O();
                }
                else {
                    if (y == 9) {
                        continue;
                    }
                    this.d(y);
                }
            }
        }
        return this.y();
    }
    
    private void W() {
        if (!this.a(JsonParser$Feature.b)) {
            this.b(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.d >= this.e && !this.t()) {
            this.e(" in a comment");
        }
        final char c = this.N[this.d++];
        if (c == '/') {
            this.Z();
            return;
        }
        if (c == '*') {
            this.X();
            return;
        }
        this.b(c, "was expecting either '*' or '/' for a comment");
    }
    
    private void X() {
        while (this.d < this.e || this.t()) {
            final char c = this.N[this.d++];
            if (c <= '*') {
                if (c == '*') {
                    if (this.d >= this.e && !this.t()) {
                        break;
                    }
                    if (this.N[this.d] == '/') {
                        ++this.d;
                        return;
                    }
                    continue;
                }
                else {
                    if (c >= ' ') {
                        continue;
                    }
                    if (c == '\n') {
                        ++this.g;
                        this.h = this.d;
                    }
                    else if (c == '\r') {
                        this.O();
                    }
                    else {
                        if (c == '\t') {
                            continue;
                        }
                        this.d(c);
                    }
                }
            }
        }
        this.e(" in a comment");
    }
    
    private boolean Y() {
        if (!this.a(JsonParser$Feature.c)) {
            return false;
        }
        this.Z();
        return true;
    }
    
    private void Z() {
        while (this.d < this.e || this.t()) {
            final char c = this.N[this.d++];
            if (c < ' ') {
                if (c == '\n') {
                    ++this.g;
                    this.h = this.d;
                    break;
                }
                if (c == '\r') {
                    this.O();
                    return;
                }
                if (c == '\t') {
                    continue;
                }
                this.d(c);
            }
        }
    }
    
    private final JsonToken a(final int n, final int d, final int n2, final boolean b, final int n3) {
        int n4 = 0;
        final int e = this.e;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        Label_0090: {
            if (n == 46) {
                int n5 = 0;
                int n7;
                for (int i = n2; i < e; i = n7) {
                    final char[] n6 = this.N;
                    n7 = i + 1;
                    n8 = n6[i];
                    if (n8 < 48 || n8 > 57) {
                        if (n5 == 0) {
                            this.a(n8, "Decimal point not followed by a digit");
                        }
                        n9 = n5;
                        n10 = n7;
                        break Label_0090;
                    }
                    ++n5;
                }
                return this.b(b, d);
            }
            n10 = n2;
            n8 = n;
            n9 = 0;
        }
        Label_0285: {
            if (n8 != 101) {
                n4 = 0;
                if (n8 != 69) {
                    break Label_0285;
                }
            }
            if (n10 >= e) {
                this.d = d;
                return this.b(b, d);
            }
            final char[] n11 = this.N;
            final int n12 = n10 + 1;
            final char c = n11[n10];
            if (c == '-' || c == '+') {
                if (n12 >= e) {
                    this.d = d;
                    return this.b(b, d);
                }
                final char[] n13 = this.N;
                n10 = n12 + 1;
                n8 = n13[n12];
            }
            else {
                n8 = c;
                n10 = n12;
                n4 = 0;
            }
            while (n8 <= 57 && n8 >= 48) {
                ++n4;
                if (n10 >= e) {
                    this.d = d;
                    return this.b(b, d);
                }
                final char[] n14 = this.N;
                final int n15 = n10 + 1;
                n8 = n14[n10];
                n10 = n15;
            }
            if (n4 == 0) {
                this.a(n8, "Exponent indicator not followed by a digit");
            }
        }
        final int d2 = n10 - 1;
        this.d = d2;
        if (this.l.b()) {
            this.i(n8);
        }
        this.n.a(this.N, d, d2 - d);
        return this.b(b, n3, n9, n4);
    }
    
    private String a(final int n, int n2, final int n3) {
        this.n.a(this.N, n, this.d - n);
        char[] array = this.n.j();
        int l = this.n.l();
    Label_0130_Outer:
        while (true) {
            if (this.d >= this.e && !this.t()) {
                this.e(": was expecting closing '" + (char)n3 + "' for name");
            }
            final char c = this.N[this.d++];
            while (true) {
                Label_0252: {
                    if (c > '\\') {
                        break Label_0252;
                    }
                    final char e;
                    if (c == '\\') {
                        e = this.E();
                    }
                    else {
                        if (c > n3) {
                            break Label_0252;
                        }
                        if (c == n3) {
                            break;
                        }
                        if (c < ' ') {
                            this.c(c, "name");
                        }
                        break Label_0252;
                    }
                    n2 = c + n2 * 33;
                    final int n4 = l + 1;
                    array[l] = e;
                    if (n4 >= array.length) {
                        array = this.n.m();
                        l = 0;
                        continue Label_0130_Outer;
                    }
                    l = n4;
                    continue Label_0130_Outer;
                }
                char e = c;
                continue;
            }
        }
        this.n.a(l);
        final d n5 = this.n;
        return this.Q.a(n5.e(), n5.d(), n5.c(), n2);
    }
    
    private String a(final int n, int n2, final int[] array) {
        this.n.a(this.N, n, this.d - n);
        char[] array2 = this.n.j();
        int l = this.n.l();
        final int length = array.length;
        while (this.d < this.e || this.t()) {
            final char c = this.N[this.d];
            if (c <= length) {
                if (array[c] != 0) {
                    break;
                }
            }
            else if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            ++this.d;
            n2 = c + n2 * 33;
            final int n3 = l + 1;
            array2[l] = c;
            if (n3 >= array2.length) {
                array2 = this.n.m();
                l = 0;
            }
            else {
                l = n3;
            }
        }
        this.n.a(l);
        final d n4 = this.n;
        return this.Q.a(n4.e(), n4.d(), n4.c(), n2);
    }
    
    private final void aa() {
        final int d = this.d;
        if (d + 3 < this.e) {
            final char[] n = this.N;
            if (n[d] == 'r') {
                final int n2 = d + 1;
                if (n[n2] == 'u') {
                    final int n3 = n2 + 1;
                    if (n[n3] == 'e') {
                        final int d2 = n3 + 1;
                        final char c = n[d2];
                        if (c < '0' || c == ']' || c == '}') {
                            this.d = d2;
                            return;
                        }
                    }
                }
            }
        }
        this.a("true", 1);
    }
    
    private final void ab() {
        final int d = this.d;
        if (d + 4 < this.e) {
            final char[] n = this.N;
            if (n[d] == 'a') {
                final int n2 = d + 1;
                if (n[n2] == 'l') {
                    final int n3 = n2 + 1;
                    if (n[n3] == 's') {
                        final int n4 = n3 + 1;
                        if (n[n4] == 'e') {
                            final int d2 = n4 + 1;
                            final char c = n[d2];
                            if (c < '0' || c == ']' || c == '}') {
                                this.d = d2;
                                return;
                            }
                        }
                    }
                }
            }
        }
        this.a("false", 1);
    }
    
    private final void ac() {
        final int d = this.d;
        if (d + 3 < this.e) {
            final char[] n = this.N;
            if (n[d] == 'u') {
                final int n2 = d + 1;
                if (n[n2] == 'l') {
                    final int n3 = n2 + 1;
                    if (n[n3] == 'l') {
                        final int d2 = n3 + 1;
                        final char c = n[d2];
                        if (c < '0' || c == ']' || c == '}') {
                            this.d = d2;
                            return;
                        }
                    }
                }
            }
        }
        this.a("null", 1);
    }
    
    private final int b(boolean b) {
        char c;
        while (true) {
            if (this.d >= this.e) {
                this.s();
            }
            c = this.N[this.d++];
            if (c > ' ') {
                if (c == '/') {
                    this.W();
                }
                else {
                    if (c == '#' && this.Y()) {
                        continue;
                    }
                    if (b) {
                        break;
                    }
                    if (c != ':') {
                        if (c < ' ') {
                            this.d(c);
                        }
                        this.b(c, "was expecting a colon to separate field name and value");
                    }
                    b = true;
                }
            }
            else {
                if (c >= ' ') {
                    continue;
                }
                if (c == '\n') {
                    ++this.g;
                    this.h = this.d;
                }
                else if (c == '\r') {
                    this.O();
                }
                else {
                    if (c == '\t') {
                        continue;
                    }
                    this.d(c);
                }
            }
        }
        return c;
    }
    
    private final JsonToken b(final boolean b, int d) {
        if (b) {
            ++d;
        }
        this.d = d;
        final char[] k = this.n.k();
        int n;
        if (b) {
            n = 1;
            k[0] = '-';
        }
        else {
            n = 0;
        }
        int n2 = 0;
        char c;
        if (this.d < this.e) {
            c = this.N[this.d++];
        }
        else {
            c = this.g("No digit following minus sign");
        }
        if (c == '0') {
            c = this.Q();
        }
        final char c2 = c;
        char[] m = k;
        while (true) {
            char c3 = '\0';
            int n3;
        Label_0266_Outer:
            for (c3 = c2; c3 >= '0' && c3 <= '9'; c3 = this.N[this.d++], n = n3) {
                ++n2;
                if (n >= m.length) {
                    m = this.n.m();
                    n = 0;
                }
                n3 = n + 1;
                m[n] = c3;
                if (this.d >= this.e && !this.t()) {
                    final int n4 = 1;
                    final int n5 = n2;
                    char[] i = m;
                    char c4 = '\0';
                    if (n5 == 0) {
                        this.c("Missing integer part (next char " + j.e(c4) + ")");
                    }
                    int n6 = 0;
                    int n9 = 0;
                    char c5 = '\0';
                    int n10 = 0;
                    char[] array = null;
                    int n11 = 0;
                    Label_0291: {
                        if (c4 == '.') {
                            int n7 = n3 + 1;
                            i[n3] = c4;
                            while (true) {
                                while (this.d < this.e || this.t()) {
                                    c4 = this.N[this.d++];
                                    if (c4 >= '0') {
                                        if (c4 <= '9') {
                                            ++n6;
                                            int n8;
                                            if (n7 >= i.length) {
                                                i = this.n.m();
                                                n8 = 0;
                                            }
                                            else {
                                                n8 = n7;
                                            }
                                            n7 = n8 + 1;
                                            i[n8] = c4;
                                            continue Label_0266_Outer;
                                        }
                                        n9 = n4;
                                        c5 = c4;
                                    }
                                    else {
                                        n9 = n4;
                                        c5 = c4;
                                    }
                                    if (n6 == 0) {
                                        this.a(c5, "Decimal point not followed by a digit");
                                    }
                                    n10 = n6;
                                    array = i;
                                    n11 = n7;
                                    break Label_0291;
                                }
                                n9 = 1;
                                c5 = c4;
                                continue;
                            }
                        }
                        n11 = n3;
                        n9 = n4;
                        c5 = c4;
                        array = i;
                        n10 = 0;
                    }
                    int n12 = 0;
                    char c7 = '\0';
                    int n18 = 0;
                    int n19 = 0;
                    int n20 = 0;
                    Label_0568: {
                        if (c5 == 'e' || c5 == 'E') {
                            if (n11 >= array.length) {
                                array = this.n.m();
                                n11 = 0;
                            }
                            final int n13 = n11 + 1;
                            array[n11] = c5;
                            char g;
                            if (this.d < this.e) {
                                g = this.N[this.d++];
                            }
                            else {
                                g = this.g("expected a digit for number exponent");
                            }
                            int n16;
                            if (g == '-' || g == '+') {
                                int n14;
                                if (n13 >= array.length) {
                                    array = this.n.m();
                                    n14 = 0;
                                }
                                else {
                                    n14 = n13;
                                }
                                final int n15 = n14 + 1;
                                array[n14] = g;
                                char g2;
                                if (this.d < this.e) {
                                    g2 = this.N[this.d++];
                                }
                                else {
                                    g2 = this.g("expected a digit for number exponent");
                                }
                                final char c6 = g2;
                                n16 = n15;
                                c7 = c6;
                            }
                            else {
                                n16 = n13;
                                c7 = g;
                                n12 = 0;
                            }
                            while (true) {
                                while (c7 <= '9' && c7 >= '0') {
                                    ++n12;
                                    if (n16 >= array.length) {
                                        array = this.n.m();
                                        n16 = 0;
                                    }
                                    final int n17 = n16 + 1;
                                    array[n16] = c7;
                                    if (this.d >= this.e && !this.t()) {
                                        n18 = n12;
                                        n19 = 1;
                                        n20 = n17;
                                        if (n18 == 0) {
                                            this.a(c7, "Exponent indicator not followed by a digit");
                                        }
                                        break Label_0568;
                                    }
                                    else {
                                        c7 = this.N[this.d++];
                                        n16 = n17;
                                    }
                                }
                                n19 = n9;
                                final int n21 = n12;
                                n20 = n16;
                                n18 = n21;
                                continue;
                            }
                        }
                        n19 = n9;
                        c7 = c5;
                        n20 = n11;
                        n18 = 0;
                    }
                    if (n19 == 0) {
                        --this.d;
                        if (this.l.b()) {
                            this.i(c7);
                        }
                    }
                    this.n.a(n20);
                    return this.a(b, n5, n10, n18);
                }
            }
            final int n5 = n2;
            n3 = n;
            char[] i = m;
            char c4 = c3;
            final int n4 = 0;
            continue;
        }
    }
    
    private final void i(final int n) {
        ++this.d;
        switch (n) {
            default: {
                this.c(n);
            }
            case 9:
            case 32: {}
            case 13: {
                this.O();
            }
            case 10: {
                ++this.g;
                this.h = this.d;
            }
        }
    }
    
    private final int j(final int n) {
        if (n != 44) {
            this.b(n, "was expecting comma to separate " + this.l.d() + " entries");
        }
        while (this.d < this.e) {
            int t = this.N[this.d++];
            if (t > 32) {
                if (t == 47 || t == 35) {
                    --this.d;
                    t = this.T();
                }
                return t;
            }
            if (t >= 32) {
                continue;
            }
            if (t == 10) {
                ++this.g;
                this.h = this.d;
            }
            else if (t == 13) {
                this.O();
            }
            else {
                if (t == 9) {
                    continue;
                }
                this.d(t);
            }
        }
        return this.T();
    }
    
    @Override
    protected char E() {
        int n = 0;
        if (this.d >= this.e && !this.t()) {
            this.e(" in character escape sequence");
        }
        char a = this.N[this.d++];
        switch (a) {
            default: {
                a = this.a(a);
                return a;
            }
            case 34:
            case 47:
            case 92: {
                return a;
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
            case 117: {
                for (int i = 0; i < 4; ++i) {
                    if (this.d >= this.e && !this.t()) {
                        this.e(" in character escape sequence");
                    }
                    final char c = this.N[this.d++];
                    final int a2 = com.fasterxml.jackson.core.io.a.a(c);
                    if (a2 < 0) {
                        this.b(c, "expected a hex-digit for character escape sequence");
                    }
                    n = (a2 | n << 4);
                }
                return (char)n;
            }
        }
    }
    
    protected final JsonToken I() {
        final int d = this.d;
        final int n = d - 1;
        final int e = this.e;
        if (d >= e) {
            return this.b(true, n);
        }
        final char[] n2 = this.N;
        final int d2 = d + 1;
        final char c = n2[d];
        if (c > '9' || c < '0') {
            this.d = d2;
            return this.a(c, true);
        }
        if (c == '0') {
            return this.b(true, n);
        }
        int n3 = 1;
        int i = d2;
        while (i < e) {
            final char[] n4 = this.N;
            final int d3 = i + 1;
            final char c2 = n4[i];
            if (c2 < '0' || c2 > '9') {
                if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this.d = d3;
                    return this.a(c2, n, d3, true, n3);
                }
                final int d4 = d3 - 1;
                this.d = d4;
                if (this.l.b()) {
                    this.i(c2);
                }
                this.n.a(this.N, n, d4 - n);
                return this.a(true, n3);
            }
            else {
                ++n3;
                i = d3;
            }
        }
        return this.b(true, n);
    }
    
    protected final String J() {
        int i = this.d;
        int r = this.R;
        final int[] l = p.L;
        while (i < this.e) {
            final char c = this.N[i];
            if (c < l.length && l[c] != 0) {
                if (c == '\"') {
                    final int d = this.d;
                    this.d = i + 1;
                    return this.Q.a(this.N, d, i - d, r);
                }
                break;
            }
            else {
                r = c + r * 33;
                ++i;
            }
        }
        final int d2 = this.d;
        this.d = i;
        return this.a(d2, r, 34);
    }
    
    protected String K() {
        int d = this.d;
        int r = this.R;
        final int e = this.e;
        if (d < e) {
            final int[] l = p.L;
            final int length = l.length;
            do {
                final char c = this.N[d];
                if (c == '\'') {
                    final int d2 = this.d;
                    this.d = d + 1;
                    return this.Q.a(this.N, d2, d - d2, r);
                }
                if (c < length && l[c] != 0) {
                    break;
                }
                r = c + r * 33;
            } while (++d < e);
        }
        final int d3 = this.d;
        this.d = d;
        return this.a(d3, r, 39);
    }
    
    protected JsonToken L() {
        char[] array = this.n.k();
        int l = this.n.l();
        while (true) {
            if (this.d >= this.e && !this.t()) {
                this.e(": was expecting closing quote for a string value");
            }
            char e = this.N[this.d++];
            if (e <= '\\') {
                if (e == '\\') {
                    e = this.E();
                }
                else if (e <= '\'') {
                    if (e == '\'') {
                        break;
                    }
                    if (e < ' ') {
                        this.c(e, "string value");
                    }
                }
            }
            int n;
            if (l >= array.length) {
                array = this.n.m();
                n = 0;
            }
            else {
                n = l;
            }
            l = n + 1;
            array[n] = e;
        }
        this.n.a(l);
        return JsonToken.h;
    }
    
    protected void M() {
        char[] array = this.n.j();
        int l = this.n.l();
        final int[] i = p.L;
        final int length = i.length;
        while (true) {
            if (this.d >= this.e && !this.t()) {
                this.e(": was expecting closing quote for a string value");
            }
            char e = this.N[this.d++];
            if (e < length && i[e] != 0) {
                if (e == '\"') {
                    break;
                }
                if (e == '\\') {
                    e = this.E();
                }
                else if (e < ' ') {
                    this.c(e, "string value");
                }
            }
            int n;
            if (l >= array.length) {
                array = this.n.m();
                n = 0;
            }
            else {
                n = l;
            }
            l = n + 1;
            array[n] = e;
        }
        this.n.a(l);
    }
    
    protected final void N() {
        this.S = false;
        int d = this.d;
        int n = this.e;
        final char[] n2 = this.N;
        int d2;
        while (true) {
            if (d >= n) {
                this.d = d;
                if (!this.t()) {
                    this.e(": was expecting closing quote for a string value");
                }
                d = this.d;
                n = this.e;
            }
            d2 = d + 1;
            final char c = n2[d];
            if (c <= '\\') {
                if (c == '\\') {
                    this.d = d2;
                    this.E();
                    d = this.d;
                    n = this.e;
                    continue;
                }
                if (c <= '\"') {
                    if (c == '\"') {
                        break;
                    }
                    if (c < ' ') {
                        this.d = d2;
                        this.c(c, "string value");
                    }
                }
            }
            d = d2;
        }
        this.d = d2;
    }
    
    protected final void O() {
        if ((this.d < this.e || this.t()) && this.N[this.d] == '\n') {
            ++this.d;
        }
        ++this.g;
        this.h = this.d;
    }
    
    @Override
    public final JsonToken a() {
        this.A = 0;
        if (this.K == JsonToken.f) {
            return this.P();
        }
        if (this.S) {
            this.N();
        }
        int n = this.U();
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
            n = this.j(n);
        }
        final boolean c = this.l.c();
        if (c) {
            String s;
            if (n == 34) {
                s = this.J();
            }
            else {
                s = this.g(n);
            }
            this.l.a(s);
            this.K = JsonToken.f;
            n = this.S();
        }
        JsonToken jsonToken = null;
        switch (n) {
            default: {
                jsonToken = this.h(n);
                break;
            }
            case 34: {
                this.S = true;
                jsonToken = JsonToken.h;
                break;
            }
            case 91: {
                if (!c) {
                    this.l = this.l.a(this.j, this.k);
                }
                jsonToken = JsonToken.d;
                break;
            }
            case 123: {
                if (!c) {
                    this.l = this.l.b(this.j, this.k);
                }
                jsonToken = JsonToken.b;
                break;
            }
            case 93:
            case 125: {
                this.b(n, "expected a value");
            }
            case 116: {
                this.aa();
                jsonToken = JsonToken.k;
                break;
            }
            case 102: {
                this.ab();
                jsonToken = JsonToken.l;
                break;
            }
            case 110: {
                this.ac();
                jsonToken = JsonToken.m;
                break;
            }
            case 45: {
                jsonToken = this.I();
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
                jsonToken = this.f(n);
                break;
            }
        }
        if (c) {
            this.m = jsonToken;
            return this.K;
        }
        return this.K = jsonToken;
    }
    
    protected JsonToken a(int n, final boolean b) {
        double n2 = Double.NEGATIVE_INFINITY;
        if (n == 73) {
            if (this.d >= this.e && !this.t()) {
                this.G();
            }
            n = this.N[this.d++];
            if (n == 78) {
                String s;
                if (b) {
                    s = "-INF";
                }
                else {
                    s = "+INF";
                }
                this.a(s, 3);
                if (this.a(JsonParser$Feature.i)) {
                    if (!b) {
                        n2 = Double.POSITIVE_INFINITY;
                    }
                    return this.a(s, n2);
                }
                this.f("Non-standard token '" + s + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            }
            else if (n == 110) {
                String s2;
                if (b) {
                    s2 = "-Infinity";
                }
                else {
                    s2 = "+Infinity";
                }
                this.a(s2, 3);
                if (this.a(JsonParser$Feature.i)) {
                    if (!b) {
                        n2 = Double.POSITIVE_INFINITY;
                    }
                    return this.a(s2, n2);
                }
                this.f("Non-standard token '" + s2 + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            }
        }
        this.a(n, "expected digit (0-9) to follow minus sign, for valid numeric value");
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
    public final String a(final String s) {
        if (this.K == JsonToken.h) {
            if (this.S) {
                this.S = false;
                this.u();
            }
            return this.n.f();
        }
        return super.a(s);
    }
    
    protected final void a(final String s, int n) {
        do {
            if (this.d >= this.e && !this.t()) {
                this.h(s.substring(0, n));
            }
            if (this.N[this.d] != s.charAt(n)) {
                this.h(s.substring(0, n));
            }
            ++this.d;
        } while (++n < s.length());
        if (this.d < this.e || this.t()) {
            final char c = this.N[this.d];
            if (c >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
                this.h(s.substring(0, n));
            }
        }
    }
    
    protected void a(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder(s);
        while (this.d < this.e || this.t()) {
            final char c = this.N[this.d];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            ++this.d;
            sb.append(c);
        }
        this.f("Unrecognized token '" + sb.toString() + "': was expecting " + s2);
    }
    
    @Override
    public final String b() {
        String f;
        if (this.K == JsonToken.f) {
            this.p = false;
            final JsonToken m = this.m;
            this.m = null;
            if ((this.K = m) == JsonToken.h) {
                if (this.S) {
                    this.S = false;
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
    
    protected final JsonToken f(final int n) {
        final int d = this.d;
        final int d2 = d - 1;
        final int e = this.e;
        if (n == 48) {
            return this.b(false, d2);
        }
        int n2 = 1;
        int i = d;
        while (i < e) {
            final char[] n3 = this.N;
            final int d3 = i + 1;
            final char c = n3[i];
            if (c < '0' || c > '9') {
                if (c == '.' || c == 'e' || c == 'E') {
                    this.d = d3;
                    return this.a(c, d2, d3, false, n2);
                }
                final int d4 = d3 - 1;
                this.d = d4;
                if (this.l.b()) {
                    this.i(c);
                }
                this.n.a(this.N, d2, d4 - d2);
                return this.a(false, n2);
            }
            else {
                ++n2;
                i = d3;
            }
        }
        this.d = d2;
        return this.b(false, d2);
    }
    
    protected char g(final String s) {
        if (this.d >= this.e && !this.t()) {
            this.e(s);
        }
        return this.N[this.d++];
    }
    
    @Override
    public final String g() {
        final JsonToken k = this.K;
        if (k == JsonToken.h) {
            if (this.S) {
                this.S = false;
                this.u();
            }
            return this.n.f();
        }
        return this.a(k);
    }
    
    protected String g(final int n) {
        if (n == 39 && this.a(JsonParser$Feature.e)) {
            return this.K();
        }
        if (!this.a(JsonParser$Feature.d)) {
            this.b(n, "was expecting double-quote to start field name");
        }
        final int[] c = com.fasterxml.jackson.core.io.a.c();
        final int length = c.length;
        int javaIdentifierPart;
        if (n < length) {
            if (c[n] == 0) {
                javaIdentifierPart = 1;
            }
            else {
                javaIdentifierPart = 0;
            }
        }
        else {
            javaIdentifierPart = (Character.isJavaIdentifierPart((char)n) ? 1 : 0);
        }
        if (javaIdentifierPart == 0) {
            this.b(n, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int d = this.d;
        int r = this.R;
        final int e = this.e;
        if (d < e) {
            do {
                final char c2 = this.N[d];
                if (c2 < length) {
                    if (c[c2] != 0) {
                        final int n2 = -1 + this.d;
                        this.d = d;
                        return this.Q.a(this.N, n2, d - n2, r);
                    }
                }
                else if (!Character.isJavaIdentifierPart(c2)) {
                    final int n3 = -1 + this.d;
                    this.d = d;
                    return this.Q.a(this.N, n3, d - n3, r);
                }
                r = c2 + r * 33;
            } while (++d < e);
        }
        final int n4 = -1 + this.d;
        this.d = d;
        return this.a(n4, r, c);
    }
    
    protected JsonToken h(final int n) {
        switch (n) {
            case 39: {
                if (this.a(JsonParser$Feature.e)) {
                    return this.L();
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
                return this.a(this.N[this.d++], false);
            }
        }
        if (Character.isJavaIdentifierStart(n)) {
            this.a("" + (char)n, "('true', 'false' or 'null')");
        }
        this.b(n, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }
    
    protected void h(final String s) {
        this.a(s, "'null', 'true', 'false' or NaN");
    }
    
    @Override
    public final String r() {
        if (this.K == JsonToken.h) {
            if (this.S) {
                this.S = false;
                this.u();
            }
            return this.n.f();
        }
        return super.a((String)null);
    }
    
    @Override
    protected boolean t() {
        this.f += this.e;
        this.h -= this.e;
        final Reader m = this.M;
        boolean b = false;
        if (m != null) {
            final int read = this.M.read(this.N, 0, this.N.length);
            if (read > 0) {
                this.d = 0;
                this.e = read;
                b = true;
            }
            else {
                this.v();
                b = false;
                if (read == 0) {
                    throw new IOException("Reader returned 0 characters when trying to read " + this.e);
                }
            }
        }
        return b;
    }
    
    @Override
    protected final void u() {
        int d = this.d;
        final int e = this.e;
        if (d < e) {
            final int[] l = p.L;
            final int length = l.length;
            do {
                final char c = this.N[d];
                if (c < length && l[c] != 0) {
                    if (c == '\"') {
                        this.n.a(this.N, this.d, d - this.d);
                        this.d = d + 1;
                        return;
                    }
                    break;
                }
            } while (++d < e);
        }
        this.n.b(this.N, this.d, d - this.d);
        this.d = d;
        this.M();
    }
    
    @Override
    protected void v() {
        if (this.M != null) {
            if (this.b.c() || this.a(JsonParser$Feature.a)) {
                this.M.close();
            }
            this.M = null;
        }
    }
    
    @Override
    protected void w() {
        super.w();
        this.Q.b();
        if (this.O) {
            final char[] n = this.N;
            if (n != null) {
                this.N = null;
                this.b.a(n);
            }
        }
    }
}
