// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.widget.TextSwitcherView;

public final class rj implements Runnable
{
    private final TextSwitcherView a;
    
    public rj(final TextSwitcherView a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.showNext();
    }
}
