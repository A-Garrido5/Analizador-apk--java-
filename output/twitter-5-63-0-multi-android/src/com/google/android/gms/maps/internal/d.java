// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.model.internal.t;
import android.location.Location;
import com.google.android.gms.maps.model.internal.c;
import com.google.android.gms.dynamic.k;
import android.os.Bundle;
import com.google.android.gms.maps.model.internal.z;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.internal.p;
import com.google.android.gms.maps.model.internal.w;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.internal.e;
import com.google.android.gms.maps.model.internal.q;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.internal.m;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.internal.b;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.internal.ac;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.CameraPosition;
import android.os.IInterface;

public interface d extends IInterface
{
    CameraPosition a();
    
    ac a(final TileOverlayOptions p0);
    
    b a(final PolylineOptions p0);
    
    m a(final CircleOptions p0);
    
    q a(final GroundOverlayOptions p0);
    
    q a(final GroundOverlayOptions p0, final e p1);
    
    w a(final MarkerOptions p0);
    
    w a(final MarkerOptions p0, final p p1);
    
    z a(final PolygonOptions p0);
    
    void a(final int p0);
    
    void a(final int p0, final int p1, final int p2, final int p3);
    
    void a(final Bundle p0);
    
    void a(final k p0);
    
    void a(final k p0, final int p1, final aj p2);
    
    void a(final k p0, final aj p1);
    
    void a(final ap p0);
    
    void a(final as p0);
    
    void a(final av p0);
    
    void a(final ay p0);
    
    void a(final bb p0);
    
    void a(final bh p0);
    
    void a(final bk p0);
    
    void a(final bn p0);
    
    void a(final bq p0);
    
    void a(final bt p0);
    
    void a(final bw p0);
    
    void a(final bz p0);
    
    void a(final cc p0);
    
    void a(final cr p0, final k p1);
    
    void a(final g p0);
    
    void a(final c p0);
    
    void a(final c p0, final int p1, final aj p2);
    
    void a(final c p0, final aj p1);
    
    void a(final String p0);
    
    void a(final boolean p0);
    
    float b();
    
    void b(final Bundle p0);
    
    void b(final k p0);
    
    void b(final c p0);
    
    boolean b(final boolean p0);
    
    float c();
    
    void c(final boolean p0);
    
    void d();
    
    void d(final boolean p0);
    
    void e();
    
    int f();
    
    boolean g();
    
    boolean h();
    
    boolean i();
    
    Location j();
    
    com.google.android.gms.maps.internal.ac k();
    
    com.google.android.gms.maps.internal.p l();
    
    boolean m();
    
    t n();
    
    void o();
    
    void p();
    
    void q();
    
    void r();
    
    boolean s();
}
