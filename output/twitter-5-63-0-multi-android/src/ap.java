// 
// Decompiled by Procyon v0.5.30
// 

public final class ap
{
    private final String a;
    private final boolean b;
    
    public ap(final String a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public String a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b;
    }
    
    @Override
    public String toString() {
        return "{" + this.a + "}" + this.b;
    }
}
