// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException
{
    private final int Eo;
    
    GooglePlayServicesAvailabilityException(final int eo, final String s, final Intent intent) {
        super(s, intent);
        this.Eo = eo;
    }
}
