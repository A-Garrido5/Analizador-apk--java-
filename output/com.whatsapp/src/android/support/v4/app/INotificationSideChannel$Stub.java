// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.app.Notification;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;

public abstract class INotificationSideChannel$Stub extends Binder implements INotificationSideChannel
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "LU\u001f|\u000fD_U}\u0015]K\u0014|\u0014\u0003MO \u0001]KUG.BO\u0012h\tNZ\u000fg\u000fCh\u0012j\u0005nS\u001a`\u000eHW";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '`';
                        break;
                    }
                    case 0: {
                        c2 = '-';
                        break;
                    }
                    case 1: {
                        c2 = ';';
                        break;
                    }
                    case 2: {
                        c2 = '{';
                        break;
                    }
                    case 3: {
                        c2 = '\u000e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "LU\u001f|\u000fD_U}\u0015]K\u0014|\u0014\u0003MO \u0001]KUG.BO\u0012h\tNZ\u000fg\u000fCh\u0012j\u0005nS\u001a`\u000eHW";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "LU\u001f|\u000fD_U}\u0015]K\u0014|\u0014\u0003MO \u0001]KUG.BO\u0012h\tNZ\u000fg\u000fCh\u0012j\u0005nS\u001a`\u000eHW";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "LU\u001f|\u000fD_U}\u0015]K\u0014|\u0014\u0003MO \u0001]KUG.BO\u0012h\tNZ\u000fg\u000fCh\u0012j\u0005nS\u001a`\u000eHW";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "LU\u001f|\u000fD_U}\u0015]K\u0014|\u0014\u0003MO \u0001]KUG.BO\u0012h\tNZ\u000fg\u000fCh\u0012j\u0005nS\u001a`\u000eHW";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "LU\u001f|\u000fD_U}\u0015]K\u0014|\u0014\u0003MO \u0001]KUG.BO\u0012h\tNZ\u000fg\u000fCh\u0012j\u0005nS\u001a`\u000eHW";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public INotificationSideChannel$Stub() {
        this.attachInterface((IInterface)this, INotificationSideChannel$Stub.z[0]);
    }
    
    public static INotificationSideChannel asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface(INotificationSideChannel$Stub.z[1]);
        if (queryLocalInterface != null && queryLocalInterface instanceof INotificationSideChannel) {
            return (INotificationSideChannel)queryLocalInterface;
        }
        return new INotificationSideChannel$Stub$Proxy(binder);
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
                parcel2.writeString(INotificationSideChannel$Stub.z[4]);
                return true;
            }
            case 1: {
                parcel.enforceInterface(INotificationSideChannel$Stub.z[2]);
                final String string = parcel.readString();
                final int int1 = parcel.readInt();
                final String string2 = parcel.readString();
                Notification notification = null;
                Label_0122: {
                    if (parcel.readInt() != 0) {
                        notification = (Notification)Notification.CREATOR.createFromParcel(parcel);
                        if (Fragment.a == 0) {
                            break Label_0122;
                        }
                    }
                    notification = null;
                }
                this.notify(string, int1, string2, notification);
                return true;
            }
            case 2: {
                parcel.enforceInterface(INotificationSideChannel$Stub.z[3]);
                this.cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            }
            case 3: {
                parcel.enforceInterface(INotificationSideChannel$Stub.z[5]);
                this.cancelAll(parcel.readString());
                return true;
            }
        }
    }
}
