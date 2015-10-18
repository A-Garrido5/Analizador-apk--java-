import com.twitter.library.av.model.factory.a;
import com.twitter.library.av.playback.bf;
import com.twitter.library.util.bq;
import com.twitter.library.av.VideoPlayerView$Mode;
import android.os.Bundle;
import android.text.TextUtils;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.TwitterUser;
import android.view.ViewGroup$LayoutParams;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import android.view.LayoutInflater;
import com.twitter.android.card.h;
import android.content.Context;
import com.twitter.android.card.v;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;
import com.twitter.ui.widget.ag;
import com.twitter.library.av.playback.au;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.playback.p;
import com.twitter.library.av.playback.av;
import com.twitter.library.av.VideoThumbnailView;
import com.twitter.library.av.VideoPlayerView;
import com.twitter.android.nativecards.CallToAction;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import android.view.ViewGroup;
import android.view.View;
import com.twitter.library.av.playback.w;
import android.view.View$OnClickListener;
import com.twitter.android.nativecards.j;

// 
// Decompiled by Procyon v0.5.30
// 

public class ed extends j implements View$OnClickListener, w, uz, wi
{
    final View a;
    final ViewGroup b;
    final MediaImageView c;
    final TextView d;
    final View e;
    final CallToAction f;
    VideoPlayerView g;
    VideoThumbnailView h;
    final TextView i;
    final TextView j;
    final av k;
    final p l;
    final eg m;
    AVPlayer n;
    au o;
    final ee p;
    Long q;
    long r;
    String s;
    String t;
    String u;
    String v;
    vj w;
    final ag x;
    
    public ed(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity), LayoutInflater.from((Context)activity).inflate(2130968934, (ViewGroup)null, false), com.twitter.library.av.playback.p.a(), eg.a(), new ee(), new av());
    }
    
    ed(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g, final View a, final p l, final eg m, final ee p11, final av k) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.x = ag.a((Context)activity);
        this.a = a;
        this.b = (ViewGroup)this.a.findViewById(2131886766);
        this.f = (CallToAction)this.a.findViewById(2131886999);
        this.c = (MediaImageView)this.a.findViewById(2131886993);
        this.d = (TextView)this.a.findViewById(2131886994);
        this.e = this.a.findViewById(2131886992);
        this.i = (TextView)this.a.findViewById(2131886291);
        this.j = (TextView)this.a.findViewById(2131886396);
        this.l = l;
        this.m = m;
        this.p = p11;
        this.k = k;
    }
    
    private void n() {
        final Activity k = this.k();
        if (k != null && this.w != null) {
            this.h = new VideoThumbnailView(k.getBaseContext());
            final boolean b = !this.l.d(this.j().a());
            this.h.a(this.w, b);
            if (b) {
                this.b.setOnClickListener((View$OnClickListener)this);
            }
            this.b.addView((View)this.h, new ViewGroup$LayoutParams(-1, -2));
        }
    }
    
    public void a() {
        if (this.h != null) {
            this.h.a();
        }
        if (this.c != null) {
            this.c.setFromMemoryOnly(false);
        }
    }
    
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.d != null) {
            this.d.setText((CharSequence)twitterUser.name);
            this.d.setTypeface(this.x.c);
        }
        if (this.c != null) {
            this.c.a(com.twitter.library.media.manager.j.a(twitterUser.profileImageUrl));
            this.c.setFromMemoryOnly(true);
        }
        if (this.e != null) {
            this.e.setVisibility(0);
            this.e.setOnClickListener((View$OnClickListener)this);
        }
    }
    
    @Override
    public void a(final long n, final Tweet tweet) {
        super.a(n, tweet);
        if (this.f != null) {
            this.f.setTweet(tweet);
        }
    }
    
    public void a(final long n, final vc vc) {
        this.s = eh.a(vc);
        this.w = vj.a("player_image", vc);
        this.u = wb.a("app_id", vc);
        this.v = wb.a("app_name", vc);
        this.t = wb.a("amplify_content_id", vc);
        if (this.i != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.i.setText((CharSequence)a);
                this.i.setTypeface(this.x.a);
            }
        }
        if (this.j != null) {
            final String a2 = wb.a("description", vc);
            if (a2 != null) {
                this.j.setText((CharSequence)a2);
                this.j.setTypeface(this.x.a);
            }
        }
        if (this.f != null) {
            int visibility = 8;
            if (!TextUtils.isEmpty((CharSequence)this.u) && !TextUtils.isEmpty((CharSequence)this.v)) {
                this.f.setScribeElement(this.l());
                this.f.setCardActionHandler(this.C);
                this.f.setCardLogger(this.B);
                this.f.a(null, this.u, this.v, null, null);
                visibility = 0;
            }
            this.f.setVisibility(visibility);
        }
        this.a(this.j());
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        this.h().b(this.r, this);
        if (this.q != null) {
            this.i().b(this.q, this);
        }
        if (this.c != null) {
            this.c.b();
        }
        if (this.n != null) {
            this.n.j();
        }
    }
    
    void a(final au au) {
        if (this.f()) {
            if (this.n == null) {
                (this.n = this.l.a(au, this.y)).c(false);
                final Activity k = this.k();
                if (k != null) {
                    (this.g = this.p.a((Context)k, this.n, VideoPlayerView$Mode.b)).setOnClickListener((View$OnClickListener)this);
                    this.b.addView((View)this.g);
                }
            }
            this.n.a(this);
            return;
        }
        this.n();
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.r = vq.b;
        this.h().a(this.r, this);
        this.q = vn.a("site", vq.c);
        if (this.q != null) {
            this.i().a(this.q, this);
        }
    }
    
    public void a(final boolean b) {
        super.a(b);
        if (!b && this.n != null && this.l.b(this.o)) {
            this.n.d(false);
        }
    }
    
    public void aj_() {
    }
    
    public void b() {
        super.b();
        if (this.n != null) {
            if (this.n.J()) {
                if (this.g != null) {
                    this.b.removeView((View)this.g);
                }
                this.n();
                return;
            }
            if (this.g != null) {
                this.g.b();
                this.g.h();
            }
        }
    }
    
    public void b(final boolean b) {
        super.b(b);
        if (this.n != null) {
            this.l.a(this.j());
            if (!b) {
                this.l.c(this.j().a());
            }
        }
        this.n = null;
    }
    
    public View d() {
        return this.a;
    }
    
    public void d_() {
        this.n.b(false);
    }
    
    public void e_() {
    }
    
    protected boolean f() {
        return this.g() && !this.l.d(this.j().a());
    }
    
    protected boolean g() {
        return bq.a();
    }
    
    protected uy h() {
        return uy.a();
    }
    
    protected wh i() {
        return wh.a();
    }
    
    public au j() {
        if (this.o == null) {
            int n;
            if (this.A != null && "video_timeline".equals(this.A.a())) {
                n = 1;
            }
            else {
                n = 0;
            }
            final av k = this.k;
            final Tweet e = this.E;
            final String s = this.s;
            final a b = bf.b(this.E);
            TwitterScribeAssociation twitterScribeAssociation;
            if (n != 0) {
                twitterScribeAssociation = this.A;
            }
            else {
                twitterScribeAssociation = this.z;
            }
            this.o = k.a(e, "VMAP", s, b, twitterScribeAssociation);
        }
        return this.o;
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            case 2131886163: {
                this.g.c();
            }
            case 2131886766: {
                final Activity k = this.k();
                if (k != null) {
                    this.m.a(this.z, this.s, this.E, k);
                    return;
                }
                break;
            }
            case 2131886992: {
                if (this.q != null) {
                    this.a(this.q);
                    return;
                }
                break;
            }
        }
    }
}
