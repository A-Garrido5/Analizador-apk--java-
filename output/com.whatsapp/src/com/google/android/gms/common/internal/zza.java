// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.internal;

import android.os.RemoteException;
import android.util.Log;
import android.os.Binder;
import android.accounts.Account;

public class zza extends IAccountAccessor$zza
{
    public static Account zza(final IAccountAccessor accountAccessor) {
        Account account = null;
        if (accountAccessor == null) {
            return account;
        }
        final long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            account = accountAccessor.getAccount();
            return account;
        }
        catch (RemoteException ex) {
            Log.w("AccountAccessor", "Remote account accessor probably died");
            return null;
        }
        finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
