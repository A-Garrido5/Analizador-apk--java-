// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import com.twitter.library.media.decoder.ImageDecoder$ScaleType;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.widget.e;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import com.twitter.library.media.widget.BaseMediaImageView;
import android.content.res.Resources;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Bitmap;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.media.widget.VideoDurationView;
import com.twitter.internal.android.widget.RichImageView;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.ImageView;
import android.view.View;
import com.twitter.library.media.widget.o;
import com.twitter.library.widget.AspectRatioFrameLayout;
import android.view.animation.Animation;
import com.twitter.library.util.f;

class bk extends f
{
    final /* synthetic */ VideoSegmentListItemView a;
    
    bk(final VideoSegmentListItemView a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.k.setVisibility(8);
    }
}
