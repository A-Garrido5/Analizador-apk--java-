// 
// Decompiled by Procyon v0.5.30
// 

public class jg extends iz implements Runnable
{
    public void a() {
        this.a.postDelayed((Runnable)this, 16L);
    }
    
    public void b() {
        this.a.removeCallbacks((Runnable)this);
    }
    
    @Override
    public void run() {
        this.b.c_(System.nanoTime());
        this.a.postDelayed((Runnable)this, 16L);
    }
}
