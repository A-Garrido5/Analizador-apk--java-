// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import com.twitter.library.provider.Tweet;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.Color;
import com.twitter.android.util.p;
import android.widget.SeekBar;
import com.twitter.library.featureswitch.d;
import android.content.Intent;
import com.twitter.library.util.an;
import android.net.Uri;
import com.twitter.library.av.model.Partner;
import com.twitter.android.av.af;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.twitter.android.av.ExternalActionButton;
import android.view.View$MeasureSpec;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build$VERSION;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.av.model.Audio;
import com.twitter.library.media.manager.q;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import com.twitter.android.av.AVBaseCardCanvasView;

public class AudioCardPlayerView extends AVBaseCardCanvasView
{
    boolean g;
    private final View h;
    private final ImageView i;
    private final ImageView j;
    private final TextView k;
    private final TextView l;
    private final q m;
    private Audio n;
    private float o;
    private int p;
    private int q;
    private int r;
    
    public AudioCardPlayerView(final Context context) {
        this(context, null, 0);
    }
    
    public AudioCardPlayerView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AudioCardPlayerView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        this.h = this.findViewById(2131886268);
        this.i = (ImageView)this.findViewById(2131886269);
        this.j = (ImageView)this.findViewById(2131886279);
        this.k = (TextView)this.findViewById(2131886281);
        this.l = (TextView)this.findViewById(2131886280);
        this.m = com.twitter.library.media.manager.q.a(context);
        if (set == null) {
            return;
        }
        TypedArray obtainStyledAttributes = null;
        try {
            obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, pa.AudioCardPlayerView, n, 0);
            this.o = obtainStyledAttributes.getDimension(0, Float.NaN);
        }
        finally {
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
        }
    }
    
    private void a(final String s, final ImageView imageView) {
        this.m.a((com.twitter.library.media.manager.k)com.twitter.library.media.manager.j.a(s).a(new c(this, imageView)));
    }
    
    @TargetApi(21)
    private void p() {
        int n;
        if (this.getResources().getConfiguration().orientation == 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        final View b = this.b;
        int backgroundColor;
        if (n != 0) {
            backgroundColor = this.q;
        }
        else {
            backgroundColor = this.r;
        }
        b.setBackgroundColor(backgroundColor);
        if (Build$VERSION.SDK_INT >= 21 && this.getContext() instanceof Activity) {
            ((Activity)this.getContext()).getWindow().setStatusBarColor(this.r);
        }
    }
    
    @Override
    protected void g() {
        final Audio n = (Audio)this.f.z();
        if (n == null) {
            return;
        }
        this.n = n;
        this.a(n.k(), this.i);
        this.k.setText((CharSequence)n.j());
        this.l.setText((CharSequence)n.f());
    }
    
    @Override
    protected int getLayoutId() {
        return 2130968597;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.p();
        super.onLayout(b, n, n2, n3, n4);
    }
    
    protected void onMeasure(final int n, final int n2) {
        int min = Math.min(View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n2));
        if (!Float.isNaN(this.o)) {
            min = (int)Math.min(min, this.o);
        }
        int n3 = View$MeasureSpec.makeMeasureSpec(min, View$MeasureSpec.getMode(n));
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n3), 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2), 0);
        ((ExternalActionButton)this.c).measure(measureSpec, measureSpec2);
        this.b.measure(measureSpec, measureSpec2);
        this.p = ((ExternalActionButton)this.c).getMeasuredHeight() + this.b.getMeasuredHeight();
        final RelativeLayout$LayoutParams layoutParams = (RelativeLayout$LayoutParams)this.h.getLayoutParams();
        if (layoutParams != null) {
            int size = View$MeasureSpec.getSize(n3);
            final int size2 = View$MeasureSpec.getSize(n2);
            if (this.getResources().getConfiguration().orientation == 2) {
                this.h.setPadding(0, 0, 0, 0);
            }
            else {
                this.h.setPadding(0, 0, 0, this.p);
            }
            if (size > size2 - this.h.getPaddingBottom()) {
                size = size2 - this.h.getPaddingBottom();
                n3 = View$MeasureSpec.makeMeasureSpec(size, View$MeasureSpec.getMode(n3));
            }
            layoutParams.width = size;
            layoutParams.height = size + this.h.getPaddingBottom();
            this.h.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        super.onMeasure(n3, n2);
    }
    
    public void setCallToActionListener(final af eventLister) {
        ((ExternalActionButton)this.c).setEventLister(eventLister);
    }
    
    @Override
    public void setPartner(final Partner partner) {
        if (partner != null && this.n != null) {
            final Context context = this.getContext();
            final String a = partner.a();
            int n;
            int n2;
            if ("learn".equals(this.n.h())) {
                n = 2131296351;
                n2 = 2131296351;
            }
            else {
                n2 = 2131296350;
                n = 2131296352;
            }
            ((ExternalActionButton)this.c).setActionText(context.getString(n2, new Object[] { partner }));
            ((ExternalActionButton)this.c).setExternalUri(Uri.parse(this.n.g()));
            ((ExternalActionButton)this.c).setFallbackText(context.getString(n, new Object[] { partner }));
            final Tweet q = this.f.q();
            String ac;
            if (q != null) {
                ac = q.ac();
            }
            else {
                ac = null;
            }
            if (ac != null) {
                ((ExternalActionButton)this.c).setFallbackIntent(new Intent("android.intent.action.VIEW", Uri.parse(an.a(context, ac))));
            }
            this.g = "dark".equals(com.twitter.library.featureswitch.d.a("audio_configurations_audio_player_asset_theme_%s", new Object[] { a }).toLowerCase());
            final Resources resources = this.getResources();
            int textColor;
            int textColor2;
            Drawable progressDrawable;
            Drawable thumb;
            if (this.g) {
                final int color = resources.getColor(2131689520);
                final int color2 = resources.getColor(2131689520);
                final Drawable drawable = resources.getDrawable(2130838714);
                final Drawable drawable2 = resources.getDrawable(2130838712);
                this.a.setColorFilter(color);
                this.e.setColorFilter(color);
                textColor = color;
                textColor2 = color2;
                progressDrawable = drawable;
                thumb = drawable2;
            }
            else {
                final int color3 = resources.getColor(2131689637);
                final int color4 = resources.getColor(2131689627);
                final Drawable drawable3 = resources.getDrawable(2130838717);
                final Drawable drawable4 = resources.getDrawable(2130838713);
                textColor = color3;
                textColor2 = color4;
                progressDrawable = drawable3;
                thumb = drawable4;
            }
            this.l.setTextColor(textColor);
            this.k.setTextColor(textColor2);
            ((TextView)this.b.findViewById(2131886274)).setTextColor(textColor2);
            ((TextView)this.b.findViewById(2131886276)).setTextColor(textColor2);
            final SeekBar seekBar = (SeekBar)this.findViewById(2131886275);
            seekBar.setProgressDrawable(progressDrawable);
            seekBar.setThumb(thumb);
            final int a2 = com.twitter.android.util.p.a(com.twitter.library.featureswitch.d.a("audio_configurations_audio_player_control_background_color_%s", new Object[] { a }), resources.getColor(2131689482));
            this.q = Color.argb(204, Color.red(a2), Color.green(a2), Color.blue(a2));
            this.r = Color.argb(255, Color.red(a2), Color.green(a2), Color.blue(a2));
            ((ExternalActionButton)this.c).setTextColor(com.twitter.android.util.p.a(com.twitter.library.featureswitch.d.a("audio_configurations_audio_player_cta_color_%s", new Object[] { a }), a2));
            this.a.getBackground().setColorFilter(this.q, PorterDuff$Mode.SRC_ATOP);
            this.p();
            final Drawable indeterminateDrawable = this.d.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                int n3;
                if (this.g) {
                    n3 = Color.argb(204, 0, 0, 0);
                }
                else {
                    n3 = Color.argb(204, 255, 255, 255);
                }
                indeterminateDrawable.setColorFilter(n3, PorterDuff$Mode.SRC_IN);
            }
            this.a(com.twitter.library.featureswitch.d.a("audio_configurations_audio_player_partner_logo_%s", new Object[] { a }), this.j);
            final Drawable background = this.i.getBackground();
            if (background != null) {
                background.setColorFilter((ColorFilter)com.twitter.android.util.p.d(com.twitter.android.util.p.f(a2, 0.88f), 0.8f));
            }
        }
    }
}
