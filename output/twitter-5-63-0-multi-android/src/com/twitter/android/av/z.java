// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.view.View;
import android.content.res.Resources;
import com.twitter.library.util.aj;
import com.twitter.library.client.az;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.twitter.android.widget.ToggleImageButton;
import android.content.Context;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import com.twitter.library.client.as;
import com.twitter.android.widget.EngagementActionBar;
import com.twitter.library.provider.Tweet;
import android.view.View$OnClickListener;

public class z implements View$OnClickListener
{
    Tweet a;
    private final EngagementActionBar b;
    private final ab c;
    private final ad d;
    private final as e;
    private final c f;
    private final Session g;
    private Context h;
    private final ToggleImageButton i;
    private final ToggleImageButton j;
    private final TextView k;
    private final TextView l;
    private final aa m;
    private final ac n;
    private FragmentActivity o;
    
    z(final Tweet a, final EngagementActionBar b, final Context h, final ab c, final Session g, final c f, final aa m, final ac n) {
        this.a = a;
        this.b = b;
        this.m = m;
        this.n = n;
        this.c = c;
        this.h = h;
        this.g = g;
        this.e = as.a(b.getContext());
        this.f = f;
        this.k = (TextView)this.b.findViewById(2131886883);
        this.i = (ToggleImageButton)this.b.findViewById(2131886229);
        this.j = (ToggleImageButton)this.b.findViewById(2131886230);
        this.l = (TextView)this.b.findViewById(2131886882);
        this.d = new ad(this);
    }
    
    public z(final Tweet tweet, final EngagementActionBar engagementActionBar, final ab ab) {
        this(tweet, engagementActionBar, engagementActionBar.getContext(), ab, az.a(engagementActionBar.getContext()).b(), com.twitter.android.client.c.a(engagementActionBar.getContext()), new aa(), new ac());
    }
    
    protected void a() {
        int n = 2131689637;
        final Resources resources = this.h.getResources();
        final int t = this.a.t;
        final int p = this.a.p;
        final TextView k = this.k;
        String b;
        if (t > 0) {
            b = aj.b(resources, t);
        }
        else {
            b = "";
        }
        k.setText((CharSequence)b);
        final TextView i = this.k;
        int n2;
        if (this.a.e) {
            n2 = 2131689548;
        }
        else {
            n2 = n;
        }
        i.setTextColor(resources.getColor(n2));
        final TextView l = this.l;
        String b2;
        if (p > 0) {
            b2 = aj.b(resources, p);
        }
        else {
            b2 = "";
        }
        l.setText((CharSequence)b2);
        final TextView j = this.l;
        if (this.a.h) {
            n = 2131689607;
        }
        j.setTextColor(resources.getColor(n));
    }
    
    public void a(final Context h) {
        this.h = h;
    }
    
    public void a(final FragmentActivity o) {
        this.o = o;
    }
    
    public void a(final Tweet a) {
        this.a = a;
        this.b.setTweet(this.a);
        this.b.setOnClickListener((View$OnClickListener)this);
        this.a();
    }
    
    protected void a(final String s) {
        this.c.a(s);
    }
    
    protected void a(final boolean toggledOn) {
        this.i.setToggledOn(toggledOn);
    }
    
    public void onClick(final View view) {
        if (this.a == null) {
            return;
        }
        if (this.g.d()) {
            final int id = view.getId();
            String s;
            if (id == 2131886228) {
                s = this.m.a(this.h, this.a, this.g);
            }
            else if (id == 2131886230) {
                s = this.m.a(this.h, this.a, this.e, this.g);
            }
            else if (id == 2131886229) {
                this.m.a(this.h, this.a, this.d);
                s = null;
            }
            else {
                s = null;
                if (id == 2131886231) {
                    s = this.m.a(this.h, this.a);
                }
            }
            if (s != null) {
                this.a(s);
            }
            this.b.a();
            this.a();
            return;
        }
        switch (view.getId()) {
            default: {}
            case 2131886228: {
                this.n.a(this.o, this.a.a());
            }
            case 2131886229: {
                this.n.b(this.o, this.a.a());
            }
            case 2131886230: {
                this.n.c(this.o, this.a.a());
                this.j.a();
            }
            case 2131886231: {
                this.n.a(this.o, this.a);
                this.a("share");
            }
        }
    }
}
