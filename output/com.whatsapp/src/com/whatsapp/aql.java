// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.GoogleMap$OnMapClickListener;

class aql implements GoogleMap$OnMapClickListener
{
    final LocationPicker2 a;
    
    aql(final LocationPicker2 a) {
        this.a = a;
    }
    
    @Override
    public void onMapClick(final LatLng latLng) {
        if (LocationPicker2.o(this.a) != null) {
            if (LocationPicker2.o(this.a).tag != null) {
                ((Marker)LocationPicker2.o(this.a).tag).setIcon(LocationPicker2.d(this.a));
            }
            LocationPicker2.a(this.a, (PlaceInfo)null);
            LocationPicker2.c(this.a).notifyDataSetChanged();
        }
        LocationPicker2.u(this.a).setVisibility(8);
    }
}
