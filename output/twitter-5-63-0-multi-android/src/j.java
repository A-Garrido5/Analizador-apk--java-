import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser$Feature;
import com.fasterxml.jackson.core.util.e;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class j extends JsonParser
{
    protected JsonToken K;
    
    protected static final String e(final int n) {
        final char c = (char)n;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + n + ")";
        }
        if (n > 255) {
            return "'" + c + "' (code " + n + " / 0x" + Integer.toHexString(n) + ")";
        }
        return "'" + c + "' (code " + n + ")";
    }
    
    protected void F() {
        this.e(" in " + this.K);
    }
    
    protected void G() {
        this.e(" in a value");
    }
    
    protected final void H() {
        e.a();
    }
    
    protected char a(final char c) {
        if (!this.a(JsonParser$Feature.g) && (c != '\'' || !this.a(JsonParser$Feature.e))) {
            this.f("Unrecognized character escape " + e(c));
            return c;
        }
        return c;
    }
    
    @Override
    public double a(final double n) {
        final JsonToken k = this.K;
        if (k != null) {
            switch (k.a()) {
                case 6: {
                    final String g = this.g();
                    if (this.d(g)) {
                        return 0.0;
                    }
                    return com.fasterxml.jackson.core.io.e.a(g, n);
                }
                case 7:
                case 8: {
                    return this.k();
                }
                case 9: {
                    return 1.0;
                }
                case 10:
                case 11: {
                    return 0.0;
                }
                case 12: {
                    final Object m = this.m();
                    if (m instanceof Number) {
                        return ((Number)m).doubleValue();
                    }
                    break;
                }
            }
        }
        return n;
    }
    
    @Override
    public int a(final int n) {
        final JsonToken k = this.K;
        if (k != null) {
            switch (k.a()) {
                case 6: {
                    final String g = this.g();
                    if (this.d(g)) {
                        return 0;
                    }
                    return com.fasterxml.jackson.core.io.e.a(g, n);
                }
                case 7:
                case 8: {
                    return this.h();
                }
                case 9: {
                    return 1;
                }
                case 10: {
                    return 0;
                }
                case 11: {
                    return 0;
                }
                case 12: {
                    final Object m = this.m();
                    if (m instanceof Number) {
                        return ((Number)m).intValue();
                    }
                    break;
                }
            }
        }
        return n;
    }
    
    @Override
    public long a(final long n) {
        final JsonToken k = this.K;
        if (k != null) {
            switch (k.a()) {
                case 6: {
                    final String g = this.g();
                    if (this.d(g)) {
                        return 0L;
                    }
                    return com.fasterxml.jackson.core.io.e.a(g, n);
                }
                case 7:
                case 8: {
                    return this.i();
                }
                case 9: {
                    return 1L;
                }
                case 10:
                case 11: {
                    return 0L;
                }
                case 12: {
                    final Object m = this.m();
                    if (m instanceof Number) {
                        return ((Number)m).longValue();
                    }
                    break;
                }
            }
        }
        return n;
    }
    
    @Override
    public abstract JsonToken a();
    
    @Override
    public String a(final String s) {
        if (this.K != JsonToken.h && (this.K == null || this.K == JsonToken.m || !this.K.e())) {
            return s;
        }
        return this.g();
    }
    
    protected final void a(final String s, final Throwable t) {
        throw this.b(s, t);
    }
    
    @Override
    public boolean a(final boolean b) {
        boolean b2 = true;
        final JsonToken k = this.K;
        if (k != null) {
            switch (k.a()) {
                case 9: {
                    return b2;
                }
                case 6: {
                    final String trim = this.g().trim();
                    if ("true".equals(trim)) {
                        return b2;
                    }
                    if ("false".equals(trim)) {
                        return false;
                    }
                    if (this.d(trim)) {
                        return false;
                    }
                    break;
                }
                case 7: {
                    if (this.h() == 0) {
                        return false;
                    }
                    return b2;
                }
                case 10:
                case 11: {
                    return false;
                }
                case 12: {
                    final Object m = this.m();
                    if (m instanceof Boolean) {
                        return (boolean)m;
                    }
                    break;
                }
            }
        }
        b2 = b;
        return b2;
    }
    
    protected final JsonParseException b(final String s, final Throwable t) {
        return new JsonParseException(s, this.f(), t);
    }
    
    protected void b(final int n, final String s) {
        if (n < 0) {
            this.F();
        }
        String s2 = "Unexpected character (" + e(n) + ")";
        if (s != null) {
            s2 = s2 + ": " + s;
        }
        this.f(s2);
    }
    
    @Override
    public JsonParser c() {
        if (this.K != JsonToken.b && this.K != JsonToken.d) {
            return this;
        }
        int n = 1;
        while (true) {
            final JsonToken a = this.a();
            if (a == null) {
                this.x();
                return this;
            }
            if (a.c()) {
                ++n;
            }
            else {
                if (a.d() && --n == 0) {
                    return this;
                }
                continue;
            }
        }
    }
    
    protected void c(final int n) {
        this.b(n, "Expected space separating root-level values");
    }
    
    protected void c(final int n, final String s) {
        if (!this.a(JsonParser$Feature.f) || n > 32) {
            this.f("Illegal unquoted character (" + e((char)n) + "): has to be escaped using backslash to be included in " + s);
        }
    }
    
    @Override
    public JsonToken d() {
        return this.K;
    }
    
    protected void d(final int n) {
        this.f("Illegal character (" + e((char)n) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }
    
    protected boolean d(final String s) {
        return "null".equals(s);
    }
    
    protected void e(final String s) {
        this.f("Unexpected end-of-input" + s);
    }
    
    protected final void f(final String s) {
        throw this.b(s);
    }
    
    @Override
    public abstract String g();
    
    protected abstract void x();
}
