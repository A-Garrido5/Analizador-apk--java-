import android.view.View;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeAssociation;
import java.util.Iterator;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.App;
import com.twitter.library.client.s;
import com.twitter.library.card.instance.CardInstanceData;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.DisplayMode;
import java.lang.ref.WeakReference;
import com.twitter.library.client.r;

// 
// Decompiled by Procyon v0.5.30
// 

public class ux implements r
{
    final WeakReference a;
    final DisplayMode b;
    final vc c;
    final String d;
    final long e;
    boolean f;
    vp g;
    
    ux(final Activity activity, final DisplayMode b, final long n, final String d, final vc c) {
        this.a = new WeakReference((T)activity);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = -1L;
    }
    
    public static ux a(final Activity activity, final CardInstanceData cardInstanceData) {
        if (activity != null) {
            if (!s.class.isAssignableFrom(activity.getClass())) {
                if (App.f()) {
                    throw new IllegalArgumentException("Not assignable from ActivityListenerRegistry");
                }
            }
            else if (cardInstanceData != null) {
                final String name = cardInstanceData.name;
                final DisplayMode d = DisplayMode.d;
                final vc u = cardInstanceData.u();
                uy.a().c(-1L, u);
                final wh a = wh.a();
                final Iterator<String> iterator = cardInstanceData.users.keySet().iterator();
                while (iterator.hasNext()) {
                    final TwitterUser twitterUser = cardInstanceData.users.get(iterator.next());
                    a.c(twitterUser.userId, twitterUser);
                }
                if (vu.a().a(name, d, u)) {
                    return new ux(activity, d, -1L, name, u);
                }
            }
        }
        return null;
    }
    
    public void a() {
        final Activity activity = (Activity)this.a.get();
        if (activity != null) {
            final vr a = vu.a().a(this.d, this.b);
            if (a != null) {
                this.g = a.a(activity, this.b, this.c, null, null);
                ((s)activity).a(this);
                this.g.a(new vq(this.e, this.e, this.c), vb.a(az.a((Context)activity)).a(this.e));
                this.f = true;
            }
        }
    }
    
    @Override
    public void a(final int n, final int n2, final Intent intent) {
    }
    
    @Override
    public void a(final Configuration configuration) {
        if (this.g != null) {
            this.g.a(configuration);
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
    }
    
    @Override
    public void a(final boolean b) {
        this.c();
        if (this.g != null) {
            this.g.b(b);
        }
    }
    
    public void b() {
        if (this.g != null) {
            this.g.a();
        }
    }
    
    @Override
    public void b(final boolean b) {
        if (this.g != null) {
            this.g.a(b);
        }
    }
    
    public void c() {
        if (this.f) {
            final Bundle bundle = new Bundle();
            this.g.a(bundle);
            final Activity activity = (Activity)this.a.get();
            if (activity != null) {
                if (!bundle.isEmpty()) {
                    vb.a(az.a((Context)activity)).a(this.e, bundle);
                }
                ((s)activity).b(this);
            }
            this.f = false;
        }
    }
    
    public View d() {
        if (this.g != null) {
            return this.g.d();
        }
        return null;
    }
    
    @Override
    public void j() {
        if (this.g != null) {
            this.g.ar_();
        }
    }
    
    @Override
    public void k() {
        if (this.g != null) {
            this.g.b();
        }
    }
}
