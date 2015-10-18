import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.5.30
// 

class iw implements Runnable
{
    final /* synthetic */ iv a;
    
    iw(final iv a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.r()) {
            this.a.o();
        }
        this.a.b.postDelayed((Runnable)this, (long)this.a.g());
    }
}
