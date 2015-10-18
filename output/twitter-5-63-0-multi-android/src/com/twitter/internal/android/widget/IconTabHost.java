// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.TabHost;

public class IconTabHost extends TabHost
{
    private x a;
    
    public IconTabHost(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public void dispatchWindowFocusChanged(final boolean b) {
        if (this.getCurrentView() != null) {
            super.dispatchWindowFocusChanged(b);
        }
    }
    
    public void onTouchModeChanged(final boolean b) {
    }
    
    public void setCurrentTab(final int currentTab) {
        if (currentTab == this.getCurrentTab()) {
            if (this.a != null) {
                this.a.h();
            }
            return;
        }
        super.setCurrentTab(currentTab);
    }
    
    public void setOnTabClickedListener(final x a) {
        this.a = a;
    }
}
