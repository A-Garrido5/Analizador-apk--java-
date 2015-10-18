// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.os.Parcelable;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnClickListener;
import com.twitter.library.media.model.MediaType;
import android.view.animation.Animation$AnimationListener;
import java.util.concurrent.Callable;
import com.twitter.util.concurrent.m;
import com.twitter.util.concurrent.b;
import java.util.NoSuchElementException;
import com.twitter.util.concurrent.i;
import android.net.Uri;
import android.animation.LayoutTransition$TransitionListener;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.view.animation.AnimationUtils;
import com.twitter.library.featureswitch.d;
import android.view.LayoutInflater;
import android.view.View;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.widget.EditableMediaView;
import com.twitter.library.media.model.EditableMedia;
import android.view.animation.Animation;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.twitter.android.gh;
import android.widget.LinearLayout;
import com.twitter.library.media.widget.e;
import com.twitter.library.media.widget.MediaImageView;
import android.graphics.Bitmap;
import com.twitter.library.media.widget.BaseMediaImageView;
import com.twitter.library.media.widget.o;

class w implements o
{
    final /* synthetic */ MediaAttachmentsView a;
    
    w(final MediaAttachmentsView a) {
        this.a = a;
    }
    
    public void a(final MediaImageView mediaImageView, final Bitmap bitmap) {
        if (bitmap != null) {
            mediaImageView.startAnimation(this.a.e);
            mediaImageView.setOnImageLoadedListener(null);
        }
    }
}
