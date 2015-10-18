import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.util.Iterator;
import com.twitter.library.service.f;
import android.util.Pair;
import com.twitter.library.service.e;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import android.net.Uri;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

class ur extends c
{
    public vc a;
    public final long e;
    private final ul f;
    private final Uri g;
    private final HttpOperation$RequestMethod h;
    
    public ur(final Context context, final long e, final ul f, final Uri g, final HttpOperation$RequestMethod h) {
        super(context, ur.class.getName(), az.a(context).b());
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    protected e a() {
        final f b = this.M().a(this.h).a((String)null).c(this.g.getScheme()).b(this.g.getAuthority()).b(new Object[] { this.g.getPath() });
        if (this.f != null) {
            for (final Pair pair : this.f) {
                b.a((String)pair.first, (String)pair.second);
            }
        }
        return b.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.a = (vc)bg.a();
        }
    }
    
    protected bg b() {
        return bg.a(98);
    }
}
