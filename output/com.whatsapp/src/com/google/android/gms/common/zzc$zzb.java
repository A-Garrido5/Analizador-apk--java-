// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import java.util.Arrays;

class zzc$zzb extends zzc$zza
{
    private final byte[] zzVO;
    
    zzc$zzb(final byte[] zzVO) {
        super(Arrays.copyOfRange(zzVO, 0, 25));
        this.zzVO = zzVO;
    }
    
    @Override
    byte[] getBytes() {
        return this.zzVO;
    }
}
