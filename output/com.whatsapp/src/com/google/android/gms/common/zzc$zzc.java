// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzc$zzc extends zzc$zza
{
    private static final WeakReference zzVQ;
    private WeakReference zzVP;
    
    static {
        zzVQ = new WeakReference(null);
    }
    
    zzc$zzc(final byte[] array) {
        super(array);
        this.zzVP = zzc$zzc.zzVQ;
    }
    
    @Override
    byte[] getBytes() {
        synchronized (this) {
            byte[] zzmk = (byte[])this.zzVP.get();
            if (zzmk == null) {
                zzmk = this.zzmk();
                this.zzVP = new WeakReference(zzmk);
            }
            return zzmk;
        }
    }
    
    protected abstract byte[] zzmk();
}
