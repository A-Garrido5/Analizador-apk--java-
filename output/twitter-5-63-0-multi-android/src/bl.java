import java.io.IOException;

// 
// Decompiled by Procyon v0.5.30
// 

public class bl
{
    public static final bl a;
    private long b;
    
    static {
        a = new bm();
    }
    
    public boolean a() {
        return System.nanoTime() - this.b >= 0L;
    }
    
    public void b() {
        if (this.a()) {
            throw new IOException("Deadline reached");
        }
    }
}
