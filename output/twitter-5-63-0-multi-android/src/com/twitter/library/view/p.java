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
import android.view.animation.Animation;
import com.twitter.internal.android.widget.TypefacesTextView;

class p implements Runnable
{
    final /* synthetic */ ScrollingMarqueeTextView a;
    
    p(final ScrollingMarqueeTextView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.a();
    }
}
