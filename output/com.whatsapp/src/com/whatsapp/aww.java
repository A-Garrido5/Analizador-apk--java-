// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.Location;
import com.google.android.maps.MapView;
import android.content.Context;

class aww extends awq
{
    final GroupChatLiveLocationsActivity h;
    
    aww(final GroupChatLiveLocationsActivity h, final Context context, final MapView mapView) {
        this.h = h;
        super(context, mapView);
    }
    
    public void onLocationChanged(final Location location) {
        super.onLocationChanged(location);
    }
}
