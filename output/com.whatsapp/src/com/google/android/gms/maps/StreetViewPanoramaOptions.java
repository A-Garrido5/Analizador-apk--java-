// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class StreetViewPanoramaOptions implements SafeParcelable
{
    public static final zzb CREATOR;
    private final int zzCY;
    private Boolean zzaBJ;
    private Boolean zzaBP;
    private Boolean zzaCA;
    private Boolean zzaCB;
    private StreetViewPanoramaCamera zzaCv;
    private String zzaCw;
    private LatLng zzaCx;
    private Integer zzaCy;
    private Boolean zzaCz;
    
    static {
        CREATOR = new zzb();
    }
    
    public StreetViewPanoramaOptions() {
        this.zzaCz = true;
        this.zzaBP = true;
        this.zzaCA = true;
        this.zzaCB = true;
        this.zzCY = 1;
    }
    
    StreetViewPanoramaOptions(final int zzCY, final StreetViewPanoramaCamera zzaCv, final String zzaCw, final LatLng zzaCx, final Integer zzaCy, final byte b, final byte b2, final byte b3, final byte b4, final byte b5) {
        this.zzaCz = true;
        this.zzaBP = true;
        this.zzaCA = true;
        this.zzaCB = true;
        this.zzCY = zzCY;
        this.zzaCv = zzaCv;
        this.zzaCx = zzaCx;
        this.zzaCy = zzaCy;
        this.zzaCw = zzaCw;
        this.zzaCz = zza.zza(b);
        this.zzaBP = zza.zza(b2);
        this.zzaCA = zza.zza(b3);
        this.zzaCB = zza.zza(b4);
        this.zzaBJ = zza.zza(b5);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public String getPanoramaId() {
        return this.zzaCw;
    }
    
    public LatLng getPosition() {
        return this.zzaCx;
    }
    
    public Integer getRadius() {
        return this.zzaCy;
    }
    
    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.zzaCv;
    }
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzb.zza(this, parcel, n);
    }
    
    byte zzvA() {
        return zza.zze(this.zzaCB);
    }
    
    byte zzvk() {
        return zza.zze(this.zzaBJ);
    }
    
    byte zzvo() {
        return zza.zze(this.zzaBP);
    }
    
    byte zzvy() {
        return zza.zze(this.zzaCz);
    }
    
    byte zzvz() {
        return zza.zze(this.zzaCA);
    }
}
