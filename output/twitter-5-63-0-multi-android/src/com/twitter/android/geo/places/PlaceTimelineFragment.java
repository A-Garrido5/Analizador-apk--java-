// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo.places;

import com.twitter.android.widget.ScrollingHeaderTimelineFragment;

public class PlaceTimelineFragment extends ScrollingHeaderTimelineFragment
{
    private l k;
    private boolean l;
    
    public void L() {
        this.l = false;
    }
    
    public void a(final l k) {
        this.k = k;
    }
    
    @Override
    protected boolean c(final int n) {
        if (n == 1 && this.k != null) {
            this.l = true;
            this.k.k();
            return true;
        }
        return false;
    }
    
    @Override
    protected boolean f(final int n) {
        return super.f(n) && n == 1;
    }
    
    @Override
    protected void i() {
    }
    
    @Override
    protected boolean o(final int n) {
        return n == 1 && this.l;
    }
}
