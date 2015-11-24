// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;

public abstract class ag extends Binder implements af
{
    public IBinder asBinder() {
        return (IBinder)this;
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                Bitmap bitmap;
                if (parcel.readInt() != 0) {
                    bitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
                }
                else {
                    bitmap = null;
                }
                final String string = parcel.readString();
                final boolean b = parcel.readInt() != 0;
                final int int1 = parcel.readInt();
                boolean b2 = false;
                if (int1 != 0) {
                    b2 = true;
                }
                this.a(bitmap, string, b, b2);
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                final String string2 = parcel.readString();
                final boolean b3 = parcel.readInt() != 0;
                final int int2 = parcel.readInt();
                boolean b4 = false;
                if (int2 != 0) {
                    b4 = true;
                }
                this.a(string2, b3, b4);
                parcel2.writeNoException();
                return true;
            }
        }
    }
}
