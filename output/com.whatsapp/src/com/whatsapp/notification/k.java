// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.App;
import com.whatsapp.up;
import com.whatsapp.gu;
import android.app.Activity;
import com.whatsapp.ps;

class k extends ps
{
    final PopupNotification z;
    
    k(final PopupNotification z, final Activity activity, final gu gu) {
        this.z = z;
        super(activity, gu);
    }
    
    @Override
    public void a() {
        up.h();
        super.a();
    }
    
    @Override
    public void b(final boolean b) {
        super.b(b);
        App.a(PopupNotification.d(this.z), false, true);
    }
    
    @Override
    public void h() {
        PopupNotification.k(this.z);
    }
}
