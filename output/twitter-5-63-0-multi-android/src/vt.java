import android.view.View;
import com.twitter.library.client.az;
import com.twitter.library.client.r;
import com.twitter.library.client.s;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Intent;
import com.twitter.library.widget.tweet.content.d;
import android.graphics.Rect;
import android.content.Context;
import com.twitter.library.card.instance.CardInstanceData;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.DisplayMode;
import java.lang.ref.WeakReference;
import com.twitter.library.widget.tweet.content.f;

// 
// Decompiled by Procyon v0.5.30
// 

public class vt implements f
{
    final WeakReference a;
    final DisplayMode b;
    final vc c;
    final String d;
    final long e;
    boolean f;
    vp g;
    
    vt(final Activity activity, final DisplayMode b, final long e, final String d, final vc c) {
        this.a = new WeakReference((T)activity);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static vt a(final Activity activity, final long n, final CardInstanceData cardInstanceData) {
        if (activity != null && cardInstanceData != null) {
            final vc u = cardInstanceData.u();
            uy.a().c(n, u);
            return new vt(activity, DisplayMode.c, n, "app", u);
        }
        return null;
    }
    
    @Override
    public Rect a(final Context context, final int n, final int n2, final int n3, final int n4) {
        return null;
    }
    
    @Override
    public d a() {
        return null;
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
    public void a(final Tweet tweet) {
    }
    
    @Override
    public void a(final boolean b) {
        this.y();
        if (this.g != null) {
            this.g.b(b);
        }
    }
    
    @Override
    public void b(final boolean b) {
        if (this.g != null) {
            this.g.a(b);
        }
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
    
    @Override
    public boolean v() {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return false;
        }
        final vr a = vu.a().a(this.d, this.b);
        if (a == null) {
            return false;
        }
        this.g = a.a(activity, this.b, this.c, (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).b("profile")).d("spotlight"), null);
        ((s)activity).a(this);
        this.g.a(new vq(this.e, this.e, this.c), vb.a(az.a((Context)activity)).a(this.e));
        return this.f = true;
    }
    
    @Override
    public void w() {
    }
    
    @Override
    public void x() {
        if (this.g != null) {
            this.g.a();
        }
    }
    
    @Override
    public void y() {
        if (this.f) {
            final Bundle bundle = new Bundle();
            this.g.a(bundle);
            final Context context = (Context)this.a.get();
            if (context != null && !bundle.isEmpty()) {
                vb.a(az.a(context)).a(this.e, bundle);
            }
            final Activity activity = (Activity)this.a.get();
            if (activity != null) {
                ((s)activity).b(this);
            }
            this.f = false;
        }
    }
    
    @Override
    public View z() {
        if (this.g != null) {
            return this.g.d();
        }
        return null;
    }
}
