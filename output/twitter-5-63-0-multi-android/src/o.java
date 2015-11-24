import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class o extends a
{
    protected final o c;
    protected l d;
    protected o e;
    protected String f;
    protected Object g;
    protected boolean h;
    
    protected o(final int a, final o c, final l d) {
        this.e = null;
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = -1;
    }
    
    public static o a(final l l) {
        return new o(0, null, l);
    }
    
    private final void a(final l l, final String s) {
        if (l.a(s)) {
            throw new JsonGenerationException("Duplicate field '" + s + "'");
        }
    }
    
    public int a(final String f) {
        int h = 1;
        if (this.h) {
            h = 4;
        }
        else {
            this.h = (h != 0);
            this.f = f;
            if (this.d != null) {
                this.a(this.d, f);
            }
            if (this.b < 0) {
                return 0;
            }
        }
        return h;
    }
    
    protected o a(final int a) {
        this.a = a;
        this.b = -1;
        this.f = null;
        this.h = false;
        this.g = null;
        if (this.d != null) {
            this.d.b();
        }
        return this;
    }
    
    protected void a(final StringBuilder sb) {
        if (this.a == 2) {
            sb.append('{');
            if (this.f != null) {
                sb.append('\"');
                sb.append(this.f);
                sb.append('\"');
            }
            else {
                sb.append('?');
            }
            sb.append('}');
            return;
        }
        if (this.a == 1) {
            sb.append('[');
            sb.append(this.f());
            sb.append(']');
            return;
        }
        sb.append("/");
    }
    
    public o g() {
        final o e = this.e;
        if (e == null) {
            l a;
            if (this.d == null) {
                a = null;
            }
            else {
                a = this.d.a();
            }
            return this.e = new o(1, this, a);
        }
        return e.a(1);
    }
    
    public o h() {
        final o e = this.e;
        if (e == null) {
            l a;
            if (this.d == null) {
                a = null;
            }
            else {
                a = this.d.a();
            }
            return this.e = new o(2, this, a);
        }
        return e.a(2);
    }
    
    public final o i() {
        return this.c;
    }
    
    public int j() {
        int n;
        if (this.a == 2) {
            this.h = false;
            ++this.b;
            n = 2;
        }
        else if (this.a == 1) {
            final int b = this.b;
            ++this.b;
            n = 0;
            if (b >= 0) {
                return 1;
            }
        }
        else {
            ++this.b;
            final int b2 = this.b;
            n = 0;
            if (b2 != 0) {
                return 3;
            }
        }
        return n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(64);
        this.a(sb);
        return sb.toString();
    }
}
