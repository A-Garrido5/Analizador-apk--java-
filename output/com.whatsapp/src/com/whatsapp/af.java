// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import android.os.Build$VERSION;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.GoogleMap$OnMarkerClickListener;

class af implements GoogleMap$OnMarkerClickListener
{
    final LocationPicker2 a;
    
    af(final LocationPicker2 a) {
        this.a = a;
    }
    
    @Override
    public boolean onMarkerClick(final Marker marker) {
        final boolean i = App.I;
        if (marker.getId() == null) {
            return false;
        }
        if (LocationPicker2.o(this.a) != null && LocationPicker2.o(this.a).tag != null) {
            ((Marker)LocationPicker2.o(this.a).tag).setIcon(LocationPicker2.d(this.a));
        }
        marker.setIcon(LocationPicker2.s(this.a));
        for (final PlaceInfo placeInfo : LocationPicker2.k(this.a).d()) {
            if (marker.equals(placeInfo.tag)) {
                LocationPicker2.a(this.a, placeInfo);
                if (!i) {
                    break;
                }
            }
            if (i) {
                break;
            }
        }
        final int a = LocationPicker2.k(this.a).a(LocationPicker2.o(this.a));
        Label_0206: {
            if (a >= 0) {
                LocationPicker2.c(this.a).notifyDataSetChanged();
                if (Build$VERSION.SDK_INT >= 8) {
                    LocationPicker2.a(this.a).smoothScrollToPosition(a);
                    if (!i) {
                        break Label_0206;
                    }
                }
                LocationPicker2.a(this.a).setSelection(a);
            }
        }
        LocationPicker2.u(this.a).setVisibility(8);
        LocationPicker2.j(this.a).setVisibility(8);
        return LocationPicker2.l(this.a).getVisibility() == 0;
    }
}
