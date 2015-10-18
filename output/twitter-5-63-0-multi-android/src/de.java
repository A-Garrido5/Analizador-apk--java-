import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.search.i;
import com.twitter.library.client.as;
import com.twitter.library.client.Session;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

class de implements Runnable
{
    final /* synthetic */ Context a;
    final /* synthetic */ Session b;
    final /* synthetic */ dg c;
    final /* synthetic */ dd d;
    
    de(final dd d, final Context a, final Session b, final dg c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        as.a(this.a).a(new i(this.a, this.b), new df(this));
    }
}
