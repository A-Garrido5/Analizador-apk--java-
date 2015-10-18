// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.graphics.drawable.TransitionDrawable;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Collection;
import java.util.Set;
import android.view.View$MeasureSpec;
import com.twitter.android.util.l;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.hardware.Camera;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Animation;
import android.widget.ImageButton;
import com.twitter.android.widget.MultiToggleButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.widget.dq;
import android.view.View$OnTouchListener;
import android.widget.LinearLayout;
import android.view.View;
import android.view.View$OnClickListener;

class e implements View$OnClickListener
{
    final /* synthetic */ CameraToolbar a;
    
    e(final CameraToolbar a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.m != null) {
            this.a.m.a();
        }
    }
}
