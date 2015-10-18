import java.util.concurrent.TimeUnit;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

// 
// Decompiled by Procyon v0.5.30
// 

class aq extends Thread
{
    CountDownLatch a;
    boolean b;
    private WeakReference c;
    private long d;
    
    public aq(final ao ao, final long d) {
        this.c = new WeakReference((T)ao);
        this.d = d;
        this.a = new CountDownLatch(1);
        this.b = false;
        this.start();
    }
    
    private void c() {
        final ao ao = (ao)this.c.get();
        if (ao != null) {
            ao.b();
            this.b = true;
        }
    }
    
    public void a() {
        this.a.countDown();
    }
    
    public boolean b() {
        return this.b;
    }
    
    @Override
    public void run() {
        try {
            if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                this.c();
            }
        }
        catch (InterruptedException ex) {
            this.c();
        }
    }
}
