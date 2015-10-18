// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class ad extends Binder implements ac
{
    public static ac a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (queryLocalInterface != null && queryLocalInterface instanceof ac) {
            return (ac)queryLocalInterface;
        }
        return new ae(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final int int1 = parcel.readInt();
                boolean b = false;
                if (int1 != 0) {
                    b = true;
                }
                this.a(b);
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final int int2 = parcel.readInt();
                boolean b2 = false;
                if (int2 != 0) {
                    b2 = true;
                }
                this.b(b2);
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final int int3 = parcel.readInt();
                boolean b3 = false;
                if (int3 != 0) {
                    b3 = true;
                }
                this.c(b3);
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final int int4 = parcel.readInt();
                boolean b4 = false;
                if (int4 != 0) {
                    b4 = true;
                }
                this.d(b4);
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final int int5 = parcel.readInt();
                boolean b5 = false;
                if (int5 != 0) {
                    b5 = true;
                }
                this.e(b5);
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final int int6 = parcel.readInt();
                boolean b6 = false;
                if (int6 != 0) {
                    b6 = true;
                }
                this.f(b6);
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final int int7 = parcel.readInt();
                boolean b7 = false;
                if (int7 != 0) {
                    b7 = true;
                }
                this.g(b7);
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final int int8 = parcel.readInt();
                boolean b8 = false;
                if (int8 != 0) {
                    b8 = true;
                }
                this.h(b8);
                parcel2.writeNoException();
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final boolean a = this.a();
                parcel2.writeNoException();
                int n3 = 0;
                if (a) {
                    n3 = 1;
                }
                parcel2.writeInt(n3);
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final boolean b9 = this.b();
                parcel2.writeNoException();
                int n4 = 0;
                if (b9) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final boolean c = this.c();
                parcel2.writeNoException();
                int n5 = 0;
                if (c) {
                    n5 = 1;
                }
                parcel2.writeInt(n5);
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final boolean d = this.d();
                parcel2.writeNoException();
                int n6 = 0;
                if (d) {
                    n6 = 1;
                }
                parcel2.writeInt(n6);
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final boolean e = this.e();
                parcel2.writeNoException();
                int n7 = 0;
                if (e) {
                    n7 = 1;
                }
                parcel2.writeInt(n7);
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final boolean f = this.f();
                parcel2.writeNoException();
                int n8 = 0;
                if (f) {
                    n8 = 1;
                }
                parcel2.writeInt(n8);
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final boolean g = this.g();
                parcel2.writeNoException();
                int n9 = 0;
                if (g) {
                    n9 = 1;
                }
                parcel2.writeInt(n9);
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final int int9 = parcel.readInt();
                boolean b10 = false;
                if (int9 != 0) {
                    b10 = true;
                }
                this.i(b10);
                parcel2.writeNoException();
                return true;
            }
            case 17: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final boolean h = this.h();
                parcel2.writeNoException();
                int n10 = 0;
                if (h) {
                    n10 = 1;
                }
                parcel2.writeInt(n10);
                return true;
            }
            case 18: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final int int10 = parcel.readInt();
                boolean b11 = false;
                if (int10 != 0) {
                    b11 = true;
                }
                this.j(b11);
                parcel2.writeNoException();
                return true;
            }
            case 19: {
                parcel.enforceInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                final boolean i = this.i();
                parcel2.writeNoException();
                int n11 = 0;
                if (i) {
                    n11 = 1;
                }
                parcel2.writeInt(n11);
                return true;
            }
        }
    }
}
