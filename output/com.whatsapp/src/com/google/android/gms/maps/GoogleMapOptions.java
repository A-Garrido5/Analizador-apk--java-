// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.Parcel;
import android.content.res.TypedArray;
import com.google.android.gms.d;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class GoogleMapOptions implements SafeParcelable
{
    public static final zza CREATOR;
    private final int zzCY;
    private Boolean zzaBI;
    private Boolean zzaBJ;
    private int zzaBK;
    private CameraPosition zzaBL;
    private Boolean zzaBM;
    private Boolean zzaBN;
    private Boolean zzaBO;
    private Boolean zzaBP;
    private Boolean zzaBQ;
    private Boolean zzaBR;
    private Boolean zzaBS;
    private Boolean zzaBT;
    
    static {
        CREATOR = new zza();
    }
    
    public GoogleMapOptions() {
        this.zzaBK = -1;
        this.zzCY = 1;
    }
    
    GoogleMapOptions(final int zzCY, final byte b, final byte b2, final int zzaBK, final CameraPosition zzaBL, final byte b3, final byte b4, final byte b5, final byte b6, final byte b7, final byte b8, final byte b9, final byte b10) {
        this.zzaBK = -1;
        this.zzCY = zzCY;
        this.zzaBI = com.google.android.gms.maps.internal.zza.zza(b);
        this.zzaBJ = com.google.android.gms.maps.internal.zza.zza(b2);
        this.zzaBK = zzaBK;
        this.zzaBL = zzaBL;
        this.zzaBM = com.google.android.gms.maps.internal.zza.zza(b3);
        this.zzaBN = com.google.android.gms.maps.internal.zza.zza(b4);
        this.zzaBO = com.google.android.gms.maps.internal.zza.zza(b5);
        this.zzaBP = com.google.android.gms.maps.internal.zza.zza(b6);
        this.zzaBQ = com.google.android.gms.maps.internal.zza.zza(b7);
        this.zzaBR = com.google.android.gms.maps.internal.zza.zza(b8);
        this.zzaBS = com.google.android.gms.maps.internal.zza.zza(b9);
        this.zzaBT = com.google.android.gms.maps.internal.zza.zza(b10);
    }
    
    public static GoogleMapOptions createFromAttributes(final Context context, final AttributeSet set) {
        if (set == null) {
            return null;
        }
        final TypedArray obtainAttributes = context.getResources().obtainAttributes(set, d.MapAttrs);
        final GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(d.MapAttrs_mapType)) {
            googleMapOptions.mapType(obtainAttributes.getInt(d.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_zOrderOnTop)) {
            googleMapOptions.zOrderOnTop(obtainAttributes.getBoolean(d.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_useViewLifecycle)) {
            googleMapOptions.useViewLifecycleInFragment(obtainAttributes.getBoolean(d.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_uiCompass)) {
            googleMapOptions.compassEnabled(obtainAttributes.getBoolean(d.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_uiRotateGestures)) {
            googleMapOptions.rotateGesturesEnabled(obtainAttributes.getBoolean(d.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_uiScrollGestures)) {
            googleMapOptions.scrollGesturesEnabled(obtainAttributes.getBoolean(d.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_uiTiltGestures)) {
            googleMapOptions.tiltGesturesEnabled(obtainAttributes.getBoolean(d.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_uiZoomGestures)) {
            googleMapOptions.zoomGesturesEnabled(obtainAttributes.getBoolean(d.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_uiZoomControls)) {
            googleMapOptions.zoomControlsEnabled(obtainAttributes.getBoolean(d.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_liteMode)) {
            googleMapOptions.liteMode(obtainAttributes.getBoolean(d.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mapToolbarEnabled(obtainAttributes.getBoolean(d.MapAttrs_uiMapToolbar, true));
        }
        googleMapOptions.camera(CameraPosition.createFromAttributes(context, set));
        obtainAttributes.recycle();
        return googleMapOptions;
    }
    
    public GoogleMapOptions camera(final CameraPosition zzaBL) {
        this.zzaBL = zzaBL;
        return this;
    }
    
    public GoogleMapOptions compassEnabled(final boolean b) {
        this.zzaBN = b;
        return this;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public CameraPosition getCamera() {
        return this.zzaBL;
    }
    
    public int getMapType() {
        return this.zzaBK;
    }
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    public GoogleMapOptions liteMode(final boolean b) {
        this.zzaBS = b;
        return this;
    }
    
    public GoogleMapOptions mapToolbarEnabled(final boolean b) {
        this.zzaBT = b;
        return this;
    }
    
    public GoogleMapOptions mapType(final int zzaBK) {
        this.zzaBK = zzaBK;
        return this;
    }
    
    public GoogleMapOptions rotateGesturesEnabled(final boolean b) {
        this.zzaBR = b;
        return this;
    }
    
    public GoogleMapOptions scrollGesturesEnabled(final boolean b) {
        this.zzaBO = b;
        return this;
    }
    
    public GoogleMapOptions tiltGesturesEnabled(final boolean b) {
        this.zzaBQ = b;
        return this;
    }
    
    public GoogleMapOptions useViewLifecycleInFragment(final boolean b) {
        this.zzaBJ = b;
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zza.zza(this, parcel, n);
    }
    
    public GoogleMapOptions zOrderOnTop(final boolean b) {
        this.zzaBI = b;
        return this;
    }
    
    public GoogleMapOptions zoomControlsEnabled(final boolean b) {
        this.zzaBM = b;
        return this;
    }
    
    public GoogleMapOptions zoomGesturesEnabled(final boolean b) {
        this.zzaBP = b;
        return this;
    }
    
    byte zzvj() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBI);
    }
    
    byte zzvk() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBJ);
    }
    
    byte zzvl() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBM);
    }
    
    byte zzvm() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBN);
    }
    
    byte zzvn() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBO);
    }
    
    byte zzvo() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBP);
    }
    
    byte zzvp() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBQ);
    }
    
    byte zzvq() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBR);
    }
    
    byte zzvr() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBS);
    }
    
    byte zzvs() {
        return com.google.android.gms.maps.internal.zza.zze(this.zzaBT);
    }
}
