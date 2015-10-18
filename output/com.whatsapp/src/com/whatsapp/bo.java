// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.whatsapp.protocol.bt;
import java.util.ArrayList;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.GoogleMap$OnMarkerClickListener;

class bo implements GoogleMap$OnMarkerClickListener
{
    final GroupChatLiveLocationsActivity2 a;
    
    bo(final GroupChatLiveLocationsActivity2 a) {
        this.a = a;
    }
    
    @Override
    public boolean onMarkerClick(final Marker marker) {
        final ArrayList<bt> list = GroupChatLiveLocationsActivity2.b(this.a).get(marker);
        GroupChatLiveLocationsActivity2.i(this.a).a(list);
        if (list.size() == 1) {
            GroupChatLiveLocationsActivity2.a(this.a, list.get(0));
        }
        GroupChatLiveLocationsActivity2.d(this.a);
        GroupChatLiveLocationsActivity2.b(this.a, true);
        GroupChatLiveLocationsActivity2.h(this.a).animateCamera(CameraUpdateFactory.newLatLng(marker.getPosition()));
        return true;
    }
}
