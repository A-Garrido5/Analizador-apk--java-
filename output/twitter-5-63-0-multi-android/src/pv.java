import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.List;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import com.twitter.library.provider.an;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import com.twitter.library.provider.be;
import android.net.Uri;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class pv extends i
{
    private final long a;
    private final int e;
    private final long f;
    private final long h;
    private final Integer i;
    private boolean j;
    private TwitterUser k;
    
    public pv(final Context context, final Session session, final long a, final int e, final long f, final long h, final Integer i) {
        super(context, pv.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
    }
    
    private Uri u() {
        final ab p = this.P();
        long c;
        if (p != null) {
            c = p.c;
        }
        else {
            c = 0L;
        }
        switch (this.e) {
            default: {
                throw new IllegalArgumentException("Unsupported type");
            }
            case 10: {
                return ae.a(ContentUris.withAppendedId(be.y, this.a), c);
            }
            case 20: {
                return ae.a(ContentUris.withAppendedId(be.z, this.a), c);
            }
            case 19: {
                return ContentUris.withAppendedId(be.v, this.a);
            }
            case 9: {
                return ae.a(an.a, c);
            }
        }
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final com.twitter.library.provider.bg v = this.V();
            final b w = this.W();
            if (httpOperation.j()) {
                final List list = (List)bg.a();
                if (!list.isEmpty()) {
                    this.k = list.get(0);
                    if (this.e == 9) {
                        final TwitterUser k = this.k;
                        long c;
                        if (this.P() != null) {
                            c = this.P().c;
                        }
                        else {
                            c = 0L;
                        }
                        this.j = v.a(k, c, this.h, this.i, w);
                    }
                    else if (!(this.j = v.a(this.k, this.a, this.e, this.f, this.h, w))) {
                        this.j = v.a(this.k.userId, this.a, this.e, this.f);
                    }
                    w.a();
                }
            }
        }
    }
    
    @Override
    protected f b() {
        if (this.e != 10 && this.e != 20 && this.e != 19 && this.e != 9) {
            throw new IllegalArgumentException("Unsupported type");
        }
        final f m = this.M();
        final com.twitter.library.provider.bg v = this.V();
        final Uri u = this.u();
        String s;
        String s2;
        String[] array;
        if (this.e == 9) {
            s = "identifier";
            s2 = "type=? AND page=?";
            array = new String[] { String.valueOf(2), String.valueOf(this.i) };
        }
        else {
            s = "user_id";
            array = null;
            s2 = null;
        }
        final long[] a = v.a(u, s, s2, array);
        m.a(new Object[] { "users", "recommendations" });
        m.a("connections", true);
        if (this.i != null) {
            m.a("page", this.i);
        }
        m.a("owner_id", this.a).a("user_type", this.e).a("user_tag", this.f).a("user_id", this.h).a("limit", 1L);
        if (a != null && a.length > 0) {
            m.a("excluded", a);
        }
        String s3 = null;
        switch (this.e) {
            default: {
                throw new IllegalArgumentException("Invalid userType: " + this.e);
            }
            case 10: {
                s3 = "st-component";
                break;
            }
            case 20: {
                s3 = "profile-cluster-follow";
                break;
            }
            case 19: {
                s3 = "welcome-flow-recommendations";
                break;
            }
            case 9: {
                s3 = "wtf-component";
                break;
            }
        }
        m.a("display_location", s3);
        m.a("pc", 1L);
        m.a("include_user_entities", true);
        return m;
    }
    
    protected bg e() {
        return bg.a(7);
    }
    
    public TwitterUser f() {
        return this.k;
    }
    
    public boolean g() {
        return this.j;
    }
    
    public long t() {
        return this.h;
    }
}
