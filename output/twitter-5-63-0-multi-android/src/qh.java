import com.twitter.library.av.playback.aw;
import com.twitter.library.av.model.c;
import com.twitter.android.av.t;
import com.twitter.library.av.model.a;
import com.twitter.library.av.playback.AVPlayer;

// 
// Decompiled by Procyon v0.5.30
// 

public class qh implements qj
{
    boolean a;
    final boolean b;
    private final AVPlayer c;
    private final a d;
    
    public qh(final AVPlayer avPlayer, final a a) {
        this(avPlayer, a, t.a() && !com.twitter.library.av.model.c.a(a));
    }
    
    qh(final AVPlayer c, final a d, final boolean b) {
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public void a() {
        this.a = false;
    }
    
    @Override
    public void a(final aw aw, final long n) {
        if (!this.a && this.b && !this.c.f()) {
            this.a = true;
            this.c.a("play_from_tap", null, this.d);
        }
    }
    
    @Override
    public boolean b() {
        return true;
    }
}
