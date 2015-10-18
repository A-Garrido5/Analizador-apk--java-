// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.vineloops;

import android.view.MotionEvent;
import android.view.View;
import com.twitter.library.media.player.InlineVideoView;
import android.view.View$OnTouchListener;

class f implements View$OnTouchListener
{
    final /* synthetic */ InlineVideoView a;
    final /* synthetic */ b b;
    
    f(final b b, final InlineVideoView a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if ((0xFF & motionEvent.getAction()) == 0x0) {
            if (!this.a.b()) {
                this.a.pause();
            }
            else {
                this.a.c();
            }
            return true;
        }
        return false;
    }
}
