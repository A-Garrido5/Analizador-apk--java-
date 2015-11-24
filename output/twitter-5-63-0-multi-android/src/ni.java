import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.be;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class ni extends c
{
    public be a;
    private final long e;
    private final String f;
    private final String g;
    
    public ni(final Context context, final Session session, final long e, final String f, final String g) {
        super(context, ni.class.getName(), session);
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    protected e a() {
        final f a = this.M().b(new Object[] { "lists" }).a(new Object[] { "show" });
        if (this.e > 0L) {
            a.a("list_id", this.e);
        }
        else {
            a.a("slug", this.g);
            a.a("owner_screen_name", this.f);
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (aa.a()) {
            this.a = (be)bg.a();
        }
    }
    
    protected bg b() {
        return bg.a(true, 0);
    }
}
