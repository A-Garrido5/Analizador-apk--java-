// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.CameraPosition$Builder;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.GoogleMap;
import com.whatsapp.protocol.bi;
import com.google.android.gms.maps.OnMapReadyCallback;

class at3 implements OnMapReadyCallback
{
    final ConversationRowLocation a;
    final bi b;
    
    at3(final ConversationRowLocation a, final bi b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        final LatLng latLng = new LatLng(this.b.p, this.b.G);
        if (ConversationRowLocation.b() == null) {
            ConversationRowLocation.a(BitmapDescriptorFactory.fromResource(2130839001));
        }
        final MarkerOptions icon = new MarkerOptions().position(latLng).icon(ConversationRowLocation.b());
        googleMap.clear();
        googleMap.addMarker(icon);
        final int n = (int)(2.0f * vc.b().b);
        googleMap.setPadding(0, n * 2, n, n);
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition$Builder().target(latLng).zoom(15.0f).build()));
    }
}
