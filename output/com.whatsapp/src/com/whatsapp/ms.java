// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.gms.maps.model.Marker;
import android.view.View;
import android.view.View$OnClickListener;

class ms implements View$OnClickListener
{
    final LocationPicker2 a;
    
    ms(final LocationPicker2 a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        LocationPicker2.u(this.a).setVisibility(0);
        if (LocationPicker2.o(this.a) != null && LocationPicker2.o(this.a).tag != null) {
            ((Marker)LocationPicker2.o(this.a).tag).hideInfoWindow();
        }
    }
}
