// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bt;
import android.view.MotionEvent;
import android.content.Context;

class GroupChatLiveLocationsActivity$3 extends GoogleMapView
{
    final GroupChatLiveLocationsActivity f;
    
    GroupChatLiveLocationsActivity$3(final GroupChatLiveLocationsActivity f, final Context context) {
        this.f = f;
        super(context);
    }
    
    @Override
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        GroupChatLiveLocationsActivity.a(this.f, null);
        return super.dispatchTouchEvent(motionEvent);
    }
}
