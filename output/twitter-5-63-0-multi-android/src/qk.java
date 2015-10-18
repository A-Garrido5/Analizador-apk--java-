import com.twitter.android.av.t;
import com.twitter.library.featureswitch.d;
import com.twitter.library.av.playback.aw;
import com.twitter.library.av.model.a;
import com.twitter.library.av.playback.AVPlayer;

// 
// Decompiled by Procyon v0.5.30
// 

public class qk implements qj
{
    volatile long a;
    volatile long b;
    boolean c;
    boolean d;
    private final AVPlayer e;
    private final a f;
    
    public qk(final AVPlayer e, final a f) {
        this.e = e;
        this.f = f;
    }
    
    @Override
    public void a() {
        this.a = 0L;
        this.c = false;
    }
    
    void a(final aw aw) {
        this.d = true;
        if ("ad".equals(this.f.b())) {
            this.b = aw.b - 1000L;
            return;
        }
        this.b = Math.min(com.twitter.library.featureswitch.d.a("media_autoplay_view_threshold_content_ms", 3000), aw.b - 1000L);
    }
    
    @Override
    public void a(final aw aw, final long n) {
        if (!this.c && t.a()) {
            if (!this.d) {
                this.a(aw);
            }
            if (this.e.P()) {
                this.a += 10L;
            }
            if (this.a >= this.b) {
                this.c = true;
                this.e.a("view_threshold");
            }
        }
    }
    
    @Override
    public boolean b() {
        return true;
    }
}
