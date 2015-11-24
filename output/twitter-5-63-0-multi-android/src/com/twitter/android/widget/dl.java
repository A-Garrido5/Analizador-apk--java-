// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.drawable.Drawable;
import com.twitter.library.util.bq;
import android.graphics.Bitmap;
import android.view.TouchDelegate;
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
import android.view.View;
import android.view.View$OnClickListener;

class dl implements View$OnClickListener
{
    final /* synthetic */ MediaStoreItemView a;
    
    dl(final MediaStoreItemView a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.q != null) {
            this.a.q.a(this.a);
        }
    }
}
