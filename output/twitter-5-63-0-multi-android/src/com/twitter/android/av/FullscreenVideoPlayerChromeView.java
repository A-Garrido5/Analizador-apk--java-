// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.model.a;
import com.twitter.library.av.model.Video;
import com.twitter.library.featureswitch.d;
import android.content.res.Configuration;
import com.twitter.library.util.b;
import com.twitter.library.av.control.VideoControlView;
import android.view.View$OnClickListener;
import android.view.LayoutInflater;
import com.twitter.library.av.playback.AVPlayer;
import android.os.Bundle;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import android.net.Uri;
import com.twitter.library.av.control.e;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.av.model.VideoCta;
import com.twitter.android.widget.EngagementActionBar;

public class FullscreenVideoPlayerChromeView extends BaseVideoPlayerChromeView implements af
{
    protected EngagementActionBar m;
    protected ExternalActionButton n;
    protected VideoCta o;
    protected String p;
    protected ViewGroup q;
    protected View r;
    protected View s;
    private final ak u;
    
    public FullscreenVideoPlayerChromeView(final Context context) {
        this(context, new e(), new ak());
    }
    
    public FullscreenVideoPlayerChromeView(final Context context, final e e, final ak u) {
        super(context, e);
        this.u = u;
    }
    
    private void A() {
        final EngagementActionBar m = this.m;
        if (this.B() && this.x()) {
            ((View)m).setVisibility(0);
        }
        else if (!this.B()) {
            ((View)m).setVisibility(8);
        }
    }
    
    private boolean B() {
        return this.u.a(this.getContext());
    }
    
    private void a(final int n) {
        if ((this.x() || n == 1 || this.c) && this.o != null) {
            this.n.setVisibility(0);
        }
        if (n == 2 && !this.x()) {
            this.n.setVisibility(8);
        }
    }
    
    private void a(final VideoCta o) {
        this.o = o;
        int visibility = 8;
        if (o != null) {
            final Context context = this.getContext();
            final Uri d = o.d();
            final Uri a = o.a(context);
            if (d != null) {
                this.n.setFallbackText(o.b(context));
                this.n.setFallbackUri(a);
                this.n.setActionText(o.c(context));
                this.n.setExternalUri(d);
                visibility = 0;
            }
        }
        this.n.setVisibility(visibility);
    }
    
    @Override
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        super.a(avPlayer$PlayerStartType);
        this.z();
    }
    
    public void a(final boolean b) {
        if (this.a != null && this.o != null) {
            final Bundle h = this.a.h();
            final String string = "impression_scribed." + this.p;
            final boolean boolean1 = h.getBoolean(string, false);
            final boolean boolean2 = h.getBoolean("cta_availability", false);
            if (!boolean1 || boolean2 != b) {
                h.putBoolean(string, true);
                h.putBoolean("cta_availability", b);
                this.a.a(this.o.a(b));
            }
        }
    }
    
    protected void a(final boolean b, final int n, final int n2, final int n3, final int n4) {
        int n5;
        if (this.B()) {
            n5 = n4 - this.m.getHeight();
            this.m.layout(n, n5, n3, n4);
        }
        else {
            n5 = n4;
        }
        final int n6 = n5 - this.b.getHeight();
        this.b.layout(n, n6, n3, n5);
        final int n7 = n6 - this.n.getPaddingBottom();
        final int n8 = n7 - this.n.getHeight();
        final int n9 = (n3 - n - this.n.getWidth()) / 2;
        int n10;
        int n11;
        if (n9 > 0) {
            n10 = n + n9;
            n11 = n3 - n9;
        }
        else {
            n11 = n3;
            n10 = n;
        }
        this.n.layout(n10, n8, n11, n7);
        final int n12 = (n4 - n2 + this.d.getHeight() + this.n.getPaddingBottom()) / 2;
        final int n13 = n12 - this.d.getHeight();
        final int n14 = (n3 - n - this.d.getWidth()) / 2;
        int n15;
        int n16;
        if (n14 > 0) {
            n15 = n + n14;
            n16 = n3 - n14;
        }
        else {
            n16 = n3;
            n15 = n;
        }
        this.d.layout(n15, n13, n16, n12);
        this.j.a(b, n, n2, n3, n4);
    }
    
    @Override
    protected void b(final Context context, final AVPlayer avPlayer) {
        super.b(context, avPlayer);
        final LayoutInflater from = LayoutInflater.from(context);
        if (this.n == null) {
            (this.n = (ExternalActionButton)from.inflate(2130968605, (ViewGroup)this, false)).setVisibility(8);
            this.n.setEventLister(this);
        }
        this.z();
        if (this.m == null) {
            this.m = this.u.a(context, (ViewGroup)this, this.a);
            final int color = context.getResources().getColor(2131689545);
            this.m.setVisibility(8);
            this.m.setBackgroundColor(color);
        }
        if (this.q == null) {
            this.q = (ViewGroup)from.inflate(2130968606, (ViewGroup)this, false);
        }
        (this.r = this.q.findViewById(2131886302)).setOnClickListener((View$OnClickListener)this);
        this.r.setVisibility(8);
        (this.s = this.q.findViewById(2131886303)).setVisibility(8);
    }
    
    @Override
    public void b(final boolean b) {
        if (this.a != null && this.o != null) {
            this.a.a(this.o.b(!b));
        }
    }
    
    protected boolean b(final View view) {
        return view.getParent() != null && view.getVisibility() == 0;
    }
    
    @Override
    protected VideoControlView c(final Context context, final AVPlayer avPlayer) {
        return this.l.b(context, avPlayer);
    }
    
    @Override
    public void k() {
        super.k();
        this.u.a();
        this.z();
    }
    
    @Override
    protected void l() {
        if (!this.a((View)this.q)) {
            this.addView((View)this.q);
            if (!this.a((View)this.g, this.q)) {
                this.q.addView((View)this.g);
            }
        }
        if (!this.a(this.d)) {
            this.addView(this.d);
        }
        if (!this.a((View)this.n)) {
            this.addView((View)this.n);
        }
        if (!this.a((View)this.b)) {
            this.addView((View)this.b);
        }
        if (!this.a((View)this.m)) {
            this.addView((View)this.m);
        }
    }
    
    @Override
    protected void n() {
        super.n();
        final int orientation = this.getResources().getConfiguration().orientation;
        if (this.B() && this.b((View)this.m)) {
            com.twitter.library.util.b.a((View)this.m);
        }
        if (this.y() && this.b((View)this.n) && orientation != 1) {
            com.twitter.library.util.b.a((View)this.n);
        }
        else if (orientation != 1) {
            return;
        }
    }
    
    @Override
    protected void o() {
        super.o();
        if (this.B() && !this.b((View)this.m)) {
            com.twitter.library.util.b.b((View)this.m);
        }
        if (this.y() && !this.b((View)this.n) && this.o != null) {
            com.twitter.library.util.b.b((View)this.n);
        }
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A();
        this.a(configuration.orientation);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.a(b, n, n2, n3, n4);
    }
    
    boolean x() {
        return this.b((View)this.b) && this.b.h();
    }
    
    boolean y() {
        return com.twitter.library.featureswitch.d.f("video_call_to_action_enabled");
    }
    
    void z() {
        final a z = this.a.z();
        if (z != null && z instanceof Video) {
            final Video video = (Video)z;
            final double n = this.a.x().a;
            final VideoCta f = video.f();
            this.p = video.c();
            this.a(f);
        }
    }
}
