// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.GoogleMap$OnCameraChangeListener;

class y4 implements GoogleMap$OnCameraChangeListener
{
    final GroupChatLiveLocationsActivity2 a;
    
    y4(final GroupChatLiveLocationsActivity2 a) {
        this.a = a;
    }
    
    @Override
    public void onCameraChange(final CameraPosition cameraPosition) {
        if ((int)(5.0f * GroupChatLiveLocationsActivity2.f(this.a)) != (int)(5.0f * cameraPosition.zoom)) {
            GroupChatLiveLocationsActivity2.a(this.a, cameraPosition.zoom);
            GroupChatLiveLocationsActivity2.d(this.a);
        }
    }
}
