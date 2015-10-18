// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class PopupNotificationLocked extends PopupNotification
{
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(-16777216));
    }
}
