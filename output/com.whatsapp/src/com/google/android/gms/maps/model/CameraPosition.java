// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.zzt;
import android.content.res.TypedArray;
import com.google.android.gms.d;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CameraPosition implements SafeParcelable
{
    public static final zza CREATOR;
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;
    private final int zzCY;
    
    static {
        CREATOR = new zza();
    }
    
    CameraPosition(final int zzCY, final LatLng target, final float zoom, final float n, float n2) {
        zzu.zzb(target, "null camera target");
        zzu.zzb(0.0f <= n && n <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", new Object[] { n });
        this.zzCY = zzCY;
        this.target = target;
        this.zoom = zoom;
        this.tilt = n + 0.0f;
        if (n2 <= 0.0) {
            n2 = 360.0f + n2 % 360.0f;
        }
        this.bearing = n2 % 360.0f;
    }
    
    public CameraPosition(final LatLng latLng, final float n, final float n2, final float n3) {
        this(1, latLng, n, n2, n3);
    }
    
    public static CameraPosition$Builder builder() {
        return new CameraPosition$Builder();
    }
    
    public static CameraPosition createFromAttributes(final Context context, final AttributeSet set) {
        if (set == null) {
            return null;
        }
        final TypedArray obtainAttributes = context.getResources().obtainAttributes(set, d.MapAttrs);
        float float1;
        if (obtainAttributes.hasValue(d.MapAttrs_cameraTargetLat)) {
            float1 = obtainAttributes.getFloat(d.MapAttrs_cameraTargetLat, 0.0f);
        }
        else {
            float1 = 0.0f;
        }
        float float2;
        if (obtainAttributes.hasValue(d.MapAttrs_cameraTargetLng)) {
            float2 = obtainAttributes.getFloat(d.MapAttrs_cameraTargetLng, 0.0f);
        }
        else {
            float2 = 0.0f;
        }
        final LatLng latLng = new LatLng(float1, float2);
        final CameraPosition$Builder builder = builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(d.MapAttrs_cameraZoom)) {
            builder.zoom(obtainAttributes.getFloat(d.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_cameraBearing)) {
            builder.bearing(obtainAttributes.getFloat(d.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(d.MapAttrs_cameraTilt)) {
            builder.tilt(obtainAttributes.getFloat(d.MapAttrs_cameraTilt, 0.0f));
        }
        return builder.build();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof CameraPosition)) {
                return false;
            }
            final CameraPosition cameraPosition = (CameraPosition)o;
            if (!this.target.equals(cameraPosition.target) || Float.floatToIntBits(this.zoom) != Float.floatToIntBits(cameraPosition.zoom) || Float.floatToIntBits(this.tilt) != Float.floatToIntBits(cameraPosition.tilt) || Float.floatToIntBits(this.bearing) != Float.floatToIntBits(cameraPosition.bearing)) {
                return false;
            }
        }
        return true;
    }
    
    int getVersionCode() {
        return this.zzCY;
    }
    
    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[] { this.target, this.zoom, this.tilt, this.bearing });
    }
    
    @Override
    public String toString() {
        return zzt.zzt(this).zzg("target", this.target).zzg("zoom", this.zoom).zzg("tilt", this.tilt).zzg("bearing", this.bearing).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        zza.zza(this, parcel, n);
    }
}
