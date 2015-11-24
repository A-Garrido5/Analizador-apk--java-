// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.view.View;
import android.view.View$OnClickListener;

class z5 implements View$OnClickListener
{
    final ProfilePhotoReminder a;
    
    z5(final ProfilePhotoReminder a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        qp.a(ProfilePhotoReminder.b(this.a), this.a, 12);
    }
}
