// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.search.verification.api;

import android.os.IInterface;
import android.os.IBinder;
import android.os.Binder;

public abstract class ISearchActionVerificationService$Stub extends Binder implements ISearchActionVerificationService
{
    public static boolean a;
    
    public static ISearchActionVerificationService asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
        if (queryLocalInterface != null && queryLocalInterface instanceof ISearchActionVerificationService) {
            return (ISearchActionVerificationService)queryLocalInterface;
        }
        return new ISearchActionVerificationService$Stub$Proxy(binder);
    }
}
