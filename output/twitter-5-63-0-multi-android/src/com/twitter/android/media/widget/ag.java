// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.os.Parcelable;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.media.widget.e;
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
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Animation;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.twitter.android.gh;
import android.widget.LinearLayout;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.media.model.EditableImage;
import android.view.View;
import com.twitter.library.media.widget.EditableMediaView;
import android.view.View$OnClickListener;

class ag implements View$OnClickListener
{
    final /* synthetic */ MediaAttachmentsView a;
    private final EditableMediaView b;
    
    ag(final MediaAttachmentsView a, final EditableMediaView b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        if (this.a.q != null) {
            final EditableMedia editableMedia = this.b.getEditableMedia();
            if (editableMedia != null) {
                if (editableMedia instanceof EditableImage) {
                    this.a.r = (EditableImage)editableMedia;
                }
                this.a.q.a(editableMedia, (View)this.b);
            }
        }
    }
}
