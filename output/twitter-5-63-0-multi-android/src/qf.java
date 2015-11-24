import com.twitter.library.av.playback.aw;
import com.twitter.library.av.playback.AVPlayer;

// 
// Decompiled by Procyon v0.5.30
// 

public class qf implements qj
{
    final boolean[] a;
    private final AVPlayer b;
    
    qf(final AVPlayer b) {
        this.a = new boolean[20];
        this.b = b;
    }
    
    @Override
    public void a() {
        for (int i = 0; i < this.a.length; ++i) {
            this.a[i] = false;
        }
    }
    
    @Override
    public void a(final aw aw, final long n) {
        if (n % 50L == 0L || aw.c == 100) {
            final int min = Math.min(-1 + this.a.length, Math.max(aw.c / 5, 0));
            final AVPlayer b = this.b;
            final int n2 = min * 5;
            final boolean b2 = this.a[min];
            boolean b3 = false;
            if (!b2) {
                b3 = true;
            }
            b.a(aw, n2, b3);
            this.a[min] = true;
        }
    }
    
    @Override
    public boolean b() {
        return true;
    }
}
