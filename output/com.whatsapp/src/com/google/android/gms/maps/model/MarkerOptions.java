// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.dynamic.zzd$zza;
import android.os.IBinder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class MarkerOptions implements SafeParcelable
{
    public static final zzf CREATOR;
    private float mAlpha;
    private final int zzCY;
    private LatLng zzaCx;
    private boolean zzaDb;
    private float zzaDj;
    private float zzaDk;
    private String zzaDs;
    private BitmapDescriptor zzaDt;
    private boolean zzaDu;
    private boolean zzaDv;
    private float zzaDw;
    private float zzaDx;
    private float zzaDy;
    private String zzadv;
    
    static {
        CREATOR = new zzf();
    }
    
    public MarkerOptions() {
        this.zzaDj = 0.5f;
        this.zzaDk = 1.0f;
        this.zzaDb = true;
        this.zzaDv = false;
        this.zzaDw = 0.0f;
        this.zzaDx = 0.5f;
        this.zzaDy = 0.0f;
        this.mAlpha = 1.0f;
        this.zzCY = 1;
    }
    
    MarkerOptions(final int zzCY, final LatLng zzaCx, final String zzadv, final String zzaDs, final IBinder binder, final float zzaDj, final float zzaDk, final boolean zzaDu, final boolean zzaDb, final boolean zzaDv, final float zzaDw, final float zzaDx, final float zzaDy, final float mAlpha) {
        final int a = LatLng.a;
        this.zzaDj = 0.5f;
        this.zzaDk = 1.0f;
        this.zzaDb = true;
        this.zzaDv = false;
        this.zzaDw = 0.0f;
        this.zzaDx = 0.5f;
        this.zzaDy = 0.0f;
        this.mAlpha = 1.0f;
        this.zzCY = zzCY;
        this.zzaCx = zzaCx;
        this.zzadv = zzadv;
        this.zzaDs = zzaDs;
        BitmapDescriptor zzaDt;
        if (binder == null) {
            zzaDt = null;
        }
        else {
            zzaDt = new BitmapDescriptor(zzd$zza.zzbg(binder));
        }
        this.zzaDt = zzaDt;
        this.zzaDj = zzaDj;
        this.zzaDk = zzaDk;
        this.zzaDu = zzaDu;
        this.zzaDb = zzaDb;
        this.zzaDv = zzaDv;
        this.zzaDw = zzaDw;
        this.zzaDx = zzaDx;
        this.zzaDy = zzaDy;
        this.mAlpha = mAlpha;
        if (GoogleMap.a != 0) {
            LatLng.a = a + 1;
        }
    }
    
    public MarkerOptions anchor(final float zzaDj, final float zzaDk) {
        this.zzaDj = zzaDj;
        this.zzaDk = zzaDk;
        return this;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public float getAlpha() {
        return this.mAlpha;
    }
    
    public float getAnchorU() {
        return this.zzaDj;
    }
    
    public float getAnchorV() {
        return this.zzaDk;
    }
    
    public float getInfoWindowAnchorU() {
        return this.zzaDx;
    }
    
    public float getInfoWindowAnchorV() {
        return this.zzaDy;
    }
    
    public LatLng getPosition() {
        return this.zzaCx;
    }
    
    public float getRotation() {
        return this.zzaDw;
    }
    
    public String getSnippet() {
        return this.zzaDs;
    }
    
    public String getTitle() {
        return this.zzadv;
    }
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    public MarkerOptions icon(final BitmapDescriptor zzaDt) {
        this.zzaDt = zzaDt;
        return this;
    }
    
    public boolean isDraggable() {
        return this.zzaDu;
    }
    
    public boolean isFlat() {
        return this.zzaDv;
    }
    
    public boolean isVisible() {
        return this.zzaDb;
    }
    
    public MarkerOptions position(final LatLng zzaCx) {
        this.zzaCx = zzaCx;
        return this;
    }
    
    public MarkerOptions snippet(final String zzaDs) {
        this.zzaDs = zzaDs;
        return this;
    }
    
    public MarkerOptions title(final String zzadv) {
        this.zzadv = zzadv;
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zzf.zza(this, parcel, n);
    }
    
    IBinder zzvJ() {
        if (this.zzaDt == null) {
            return null;
        }
        return this.zzaDt.zzvg().asBinder();
    }
}
