// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.List;
import android.location.Address;
import android.content.Context;
import android.location.Geocoder;
import java.util.Locale;
import android.location.Location;

class zx implements Runnable
{
    private nl a;
    private Location b;
    
    public zx(final nl a, final Location b) {
        this.a = a;
        this.b = b;
        a.a = b.getLatitude();
        a.i = b.getLongitude();
        a.j = b.getAccuracy();
    }
    
    @Override
    public void run() {
        final Geocoder geocoder = new Geocoder((Context)App.aq, Locale.getDefault());
        while (true) {
            try {
                final List fromLocation = geocoder.getFromLocation(this.b.getLatitude(), this.b.getLongitude(), 1);
                if (fromLocation == null) {
                    break Label_0079;
                }
                try {
                    if (!fromLocation.isEmpty()) {
                        this.a.l = fromLocation.get(0).getLocality();
                    }
                    l7.y().a(this.a.f, this.a.a, this.a.i, this.a.j, this.a.l);
                    App.aq.a5().post((Runnable)new k(this));
                }
                catch (Exception ex) {
                    throw ex;
                }
            }
            catch (Exception ex2) {
                continue;
            }
            break;
        }
    }
}
