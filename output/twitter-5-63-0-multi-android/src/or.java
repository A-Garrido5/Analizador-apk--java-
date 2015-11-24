import com.twitter.library.service.d;
import com.twitter.library.api.bp;
import com.twitter.library.network.ae;
import java.util.List;
import com.twitter.library.api.bq;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import java.util.Locale;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.bg;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.ar;
import com.twitter.library.provider.b;

// 
// Decompiled by Procyon v0.5.30
// 

class or implements Runnable
{
    final /* synthetic */ oq a;
    
    or(final oq a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final b a = this.a.W();
        this.a.h.a(this.a.P().c, this.a.a, true, a);
        a.a();
    }
}
