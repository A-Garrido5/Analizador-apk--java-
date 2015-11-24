import com.twitter.library.client.az;
import android.os.Bundle;
import android.view.View;
import android.view.View$MeasureSpec;
import java.util.Iterator;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.App;
import com.twitter.library.client.s;
import com.twitter.util.c;
import com.twitter.library.experiments.b;
import com.twitter.library.util.bj;
import com.twitter.library.featureswitch.d;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.app.Activity;
import android.graphics.Rect;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.widget.tweet.content.a;

// 
// Decompiled by Procyon v0.5.30
// 

public final class vs extends a
{
    final DisplayMode a;
    final String b;
    final long c;
    final vc d;
    Rect e;
    
    vs(final Activity activity, final Tweet tweet, final DisplayMode a, final String b, final long c, final vc d, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        super(activity, tweet, twitterScribeAssociation, twitterScribeAssociation2);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static int a(final Context context, final Tweet tweet) {
        int n = bj.a(d.a("cards_forward_max_height", 500.0f));
        if (tweet.H() && b.a() && c.g(context)) {
            n = Math.min(n, b.c(context));
        }
        return n;
    }
    
    public static vs a(final Activity activity, final Tweet tweet, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        if (activity == null) {
            return null;
        }
        if (!s.class.isAssignableFrom(activity.getClass())) {
            if (App.f()) {
                throw new IllegalArgumentException("Not assignable from ActivityListenerRegistry");
            }
            return null;
        }
        else {
            if (tweet == null) {
                return null;
            }
            final CardInstanceData w = tweet.W();
            if (w == null) {
                return null;
            }
            final String name = w.name;
            final long q = tweet.Q;
            final vc u = w.u();
            wc.a().c(tweet.Q, tweet);
            uy.a().c(q, u);
            final wh a = wh.a();
            final Iterator<String> iterator = w.users.keySet().iterator();
            while (iterator.hasNext()) {
                final TwitterUser twitterUser = w.users.get(iterator.next());
                a.c(twitterUser.userId, twitterUser);
            }
            if (!vu.a().a(name, displayMode, u)) {
                return null;
            }
            return new vs(activity, tweet, displayMode, name, q, u, twitterScribeAssociation, twitterScribeAssociation2);
        }
    }
    
    @Override
    public Rect a(final Context context, final int n, final int n2, final int n3, final int n4) {
        final int a = a(context, this.f);
        final View z = this.z();
        int n5;
        int n6;
        if (z == null) {
            final int a2 = this.f.W().a(bj.a);
            n5 = n + n3;
            n6 = n2 + Math.min(a2, a);
        }
        else {
            z.measure(View$MeasureSpec.makeMeasureSpec(n3, 1073741824), View$MeasureSpec.makeMeasureSpec(a, Integer.MIN_VALUE));
            n5 = n + z.getMeasuredWidth();
            n6 = n2 + z.getMeasuredHeight();
        }
        if (this.e == null) {
            this.e = new Rect(n, n2, n5, n6);
        }
        else {
            this.e.set(n, n2, n5, n6);
        }
        return this.e;
    }
    
    protected vp a(final Activity activity) {
        if (this.f.W() == null) {
            return null;
        }
        final vr a = vu.a().a(this.b, this.a);
        if (a == null) {
            return null;
        }
        return a.a(activity, this.a, this.d, this.g, this.h);
    }
    
    @Override
    protected Object b() {
        return new vq(this.f.Q, this.c, this.d);
    }
    
    @Override
    protected void b(final Bundle bundle) {
        final Context context = (Context)this.i.get();
        if (context != null && !bundle.isEmpty()) {
            vb.a(az.a(context)).a(this.c, bundle);
        }
    }
    
    @Override
    protected Bundle c() {
        final Context context = (Context)this.i.get();
        if (context == null) {
            return null;
        }
        return vb.a(az.a(context)).a(this.c);
    }
}
