// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.internal.am;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.internal.cv;
import com.google.android.gms.internal.ap;
import android.content.Context;

public final class s
{
    public static int a(final Context context) {
        ap.a(context);
        try {
            a(cv.a(context));
            return 0;
        }
        catch (GooglePlayServicesNotAvailableException ex) {
            return ex.errorCode;
        }
    }
    
    public static void a(final am am) {
        try {
            b.a(am.a());
            com.google.android.gms.maps.model.b.a(am.b());
        }
        catch (RemoteException ex) {
            throw new RuntimeRemoteException(ex);
        }
    }
}
