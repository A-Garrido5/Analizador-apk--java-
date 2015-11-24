import com.twitter.library.service.d;
import com.twitter.library.api.bp;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.a;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import com.twitter.library.service.aa;
import com.twitter.library.api.bg;
import android.content.Context;
import com.twitter.library.api.ar;
import com.twitter.library.provider.b;

// 
// Decompiled by Procyon v0.5.30
// 

class on implements Runnable
{
    final /* synthetic */ ol a;
    
    on(final ol a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final b b = this.a.W();
        this.a.g.a(this.a.P().c, this.a.e, false, b);
        b.a();
    }
}
