// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class aj extends Binder implements ai
{
    public static ai a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
        if (queryLocalInterface != null && queryLocalInterface instanceof ai) {
            return (ai)queryLocalInterface;
        }
        return new ak(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                this.a(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                this.a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                this.a();
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                this.b();
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                this.c();
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderService");
                this.d();
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
