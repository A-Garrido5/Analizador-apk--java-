import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.a;

// 
// Decompiled by Procyon v0.5.30
// 

public final class n extends a
{
    protected final n c;
    protected l d;
    protected n e;
    protected String f;
    protected Object g;
    protected int h;
    protected int i;
    
    public n(final n c, final l d, final int a, final int h, final int i) {
        this.e = null;
        this.c = c;
        this.d = d;
        this.a = a;
        this.h = h;
        this.i = i;
        this.b = -1;
    }
    
    public static n a(final l l) {
        return new n(null, l, 0, 1, 0);
    }
    
    private void a(final l l, final String s) {
        if (l.a(s)) {
            throw new JsonParseException("Duplicate field '" + s + "'", l.c());
        }
    }
    
    public JsonLocation a(final Object o) {
        return new JsonLocation(o, -1L, this.h, this.i);
    }
    
    public n a(final int n, final int n2) {
        final n e = this.e;
        if (e == null) {
            l a;
            if (this.d == null) {
                a = null;
            }
            else {
                a = this.d.a();
            }
            return this.e = new n(this, a, 1, n, n2);
        }
        e.a(1, n, n2);
        return e;
    }
    
    protected void a(final int a, final int h, final int i) {
        this.a = a;
        this.b = -1;
        this.h = h;
        this.i = i;
        this.f = null;
        this.g = null;
        if (this.d != null) {
            this.d.b();
        }
    }
    
    public void a(final String f) {
        this.f = f;
        if (this.d != null) {
            this.a(this.d, f);
        }
    }
    
    public n b(final int n, final int n2) {
        final n e = this.e;
        if (e == null) {
            l a;
            if (this.d == null) {
                a = null;
            }
            else {
                a = this.d.a();
            }
            return this.e = new n(this, a, 2, n, n2);
        }
        e.a(2, n, n2);
        return e;
    }
    
    public String g() {
        return this.f;
    }
    
    public n h() {
        return this.c;
    }
    
    public boolean i() {
        final int b = 1 + this.b;
        this.b = b;
        return this.a != 0 && b > 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(64);
        switch (this.a) {
            case 0: {
                sb.append("/");
                break;
            }
            case 1: {
                sb.append('[');
                sb.append(this.f());
                sb.append(']');
                break;
            }
            case 2: {
                sb.append('{');
                if (this.f != null) {
                    sb.append('\"');
                    com.fasterxml.jackson.core.io.a.a(sb, this.f);
                    sb.append('\"');
                }
                else {
                    sb.append('?');
                }
                sb.append('}');
                break;
            }
        }
        return sb.toString();
    }
}
