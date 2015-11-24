// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import com.twitter.library.util.bq;
import android.graphics.Bitmap;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.EditableVideo;
import com.twitter.library.media.model.VideoFile;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import java.util.concurrent.Future;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.media.model.m;
import android.widget.TextView;
import com.twitter.library.media.widget.VideoDurationView;
import android.widget.ImageView;
import com.twitter.library.widget.AspectRatioFrameLayout;
import android.view.TouchDelegate;
import android.view.View;

class dm implements Runnable
{
    final /* synthetic */ View a;
    final /* synthetic */ MediaStoreItemView b;
    
    dm(final MediaStoreItemView b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.setTouchDelegate(new TouchDelegate(this.b.a(this.a), this.b.i));
    }
}
