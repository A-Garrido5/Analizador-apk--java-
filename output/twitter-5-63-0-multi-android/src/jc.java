import android.view.Choreographer;
import android.annotation.TargetApi;
import android.view.Choreographer$FrameCallback;

// 
// Decompiled by Procyon v0.5.30
// 

class jc implements Runnable
{
    final /* synthetic */ ja a;
    
    jc(final ja a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.c != null) {
            this.a.c.removeFrameCallback((Choreographer$FrameCallback)this.a);
        }
        this.a.d = false;
    }
}
