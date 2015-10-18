import com.twitter.library.provider.b;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.Translation;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class os extends c
{
    private final long a;
    private final String e;
    private Translation f;
    
    public os(final Context context, final Session session, final long a, final String e) {
        super(context, os.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    @Override
    protected e a() {
        return this.M().a(new Object[] { "translations", "show" }).a("id", this.a).a("dest", this.e).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            final Translation f = (Translation)bg.a();
            if (f != null) {
                final b w = this.W();
                this.V().a(f.a, f.b, w);
                w.a();
                this.f = f;
            }
        }
    }
    
    protected bg b() {
        return bg.a(56);
    }
    
    public Translation e() {
        return this.f;
    }
}
