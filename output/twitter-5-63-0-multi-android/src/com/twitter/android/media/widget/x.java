// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.os.Parcelable;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.media.widget.e;
import android.view.View$OnClickListener;
import com.twitter.library.media.model.MediaType;
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
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.widget.EditableMediaView;
import com.twitter.library.media.model.EditableMedia;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.twitter.android.gh;
import android.widget.LinearLayout;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.view.View;
import com.twitter.library.util.f;

class x extends f
{
    final /* synthetic */ View a;
    final /* synthetic */ MediaAttachmentsView b;
    
    x(final MediaAttachmentsView b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.b.o = false;
        this.b.post((Runnable)new y(this));
        this.b.f.setAnimationListener((Animation$AnimationListener)null);
    }
}
