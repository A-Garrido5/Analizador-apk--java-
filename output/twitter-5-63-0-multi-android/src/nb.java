import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.be;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class nb extends c
{
    private final long a;
    private final long e;
    private final String f;
    private final String g;
    private final int h;
    
    private nb(final Context context, final Session session, final long a, final long e, final String f, final int h, final String g) {
        super(context, nb.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.h = h;
        this.g = g;
    }
    
    public static nb a(final Context context, final Session session, final long n, final long n2, final String s, final int n3, final String s2) {
        return new nb(context, session, n, n2, s, n3, s2);
    }
    
    public static nb a(final Context context, final Session session, final long n, final String s, final int n2, final String s2) {
        return new nb(context, session, 0L, n, s, n2, s2);
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a("name", this.f);
        if (this.a == 0L) {
            a.a(new Object[] { "lists", "create" });
        }
        else {
            a.a(new Object[] { "lists", "update" }).a("list_id", this.a);
        }
        switch (this.h) {
            case 0: {
                a.a("mode", "public");
                break;
            }
            case 1: {
                a.a("mode", "private");
                break;
            }
        }
        if (this.g != null) {
            a.a("description", this.g);
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final be be = (be)bg.a();
            final ArrayList<be> list = new ArrayList<be>();
            list.add(be);
            final b w = this.W();
            this.V().a(list, this.e, 0, null, false, w);
            w.a();
        }
    }
    
    protected bg b() {
        return bg.a(true, 1);
    }
}
