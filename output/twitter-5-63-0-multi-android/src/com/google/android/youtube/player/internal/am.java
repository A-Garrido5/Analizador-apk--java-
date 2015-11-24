// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class am extends Binder implements al
{
    public static al a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
        if (queryLocalInterface != null && queryLocalInterface instanceof al) {
            return (al)queryLocalInterface;
        }
        return new an(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.youtube.player.internal.IYouTubeService");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
                final IBinder a = this.a();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(a);
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
                final IBinder strongBinder = parcel.readStrongBinder();
                af af;
                if (strongBinder == null) {
                    af = null;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                    if (queryLocalInterface != null && queryLocalInterface instanceof af) {
                        af = (af)queryLocalInterface;
                    }
                    else {
                        af = new ah(strongBinder);
                    }
                }
                final ai a2 = this.a(af);
                parcel2.writeNoException();
                IBinder binder = null;
                if (a2 != null) {
                    binder = a2.asBinder();
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IYouTubeService");
                this.a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
