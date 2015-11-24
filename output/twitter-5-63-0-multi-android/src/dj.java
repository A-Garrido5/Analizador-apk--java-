import android.os.Looper;
import com.twitter.library.client.Session;
import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.5.30
// 

public class dj
{
    private final Handler a;
    private final Context b;
    private final Session c;
    private final long d;
    private final String e;
    private Runnable f;
    
    public dj(final Context context, final Session c, final long d, final String e) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = context.getApplicationContext();
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public void a() {
        synchronized (this) {
            if (this.f != null) {
                this.a.removeCallbacks(this.f);
                this.f = null;
            }
        }
    }
    
    public void a(final String s, final int n, final int n2, final dm dm) {
        synchronized (this) {
            this.a();
            this.f = new dk(this, s, n, n2, dm);
            this.a.postDelayed(this.f, this.d);
        }
    }
}
