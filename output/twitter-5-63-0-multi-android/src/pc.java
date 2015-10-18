import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import java.util.List;
import com.twitter.library.network.ae;
import com.twitter.library.api.timeline.w;
import java.util.Collection;
import java.util.Collections;
import com.twitter.library.api.z;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import java.util.Iterator;
import com.twitter.library.api.bd;
import java.util.ArrayList;
import java.util.Locale;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.ar;
import com.twitter.library.provider.bg;
import com.twitter.library.provider.b;

// 
// Decompiled by Procyon v0.5.30
// 

class pc implements Runnable
{
    final /* synthetic */ pb a;
    
    pc(final pb a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final b a = this.a.W();
        final bg d = this.a.t;
        final long b = this.a.a;
        int n;
        if (this.a.g) {
            n = 256;
        }
        else {
            n = 1;
        }
        d.a(b, n, a, true, this.a.P().c);
        a.a();
    }
}
