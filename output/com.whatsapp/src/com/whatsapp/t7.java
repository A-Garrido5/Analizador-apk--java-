// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.android.vending.billing.IInAppBillingService;
import android.content.ServiceConnection;

class t7
{
    final o6 a;
    public ServiceConnection b;
    public IInAppBillingService c;
    
    public t7(final o6 a, final IInAppBillingService c, final ServiceConnection b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
}
