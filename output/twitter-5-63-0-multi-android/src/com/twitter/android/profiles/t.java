// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import android.view.View;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.a;
import com.twitter.library.api.z;
import com.twitter.library.platform.PushService;
import com.twitter.library.api.TwitterUser;
import android.content.Context;
import android.widget.RelativeLayout;
import com.twitter.ui.widget.TwitterButton;
import android.view.View$OnClickListener;

public class t implements View$OnClickListener
{
    private final TwitterButton a;
    private final TwitterButton b;
    private final TwitterButton c;
    private final TwitterButton d;
    private final TwitterButton e;
    private final TwitterButton f;
    private final TwitterButton g;
    private final TwitterButton h;
    private final TwitterButton i;
    private final TwitterButton j;
    private final TwitterButton k;
    private final RelativeLayout l;
    private final boolean m;
    private final boolean n;
    private final Context o;
    private final u p;
    private TwitterUser q;
    private boolean r;
    
    public t(final Context context, final u u, final RelativeLayout relativeLayout, final boolean b) {
        this(context, u, relativeLayout, b, PushService.c(context));
    }
    
    public t(final Context o, final u p5, final RelativeLayout l, final boolean m, final boolean n) {
        this.m = m;
        this.o = o;
        this.p = p5;
        this.n = n;
        (this.a = (TwitterButton)l.findViewById(2131887162)).setOnClickListener((View$OnClickListener)this);
        (this.b = (TwitterButton)l.findViewById(2131887167)).setOnClickListener((View$OnClickListener)this);
        (this.c = (TwitterButton)l.findViewById(2131887168)).setOnClickListener((View$OnClickListener)this);
        (this.d = (TwitterButton)l.findViewById(2131887169)).setOnClickListener((View$OnClickListener)this);
        (this.e = (TwitterButton)l.findViewById(2131887170)).setOnClickListener((View$OnClickListener)this);
        (this.f = (TwitterButton)l.findViewById(2131887171)).setOnClickListener((View$OnClickListener)this);
        (this.g = (TwitterButton)l.findViewById(2131887172)).setOnClickListener((View$OnClickListener)this);
        (this.h = (TwitterButton)l.findViewById(2131887173)).setOnClickListener((View$OnClickListener)this);
        (this.i = (TwitterButton)l.findViewById(2131887163)).setOnClickListener((View$OnClickListener)this);
        (this.j = (TwitterButton)l.findViewById(2131887165)).setOnClickListener((View$OnClickListener)this);
        (this.k = (TwitterButton)l.findViewById(2131887164)).setOnClickListener((View$OnClickListener)this);
        this.l = l;
    }
    
    private int c(final int n) {
        if (this.m) {
            return 0;
        }
        if (z.b(n)) {
            return 2131298026;
        }
        if (z.e(n)) {
            return 2131298023;
        }
        if (z.k(n)) {
            return 2131297377;
        }
        return 2131297007;
    }
    
    public void a() {
        this.g.setVisibility(8);
        this.f.setVisibility(0);
    }
    
    public void a(final int n) {
        int visibility = 8;
        if (this.r) {
            return;
        }
        final int c = this.c(n);
        this.b.setEnabled(true);
        this.c.setEnabled(true);
        this.f.setEnabled(true);
        if (c > 0) {
            this.b.setVisibility(visibility);
            this.c.setVisibility(visibility);
            this.d.setVisibility(visibility);
            this.e.setVisibility(visibility);
            this.f.setVisibility(visibility);
            this.g.setVisibility(visibility);
            if (c == 2131297007) {
                this.b.setVisibility(0);
            }
            else if (c == 2131298026) {
                this.c.setVisibility(0);
            }
            else if (c == 2131297377) {
                this.d.setVisibility(0);
            }
            else if (c == 2131298023) {
                this.e.setVisibility(0);
            }
        }
        if (this.m) {
            this.b.setVisibility(visibility);
            this.f.setVisibility(visibility);
            this.a.setVisibility(0);
            if (com.twitter.library.util.a.b(this.o) > 1) {
                this.h.setVisibility(0);
            }
            else {
                this.h.setVisibility(visibility);
            }
        }
        else {
            this.a.setVisibility(visibility);
            final boolean f = com.twitter.library.featureswitch.d.f("legacy_deciders_alerts_activation_enabled");
            if (this.q.isLifelineInstitution && c != 2131298023 && f && !this.q.isProtected && this.n) {
                if (z.l(n)) {
                    this.b();
                }
                else {
                    this.a();
                }
            }
        }
        final boolean a = ah.a(this.o, this.q, n, this.m);
        final boolean i = z.i(n);
        final TwitterButton j = this.i;
        int visibility2;
        if (a && !i) {
            visibility2 = 0;
        }
        else {
            visibility2 = visibility;
        }
        j.setVisibility(visibility2);
        final TwitterButton k = this.j;
        int visibility3;
        if (a && i) {
            visibility3 = 0;
        }
        else {
            visibility3 = visibility;
        }
        k.setVisibility(visibility3);
        final TwitterButton l = this.k;
        if (ah.a(this.q, n, this.m)) {
            visibility = 0;
        }
        l.setVisibility(visibility);
        this.l.setVisibility(0);
    }
    
    public void a(final TwitterUser q) {
        this.q = q;
    }
    
    public void b() {
        this.f.setVisibility(8);
        this.g.setVisibility(0);
    }
    
    public void b(final int n) {
        this.r = false;
        this.a(n);
    }
    
    public void c() {
        this.r = true;
        this.l.setVisibility(4);
    }
    
    public void onClick(final View view) {
        this.p.onButtonBarItemClick(view);
    }
}
