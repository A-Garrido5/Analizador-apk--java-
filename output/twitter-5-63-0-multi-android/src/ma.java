import com.twitter.library.service.f;
import com.twitter.library.service.d;
import java.util.Iterator;
import java.util.List;
import com.twitter.library.network.ae;
import com.twitter.library.provider.k;
import android.database.ContentObserver;
import com.twitter.library.provider.b;
import com.twitter.library.client.t;
import com.twitter.library.service.y;
import com.twitter.library.provider.af;
import com.twitter.library.api.az;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.api.timeline.ak;

// 
// Decompiled by Procyon v0.5.30
// 

public class ma extends ak
{
    public static final String a;
    private final int e;
    private ArrayList f;
    private int h;
    private boolean i;
    
    static {
        a = ma.class.getName();
    }
    
    public ma(final Context context, final Session session, final int n) {
        this(context, new ab(session), n);
    }
    
    public ma(final Context context, final ab ab, final int e) {
        super(context, ma.a, ab);
        this.i = true;
        this.e = e;
    }
    
    public final ma a(final String s) {
        return (ma)this.b("scribe_event", s);
    }
    
    public ma a(final boolean i) {
        this.i = i;
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        int n9;
        if (httpOperation.k()) {
            final ArrayList list = (ArrayList)bg.a();
            final ab p3 = this.P();
            final long c = p3.c;
            final long j = this.J();
            final long n = this.I();
            final long h = this.H();
            final long n2 = lcmp(j, 0L);
            int n3 = 0;
            if (n2 > 0) {
                int n4;
                if (list.size() == n) {
                    n4 = 1;
                }
                else {
                    n4 = 0;
                }
                int i = -1 + list.size();
                n3 = n4;
                while (i >= 0) {
                    int n5;
                    if (list.get(i).c <= j) {
                        list.remove(i);
                        n5 = 0;
                    }
                    else {
                        n5 = n3;
                    }
                    --i;
                    n3 = n5;
                }
            }
            final int n6 = n3;
            final com.twitter.library.provider.bg v = this.V();
            final b w = this.W();
            int n7;
            if (h > 0L && v.h(h, this.e) > 0) {
                n7 = 1;
            }
            else {
                n7 = 0;
            }
            final boolean b = h > 0L;
            final ArrayList a = v.a(list, c, this.e, b, b && list.size() < n && n7 == 0, w);
            w.a();
            this.f = a;
            final int size = a.size();
            if (size > 0 && n6 != 0) {
                final az az = a.get(size - 1);
                if (az != null) {
                    v.a(az.c - 1L, j, az.b - 1L, this.e);
                }
            }
            long a2 = 0L;
            final String e = p3.e;
            final boolean a3 = af.a(this.e);
            boolean b2 = false;
            if (a3) {
                final boolean k = this.i;
                b2 = false;
                if (k) {
                    final aa s = ((lz)new lz(this.p, this.P()).a(this)).S();
                    if (s.a()) {
                        t.a(this.p, e, s.c.getLong("act_read_pos"));
                    }
                    a2 = t.a(this.p, e);
                    b2 = (v.a(this.e, a2, (b)null) > 0);
                }
            }
            if (size > 0 || n7 != 0 || n6 != 0) {
                this.p.getContentResolver().notifyChange(af.a, (ContentObserver)null);
            }
            if (af.a(this.e) && !b && size > 0 && this.i) {
                final Iterator<az> iterator = a.iterator();
                int h2 = 0;
                while (iterator.hasNext()) {
                    final az az2 = iterator.next();
                    if (az2.b > a2) {
                        int n8 = 0;
                        switch (az2.a) {
                            default: {
                                n8 = h2;
                                break;
                            }
                            case 2:
                            case 3: {
                                n8 = (h2 | 0x1);
                                break;
                            }
                            case 1: {
                                n8 = (h2 | 0x2);
                                break;
                            }
                            case 5: {
                                n8 = (h2 | 0x4);
                                break;
                            }
                            case 4: {
                                n8 = (h2 | 0x8);
                                break;
                            }
                            case 6: {
                                n8 = (h2 | 0x10);
                                break;
                            }
                            case 15: {
                                n8 = (h2 | 0x200);
                                break;
                            }
                        }
                        h2 = n8;
                    }
                }
                this.h = h2;
                com.twitter.library.provider.k.a(this.p).a(e, h2, w);
                w.a();
                b2 = true;
            }
            if (b2) {
                com.twitter.library.provider.k.a(this.p).a(e, "unread_interactions", v.e(this.e), w);
                w.a();
            }
            aa.c.putInt("scribe_item_count", size);
            n9 = size;
        }
        else {
            this.o.putIntArray("custom_errors", ae.a((List)bg.a()));
            n9 = 0;
        }
        this.o.putInt("count", n9);
    }
    
    public ArrayList e() {
        return this.f;
    }
    
    public int f() {
        return this.h;
    }
    
    @Override
    protected f g() {
        long n = this.J();
        final long h = this.H();
        if (n == 0L && h == 0L) {
            n = this.V().b(this.e);
            this.c(n);
        }
        final f m = this.M();
        if (1 == this.e) {
            m.a(new Object[] { "activity", "by_friends" });
        }
        else {
            m.a(new Object[] { "activity", "about_me" });
            switch (this.e) {
                case 2: {
                    m.a("filters", "filtered");
                    break;
                }
                case 3: {
                    m.a("filters", "following");
                    break;
                }
                case 4: {
                    m.a("filters", "verified");
                    break;
                }
            }
        }
        m.a("model_version", 7L);
        m.a("send_error_codes", true);
        if (n > 0L) {
            m.a("latest_results", true);
        }
        return m;
    }
    
    protected bg t() {
        return bg.a(27);
    }
}
