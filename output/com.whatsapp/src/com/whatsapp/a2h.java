// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class a2h implements ViewTreeObserver$OnGlobalLayoutListener
{
    final GroupChatLiveLocationsActivity2 a;
    
    a2h(final GroupChatLiveLocationsActivity2 a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        GroupChatLiveLocationsActivity2.a(this.a).getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        if (GroupChatLiveLocationsActivity2.a(this.a).getWidth() > 0 && GroupChatLiveLocationsActivity2.a(this.a).getHeight() > 0) {
            GroupChatLiveLocationsActivity2.a(this.a, false);
        }
    }
}
