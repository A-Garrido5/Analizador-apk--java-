// 
// Decompiled by Procyon v0.5.30
// 

package com.android.vending.billing;

import com.whatsapp.DialogToastActivity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;

class IInAppBillingService$Stub$Proxy implements IInAppBillingService
{
    private static final String[] z;
    private IBinder a;
    
    static {
        final String[] z2 = new String[5];
        String s = "+\u0013o\u000fg&\u0018pNo,RtDh,\u0015lF(*\u0015nMo&\u001b,hO&=rQD!\u0010nHh//gSp!\u001fg";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = 'H';
                        break;
                    }
                    case 1: {
                        c2 = '|';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = '!';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "+\u0013o\u000fg&\u0018pNo,RtDh,\u0015lF(*\u0015nMo&\u001b,hO&=rQD!\u0010nHh//gSp!\u001fg";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "+\u0013o\u000fg&\u0018pNo,RtDh,\u0015lF(*\u0015nMo&\u001b,hO&=rQD!\u0010nHh//gSp!\u001fg";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "+\u0013o\u000fg&\u0018pNo,RtDh,\u0015lF(*\u0015nMo&\u001b,hO&=rQD!\u0010nHh//gSp!\u001fg";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "+\u0013o\u000fg&\u0018pNo,RtDh,\u0015lF(*\u0015nMo&\u001b,hO&=rQD!\u0010nHh//gSp!\u001fg";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    IInAppBillingService$Stub$Proxy(final IBinder a) {
        this.a = a;
    }
    
    public IBinder asBinder() {
        return this.a;
    }
    
    @Override
    public int consumePurchase(final int n, final String s, final String s2) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IInAppBillingService$Stub$Proxy.z[4]);
            obtain.writeInt(n);
            obtain.writeString(s);
            obtain.writeString(s2);
            this.a.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public Bundle getBuyIntent(final int n, final String s, final String s2, final String s3, final String s4) {
        final int a = IInAppBillingService$Stub.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IInAppBillingService$Stub$Proxy.z[0]);
            obtain.writeInt(n);
            obtain.writeString(s);
            obtain.writeString(s2);
            obtain.writeString(s3);
            obtain.writeString(s4);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                final Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                if (a == 0) {
                    return bundle;
                }
                DialogToastActivity.h = !DialogToastActivity.h;
            }
            return null;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public Bundle getPurchases(final int n, final String s, final String s2, final String s3) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IInAppBillingService$Stub$Proxy.z[1]);
            obtain.writeInt(n);
            obtain.writeString(s);
            obtain.writeString(s2);
            obtain.writeString(s3);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                final Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                if (IInAppBillingService$Stub.a == 0) {
                    return bundle;
                }
            }
            return null;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public Bundle getSkuDetails(final int n, final String s, final String s2, final Bundle bundle) {
        final int a = IInAppBillingService$Stub.a;
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IInAppBillingService$Stub$Proxy.z[2]);
            obtain.writeInt(n);
            obtain.writeString(s);
            obtain.writeString(s2);
            Label_0073: {
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (a == 0) {
                        break Label_0073;
                    }
                }
                obtain.writeInt(0);
            }
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            Bundle bundle2 = null;
            Label_0125: {
                if (obtain2.readInt() != 0) {
                    bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    if (a == 0) {
                        break Label_0125;
                    }
                }
                bundle2 = null;
            }
            obtain2.recycle();
            obtain.recycle();
            if (DialogToastActivity.h) {
                IInAppBillingService$Stub.a = a + 1;
            }
            return bundle2;
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
    
    @Override
    public int isBillingSupported(final int n, final String s, final String s2) {
        final Parcel obtain = Parcel.obtain();
        final Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IInAppBillingService$Stub$Proxy.z[3]);
            obtain.writeInt(n);
            obtain.writeString(s);
            obtain.writeString(s2);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        }
        finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
