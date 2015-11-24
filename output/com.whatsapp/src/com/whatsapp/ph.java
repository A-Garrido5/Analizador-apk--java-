// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;

class ph extends ps
{
    final Conversation z;
    
    ph(final Conversation z, final Activity activity, final gu gu) {
        this.z = z;
        super(activity, gu);
    }
    
    @Override
    public void h() {
        Conversation.k(this.z);
    }
}
