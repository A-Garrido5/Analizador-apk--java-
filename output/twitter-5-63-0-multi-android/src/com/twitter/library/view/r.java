// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.os.Parcelable;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import com.twitter.library.util.bk;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.view.animation.Animation;
import com.twitter.library.util.f;

class r extends f
{
    final /* synthetic */ ScrollingMarqueeTextView a;
    
    r(final ScrollingMarqueeTextView a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.setVisibility(8);
        this.a.b(1 + this.a.a);
    }
}
