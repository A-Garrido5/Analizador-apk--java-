// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException
{
    private final int zzOD;
    
    GooglePlayServicesAvailabilityException(final int zzOD, final String s, final Intent intent) {
        super(s, intent);
        this.zzOD = zzOD;
    }
    
    public int getConnectionStatusCode() {
        return this.zzOD;
    }
}
