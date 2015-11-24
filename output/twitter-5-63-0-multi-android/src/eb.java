import com.twitter.library.provider.Tweet;
import com.twitter.library.card.Card;
import java.util.Map;
import com.twitter.library.av.model.factory.a;
import com.twitter.library.av.model.factory.b;
import android.os.Bundle;
import android.graphics.RectF;
import com.twitter.android.av.audio.i;
import android.graphics.PointF;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.featureswitch.d;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.android.card.h;
import android.content.Context;
import com.twitter.android.card.v;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;
import com.twitter.library.av.playback.au;
import com.twitter.library.av.playback.av;
import android.content.res.Resources;
import com.twitter.library.av.playback.p;
import com.twitter.library.av.model.Partner;
import com.twitter.library.api.TwitterUser;
import com.twitter.internal.android.widget.TypefacesTextView;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.android.nativecards.j;

// 
// Decompiled by Procyon v0.5.30
// 

public class eb extends j implements View$OnClickListener, uz, wi
{
    final View a;
    final MediaImageView b;
    final TypefacesTextView c;
    final TypefacesTextView d;
    final TypefacesTextView e;
    final TypefacesTextView f;
    Long g;
    TwitterUser h;
    String i;
    String j;
    String k;
    vj l;
    Partner m;
    long n;
    String o;
    private final p p;
    private final Resources q;
    private final av r;
    private au s;
    
    public eb(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity), com.twitter.library.av.playback.p.a());
    }
    
    eb(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g, final p p7) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g, p7, LayoutInflater.from((Context)activity).inflate(2130968907, (ViewGroup)null, false), new av());
    }
    
    eb(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g, final p p9, final View a, final av r) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.m = Partner.a;
        this.a = a;
        this.q = activity.getResources();
        (this.b = (MediaImageView)this.a.findViewById(2131886973)).setOnClickListener((View$OnClickListener)this);
        this.c = (TypefacesTextView)this.a.findViewById(2131886291);
        this.d = (TypefacesTextView)this.a.findViewById(2131886974);
        this.e = (TypefacesTextView)this.a.findViewById(2131886975);
        this.f = (TypefacesTextView)this.a.findViewById(2131886976);
        this.p = p9;
        this.r = r;
    }
    
    public static HashMap a(final String s, final String s2, final String s3, final String s4, final Partner partner) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        if (s != null) {
            hashMap.put("playlist_url", s);
        }
        if (s2 != null) {
            hashMap.put("artist_name", s2);
        }
        if (s3 != null) {
            hashMap.put("card_title", s3);
        }
        if (s4 != null) {
            hashMap.put("image_url", s4);
        }
        if (partner != null) {
            hashMap.put("integration_partner", partner.b());
        }
        return hashMap;
    }
    
    public void a() {
        if (this.b != null) {
            this.b.setFromMemoryOnly(false);
        }
    }
    
    public void a(final long n, final TwitterUser h) {
        if (this.g != null && this.g.equals(n)) {
            this.h = h;
            this.ai_();
        }
    }
    
    public void a(final long n, final vc vc) {
        this.l = vj.a("player_image", vc);
        this.m = new Partner(wb.a("partner", vc));
        this.k = wb.a("artist_name", vc);
        this.i = wb.a("title", vc);
        this.o = wb.a("card_url", vc);
        this.j = wb.a("source", vc);
        if (this.b != null && this.l != null) {
            this.b.setAspectRatio(this.l.a(1.0f));
            this.b.a(com.twitter.library.media.manager.j.a(this.l.a));
            this.b.setFromMemoryOnly(true);
        }
        this.ah_();
    }
    
    void a(final Activity activity, final View view) {
        if (!com.twitter.library.featureswitch.d.f("audio_configurations_audio_player_enabled")) {
            this.D.b(this.o);
        }
        else if (activity instanceof TwitterFragmentActivity) {
            final i l = ((TwitterFragmentActivity)activity).L();
            if (l != null) {
                final RectF a = com.twitter.util.t.a(activity, view);
                PointF pointF;
                if (a != null) {
                    pointF = new PointF(a.left, a.top);
                }
                else {
                    pointF = null;
                }
                PointF pointF2;
                if (a != null) {
                    pointF2 = new PointF(a.width(), a.height());
                }
                else {
                    pointF2 = null;
                }
                l.a(this.g(), pointF, pointF2, this.z);
            }
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        this.f().b(this.n, this);
        if (this.g != null) {
            this.e().b(this.g, this);
        }
        if (this.b != null) {
            this.b.b();
        }
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.n = vq.b;
        this.f().a(this.n, this);
        this.g = vn.a("artist_user", vq.c);
        if (this.g != null) {
            this.e().a(this.g, this);
        }
    }
    
    void ah_() {
        if (this.i != null) {
            this.c.setText((CharSequence)this.i);
            this.c.setVisibility(0);
        }
        else {
            this.c.setVisibility(8);
        }
        if (this.k != null) {
            this.d.setText((CharSequence)this.k);
            this.d.setVisibility(0);
        }
        else {
            this.d.setVisibility(8);
        }
        this.ai_();
        if (this.m != null && !Partner.a.equals(this.m)) {
            this.f.setText((CharSequence)this.m.b());
            this.f.setVisibility(0);
            return;
        }
        this.f.setVisibility(8);
    }
    
    void ai_() {
        if (this.h != null) {
            this.e.setText((CharSequence)("@" + this.h.username));
            this.e.setVisibility(0);
            if (this.F == DisplayMode.b) {
                this.e.setOnClickListener((View$OnClickListener)this);
                this.e.setBackgroundDrawable(this.q.getDrawable(2130837557));
                this.e.setTextColor(this.q.getColor(2131689631));
            }
            return;
        }
        this.e.setVisibility(8);
    }
    
    public View d() {
        return this.a;
    }
    
    wh e() {
        return wh.a();
    }
    
    uy f() {
        return uy.a();
    }
    
    public au g() {
        if (this.s == null) {
            final av r = this.r;
            final Tweet e = this.E;
            final String j = this.j;
            final b b = new b();
            final String i = this.j;
            final String k = this.k;
            final String l = this.i;
            String a;
            if (this.l != null) {
                a = this.l.a;
            }
            else {
                a = null;
            }
            this.s = r.a(e, "audio", j, b, a(i, k, l, a, this.m), this.m, this.z, null);
        }
        return this.s;
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            case 2131886973: {
                this.a(this.k(), (View)this.b);
            }
            case 2131886975: {
                if (this.g != null) {
                    this.a(this.g);
                    return;
                }
                break;
            }
        }
    }
}
