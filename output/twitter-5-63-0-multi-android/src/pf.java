import com.twitter.library.service.d;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.provider.bg;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.ar;
import com.twitter.library.provider.b;

// 
// Decompiled by Procyon v0.5.30
// 

class pf implements Runnable
{
    final /* synthetic */ pe a;
    
    pf(final pe a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final b a = this.a.W();
        this.a.h.b(this.a.a, 1, a, true, this.a.P().c);
        a.a();
    }
}
