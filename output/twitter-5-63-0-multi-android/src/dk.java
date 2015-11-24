import android.os.Looper;
import com.twitter.library.client.Session;
import android.content.Context;
import android.os.Handler;
import com.twitter.library.service.y;
import com.twitter.library.api.search.z;
import com.twitter.library.client.as;

// 
// Decompiled by Procyon v0.5.30
// 

class dk implements Runnable
{
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ dm d;
    final /* synthetic */ dj e;
    
    dk(final dj e, final String a, final int b, final int c, final dm d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void run() {
        as.a(this.e.b).a(new z(this.e.b, this.e.c, this.a.trim(), this.b, this.c, this.e.e), new dl(this));
    }
}
