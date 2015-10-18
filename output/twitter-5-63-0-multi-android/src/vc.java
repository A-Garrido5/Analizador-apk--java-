import java.util.Set;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class vc
{
    protected HashMap a;
    
    public vc() {
        this.a = new HashMap();
    }
    
    public static vc a(final HashMap hashMap) {
        return new vo(hashMap);
    }
    
    public Object a(final String s) {
        return this.a.get(s);
    }
    
    public Object a(final String s, final Class clazz) {
        return clazz.cast(this.a.get(s));
    }
    
    public Set a() {
        return this.a.keySet();
    }
}
