// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.view.KeyEvent;
import android.os.Bundle;
import android.content.res.Configuration;
import java.util.List;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class j extends Binder implements i
{
    public static i a(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
        if (queryLocalInterface != null && queryLocalInterface instanceof i) {
            return (i)queryLocalInterface;
        }
        return new k(binder);
    }
    
    public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        switch (n) {
            default: {
                return super.onTransact(n, parcel, parcel2, n2);
            }
            case 1598968902: {
                parcel2.writeString("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                return true;
            }
            case 1: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.a(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
            case 2: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 3: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.b(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 4: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.a(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 5: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.b(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 6: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.a(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 7: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.b(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 8: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.a();
                parcel2.writeNoException();
                return true;
            }
            case 9: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.b();
                parcel2.writeNoException();
                return true;
            }
            case 10: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final boolean c = this.c();
                parcel2.writeNoException();
                int n3 = 0;
                if (c) {
                    n3 = 1;
                }
                parcel2.writeInt(n3);
                return true;
            }
            case 11: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final boolean d = this.d();
                parcel2.writeNoException();
                int n4 = 0;
                if (d) {
                    n4 = 1;
                }
                parcel2.writeInt(n4);
                return true;
            }
            case 12: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final boolean e = this.e();
                parcel2.writeNoException();
                int n5 = 0;
                if (e) {
                    n5 = 1;
                }
                parcel2.writeInt(n5);
                return true;
            }
            case 13: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.f();
                parcel2.writeNoException();
                return true;
            }
            case 14: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.g();
                parcel2.writeNoException();
                return true;
            }
            case 15: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int h = this.h();
                parcel2.writeNoException();
                parcel2.writeInt(h);
                return true;
            }
            case 16: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int i = this.i();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                return true;
            }
            case 17: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.a(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 18: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 19: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int int1 = parcel.readInt();
                boolean b = false;
                if (int1 != 0) {
                    b = true;
                }
                this.b(b);
                parcel2.writeNoException();
                return true;
            }
            case 20: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.c(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 21: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int j = this.j();
                parcel2.writeNoException();
                parcel2.writeInt(j);
                return true;
            }
            case 22: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.d(parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            case 23: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.a(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            case 24: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int int2 = parcel.readInt();
                boolean b2 = false;
                if (int2 != 0) {
                    b2 = true;
                }
                this.c(b2);
                parcel2.writeNoException();
                return true;
            }
            case 25: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int int3 = parcel.readInt();
                boolean b3 = false;
                if (int3 != 0) {
                    b3 = true;
                }
                this.d(b3);
                parcel2.writeNoException();
                return true;
            }
            case 26: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final IBinder strongBinder = parcel.readStrongBinder();
                l l = null;
                if (strongBinder != null) {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
                    if (queryLocalInterface != null && queryLocalInterface instanceof l) {
                        l = (l)queryLocalInterface;
                    }
                    else {
                        l = new o(strongBinder);
                    }
                }
                this.a(l);
                parcel2.writeNoException();
                return true;
            }
            case 27: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final IBinder strongBinder2 = parcel.readStrongBinder();
                x x = null;
                if (strongBinder2 != null) {
                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.youtube.player.internal.IPlaylistEventListener");
                    if (queryLocalInterface2 != null && queryLocalInterface2 instanceof x) {
                        x = (x)queryLocalInterface2;
                    }
                    else {
                        x = new ab(strongBinder2);
                    }
                }
                this.a(x);
                parcel2.writeNoException();
                return true;
            }
            case 28: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final IBinder strongBinder3 = parcel.readStrongBinder();
                t t = null;
                if (strongBinder3 != null) {
                    final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    if (queryLocalInterface3 != null && queryLocalInterface3 instanceof t) {
                        t = (t)queryLocalInterface3;
                    }
                    else {
                        t = new v(strongBinder3);
                    }
                }
                this.a(t);
                parcel2.writeNoException();
                return true;
            }
            case 29: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final IBinder strongBinder4 = parcel.readStrongBinder();
                p p4 = null;
                if (strongBinder4 != null) {
                    final IInterface queryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    if (queryLocalInterface4 != null && queryLocalInterface4 instanceof p) {
                        p4 = (p)queryLocalInterface4;
                    }
                    else {
                        p4 = new s(strongBinder4);
                    }
                }
                this.a(p4);
                parcel2.writeNoException();
                return true;
            }
            case 30: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.k();
                parcel2.writeNoException();
                return true;
            }
            case 31: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.l();
                parcel2.writeNoException();
                return true;
            }
            case 32: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int int4 = parcel.readInt();
                Configuration configuration = null;
                if (int4 != 0) {
                    configuration = (Configuration)Configuration.CREATOR.createFromParcel(parcel);
                }
                this.a(configuration);
                parcel2.writeNoException();
                return true;
            }
            case 33: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.m();
                parcel2.writeNoException();
                return true;
            }
            case 34: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.n();
                parcel2.writeNoException();
                return true;
            }
            case 35: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.o();
                parcel2.writeNoException();
                return true;
            }
            case 36: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.p();
                parcel2.writeNoException();
                return true;
            }
            case 37: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int int5 = parcel.readInt();
                boolean b4 = false;
                if (int5 != 0) {
                    b4 = true;
                }
                this.e(b4);
                parcel2.writeNoException();
                return true;
            }
            case 38: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                this.q();
                parcel2.writeNoException();
                return true;
            }
            case 39: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final Bundle r = this.r();
                parcel2.writeNoException();
                if (r != null) {
                    parcel2.writeInt(1);
                    r.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            case 40: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int int6 = parcel.readInt();
                Bundle bundle = null;
                if (int6 != 0) {
                    bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                final boolean a = this.a(bundle);
                parcel2.writeNoException();
                int n6 = 0;
                if (a) {
                    n6 = 1;
                }
                parcel2.writeInt(n6);
                return true;
            }
            case 41: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int int7 = parcel.readInt();
                final int int8 = parcel.readInt();
                KeyEvent keyEvent = null;
                if (int8 != 0) {
                    keyEvent = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
                }
                final boolean a2 = this.a(int7, keyEvent);
                parcel2.writeNoException();
                int n7 = 0;
                if (a2) {
                    n7 = 1;
                }
                parcel2.writeInt(n7);
                return true;
            }
            case 42: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final int int9 = parcel.readInt();
                final int int10 = parcel.readInt();
                KeyEvent keyEvent2 = null;
                if (int10 != 0) {
                    keyEvent2 = (KeyEvent)KeyEvent.CREATOR.createFromParcel(parcel);
                }
                final boolean b5 = this.b(int9, keyEvent2);
                parcel2.writeNoException();
                int n8 = 0;
                if (b5) {
                    n8 = 1;
                }
                parcel2.writeInt(n8);
                return true;
            }
            case 43: {
                parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                final bb s = this.s();
                parcel2.writeNoException();
                IBinder binder = null;
                if (s != null) {
                    binder = s.asBinder();
                }
                parcel2.writeStrongBinder(binder);
                return true;
            }
        }
    }
}
