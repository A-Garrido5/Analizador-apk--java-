// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnLayoutChangeListener;
import com.twitter.library.widget.AspectRatioFrameLayout;
import com.twitter.android.widget.ez;
import android.widget.ListAdapter;
import com.twitter.util.r;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import com.twitter.internal.android.widget.ToolBar;
import android.widget.ListView;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.graphics.Rect;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.moments.CropData;
import com.twitter.library.api.moments.Moment;
import com.twitter.library.api.MediaEntity;
import android.view.View;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.android.moments.ui.FillCropFrameLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;
import com.twitter.android.moments.viewmodels.CarouselImageHeroMomentModule;
import com.twitter.android.client.TwitterFragmentActivity;

public class GuideActivity extends TwitterFragmentActivity
{
    private void a(final CarouselImageHeroMomentModule carouselImageHeroMomentModule, final ViewGroup viewGroup) {
        final MediaEntity a = carouselImageHeroMomentModule.a();
        final TextView textView = (TextView)viewGroup.findViewById(2131886950);
        final TextView textView2 = (TextView)viewGroup.findViewById(2131886951);
        final TextView textView3 = (TextView)viewGroup.findViewById(2131886963);
        final Moment c = carouselImageHeroMomentModule.c();
        textView.setText((CharSequence)c.b);
        textView2.setText((CharSequence)"Ends at 12PM");
        final Button button = (Button)viewGroup.findViewById(2131886394);
        if (c.c) {
            button.setVisibility(0);
        }
        if (c.d) {
            textView3.setVisibility(0);
        }
        else {
            textView3.setVisibility(8);
        }
        final FillCropFrameLayout fillCropFrameLayout = (FillCropFrameLayout)viewGroup.findViewById(2131886960);
        if (a.type == MediaEntity$Type.b) {
            final CropData b = carouselImageHeroMomentModule.b();
            final Size size = a.size;
            Rect a2;
            if (b == null) {
                a2 = null;
            }
            else {
                a2 = b.a();
            }
            fillCropFrameLayout.a(size, a2);
            final MediaImageView mediaImageView = new MediaImageView(fillCropFrameLayout.getContext());
            mediaImageView.setScaleType(BaseMediaImageView$ScaleType.a);
            mediaImageView.a(new k(a.mediaUrl));
            fillCropFrameLayout.addView((View)mediaImageView);
        }
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.c(2130968893);
        return a;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        final ListView listView = (ListView)this.findViewById(2131886957);
        final ToolBar toolBar = (ToolBar)this.findViewById(2131886153);
        toolBar.setBackgroundDrawable(this.getResources().getDrawable(2130837504));
        final LayoutInflater from = LayoutInflater.from((Context)this);
        final ez adapter = new ez(new BaseAdapter[] { new com.twitter.android.moments.ui.guide.d(new j(from, (ViewGroup)listView, "Today's Moments"), (ListAdapter)new h(from, gt.F)), new c(from, gt.G), new com.twitter.android.moments.ui.guide.d(new j(from, (ViewGroup)listView, "Future Moments"), (ListAdapter)new h(from, gt.F)) }, 2);
        final AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout)this.findViewById(2131886958);
        this.a(gt.E, (ViewGroup)aspectRatioFrameLayout);
        toolBar.addOnLayoutChangeListener((View$OnLayoutChangeListener)new a(this, aspectRatioFrameLayout, toolBar, new m(aspectRatioFrameLayout, listView, this.findViewById(2131886964))));
        listView.setAdapter((ListAdapter)adapter);
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new b(this));
    }
}
