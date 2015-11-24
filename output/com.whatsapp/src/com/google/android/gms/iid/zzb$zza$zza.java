// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.os.Parcel;
import android.os.Message;
import android.os.IBinder;

class zzb$zza$zza implements zzb
{
    private IBinder zznF;
    
    zzb$zza$zza(final IBinder zznF) {
        this.zznF = zznF;
    }
    
    public IBinder asBinder() {
        return this.zznF;
    }
    
    @Override
    public void send(final Message message) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            Label_0036: {
                if (message != null) {
                    obtain.writeInt(1);
                    message.writeToParcel(obtain, 0);
                    if (MessengerCompat.a == 0) {
                        break Label_0036;
                    }
                }
                obtain.writeInt(0);
            }
            this.zznF.transact(1, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
}
