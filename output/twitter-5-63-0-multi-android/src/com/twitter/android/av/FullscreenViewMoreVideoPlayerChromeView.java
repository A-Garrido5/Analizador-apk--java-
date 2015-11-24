// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.util.b;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.view.View;
import com.twitter.library.av.playback.aw;
import com.twitter.library.av.control.e;
import android.content.Context;

public class FullscreenViewMoreVideoPlayerChromeView extends FullscreenVideoPlayerChromeView
{
    private al u;
    
    public FullscreenViewMoreVideoPlayerChromeView(final Context context) {
        super(context, new e(), new ak());
    }
    
    @Override
    public void a(final int n, final long n2) {
        super.a(n, n2);
        if (this.u != null) {
            this.u.a(n, n2);
        }
    }
    
    @Override
    public void a(final aw aw, final int n, final boolean b) {
        super.a(aw, n, b);
        if (this.a != null && (this.a == null || !this.a.D()) && this.d instanceof ViewMoreVideosButtonView) {
            ((ViewMoreVideosButtonView)this.d).a(n);
        }
    }
    
    @Override
    protected void a(final boolean b, final int n, final int n2, final int n3, final int n4) {
        int n5;
        if (this.m != null && this.b((View)this.m)) {
            n5 = n4 - this.m.getHeight();
            this.m.layout(n, n5, n3, n4);
        }
        else {
            n5 = n4;
        }
        if (this.b != null) {
            this.b.layout(n, n5 - this.b.getHeight(), n3, n5);
        }
        if (this.n != null) {
            final int n6 = this.d.getBottom() - this.n.getPaddingTop();
            final int n7 = n6 + this.n.getHeight();
            final int n8 = (n3 - n - this.n.getWidth()) / 2;
            int n9;
            int n10;
            if (n8 > 0) {
                n9 = n + n8;
                n10 = n3 - n8;
            }
            else {
                n10 = n3;
                n9 = n;
            }
            this.n.layout(n9, n6, n10, n7);
        }
        if (this.j != null) {
            this.j.a(b, n, n2, n3, n4);
        }
    }
    
    @Override
    protected View b(final Context context) {
        return LayoutInflater.from(context).inflate(2130968604, (ViewGroup)this, false);
    }
    
    @Override
    public void d(final boolean b) {
        if (b && this.d instanceof ViewMoreVideosButtonView) {
            ((ViewMoreVideosButtonView)this.d).b();
        }
    }
    
    @Override
    protected void l() {
        if (!this.a((View)this.q)) {
            this.addView((View)this.q);
            if (!this.a(this.d, this.q)) {
                this.q.addView(this.d);
            }
            if (!this.a((View)this.g, this.q)) {
                this.q.addView((View)this.g);
            }
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
        if (this.b(this.d)) {
            com.twitter.library.util.b.a(this.d);
        }
        if (this.b(this.r)) {
            com.twitter.library.util.b.a(this.r);
        }
    }
    
    @Override
    protected void o() {
        super.o();
        if (!this.b(this.d)) {
            com.twitter.library.util.b.b(this.d);
            if (this.e != null) {
                this.e.c();
            }
        }
        if (!this.b(this.r)) {
            com.twitter.library.util.b.b(this.r);
        }
    }
    
    @Override
    public void onClick(final View view) {
        if (view.equals(this.d) && this.u != null) {
            this.u.a(this);
            com.twitter.library.util.b.b(this.s);
            com.twitter.library.util.b.a(this.d);
            return;
        }
        if (view.equals(this.r) && this.u != null) {
            this.u.c_();
            return;
        }
        super.onClick(view);
    }
    
    public void setListener(final al u) {
        this.u = u;
    }
    
    @Override
    protected void v() {
    }
    
    @Override
    protected void w() {
    }
}
