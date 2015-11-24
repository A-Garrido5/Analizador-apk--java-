// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.os.Parcel;
import android.graphics.Bitmap;
import android.os.IBinder;

final class ah implements af
{
    private IBinder a;
    
    ah(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Bitmap bitmap, final String s, final boolean b, final boolean b2) {
    Label_0063_Outer:
        while (true) {
            int n = 1;
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            while (true) {
            Label_0132:
                while (true) {
                    try {
                        obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                        if (bitmap != null) {
                            obtain.writeInt(1);
                            bitmap.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        obtain.writeString(s);
                        if (b) {
                            final int n2 = n;
                            obtain.writeInt(n2);
                            if (b2) {
                                obtain.writeInt(n);
                                this.a.transact(1, obtain, obtain2, 0);
                                obtain2.readException();
                                return;
                            }
                            break Label_0132;
                        }
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    final int n2 = 0;
                    continue Label_0063_Outer;
                }
                n = 0;
                continue;
            }
        }
    }
    
    @Override
    public final void a(final String s, final boolean b, final boolean b2) {
        int n = 1;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
            obtain.writeString(s);
            int n2;
            if (b) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            obtain.writeInt(n2);
            if (!b2) {
                n = 0;
            }
            obtain.writeInt(n);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    public final IBinder asBinder() {
        return this.a;
    }
}
