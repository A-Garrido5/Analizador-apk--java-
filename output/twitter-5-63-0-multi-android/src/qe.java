import com.twitter.library.av.playback.aw;
import com.twitter.library.av.playback.AVPlayer;

// 
// Decompiled by Procyon v0.5.30
// 

public class qe implements qj
{
    volatile long a;
    private final AVPlayer b;
    
    qe(final AVPlayer b) {
        this.b = b;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final aw aw, final long a) {
        if (a >= 0L && this.a >= 0L && a - this.a >= 30000L) {
            this.a = a;
            this.b.a("checkpoint");
        }
    }
    
    @Override
    public boolean b() {
        return true;
    }
}
