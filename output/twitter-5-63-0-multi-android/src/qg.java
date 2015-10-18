import com.twitter.library.av.playback.aw;
import com.twitter.android.av.t;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.model.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class qg implements qj
{
    boolean a;
    boolean b;
    private final qk c;
    private final qh d;
    private final a e;
    private final AVPlayer f;
    
    public qg(final AVPlayer avPlayer, final a a) {
        this(avPlayer, a, new qk(avPlayer, a), new qh(avPlayer, a), t.a());
    }
    
    qg(final AVPlayer f, final a e, final qk c, final qh d, final boolean b) {
        this.f = f;
        this.e = e;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public void a() {
        this.c.a();
        this.d.a();
        this.a = false;
    }
    
    @Override
    public void a(final aw aw, final long n) {
        this.c.a(aw, n);
        this.d.a(aw, n);
        if (!this.a && this.b && (this.c.c || this.d.a)) {
            this.a = true;
            this.f.a("video_view", null, this.e);
        }
    }
    
    @Override
    public boolean b() {
        return this.a;
    }
}
