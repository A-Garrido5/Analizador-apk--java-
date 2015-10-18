import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.bc;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class ng extends c
{
    private int a;
    private int e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;
    private int j;
    private long[] k;
    
    public ng(final Context context, final Session session, final int a, final long f, final long g, final int e, final boolean h, final boolean i) {
        super(context, ng.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    protected e a() {
        final String a = this.V().a(1, this.a, this.f, this.e);
        f f = null;
        switch (this.a) {
            default: {
                throw new IllegalStateException("Unknown user type: " + this.a);
            }
            case 4:
            case 6: {
                f = this.M().a(new Object[] { "lists", "members" });
                break;
            }
            case 5: {
                f = this.M().a(new Object[] { "lists", "subscribers" });
                break;
            }
        }
        f.a("list_id", this.g);
        f.a("include_user_entities", this.h);
        f.a("skip_status", this.i);
        if (a != null) {
            f.a("cursor", a);
        }
        return f.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        int n = 0;
        if (httpOperation.j()) {
            final bc bc = (bc)bg.a();
            if (bc == null) {
                httpOperation.l().a = 0;
            }
            else {
                final ArrayList b = bc.b();
                final int size = b.size();
                if (size > 0) {
                    this.k = new long[size];
                    for (final TwitterUser twitterUser : b) {
                        final long[] k = this.k;
                        final int n2 = n + 1;
                        k[n] = twitterUser.a();
                        n = n2;
                    }
                    final b w = this.W();
                    final com.twitter.library.provider.bg v = this.V();
                    final long f = this.f;
                    final int a = this.a;
                    final long g = this.g;
                    String s;
                    if (this.e == 0) {
                        s = "-1";
                    }
                    else {
                        s = null;
                    }
                    this.j = v.a(b, f, a, g, s, bc.a(), true, w);
                    w.a();
                }
            }
        }
    }
    
    public int b() {
        return this.j;
    }
    
    protected bg e() {
        return bg.a(21);
    }
}
