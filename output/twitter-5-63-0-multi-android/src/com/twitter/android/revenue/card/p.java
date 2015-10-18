// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.text.TextUtils;
import android.widget.Toast;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Resources;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.client.c;
import com.twitter.ui.widget.TwitterButton;
import android.view.View$OnTouchListener;
import com.twitter.library.media.manager.j;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import android.view.View;
import com.twitter.library.provider.Tweet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.content.Context;

public class p extends aj implements o, uz, wi
{
    private String A;
    private Long B;
    private final Context a;
    private DisplayMode b;
    private n c;
    private MediaImageView d;
    private Button e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private MediaImageView j;
    private TextView k;
    private TextView q;
    private TextView r;
    private TextView s;
    private RelativeLayout t;
    private RelativeLayout u;
    private Tweet v;
    private String w;
    private String x;
    private String y;
    private boolean z;
    
    p(final l l, final Tweet v) {
        super(l, null);
        this.a = l.e();
        this.v = v;
    }
    
    private void a(final View view, final MotionEvent motionEvent) {
        this.o.a(this.v, NativeCardUserAction.a(this.h(), view, motionEvent, 0));
    }
    
    private void a(final vc vc) {
        if (this.d != null) {
            final vj a = vj.a("promo_image", vc);
            if (a != null) {
                this.d.setAspectRatio(a.a(2.5f));
                this.d.a(com.twitter.library.media.manager.j.a(a.a));
                this.d.setFromMemoryOnly(true);
            }
            this.d.setTag((Object)"promo_image");
            if (this.b == DisplayMode.a) {
                this.d.setOnTouchListener((View$OnTouchListener)new q(this));
            }
        }
    }
    
    private void b() {
        this.e.setVisibility(8);
        this.g.setVisibility(0);
    }
    
    private void b(final View view, final MotionEvent motionEvent) {
        this.b();
        (this.c = new n(this.a, this.w, this.v, this)).e();
    }
    
    private void b(final vc vc) {
        if (this.e != null) {
            this.e.setText((CharSequence)vc.a("promotion_cta", String.class));
            this.e.setTag((Object)"button");
            if (this.b != DisplayMode.a) {
                this.e.setOnTouchListener((View$OnTouchListener)new s(this, (TwitterButton)this.e));
                return;
            }
            this.e.setOnTouchListener((View$OnTouchListener)new r(this, (TwitterButton)this.e));
        }
    }
    
    private void c() {
        if (this.t != null) {
            this.t.setVisibility(8);
        }
        if (this.u != null) {
            this.u.setVisibility(0);
        }
        if (this.f != null) {
            this.f.setText((CharSequence)this.a.getResources().getString(2131297128, new Object[] { this.A }));
        }
    }
    
    private void c(final vc vc) {
        if (com.twitter.android.revenue.card.n.a(this.v.Q)) {
            this.c();
            return;
        }
        this.d(vc);
    }
    
    private void d(final vc vc) {
        final TwitterUser f = com.twitter.android.client.c.a(this.a).a().b().f();
        if (this.i != null) {
            this.i.setText((CharSequence)vc.a("title", String.class));
            this.i.setTag((Object)"title");
        }
        if (this.r != null) {
            this.r.setText((CharSequence)this.a.getResources().getString(2131298120));
            this.r.setTypeface(com.twitter.android.revenue.card.j.a);
            this.r.setOnTouchListener((View$OnTouchListener)new t(this));
        }
        if (this.s != null) {
            this.s.setText((CharSequence)this.a.getResources().getString(2131297130));
            this.s.setTag((Object)"title");
            this.s.setTypeface(com.twitter.android.revenue.card.j.a);
            this.s.setOnTouchListener((View$OnTouchListener)new u(this));
        }
        if (f != null && this.j != null) {
            this.j.a(com.twitter.library.media.manager.j.a(f.profileImageUrl));
            this.j.setFromMemoryOnly(true);
        }
        if (f != null && this.k != null) {
            this.k.setText((CharSequence)f.c());
        }
        if (this.q != null) {
            this.q.setText((CharSequence)vc.a("viewing_user_obfuscated_email_address", String.class));
        }
    }
    
    @Override
    protected void a() {
        if (this.d != null) {
            this.d.setFromMemoryOnly(false);
        }
        if (this.j != null) {
            this.j.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.b == DisplayMode.b && this.f != null) {
            this.A = twitterUser.name;
            final Resources resources = this.a.getResources();
            this.f.setVisibility(0);
            this.f.setText((CharSequence)resources.getString(2131297791, new Object[] { twitterUser.name }));
            this.h.setText((CharSequence)resources.getString(2131297128, new Object[] { twitterUser.name }));
        }
    }
    
    @Override
    public void a(final long n, final vc vc) {
        this.p.f().a((String)vc.a("_card_data", String.class));
        this.w = (String)vc.a("promotion_api_url", String.class);
        this.x = (String)vc.a("promotion_privacy_url", String.class);
        this.y = (String)vc.a("promotion_learn_more_url", String.class);
        final String s = (String)vc.a("promotion_has_destination_url", String.class);
        this.z = (s != null && s.equals("true"));
        this.a(vc);
        this.b(vc);
        this.c(vc);
    }
    
    @Override
    protected void a(final Context context, final DisplayMode b) {
        this.b = b;
        int n;
        if (DisplayMode.a == b) {
            n = 2130968917;
        }
        else {
            n = 2130968918;
        }
        this.m = LayoutInflater.from(context).inflate(n, (ViewGroup)null);
        this.d = (MediaImageView)this.m.findViewById(2131886977);
        if (this.d != null) {
            this.d.setAspectRatio(2.5f);
        }
        this.e = (Button)this.m.findViewById(2131886978);
        if (b == DisplayMode.b) {
            this.i = (TextView)this.m.findViewById(2131886461);
            this.f = (TextView)this.m.findViewById(2131886981);
            this.j = (MediaImageView)this.m.findViewById(2131887004);
            if (this.j != null) {
                this.j.setAspectRatio(1.0f);
            }
            this.g = (TextView)this.m.findViewById(2131887003);
            this.h = (TextView)this.m.findViewById(2131887010);
            this.k = (TextView)this.m.findViewById(2131887005);
            this.q = (TextView)this.m.findViewById(2131887006);
            this.r = (TextView)this.m.findViewById(2131887007);
            this.s = (TextView)this.m.findViewById(2131887011);
            this.t = (RelativeLayout)this.m.findViewById(2131887001);
            this.u = (RelativeLayout)this.m.findViewById(2131887008);
        }
    }
    
    public void a(final Bundle bundle) {
        super.a(bundle);
        if (this.B != null) {
            wh.a().b(this.B, this);
        }
        if (this.d != null) {
            this.d.b();
        }
        if (this.j != null) {
            this.j.b();
        }
        if (this.c != null) {
            this.c.f();
        }
        uy.a().b(this.n, this);
    }
    
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        uy.a().a(this.n, this);
        this.B = vn.a("site", vq.c);
        if (this.B != null) {
            wh.a().a(this.B, this);
        }
    }
    
    @Override
    public void a(final boolean b, final String s) {
        if (this.g != null && this.g.getVisibility() == 0) {
            this.g.setVisibility(8);
            if (!b) {
                this.e.setVisibility(0);
                Toast.makeText(this.a, 2131297126, 1).show();
                return;
            }
            this.c();
            if (this.z && !TextUtils.isEmpty((CharSequence)s)) {
                this.o.b(s);
            }
        }
    }
}
