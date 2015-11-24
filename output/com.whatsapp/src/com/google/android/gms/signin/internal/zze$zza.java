// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.signin.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.ConnectionResult;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class zze$zza extends Binder implements zze
{
    public static int a;
    
    public zze$zza() {
        this.attachInterface((IInterface)this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }
    
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        final int a = zze$zza.a;
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                ConnectionResult connectionResult2 = null;
                Label_0093: {
                    if (parcel.readInt() != 0) {
                        final ConnectionResult connectionResult = (ConnectionResult)ConnectionResult.CREATOR.createFromParcel(parcel);
                        if (a == 0) {
                            connectionResult2 = connectionResult;
                            break Label_0093;
                        }
                    }
                    connectionResult2 = null;
                }
                AuthAccountResult authAccountResult = null;
                Label_0122: {
                    if (parcel.readInt() != 0) {
                        authAccountResult = (AuthAccountResult)AuthAccountResult.CREATOR.createFromParcel(parcel);
                        if (a == 0) {
                            break Label_0122;
                        }
                    }
                    authAccountResult = null;
                }
                this.zza(connectionResult2, authAccountResult);
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                Status status = null;
                Label_0171: {
                    if (parcel.readInt() != 0) {
                        status = (Status)Status.CREATOR.createFromParcel(parcel);
                        if (a == 0) {
                            break Label_0171;
                        }
                    }
                    status = null;
                }
                this.zzaT(status);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
