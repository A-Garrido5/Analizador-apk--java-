// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.os.Message;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class zzb$zza extends Binder implements zzb
{
    public static boolean a;
    
    public zzb$zza() {
        this.attachInterface((IInterface)this, "com.google.android.gms.iid.IMessengerCompat");
    }
    
    public static zzb zzbR(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
        if (queryLocalInterface != null && queryLocalInterface instanceof zzb) {
            return (zzb)queryLocalInterface;
        }
        return new zzb$zza$zza(binder);
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.iid.IMessengerCompat");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.iid.IMessengerCompat");
                Message message = null;
                Label_0082: {
                    if (parcel.readInt() != 0) {
                        message = (Message)Message.CREATOR.createFromParcel(parcel);
                        if (MessengerCompat.a == 0) {
                            break Label_0082;
                        }
                    }
                    message = null;
                }
                this.send(message);
                return true;
            }
        }
    }
}
