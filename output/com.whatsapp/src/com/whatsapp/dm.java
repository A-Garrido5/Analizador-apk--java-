// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class dm implements View$OnClickListener
{
    final GroupChatRecentLocationsActivity a;
    
    dm(final GroupChatRecentLocationsActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        GroupChatRecentLocationsActivity.h(this.a);
        if (GroupChatRecentLocationsActivity.a(this.a) >= GroupChatRecentLocationsActivity.d(this.a).size()) {
            GroupChatRecentLocationsActivity.a(this.a, -1);
        }
        GroupChatRecentLocationsActivity.e(this.a);
    }
}
