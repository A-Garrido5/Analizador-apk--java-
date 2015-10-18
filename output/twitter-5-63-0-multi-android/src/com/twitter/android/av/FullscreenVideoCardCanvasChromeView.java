// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.util.b;
import android.view.View$OnTouchListener;
import com.twitter.library.av.control.d;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.android.revenue.a;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import com.twitter.android.card.CardActionHelper;
import com.twitter.android.av.videoapp.VideoCardData;
import android.view.View;
import com.twitter.ui.widget.TwitterButton;

public class FullscreenVideoCardCanvasChromeView extends BaseVideoPlayerChromeView
{
    TwitterButton m;
    TwitterButton n;
    View o;
    private VideoCardData p;
    private CardActionHelper q;
    private View r;
    
    public FullscreenVideoCardCanvasChromeView(final Context context) {
        super(context);
    }
    
    private View d(final Context context) {
        return LayoutInflater.from(context).inflate(2130969195, (ViewGroup)this, false);
    }
    
    void a(final View view, final MotionEvent motionEvent) {
        if (this.q != null) {
            this.q.a(this.p.g, this.p.f, this.p.i, NativeCardUserAction.a(this.r, view, motionEvent, 0));
        }
    }
    
    public void a(final View r, final CardActionHelper q, final VideoCardData p3) {
        this.r = r;
        this.q = q;
        this.p = p3;
        if (this.o == null) {
            return;
        }
        final MediaImageView mediaImageView = (MediaImageView)this.o.findViewById(2131887343);
        Label_0246: {
            if (this.p.h == null) {
                break Label_0246;
            }
            mediaImageView.a(com.twitter.library.media.manager.j.a(this.p.h));
        Label_0143_Outer:
            while (true) {
                final TextView textView = (TextView)this.o.findViewById(2131886291);
                final TextView textView2 = (TextView)this.o.findViewById(2131887344);
                final LinearLayout linearLayout = (LinearLayout)this.o.findViewById(2131887049);
                textView.setText((CharSequence)this.p.b);
                Label_0171: {
                    if (this.p.d == null) {
                        break Label_0171;
                    }
                    while (true) {
                        try {
                            final float float1 = Float.parseFloat(this.p.d);
                            com.twitter.android.revenue.a.a(this.getContext(), linearLayout, 2130839290, 2130839292, 2130839288, this.getResources().getDimensionPixelOffset(2131558935), float1, 5.0f);
                            ((TextView)this.findViewById(2131886984)).setText((CharSequence)this.getResources().getString(2131298102, new Object[] { this.p.e }));
                            if (this.p.c != null) {
                                textView2.setText((CharSequence)this.p.c);
                            }
                            this.x();
                            return;
                            mediaImageView.setBackgroundResource(2130839018);
                            continue Label_0143_Outer;
                        }
                        catch (NumberFormatException ex) {
                            final float float1 = 0.0f;
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    @Override
    protected void b(final Context context, final AVPlayer avPlayer) {
        if (this.b == null) {
            this.b = this.c(context, avPlayer);
        }
        if (this.b != null) {
            this.b.setListener(this);
            this.b.setIsFullScreenToggleAllowed(false);
        }
        if (this.m == null) {
            (this.m = this.c(context)).setOnTouchListener((View$OnTouchListener)new ag(this, this.m));
        }
        if (this.o == null) {
            (this.o = this.d(context)).setOnTouchListener((View$OnTouchListener)new ah(this));
            (this.n = (TwitterButton)this.o.findViewById(2131887345)).setOnTouchListener((View$OnTouchListener)new ai(this, this.n));
        }
    }
    
    protected TwitterButton c(final Context context) {
        return (TwitterButton)LayoutInflater.from(context).inflate(2130969194, (ViewGroup)this, false);
    }
    
    @Override
    public void c_(final boolean b) {
        super.c_(b);
        this.o();
    }
    
    @Override
    public void i() {
        this.s();
    }
    
    @Override
    protected void l() {
        if (this.b != null && this.b.getParent() == null) {
            this.addView((View)this.b);
        }
        if (this.m != null && this.m.getParent() == null) {
            this.addView((View)this.m);
        }
        if (this.o != null && this.o.getParent() == null) {
            this.addView(this.o);
        }
    }
    
    @Override
    protected void o() {
        super.o();
        if (this.m != null && !this.c) {
            com.twitter.library.util.b.b((View)this.m);
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.b != null) {
            this.b.layout(n, n4 - this.b.getMeasuredHeight(), n3, n4);
        }
        if (this.j != null) {
            this.j.a(b, n, n2, n3, n4);
        }
        if (this.o != null) {
            final int n5 = n3 + n >> 1;
            final int n6 = n4 + n2 >> 1;
            final int n7 = this.o.getMeasuredWidth() >> 1;
            final int n8 = this.o.getMeasuredHeight() >> 1;
            this.o.layout(n5 - n7, n6 - n8, n5 + n7, n6 + n8);
        }
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b) {
            this.x();
        }
    }
    
    @Override
    protected void v() {
        super.v();
        if (this.o != null) {
            this.o.setVisibility(8);
        }
        if (this.m != null) {
            this.m.setVisibility(0);
        }
    }
    
    @Override
    protected void w() {
        super.w();
        if (this.o != null) {
            this.o.setVisibility(0);
        }
        if (this.m != null) {
            this.m.setVisibility(8);
        }
    }
    
    void x() {
        if (this.q != null && this.p != null) {
            int n = 0;
            switch (aj.a[this.q.a(this.p.f).ordinal()]) {
                default: {
                    n = 2131296449;
                    break;
                }
                case 1: {
                    n = 2131296322;
                    break;
                }
                case 2: {
                    n = 2131296320;
                    break;
                }
            }
            this.m.setText(n);
            this.n.setText(n);
        }
    }
}
