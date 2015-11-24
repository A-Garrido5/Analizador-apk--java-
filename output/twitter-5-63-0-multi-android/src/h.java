import com.fasterxml.jackson.core.JsonGenerator$Feature;
import com.fasterxml.jackson.core.b;
import com.fasterxml.jackson.core.JsonGenerator;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class h extends JsonGenerator
{
    protected static final int b;
    protected b c;
    protected int d;
    protected boolean e;
    protected o f;
    protected boolean g;
    
    static {
        b = (JsonGenerator$Feature.e.c() | JsonGenerator$Feature.h.c() | JsonGenerator$Feature.i.c());
    }
    
    protected h(final int d, final b c) {
        this.d = d;
        this.c = c;
        l a;
        if (JsonGenerator$Feature.i.a(d)) {
            a = l.a(this);
        }
        else {
            a = null;
        }
        this.f = o.a(a);
        this.e = JsonGenerator$Feature.e.a(d);
    }
    
    protected final int a(final int n, final int n2) {
        if (n2 < 56320 || n2 > 57343) {
            this.f("Incomplete surrogate pair: first char 0x" + Integer.toHexString(n) + ", second 0x" + Integer.toHexString(n2));
        }
        return 65536 + (n - 55296 << 10) + (n2 - 56320);
    }
    
    public final boolean a(final JsonGenerator$Feature jsonGenerator$Feature) {
        return (this.d & jsonGenerator$Feature.c()) != 0x0;
    }
    
    @Override
    public void close() {
        this.g = true;
    }
    
    public final o g() {
        return this.f;
    }
    
    protected abstract void g(final String p0);
    
    protected abstract void h();
}
