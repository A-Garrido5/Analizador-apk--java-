import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonGenerator;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.5.30
// 

public class l
{
    protected final Object a;
    protected String b;
    protected String c;
    protected HashSet d;
    
    private l(final Object a) {
        this.a = a;
    }
    
    public static l a(final JsonGenerator jsonGenerator) {
        return new l(jsonGenerator);
    }
    
    public static l a(final JsonParser jsonParser) {
        return new l(jsonParser);
    }
    
    public l a() {
        return new l(this.a);
    }
    
    public boolean a(final String s) {
        boolean b = true;
        if (this.b == null) {
            this.b = s;
            b = false;
        }
        else if (!s.equals(this.b)) {
            if (this.c == null) {
                this.c = s;
                return false;
            }
            if (!s.equals(this.c)) {
                if (this.d == null) {
                    (this.d = new HashSet(16)).add(this.b);
                    this.d.add(this.c);
                }
                if (this.d.add(s)) {
                    return false;
                }
            }
        }
        return b;
    }
    
    public void b() {
        this.b = null;
        this.c = null;
        this.d = null;
    }
    
    public JsonLocation c() {
        if (this.a instanceof JsonParser) {
            return ((JsonParser)this.a).f();
        }
        return null;
    }
}
