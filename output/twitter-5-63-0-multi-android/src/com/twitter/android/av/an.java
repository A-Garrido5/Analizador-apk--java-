// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.twitter.library.util.e;

public class an extends e
{
    private final PackageManager a;
    private final ao b;
    
    public an(final PackageManager a, final ao b) {
        this.a = a;
        this.b = b;
    }
    
    private boolean a(final Intent intent) {
        return this.a.queryIntentActivities(intent, 65536).size() > 0;
    }
    
    public Boolean a(final Intent... array) {
        if (array.length != 1) {
            throw new IllegalArgumentException("CheckActivityAvailabilityTask requires exactly one argument.");
        }
        return this.a(array[0]);
    }
    
    protected void a(final Boolean b) {
        this.b.a(b);
    }
}
