// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.MotionEvent;
import android.view.View;
import android.support.v4.view.ViewPager;
import android.support.v4.view.GestureDetectorCompat;
import android.view.View$OnTouchListener;

class ic implements View$OnTouchListener
{
    final /* synthetic */ GestureDetectorCompat a;
    final /* synthetic */ ViewPager b;
    final /* synthetic */ GalleryActivity c;
    
    ic(final GalleryActivity c, final GestureDetectorCompat a, final ViewPager b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        this.a.onTouchEvent(motionEvent);
        return this.b.dispatchTouchEvent(motionEvent);
    }
}
