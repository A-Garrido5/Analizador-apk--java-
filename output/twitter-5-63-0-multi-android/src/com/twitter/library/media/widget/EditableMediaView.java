// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.media.model.EditableVideo;
import com.twitter.library.media.model.SegmentedVideoFile;
import com.twitter.library.media.model.MediaType;
import android.view.View$OnClickListener;
import com.twitter.library.media.model.EditableAnimatedGif;
import com.twitter.library.media.manager.k;
import com.twitter.library.featureswitch.d;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import com.twitter.ui.widget.f;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.twitter.internal.android.widget.RichImageView;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.model.EditableMedia;
import android.graphics.drawable.Drawable;
import android.view.View;

public class EditableMediaView extends MediaImageView
{
    private final View c;
    private final VideoDurationView d;
    private final View e;
    private final Drawable f;
    private final AnimatedGifView g;
    private EditableMedia h;
    private boolean i;
    
    public EditableMediaView(final Context context) {
        this(context, null);
        this.k();
    }
    
    public EditableMediaView(final Context context, final AttributeSet set) {
        this(context, set, kv.editableMediaViewStyle);
    }
    
    public EditableMediaView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n, new RichImageView(context), false);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.EditableMediaView, n, 0);
        final int resourceId = obtainStyledAttributes.getResourceId(li.EditableMediaView_layout, 0);
        this.f = obtainStyledAttributes.getDrawable(li.EditableMediaView_playerOverlay);
        int resourceId2;
        if (this.m()) {
            resourceId2 = obtainStyledAttributes.getResourceId(li.EditableMediaView_animatedGifViewLayout, 0);
        }
        else {
            resourceId2 = 0;
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            final View inflate = inflate(context, resourceId, (ViewGroup)this);
            this.c = inflate.findViewById(la.gif_badge);
            this.d = (VideoDurationView)inflate.findViewById(la.video_duration);
            this.e = inflate.findViewById(la.dismiss);
        }
        else {
            this.c = null;
            this.d = null;
            this.e = null;
        }
        if (this.getDefaultDrawable() == null) {
            final f defaultDrawable = new f(this.getContext(), (View)this.getImageView());
            defaultDrawable.b(0);
            defaultDrawable.setAlpha(255);
            defaultDrawable.a(new int[] { this.getResources().getColor(kx.twitter_blue) });
            this.setDefaultDrawable(defaultDrawable);
        }
        this.setErrorDrawableId(17170445);
        this.setScaleType(BaseMediaImageView$ScaleType.b);
        this.d();
        if (resourceId2 != 0) {
            this.addView((View)(this.g = (AnimatedGifView)inflate(context, resourceId2, (ViewGroup)null)), 0);
            this.g.setListener(new j(this));
            return;
        }
        this.g = null;
    }
    
    private boolean m() {
        return Build$VERSION.SDK_INT >= 17 && com.twitter.library.featureswitch.d.f("animated_content_composer_enabled") && com.twitter.library.featureswitch.d.f("animated_content_composer_animation_enabled");
    }
    
    @Override
    public boolean a(final k k, final boolean b) {
        throw new UnsupportedOperationException("Use setEditableMedia");
    }
    
    public boolean a(final EditableMedia h, final boolean i) {
        this.h = h;
        if (this.e != null) {
            this.e.setVisibility(0);
        }
        if (this.d != null) {
            this.d.setVisibility(8);
        }
        final RichImageView richImageView = (RichImageView)this.getImageView();
        if (this.g != null) {
            if (h instanceof EditableAnimatedGif) {
                this.i = i;
                this.setContentDescription((CharSequence)this.getResources().getString(lg.attached_gif));
                richImageView.setVisibility(8);
                if (this.c != null) {
                    this.c.setVisibility(0);
                }
                this.g.setOnClickListener((View$OnClickListener)null);
                this.g.setVisibility(0);
                this.g.setEditableAnimatedGif((EditableAnimatedGif)h);
                return true;
            }
            this.g.setEditableAnimatedGif(null);
            this.g.setVisibility(8);
        }
        if (this.c != null) {
            this.c.setVisibility(8);
        }
        richImageView.setVisibility(0);
        richImageView.setOverlayDrawable(null);
        if (h == null) {
            return this.j();
        }
        switch (com.twitter.library.media.widget.l.a[h.mediaFile.type.ordinal()]) {
            case 1: {
                this.setContentDescription((CharSequence)this.getResources().getString(lg.attached_gif));
                if (this.c != null) {
                    this.c.setVisibility(0);
                    break;
                }
                break;
            }
            case 2:
            case 3: {
                this.setContentDescription((CharSequence)this.getResources().getString(lg.attached_video));
                if (this.d != null) {
                    int duration;
                    if (h.mediaFile.type == MediaType.e) {
                        duration = ((SegmentedVideoFile)h.mediaFile).d();
                    }
                    else {
                        duration = ((EditableVideo)h).b();
                    }
                    this.d.setDuration(duration);
                    this.d.setVisibility(0);
                }
                richImageView.setOverlayDrawable(this.f);
                break;
            }
            case 4: {
                this.setContentDescription((CharSequence)this.getResources().getString(lg.attached_photo));
                break;
            }
        }
        return this.j();
    }
    
    public void g() {
        this.a(this.h, false);
    }
    
    public View getDismissView() {
        return this.e;
    }
    
    public EditableMedia getEditableMedia() {
        return this.h;
    }
    
    public boolean h() {
        if (this.e != null) {
            this.e.setVisibility(0);
        }
        return super.a(com.twitter.library.media.manager.j.a(""), true);
    }
    
    public boolean i() {
        return this.g != null && this.g.getVisibility() == 0;
    }
    
    boolean j() {
        if (this.h != null) {
            final k b = this.h.b(this.getContext());
            if (this.h.e() == MediaType.d) {
                b.b(((EditableVideo)this.h).clipStart);
            }
            return super.a(b, true);
        }
        return super.a((k)null, true);
    }
}
