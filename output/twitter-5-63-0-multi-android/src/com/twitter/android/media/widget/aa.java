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
import android.view.animation.Animation$AnimationListener;
import java.util.concurrent.Callable;
import com.twitter.util.concurrent.m;
import com.twitter.util.concurrent.b;
import java.util.NoSuchElementException;
import android.net.Uri;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.view.animation.AnimationUtils;
import com.twitter.library.featureswitch.d;
import android.view.LayoutInflater;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.model.EditableImage;
import com.twitter.library.media.model.EditableMedia;
import android.view.animation.Animation;
import com.twitter.android.gh;
import android.widget.LinearLayout;
import android.animation.LayoutTransition$TransitionListener;
import com.twitter.library.media.widget.EditableMediaView;
import android.view.View;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.twitter.library.util.i;

class aa extends i
{
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ LayoutTransition b;
    final /* synthetic */ MediaAttachmentsView c;
    
    aa(final MediaAttachmentsView c, final ViewGroup a, final LayoutTransition b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void endTransition(final LayoutTransition layoutTransition, final ViewGroup viewGroup, final View view, final int n) {
        if (n == 1 && view == this.c.c) {
            final View child = this.a.getChildAt(0);
            this.a.removeView(child);
            this.c.addView(child, 0);
            this.c.m = (EditableMediaView)child;
            this.c.a((EditableMediaView)child, false);
            this.b.removeTransitionListener((LayoutTransition$TransitionListener)this);
        }
    }
}
