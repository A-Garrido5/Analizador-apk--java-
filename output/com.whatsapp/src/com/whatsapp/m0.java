// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;

class m0 implements View$OnClickListener
{
    final SystemStatusActivity a;
    
    m0(final SystemStatusActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        UserFeedbackActivity.a((Context)this.a, SystemStatusActivity.b(this.a), SystemStatusActivity.a(this.a), SystemStatusActivity.c(this.a));
        this.a.finish();
    }
}
