import com.twitter.library.av.playback.AVPlayer;
import android.view.View;
import com.twitter.library.av.VideoPlayerView$Mode;
import com.twitter.library.av.playback.av;
import android.os.Bundle;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.android.card.h;
import android.content.Context;
import com.twitter.android.card.v;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;
import com.twitter.library.av.playback.au;
import com.twitter.library.av.playback.p;
import com.twitter.library.av.ap;
import com.twitter.android.av.bf;
import com.twitter.library.av.VideoPlayerView;
import com.twitter.library.av.ao;
import android.widget.LinearLayout;
import com.twitter.library.widget.a;
import android.view.View$OnClickListener;
import com.twitter.android.nativecards.j;

// 
// Decompiled by Procyon v0.5.30
// 

public class ei extends j implements View$OnClickListener, a
{
    final LinearLayout a;
    ao b;
    final eg c;
    String d;
    private VideoPlayerView f;
    private final bf g;
    private final ap h;
    private final p i;
    private au j;
    
    public ei(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity), eg.a(), p.a(), new ap(), new bf());
    }
    
    ei(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g, final eg c, final p i, final ap h, final bf g2) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.c = c;
        this.i = i;
        this.g = g2;
        this.h = h;
        (this.a = new LinearLayout(activity.getBaseContext())).setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, -2));
        this.a.setOrientation(1);
        this.a.setOnClickListener((View$OnClickListener)this);
    }
    
    private void g() {
        final Activity k = this.k();
        if (k != null) {
            this.c.a(this.z, this.d, this.E, k);
        }
    }
    
    public void a() {
        if (this.b != null) {
            this.b.a();
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        if (this.b != null) {
            this.b.b();
        }
        if (this.f != null) {
            this.i.a(this.j);
            this.i.c(this.j.a());
        }
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.d = eh.a(vq.c);
        final Activity k = this.k();
        if (k != null) {
            if (!com.twitter.android.av.t.a()) {
                this.b = this.h.a(k.getBaseContext());
                this.b.getView().setId(2131886973);
                this.b.setTweet(this.E);
                this.a.addView(this.b.getView(), new ViewGroup$LayoutParams(-1, -2));
                return;
            }
            this.j = new av().a(this.E, "VMAP", this.d, com.twitter.library.av.playback.bf.b(this.E), this.z);
            final AVPlayer a = this.i.a(this.j, k.getBaseContext());
            a.c(false);
            this.f = this.g.a(k.getBaseContext(), a, VideoPlayerView$Mode.a);
            this.a.addView((View)this.f, new ViewGroup$LayoutParams(-1, -2));
        }
    }
    
    public au ak_() {
        if (this.f != null) {
            return this.f.g();
        }
        return au.a;
    }
    
    public View d() {
        return (View)this.a;
    }
    
    public au e() {
        if (this.f != null) {
            return this.f.m();
        }
        return au.a;
    }
    
    public View f() {
        return this.d();
    }
    
    public void onClick(final View view) {
        this.g();
    }
}
