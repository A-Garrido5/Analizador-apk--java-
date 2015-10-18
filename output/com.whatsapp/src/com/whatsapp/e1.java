// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class e1 implements View$OnClickListener
{
    final GroupChatRecentLocationsActivity a;
    
    e1(final GroupChatRecentLocationsActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        GroupChatRecentLocationsActivity.b(this.a);
        if (GroupChatRecentLocationsActivity.a(this.a) < -1) {
            GroupChatRecentLocationsActivity.a(this.a, -1 + GroupChatRecentLocationsActivity.d(this.a).size());
        }
        GroupChatRecentLocationsActivity.e(this.a);
    }
}
