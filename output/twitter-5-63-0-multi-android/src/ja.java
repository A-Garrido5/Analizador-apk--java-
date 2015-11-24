import android.view.Choreographer;
import android.annotation.TargetApi;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.5.30
// 

@TargetApi(16)
public class ja extends iz implements Choreographer$FrameCallback
{
    private Choreographer c;
    private boolean d;
    
    public void a() {
        this.a.post((Runnable)new jb(this));
    }
    
    public void b() {
        this.a.post((Runnable)new jc(this));
    }
    
    public void doFrame(final long n) {
        if (this.d) {
            this.b.c_(n);
            this.c.postFrameCallback((Choreographer$FrameCallback)this);
        }
    }
}
