// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.CameraUpdateFactory;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.view.View$OnClickListener;

class fg implements View$OnClickListener
{
    final LocationPicker2 a;
    final ImageView b;
    
    fg(final LocationPicker2 a, final ImageView b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        if (LocationPicker2.l(this.a).getVisibility() == 0) {
            final ViewGroup viewGroup = (ViewGroup)this.a.findViewById(2131755491);
            if (viewGroup != null) {
                final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, 0);
                layoutParams.weight = 0.4f;
                viewGroup.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
            LocationPicker2.l(this.a).setVisibility(8);
            this.b.setImageResource(2130837655);
            if (LocationPicker2.g(this.a) != null) {
                LocationPicker2.g(this.a).animateCamera(CameraUpdateFactory.zoomBy(0.5f));
                if (LocationPicker2.o(this.a) != null && LocationPicker2.o(this.a).tag != null) {
                    ((Marker)LocationPicker2.o(this.a).tag).showInfoWindow();
                }
            }
            LocationPicker2.u(this.a).setVisibility(8);
            LocationPicker2.j(this.a).setVisibility(0);
            if (!App.I) {
                return;
            }
        }
        LocationPicker2.l(this.a).setVisibility(0);
        this.b.setImageResource(2130837658);
        if (LocationPicker2.g(this.a) != null) {
            final CameraPosition cameraPosition = LocationPicker2.g(this.a).getCameraPosition();
            LocationPicker2.g(this.a).animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(cameraPosition.target).zoom(cameraPosition.zoom - 0.5f).tilt(0.0f).bearing(0.0f).build()));
            if (LocationPicker2.o(this.a) != null && LocationPicker2.o(this.a).tag != null) {
                ((Marker)LocationPicker2.o(this.a).tag).hideInfoWindow();
            }
        }
        LocationPicker2.j(this.a).setVisibility(8);
    }
}
