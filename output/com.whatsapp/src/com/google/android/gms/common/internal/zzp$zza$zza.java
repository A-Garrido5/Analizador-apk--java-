// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.IBinder;

class zzp$zza$zza implements zzp
{
    private IBinder zznF;
    
    zzp$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public void zza(final zzo zzo, final GetServiceRequest getServiceRequest) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder binder;
            if (zzo != null) {
                binder = zzo.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            Label_0059: {
                if (getServiceRequest != null) {
                    obtain.writeInt(1);
                    getServiceRequest.writeToParcel(obtain, 0);
                    if (!zzi.a) {
                        break Label_0059;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public void zza(final zzo zzo, final ValidateAccountRequest validateAccountRequest) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder binder;
            if (zzo != null) {
                binder = zzo.asBinder();
            }
            else {
                binder = null;
            }
            obtain.writeStrongBinder(binder);
            Label_0059: {
                if (validateAccountRequest != null) {
                    obtain.writeInt(1);
                    validateAccountRequest.writeToParcel(obtain, 0);
                    if (!zzi.a) {
                        break Label_0059;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(47, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
