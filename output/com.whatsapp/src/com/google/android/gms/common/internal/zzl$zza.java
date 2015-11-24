// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.content.Intent;
import android.content.ComponentName;

final class zzl$zza
{
    private final ComponentName zzaaO;
    private final String zzuO;
    
    public zzl$zza(final ComponentName componentName) {
        this.zzuO = null;
        this.zzaaO = (ComponentName)zzu.zzu(componentName);
    }
    
    public zzl$zza(final String s) {
        this.zzuO = zzu.zzcj(s);
        this.zzaaO = null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof zzl$zza)) {
                return false;
            }
            final zzl$zza zzl$zza = (zzl$zza)o;
            if (!zzt.equal(this.zzuO, zzl$zza.zzuO) || !zzt.equal(this.zzaaO, zzl$zza.zzaaO)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return zzt.hashCode(new Object[] { this.zzuO, this.zzaaO });
    }
    
    @Override
    public String toString() {
        if (this.zzuO == null) {
            return this.zzaaO.flattenToString();
        }
        return this.zzuO;
    }
    
    public Intent zznV() {
        if (this.zzuO != null) {
            final Intent intent = new Intent(this.zzuO).setPackage("com.google.android.gms");
            if (!zzi.a) {
                return intent;
            }
        }
        return new Intent().setComponent(this.zzaaO);
    }
}
