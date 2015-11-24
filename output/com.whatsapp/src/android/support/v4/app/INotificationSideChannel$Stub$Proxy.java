// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.app.Notification;
import android.os.Parcel;
import android.os.IBinder;

class INotificationSideChannel$Stub$Proxy implements INotificationSideChannel
{
    private static final String[] z;
    private IBinder mRemote;
    
    static {
        final String[] z2 = new String[3];
        String s = "_\u001esX2W\u00149Y(N\u0000xX)\u0010\u0006#\u0004<N\u00009c\u0013Q\u0004~L4]\u0011cC2P#~N8}\u0018vD3[\u001c";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ']';
                        break;
                    }
                    case 0: {
                        c2 = '>';
                        break;
                    }
                    case 1: {
                        c2 = 'p';
                        break;
                    }
                    case 2: {
                        c2 = '\u0017';
                        break;
                    }
                    case 3: {
                        c2 = '*';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "_\u001esX2W\u00149Y(N\u0000xX)\u0010\u0006#\u0004<N\u00009c\u0013Q\u0004~L4]\u0011cC2P#~N8}\u0018vD3[\u001c";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "_\u001esX2W\u00149Y(N\u0000xX)\u0010\u0006#\u0004<N\u00009c\u0013Q\u0004~L4]\u0011cC2P#~N8}\u0018vD3[\u001c";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    INotificationSideChannel$Stub$Proxy(final IBinder mRemote) {
        this.mRemote = mRemote;
    }
    
    public IBinder asBinder() {
        return this.mRemote;
    }
    
    @Override
    public void cancel(final String s, final int n, final String s2) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(INotificationSideChannel$Stub$Proxy.z[2]);
            obtain.writeString(s);
            obtain.writeInt(n);
            obtain.writeString(s2);
            this.mRemote.transact(2, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
    
    @Override
    public void cancelAll(final String s) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(INotificationSideChannel$Stub$Proxy.z[1]);
            obtain.writeString(s);
            this.mRemote.transact(3, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
    
    @Override
    public void notify(final String s, final int n, final String s2, final Notification notification) {
        final Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(INotificationSideChannel$Stub$Proxy.z[0]);
            obtain.writeString(s);
            obtain.writeInt(n);
            obtain.writeString(s2);
            Label_0064: {
                if (notification != null) {
                    obtain.writeInt(1);
                    notification.writeToParcel(obtain, 0);
                    if (Fragment.a == 0) {
                        break Label_0064;
                    }
                }
                obtain.writeInt(0);
            }
            this.mRemote.transact(1, obtain, (Parcel)null, 1);
        }
        finally {
            obtain.recycle();
        }
    }
}
