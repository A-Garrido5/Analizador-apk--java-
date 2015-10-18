import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.List;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import java.util.Collection;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class qb extends c
{
    private final ArrayList a;
    private ArrayList e;
    private ArrayList f;
    
    public qb(final Context context, final Session session) {
        super(context, qb.class.getName(), session);
        this.a = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "users", "lookup" }).a("include_user_entities", true);
        final int size = this.e.size();
        final int size2 = this.f.size();
        if (size > 0) {
            a.a("user_id", this.e);
        }
        if (size2 > 0) {
            a.a("screen_name", this.f);
        }
        return a.a();
    }
    
    public qb a(final Collection collection) {
        this.e.addAll(collection);
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final List list = (List)bg.a();
            final b w = this.W();
            this.V().a(list, this.P().c, -1, -1L, "-1", null, true, w);
            w.a();
            this.a.addAll(list);
        }
    }
    
    protected bg b() {
        return bg.a(22);
    }
    
    public qb b(final Collection collection) {
        this.f.addAll(collection);
        return this;
    }
    
    @Override
    protected boolean c(final aa aa) {
        return this.e.size() + this.f.size() != 0;
    }
    
    public List e() {
        return this.a;
    }
}
