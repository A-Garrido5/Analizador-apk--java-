import android.text.TextUtils;
import com.twitter.library.service.f;
import com.twitter.library.service.d;
import java.util.ArrayList;
import com.twitter.library.provider.b;
import java.util.Collection;
import com.twitter.library.api.bc;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class ne extends i
{
    private int a;
    private int e;
    private long f;
    private String h;
    private boolean i;
    private boolean j;
    private int k;
    
    public ne(final Context context, final Session session) {
        super(context, ne.class.getName(), session);
        this.i = true;
    }
    
    public ne(final Context context, final ab ab) {
        super(context, ne.class.getName(), ab);
        this.i = true;
    }
    
    public ne a(final long f) {
        this.f = f;
        return this;
    }
    
    public ne a(final String h) {
        this.h = h;
        return this;
    }
    
    public ne a(final boolean i) {
        this.i = i;
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final bc bc = (bc)bg.a();
            if (bc != null) {
                this.j = (bc.b().isEmpty() && "0".equals(bc.a()));
                final b w = this.W();
                final com.twitter.library.provider.bg v = this.V();
                final ArrayList b = bc.b();
                final long f = this.f;
                final int a = this.a;
                final String a2 = bc.a();
                final int e = this.e;
                boolean b2 = false;
                if (e == 0) {
                    b2 = true;
                }
                v.a(b, f, a, a2, b2, this.i, w);
                w.a();
                return;
            }
            httpOperation.l().a = 0;
        }
    }
    
    @Override
    protected f b() {
        final f b = this.M().b(new Object[] { "lists" });
        switch (this.a) {
            default: {
                throw new IllegalArgumentException("Invalid list type: " + this.a);
            }
            case 0: {
                b.a(new Object[] { "ownerships" });
                break;
            }
            case 1: {
                b.a(new Object[] { "memberships" });
                break;
            }
            case 2: {
                b.a(new Object[] { "subscriptions" });
                break;
            }
        }
        if (this.f > 0L) {
            b.a("user_id", this.f);
        }
        if (!TextUtils.isEmpty((CharSequence)this.h)) {
            b.a("screen_name", this.h);
        }
        if (this.k > 0) {
            b.a("count", this.k);
        }
        final String a = this.V().a(2, this.a, this.f, this.e);
        if (a != null) {
            b.a("cursor", a);
        }
        return b;
    }
    
    public ne c(final int a) {
        this.a = a;
        return this;
    }
    
    public ne d(final int e) {
        this.e = e;
        return this;
    }
    
    public ne e(final int k) {
        this.k = k;
        return this;
    }
    
    public boolean e() {
        return this.j;
    }
    
    protected bg f() {
        int n = 1;
        switch (this.a) {
            default: {
                throw new IllegalArgumentException("Invalid list type: " + this.a);
            }
            case 0: {
                if (this.f == this.P().c) {
                    break;
                }
                n = 0;
                break;
            }
            case 1: {
                n = 0;
                break;
            }
            case 2: {
                if (this.f != this.P().c) {
                    n = 0;
                    break;
                }
                break;
            }
        }
        return bg.a(false, n);
    }
}
