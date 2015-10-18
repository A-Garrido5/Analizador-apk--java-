import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

public class lr
{
    private List a;
    
    public lr() {
        this.a = new ArrayList();
    }
    
    public lq a() {
        return new lq(this.a);
    }
    
    public lr a(final Object o) {
        this.a.add(o);
        return this;
    }
}
