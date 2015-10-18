// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.view.View$OnClickListener;

class r3 implements View$OnClickListener
{
    final GroupChatRecentLocationsActivity a;
    
    r3(final GroupChatRecentLocationsActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        GroupChatRecentLocationsActivity.a(this.a, -1);
        GroupChatRecentLocationsActivity.k(this.a).runOnFirstFix((Runnable)new _1(this));
    }
}
