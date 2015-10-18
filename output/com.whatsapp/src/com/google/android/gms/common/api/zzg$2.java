// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.Bundle;

class zzg$2 extends zzg$zzd
{
    final zzg zzXE;
    
    zzg$2(final zzg zzXE) {
        super(this.zzXE = zzXE);
    }
    
    @Override
    public void onConnected(final Bundle bundle) {
        zzg.zza(this.zzXE).onConnected(bundle);
    }
}
