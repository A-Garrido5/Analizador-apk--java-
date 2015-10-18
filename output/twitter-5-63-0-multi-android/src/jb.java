import android.annotation.TargetApi;
import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;

// 
// Decompiled by Procyon v0.5.30
// 

class jb implements Runnable
{
    final /* synthetic */ ja a;
    
    jb(final ja a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.d = true;
        if (this.a.c == null) {
            this.a.c = Choreographer.getInstance();
        }
        this.a.c.postFrameCallback((Choreographer$FrameCallback)this.a);
    }
}
