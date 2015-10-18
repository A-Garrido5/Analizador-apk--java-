// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import android.graphics.Rect;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.moments.CropData;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.api.moments.Moment;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
import com.twitter.android.moments.viewmodels.CarouselImageHeroMomentModule;
import android.view.ViewGroup;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.android.moments.ui.FillCropFrameLayout;

class e
{
    private final FillCropFrameLayout a;
    private final MediaImageView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    
    public e(final ViewGroup viewGroup) {
        this.a = (FillCropFrameLayout)viewGroup.findViewById(2131886960);
        this.b = (MediaImageView)viewGroup.findViewById(2131886953);
        this.c = (TextView)viewGroup.findViewById(2131886950);
        this.e = (TextView)viewGroup.findViewById(2131886963);
        this.d = (TextView)viewGroup.findViewById(2131886951);
    }
    
    public void a(final CarouselImageHeroMomentModule carouselImageHeroMomentModule) {
        final Moment c = carouselImageHeroMomentModule.c();
        final MediaEntity a = carouselImageHeroMomentModule.a();
        final CropData b = carouselImageHeroMomentModule.b();
        final FillCropFrameLayout a2 = this.a;
        final Size size = a.size;
        Rect a3;
        if (b == null) {
            a3 = null;
        }
        else {
            a3 = b.a();
        }
        a2.a(size, a3);
        this.b.setScaleType(BaseMediaImageView$ScaleType.a);
        this.b.a(new k(a.mediaUrl), true);
        this.c.setText((CharSequence)c.b);
        this.d.setText((CharSequence)"Started 6AM");
        if (c.d) {
            this.e.setVisibility(0);
            return;
        }
        this.e.setVisibility(8);
    }
}
