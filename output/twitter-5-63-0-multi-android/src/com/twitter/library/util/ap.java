// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.view.MotionEvent;
import android.view.View;
import com.twitter.ui.widget.TwitterButton;

public abstract class ap extends ao
{
    private final TwitterButton a;
    
    public ap(final TwitterButton a) {
        this.a = a;
    }
    
    @Override
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        this.a.onTouch(view, motionEvent);
        return super.onTouch(view, motionEvent);
    }
}
