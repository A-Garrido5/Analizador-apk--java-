import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.5.30
// 

public class yv
{
    private final AtomicBoolean a;
    private final String b;
    
    public yv(final String b) {
        this.a = new AtomicBoolean(true);
        this.b = b;
    }
    
    public void a() {
        if (this.b() && this.a.get()) {
            throw new IllegalStateException("Locked: Add a " + this.b + " test rule to acquire");
        }
    }
    
    boolean b() {
        return yw.b();
    }
}
