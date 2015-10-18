// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import android.os.IInterface;

public interface s extends IInterface
{
    k a(final StreetViewPanoramaOrientation p0);
    
    StreetViewPanoramaOrientation a(final k p0);
    
    void a(final cf p0);
    
    void a(final ci p0);
    
    void a(final cl p0);
    
    void a(final LatLng p0);
    
    void a(final LatLng p0, final int p1);
    
    void a(final StreetViewPanoramaCamera p0, final long p1);
    
    void a(final String p0);
    
    void a(final boolean p0);
    
    boolean a();
    
    void b(final boolean p0);
    
    boolean b();
    
    void c(final boolean p0);
    
    boolean c();
    
    void d(final boolean p0);
    
    boolean d();
    
    StreetViewPanoramaCamera e();
    
    StreetViewPanoramaLocation f();
}
