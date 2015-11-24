// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import com.twitter.library.widget.aj;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.widget.SlidingUpPanelLayout;
import android.view.View;
import com.twitter.library.widget.SlidingPanel;
import com.twitter.library.widget.al;

class qy extends al
{
    private final SlidingPanel a;
    private final qz b;
    
    public qy(final SlidingPanel a, final qz b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        this.b.a(true);
        this.a.a(2);
    }
    
    @Override
    public void b(final View view) {
        this.b.a(false);
    }
}
