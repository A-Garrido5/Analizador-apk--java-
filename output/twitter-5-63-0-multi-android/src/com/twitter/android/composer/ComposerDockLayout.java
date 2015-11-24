// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.widget.ImageView;
import android.view.View$OnClickListener;
import com.twitter.ui.widget.ag;
import com.twitter.util.t;
import com.twitter.library.featureswitch.d;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.Activity;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;
import com.twitter.android.widget.LoggedOutBar;
import android.view.View;
import android.support.annotation.LayoutRes;
import com.twitter.internal.android.widget.DockLayout;

public class ComposerDockLayout extends DockLayout
{
    at a;
    private boolean b;
    @LayoutRes
    private int c;
    private View d;
    private FloatingActionButtonLayout e;
    private LoggedOutBar f;
    private TextView g;
    
    public ComposerDockLayout(final Context context) {
        this(context, null);
    }
    
    public ComposerDockLayout(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ComposerDockLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.ComposerDockLayout, n, 0);
        this.c = obtainStyledAttributes.getResourceId(0, 2130968868);
        obtainStyledAttributes.recycle();
    }
    
    public void a(final Activity defaultOnClickListener) {
        this.f.setDefaultOnClickListener(defaultOnClickListener);
    }
    
    @Override
    protected void onFinishInflate() {
        if (this.c == 0) {
            throw new IllegalStateException("The bar layout resource id is undefined");
        }
        final Context context = this.getContext();
        final View inflate = LayoutInflater.from(context).inflate(this.c, (ViewGroup)this, false);
        this.addView(inflate);
        this.setBottomDockView(inflate);
        if (this.getResources().getConfiguration().fontScale > 1.0f) {
            inflate.getLayoutParams().height = -2;
        }
        final String a = com.twitter.library.featureswitch.d.a("android_entrypoints_2_2997");
        View viewById2;
        if ("three_tab_labeled".equals(a) || "two_tab_labeled".equals(a) || "three_tab_unlabeled".equals(a)) {
            final View viewById = inflate.findViewById(2131886922);
            com.twitter.util.t.c(inflate.findViewById(2131886921));
            viewById2 = viewById;
        }
        else if ("single_entrypoint_fab".equals(a) || "split_fab".equals(a) || "split_fab_w_drafts".equals(a)) {
            inflate.setVisibility(8);
            com.twitter.util.t.c(inflate.findViewById(2131886921));
            com.twitter.util.t.c(inflate.findViewById(2131886922));
            this.b = true;
            viewById2 = null;
        }
        else {
            viewById2 = inflate.findViewById(2131886921);
            com.twitter.util.t.c(inflate.findViewById(2131886922));
            final TextView g = (TextView)viewById2.findViewById(2131886755);
            g.setContentDescription((CharSequence)context.getString(2131296907));
            g.setTypeface(ag.a(context).a);
            this.g = g;
        }
        if (viewById2 != null) {
            final ar ar = new ar(this);
            viewById2.setOnClickListener((View$OnClickListener)ar);
            viewById2.findViewById(2131886755).setOnClickListener((View$OnClickListener)ar);
            final View viewById3 = viewById2.findViewById(2131886749);
            viewById3.setOnClickListener((View$OnClickListener)ar);
            viewById2.findViewById(2131886752).setOnClickListener((View$OnClickListener)ar);
            switch (a) {
                case "two_tab_labeled": {
                    viewById3.setVisibility(8);
                    viewById2.findViewById(2131886109).setVisibility(8);
                    ((ImageView)viewById2.findViewById(2131886923)).setImageDrawable(this.getResources().getDrawable(2130838844));
                    break;
                }
                case "three_tab_labeled": {
                    ((TextView)viewById2.findViewById(2131886751)).setText((CharSequence)context.getString(2131296412));
                    break;
                }
                case "three_tab_unlabeled": {
                    viewById2.findViewById(2131886754).setVisibility(8);
                    viewById2.findViewById(2131886748).setVisibility(8);
                    viewById2.findViewById(2131886751).setVisibility(8);
                    break;
                }
            }
            this.d = viewById2;
        }
        this.f = (LoggedOutBar)this.findViewById(2131886901);
        super.onFinishInflate();
    }
    
    @Override
    public void setBottomVisible(final boolean bottomVisible) {
        if (this.f.getVisibility() != 0 && this.b && this.e != null) {
            this.e.a(bottomVisible);
            return;
        }
        super.setBottomVisible(bottomVisible);
    }
    
    public void setComposerDockListener(final at a) {
        this.a = a;
    }
    
    public void setComposerHintText(final String hint) {
        if (this.g != null) {
            this.g.setHint((CharSequence)hint);
        }
    }
    
    public void setFabLayout(final FloatingActionButtonLayout e) {
        if (this.e != null) {
            this.e.setFabListener(null);
        }
        if (e != null) {
            final String a = com.twitter.library.featureswitch.d.a("android_entrypoints_2_2997");
            e.a(this.b);
            e.setSplitMode("split_fab".equals(a) || "split_fab_w_drafts".equals(a));
            e.setShowDraftsFab("split_fab_w_drafts".equals(a));
            e.setFabListener(new as(this));
        }
        this.e = e;
    }
    
    public void setLoggedOutMode(final boolean b) {
        int visibility = 8;
        if (this.d != null) {
            final View d = this.d;
            int visibility2;
            if (b) {
                visibility2 = visibility;
            }
            else {
                visibility2 = 0;
            }
            d.setVisibility(visibility2);
        }
        if (this.b && this.e != null) {
            this.e.a(!b);
        }
        final LoggedOutBar f = this.f;
        if (b) {
            visibility = 0;
        }
        f.setVisibility(visibility);
        boolean bottomVisible = false;
        Label_0101: {
            if (!b) {
                final boolean b2 = this.b;
                bottomVisible = false;
                if (b2) {
                    break Label_0101;
                }
            }
            bottomVisible = true;
        }
        super.setBottomVisible(bottomVisible);
    }
}
