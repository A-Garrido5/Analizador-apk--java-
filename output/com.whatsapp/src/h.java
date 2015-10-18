import java.util.Collection;
import java.util.Arrays;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.5.30
// 

public class h extends g
{
    private static final HashSet A;
    private static final HashSet B;
    private static final HashSet C;
    private static final String[] E;
    private String D;
    
    static {
        final String[] e = new String[42];
        String s = "\b3|#r+4t#6n>e4; =063<)y(5n\u0018Q\u0015\u0017xn0$; ;b?";
        int n = -1;
        String[] array = e;
        int n2 = 0;
        String intern = null;
    Label_1082:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'R';
                        break;
                    }
                    case 0: {
                        c2 = 'N';
                        break;
                    }
                    case 1: {
                        c2 = 'Z';
                        break;
                    }
                    case 2: {
                        c2 = '\u0010';
                        break;
                    }
                    case 3: {
                        c2 = 'F';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0016w";
                    n2 = 1;
                    array = e;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "}t ";
                    n2 = 2;
                    array = e;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "CP";
                    n2 = 3;
                    array = e;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = e;
                    s = "\u001b4{(=94063<;}5r8;|37tz";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u000f\u001dU\b\u0006n3~f$\r;b\"r}t f;=z~)&n)e6\"!(d#6n#u2|";
                    n = 4;
                    array = e;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001c?q%:+>0#<*z\u007f r,/v 7<t";
                    n = 5;
                    array = e;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u001d*q%7n?h/!:)0'&n.x#r,?w/< 3~!r!<02:+z|/<+";
                    n = 6;
                    array = e;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "CP";
                    n = 7;
                    array = e;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u001a\u0003@\u0003";
                    n = 8;
                    array = e;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0015\u00054gn2d1b\r\u0013";
                    n = 9;
                    array = e;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0000\u001b]\u0003";
                    n = 10;
                    array = e;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\r\u0016Q\u0015\u0001";
                    n = 11;
                    array = e;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0018\u001fB\u0015\u001b\u0001\u0014";
                    n = 12;
                    array = e;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u001b\b\\";
                    n = 13;
                    array = e;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\t\u001f_";
                    n = 14;
                    array = e;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    s = "\f\u001eQ\u001f";
                    n = 15;
                    n2 = 16;
                    array = e;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    array = e;
                    s = "\u0003\u001bY\n\u0017\u001c";
                    n = 16;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u000b\u0017Q\u000f\u001e";
                    n = 17;
                    array = e;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\f\u001fW\u000f\u001c";
                    n = 18;
                    array = e;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u001a\u001f\\";
                    n = 19;
                    array = e;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0002\u0015W\t";
                    n = 20;
                    array = e;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "y\u0018Y\u0012";
                    n = 21;
                    array = e;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u001e\u0012_\u0012\u001d";
                    n = 22;
                    array = e;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u001e\b_\u0002\u001b\n";
                    n = 23;
                    array = e;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u001c\u0015\\\u0003";
                    n = 24;
                    array = e;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u001b\u0013T";
                    n = 25;
                    array = e;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u001c\u001fF";
                    n = 26;
                    array = e;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\r\u001bD\u0003\u0015\u0001\bY\u0003\u0001";
                    n = 27;
                    array = e;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\b\u0014";
                    n = 28;
                    array = e;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u0000\u0015D\u0003";
                    n = 29;
                    array = e;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "\f\u001bC\u0003dz";
                    n = 30;
                    array = e;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u001e\b_\u0000\u001b\u0002\u001f";
                    n = 31;
                    array = e;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\u001d\u0015B\u0012\u007f\u001d\u000eB\u000f\u001c\t";
                    n = 32;
                    array = e;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "\u001d\u0015E\u0014\u0011\u000b";
                    n = 33;
                    array = e;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "\u0002\u001bR\u0003\u001e";
                    n = 34;
                    array = e;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "\u001a\u0000";
                    n = 35;
                    array = e;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u0000\u0013S\r\u001c\u000f\u0017U";
                    n = 36;
                    array = e;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u0005\u001fI";
                    n = 37;
                    array = e;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "v\u0018Y\u0012";
                    n = 38;
                    array = e;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "\u001a\u0013D\n\u0017";
                    n = 39;
                    array = e;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "\u001d\u0015E\b\u0016";
                    n = 40;
                    array = e;
                    continue;
                }
                case 40: {
                    break Label_1082;
                }
            }
        }
        array[n2] = intern;
        E = e;
        B = new HashSet((Collection<? extends E>)Arrays.asList(h.E[19], h.E[21], h.E[23], h.E[35], h.E[29], h.E[40], h.E[41], h.E[13], h.E[20], h.E[18], h.E[36], h.E[15], h.E[30], h.E[14], h.E[16], h.E[25], h.E[27], h.E[26], h.E[38], h.E[17], h.E[11], h.E[32], h.E[34], h.E[37], h.E[12], h.E[33], h.E[28], h.E[24]));
        A = new HashSet((Collection<? extends E>)Arrays.asList(h.E[22], h.E[39], h.E[31], "B"));
        C = new HashSet();
    }
    
    @Override
    protected void a(final boolean b, final boolean b2) {
        super.a(b, b2);
    }
    
    @Override
    protected boolean a(final boolean b) {
        return super.a(b);
    }
    
    @Override
    protected String b(final char c) {
        if (c == 'n' || c == 'N') {
            return h.E[8];
        }
        return String.valueOf(c);
    }
    
    @Override
    protected String c() {
        if (this.D != null) {
            final String d = this.D;
            this.D = null;
            return d;
        }
        return this.y.readLine();
    }
    
    @Override
    protected void c(final String s, final String s2) {
        super.c(s, s2);
    }
    
    @Override
    protected String d() {
        final boolean b = o.b;
        if (g.j) {
            g.j = false;
            return g.q;
        }
        StringBuilder sb = null;
        String line = null;
        Label_0229: {
            while (true) {
                line = this.y.readLine();
                if (line == null) {
                    if (sb != null) {
                        return sb.toString();
                    }
                    if (this.D != null) {
                        final String d = this.D;
                        this.D = null;
                        return d;
                    }
                    throw new a(h.E[6]);
                }
                else if (line.length() == 0) {
                    if (sb != null) {
                        return sb.toString();
                    }
                    if (this.D != null) {
                        final String d2 = this.D;
                        this.D = null;
                        return d2;
                    }
                    continue;
                }
                else if (line.charAt(0) == ' ' || line.charAt(0) == '\t') {
                    if (sb != null) {
                        sb.append(line.substring(1));
                        if (!b) {
                            continue;
                        }
                    }
                    if (this.D == null) {
                        break;
                    }
                    sb = new StringBuilder();
                    sb.append(this.D);
                    this.D = null;
                    sb.append(line.substring(1));
                    if (b) {
                        break;
                    }
                    continue;
                }
                else {
                    if (this.D != null) {
                        break Label_0229;
                    }
                    this.D = line;
                    if (sb != null) {
                        return sb.toString();
                    }
                    continue;
                }
            }
            throw new a(h.E[7]);
        }
        final String d3 = this.D;
        this.D = line;
        return d3;
    }
    
    @Override
    protected boolean d(final String s) {
        if (!h.B.contains(s) && !h.C.contains(s) && !s.startsWith(h.E[1]) && !this.g.contains(s)) {
            this.g.add(s);
        }
        return true;
    }
    
    @Override
    protected String f(final String s) {
        final boolean b = o.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        do {
            final String c = this.c();
            if (c == null) {
                throw new a(h.E[0]);
            }
            if (c.length() == 0 && !b) {
                break;
            }
            if (!c.startsWith(" ") && !c.startsWith("\t")) {
                this.D = c;
                if (!b) {
                    break;
                }
            }
            sb.append(c);
        } while (!b);
        return sb.toString();
    }
    
    @Override
    protected String g() {
        return h.E[2];
    }
    
    @Override
    protected void g(final String s) {
        try {
            super.g(s);
        }
        catch (a a3) {
            final String[] split = s.split("=", 2);
            try {
                Label_0041: {
                    if (split.length != 2) {
                        break Label_0041;
                    }
                    try {
                        this.c(split[0], split[1]);
                        if (o.b) {
                            throw new a(h.E[4] + s);
                        }
                    }
                    catch (a a) {
                        throw a;
                    }
                }
            }
            catch (a a2) {
                throw a2;
            }
        }
    }
    
    @Override
    protected String i(final String s) {
        final boolean b = o.b;
        final StringBuilder sb = new StringBuilder();
        final int length = s.length();
        int i = 0;
        while (i < length) {
            final char char1 = s.charAt(i);
            Label_0109: {
                if (char1 == '\\' && i < length - 1) {
                    ++i;
                    final char char2 = s.charAt(i);
                    Label_0098: {
                        if (char2 == 'n' || char2 == 'N') {
                            sb.append(h.E[3]);
                            if (!b) {
                                break Label_0098;
                            }
                        }
                        sb.append(char2);
                    }
                    if (!b) {
                        break Label_0109;
                    }
                }
                sb.append(char1);
            }
            ++i;
            if (b) {
                break;
            }
        }
        return sb.toString();
    }
    
    @Override
    protected void j(final String s) {
        final boolean b = o.b;
        final String[] split = s.split(",");
        this.h.c(h.E[9]);
        final int length = split.length;
        int i = 0;
        while (i < length) {
            final String s2 = split[i];
            Label_0124: {
                if (s2.length() >= 2 && s2.startsWith("\"") && s2.endsWith("\"")) {
                    this.h.e(s2.substring(1, -1 + s2.length()));
                    if (!b) {
                        break Label_0124;
                    }
                }
                this.h.e(s2.replaceAll(h.E[10], ""));
            }
            ++i;
            if (b) {
                break;
            }
        }
    }
    
    @Override
    protected boolean m(final String s) {
        return h.A.contains(s.toUpperCase());
    }
    
    @Override
    protected void n(final String s) {
        throw new a(h.E[5]);
    }
}
