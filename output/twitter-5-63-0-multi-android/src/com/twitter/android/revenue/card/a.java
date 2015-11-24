// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import com.twitter.ui.widget.TwitterButton;
import android.graphics.Typeface;
import android.content.res.Resources;
import android.text.TextUtils;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View$OnTouchListener;
import com.twitter.library.media.manager.j;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.card.CardActionHelper$AppStatus;
import android.content.Context;
import com.twitter.library.util.ao;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.widget.tweet.content.DisplayMode;

public class a extends aj implements uz, wi
{
    DisplayMode a;
    MediaImageView b;
    TextView c;
    MediaImageView d;
    View e;
    TextView f;
    TextView g;
    TextView h;
    TextView i;
    Button j;
    Long k;
    private final ao q;
    private final Context r;
    private um s;
    private String t;
    private String u;
    
    a(final l l) {
        super(l, null);
        this.r = l.e();
        this.q = new b(this);
    }
    
    int a(final DisplayMode displayMode) {
        if (displayMode == DisplayMode.a) {
            return 2130968909;
        }
        return 2130968910;
    }
    
    int a(final vc vc, final CardActionHelper$AppStatus cardActionHelper$AppStatus) {
        switch (com.twitter.android.revenue.card.g.a[cardActionHelper$AppStatus.ordinal()]) {
            default: {
                return this.d();
            }
            case 1: {
                final Integer n = com.twitter.android.revenue.card.a.l.get(vc.a("cta_key", String.class));
                if (n != null) {
                    return n;
                }
                return this.b(this.a);
            }
            case 2: {
                return this.c(this.a);
            }
        }
    }
    
    public void a() {
        if (this.b != null) {
            this.b.setFromMemoryOnly(false);
        }
        if (this.d != null) {
            this.d.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.b != null) {
            this.b.a(com.twitter.library.media.manager.j.a(twitterUser.profileImageUrl));
            this.b.setFromMemoryOnly(true);
            this.b.setTag((Object)"author_image");
            this.b.setOnTouchListener((View$OnTouchListener)new c(this, n));
        }
        if (this.c != null) {
            this.c.setText((CharSequence)twitterUser.name);
            this.c.setTag((Object)"author_name");
            this.c.setOnTouchListener((View$OnTouchListener)new d(this, n));
        }
    }
    
    @Override
    public void a(final long n, final vc vc) {
        this.s = um.a("app_url", "app_url_resolved", vc);
        this.t = (String)vc.a("app_id", String.class);
        this.u = (String)vc.a("card_url", String.class);
        this.p.f().a((String)vc.a("_card_data", String.class));
        this.a(vc);
        this.b(vc);
        this.f(vc);
        this.g(vc);
        if (DisplayMode.a == this.a) {
            final View viewById = this.m.findViewById(2131886979);
            if (viewById != null) {
                viewById.setOnTouchListener((View$OnTouchListener)this.q);
            }
        }
    }
    
    @Override
    protected void a(final Context context, final DisplayMode a) {
        this.a = a;
        this.m = LayoutInflater.from(context).inflate(this.a(a), (ViewGroup)null);
        this.b = (MediaImageView)this.m.findViewById(2131886982);
        this.c = (TextView)this.m.findViewById(2131886983);
        this.d = (MediaImageView)this.m.findViewById(2131886977);
        if (this.d != null) {
            this.d.setAspectRatio(1.0f);
        }
        this.e = this.m.findViewById(2131886980);
        this.f = (TextView)this.m.findViewById(2131886461);
        this.g = (TextView)this.m.findViewById(2131886981);
        this.h = (TextView)this.m.findViewById(2131886984);
        this.i = (TextView)this.m.findViewById(2131886462);
        this.j = (Button)this.m.findViewById(2131886978);
    }
    
    public void a(final Bundle bundle) {
        super.a(bundle);
        if (this.b != null) {
            this.b.b();
        }
        if (this.d != null) {
            this.d.b();
        }
        this.b().b(this.n, this);
        if (this.k != null) {
            this.c().b(this.k, this);
        }
    }
    
    void a(final View view, final MotionEvent motionEvent) {
        this.o.a(this.s, this.t, this.u, NativeCardUserAction.a(this.h(), view, motionEvent, 0));
    }
    
    void a(final vc vc) {
        if (this.d != null) {
            final vj a = vj.a("thumbnail", vc);
            if (a != null) {
                this.d.setAspectRatio(a.a(1.0f));
                this.d.a(com.twitter.library.media.manager.j.a(a.a));
                this.d.setFromMemoryOnly(true);
            }
            this.d.setTag((Object)"thumbnail");
            this.d.setOnTouchListener((View$OnTouchListener)this.q);
        }
    }
    
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.b().a(this.n, this);
        this.k = vn.a("site", vq.c);
        if (this.k != null) {
            this.c().a(this.k, this);
        }
    }
    
    int b(final DisplayMode displayMode) {
        if (displayMode == DisplayMode.a) {
            return 2131296322;
        }
        return 2131297366;
    }
    
    uy b() {
        return uy.a();
    }
    
    void b(final vc vc) {
        this.c(vc);
        this.d(vc);
        this.e(vc);
        if (this.e != null) {
            this.e.setOnTouchListener((View$OnTouchListener)this.q);
            this.e.setTag((Object)"stats_container");
        }
    }
    
    int c(final DisplayMode displayMode) {
        if (displayMode == DisplayMode.a) {
            return 2131296320;
        }
        return 2131297032;
    }
    
    wh c() {
        return wh.a();
    }
    
    void c(final vc vc) {
        if (this.f != null) {
            this.f.setTypeface(com.twitter.android.revenue.card.j.a);
            this.f.setText((CharSequence)vc.a("title", String.class));
        }
    }
    
    int d() {
        return 2131296449;
    }
    
    void d(final vc vc) {
        if (this.h != null) {
            final Resources resources = this.r.getResources();
            final String s = (String)vc.a("app_star_rating", String.class);
            final String s2 = (String)vc.a("app_num_ratings", String.class);
            this.h.setTypeface(com.twitter.android.revenue.card.j.a);
            final String s3 = (String)vc.a("app_price", String.class);
            String text;
            if (!TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)s)) {
                text = resources.getString(2131296452, new Object[] { s, s2 });
            }
            else if (!TextUtils.isEmpty((CharSequence)s3)) {
                text = resources.getString(2131296323, new Object[] { s3 });
            }
            else {
                text = resources.getString(2131297027);
            }
            this.h.setText((CharSequence)text);
        }
    }
    
    void e(final vc vc) {
        if (this.g != null) {
            final Resources resources = this.r.getResources();
            String text = (String)vc.a("app_price", String.class);
            if (DisplayMode.a == this.a) {
                if (TextUtils.isEmpty((CharSequence)text)) {
                    text = resources.getString(2131296342, new Object[] { resources.getString(2131296316) });
                }
                else {
                    text = resources.getString(2131296342, new Object[] { text });
                }
                this.g.setTypeface(com.twitter.android.revenue.card.j.a);
            }
            else {
                if (TextUtils.isEmpty((CharSequence)text)) {
                    text = resources.getString(2131296316);
                }
                this.g.setTypeface(Typeface.DEFAULT_BOLD);
            }
            this.g.setText((CharSequence)text);
        }
    }
    
    void f(final vc vc) {
        if (this.i != null) {
            final String text = (String)vc.a("description", String.class);
            this.i.setTypeface(com.twitter.android.revenue.card.j.a);
            this.i.setText((CharSequence)text);
            this.i.setOnTouchListener((View$OnTouchListener)new e(this));
        }
    }
    
    void g(final vc vc) {
        final CardActionHelper$AppStatus a = this.o.a(this.t);
        this.j.setText(this.a(vc, a));
        this.j.setTag((Object)"button");
        if (this.j instanceof TwitterButton) {
            this.j.setOnTouchListener((View$OnTouchListener)new f(this, (TwitterButton)this.j));
        }
        else {
            this.j.setOnTouchListener((View$OnTouchListener)this.q);
        }
        if (DisplayMode.b == this.a && CardActionHelper$AppStatus.b == a) {
            this.j.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }
}
