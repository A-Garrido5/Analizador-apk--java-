import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class iz
{
    protected final Handler a;
    protected jd b;
    
    public iz() {
        this.a = new Handler(Looper.getMainLooper());
    }
    
    abstract void a();
    
    public void a(final jd b) {
        this.b = b;
    }
    
    abstract void b();
}
