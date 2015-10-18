// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bt;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.GoogleMap$OnMapClickListener;

class kd implements GoogleMap$OnMapClickListener
{
    final GroupChatLiveLocationsActivity2 a;
    
    kd(final GroupChatLiveLocationsActivity2 a) {
        this.a = a;
    }
    
    @Override
    public void onMapClick(final LatLng latLng) {
        GroupChatLiveLocationsActivity2.a(this.a, null);
        GroupChatLiveLocationsActivity2.i(this.a).f();
        GroupChatLiveLocationsActivity2.d(this.a);
    }
}
