// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import com.google.android.gms.location.e;
import android.os.IBinder;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import java.util.List;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.location.l;
import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;

public interface bx extends IInterface
{
    Location a();
    
    Location a(final String p0);
    
    void a(final long p0, final boolean p1, final PendingIntent p2);
    
    void a(final PendingIntent p0);
    
    void a(final PendingIntent p0, final bu p1, final String p2);
    
    void a(final Location p0);
    
    void a(final Location p0, final int p1);
    
    void a(final bu p0, final String p1);
    
    void a(final nl p0, final PendingIntent p1);
    
    void a(final nl p0, final l p1);
    
    void a(final ns p0, final oh p1, final PendingIntent p2);
    
    void a(final nu p0, final oh p1, final cp p2);
    
    void a(final nw p0, final oh p1);
    
    void a(final ny p0, final oh p1, final PendingIntent p2);
    
    void a(final oc p0, final oh p1, final cp p2);
    
    void a(final oe p0, final LatLngBounds p1, final List p2, final oh p3, final cp p4);
    
    void a(final oh p0, final PendingIntent p1);
    
    void a(final GeofencingRequest p0, final PendingIntent p1, final bu p2);
    
    void a(final LocationRequest p0, final PendingIntent p1);
    
    void a(final LocationRequest p0, final l p1);
    
    void a(final LocationRequest p0, final l p1, final String p2);
    
    void a(final l p0);
    
    void a(final LatLng p0, final nu p1, final oh p2, final cp p3);
    
    void a(final LatLngBounds p0, final int p1, final nu p2, final oh p3, final cp p4);
    
    void a(final LatLngBounds p0, final int p1, final String p2, final nu p3, final oh p4, final cp p5);
    
    void a(final String p0, final oh p1, final cp p2);
    
    void a(final String p0, final LatLngBounds p1, final nq p2, final oh p3, final cp p4);
    
    void a(final List p0, final PendingIntent p1, final bu p2, final String p3);
    
    void a(final List p0, final oh p1, final cp p2);
    
    void a(final boolean p0);
    
    void a(final String[] p0, final bu p1, final String p2);
    
    IBinder b();
    
    e b(final String p0);
    
    void b(final PendingIntent p0);
    
    void b(final oh p0, final PendingIntent p1);
    
    void b(final String p0, final oh p1, final cp p2);
    
    IBinder c();
}
