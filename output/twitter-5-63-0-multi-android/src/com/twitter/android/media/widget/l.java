// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class l implements View$OnTouchListener
{
    final /* synthetic */ FilterFilmstripView a;
    
    l(final FilterFilmstripView a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.a.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        return false;
    }
}
