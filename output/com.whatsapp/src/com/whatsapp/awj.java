// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bt;
import android.view.View;
import android.view.View$OnClickListener;

class awj implements View$OnClickListener
{
    final GroupChatLiveLocationsActivity2 a;
    
    awj(final GroupChatLiveLocationsActivity2 a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        GroupChatLiveLocationsActivity2.a(this.a, null);
        GroupChatLiveLocationsActivity2.i(this.a).f();
        GroupChatLiveLocationsActivity2.d(this.a);
        GroupChatLiveLocationsActivity2.a(this.a).b();
    }
}
