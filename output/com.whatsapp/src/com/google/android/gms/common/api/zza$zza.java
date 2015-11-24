// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.os.DeadObjectException;
import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import java.util.concurrent.atomic.AtomicReference;

public abstract class zza$zza extends AbstractPendingResult implements zza$zzb, zzg$zze
{
    private final Api$ClientKey zzVu;
    private AtomicReference zzWm;
    
    protected zza$zza(final Api$ClientKey api$ClientKey, final GoogleApiClient googleApiClient) {
        super(((GoogleApiClient)zzu.zzb(googleApiClient, "GoogleApiClient must not be null")).getLooper());
        this.zzWm = new AtomicReference();
        this.zzVu = (Api$ClientKey)zzu.zzu(api$ClientKey);
    }
    
    private void zza(final RemoteException ex) {
        this.zzr(new Status(8, ex.getLocalizedMessage(), null));
    }
    
    @Override
    protected void onResultConsumed() {
        final zzg$zzc zzg$zzc = this.zzWm.getAndSet(null);
        if (zzg$zzc != null) {
            zzg$zzc.zzc(this);
        }
    }
    
    protected abstract void zza(final Api$Client p0);
    
    @Override
    public void zza(final zzg$zzc zzg$zzc) {
        this.zzWm.set(zzg$zzc);
    }
    
    @Override
    public final void zzb(final Api$Client api$Client) {
        try {
            this.zza(api$Client);
        }
        catch (DeadObjectException ex) {
            this.zza((RemoteException)ex);
            throw ex;
        }
        catch (RemoteException ex2) {
            this.zza(ex2);
        }
    }
    
    @Override
    public final Api$ClientKey zzms() {
        return this.zzVu;
    }
    
    @Override
    public int zzmv() {
        return 0;
    }
    
    @Override
    public final void zzr(final Status status) {
        zzu.zzb(!status.isSuccess(), "Failed result must not be success");
        this.setResult(this.createFailedResult(status));
    }
}
