// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.widget.DockLayout;
import com.twitter.refresh.widget.e;

public class fn implements e
{
    private final DockLayout a;
    
    public fn(final DockLayout a) {
        this.a = a;
    }
    
    @Override
    public void a_(final boolean b) {
        this.a.setTopLocked(!b);
    }
    
    @Override
    public void af_() {
        this.a.setTopLocked(false);
    }
    
    @Override
    public void k_() {
        this.a.setTopLocked(true);
    }
}
