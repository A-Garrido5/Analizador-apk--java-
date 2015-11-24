// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver$OnPreDrawListener;

class aq5 implements ViewTreeObserver$OnPreDrawListener
{
    final GroupChatLiveLocationsActivity a;
    
    aq5(final GroupChatLiveLocationsActivity a) {
        this.a = a;
    }
    
    public boolean onPreDraw() {
        GroupChatLiveLocationsActivity.b(this.a).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        GroupChatLiveLocationsActivity.d(this.a);
        return true;
    }
}
