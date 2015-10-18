// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.dynamic.zzd;
import android.os.Bundle;
import android.os.IInterface;

public interface IMapFragmentDelegate extends IInterface
{
    void getMapAsync(final zzm p0);
    
    void onCreate(final Bundle p0);
    
    zzd onCreateView(final zzd p0, final zzd p1, final Bundle p2);
    
    void onDestroy();
    
    void onDestroyView();
    
    void onInflate(final zzd p0, final GoogleMapOptions p1, final Bundle p2);
    
    void onLowMemory();
    
    void onPause();
    
    void onResume();
    
    void onSaveInstanceState(final Bundle p0);
}
