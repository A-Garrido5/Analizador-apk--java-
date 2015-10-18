import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator$Feature;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.io.a;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.b;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class m extends h
{
    protected static final int[] h;
    protected final b i;
    protected int[] j;
    protected int k;
    protected CharacterEscapes l;
    protected d m;
    
    static {
        h = a.f();
    }
    
    public m(final b i, final int n, final com.fasterxml.jackson.core.b b) {
        super(n, b);
        this.j = m.h;
        this.m = DefaultPrettyPrinter.a;
        this.i = i;
        if (this.a(JsonGenerator$Feature.h)) {
            this.a(127);
        }
    }
    
    @Override
    public JsonGenerator a(int k) {
        if (k < 0) {
            k = 0;
        }
        this.k = k;
        return this;
    }
    
    @Override
    public JsonGenerator a(final d m) {
        this.m = m;
        return this;
    }
    
    @Override
    public JsonGenerator a(final CharacterEscapes l) {
        this.l = l;
        if (l == null) {
            this.j = m.h;
            return this;
        }
        this.j = l.a();
        return this;
    }
    
    @Override
    public final void a(final String s, final String s2) {
        this.a(s);
        this.b(s2);
    }
}
