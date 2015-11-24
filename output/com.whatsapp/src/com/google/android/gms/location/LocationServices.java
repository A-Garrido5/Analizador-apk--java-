// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.location;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.internal.zzj;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.internal.zzo;
import com.google.android.gms.location.internal.zze;
import com.google.android.gms.location.internal.zzd;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Api$zza;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.Api;

public class LocationServices
{
    public static final Api API;
    public static final FusedLocationProviderApi FusedLocationApi;
    public static final GeofencingApi GeofencingApi;
    public static final SettingsApi SettingsApi;
    private static final Api$ClientKey zzNX;
    private static final Api$zza zzNY;
    
    static {
        zzNX = new Api$ClientKey();
        zzNY = new LocationServices$1();
        API = new Api("LocationServices.API", LocationServices.zzNY, LocationServices.zzNX, new Scope[0]);
        FusedLocationApi = new zzd();
        GeofencingApi = new zze();
        SettingsApi = new zzo();
    }
    
    public static zzj zze(final GoogleApiClient googleApiClient) {
        boolean b = true;
        zzu.zzb(googleApiClient != null && b, "GoogleApiClient parameter is required.");
        final zzj zzj = (zzj)googleApiClient.zza(LocationServices.zzNX);
        if (zzj == null) {
            b = false;
        }
        zzu.zza(b, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return zzj;
    }
    
    static Api$ClientKey zzum() {
        return LocationServices.zzNX;
    }
}
