// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class at implements View$OnTouchListener
{
    final /* synthetic */ VideoSegmentEditView a;
    
    at(final VideoSegmentEditView a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }
}
