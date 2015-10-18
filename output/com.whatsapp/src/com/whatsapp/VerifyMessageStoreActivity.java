// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Dialog;
import android.app.Activity;

public class VerifyMessageStoreActivity extends UserFeedbackActivity
{
    private pr k;
    
    public VerifyMessageStoreActivity() {
        this.k = new pc(this, this);
    }
    
    protected void b() {
    }
    
    protected void b(final boolean b) {
        this.k.a(b, true);
    }
    
    protected void c(final boolean b) {
        this.k.b(b);
    }
    
    protected void e() {
        this.k.a();
    }
    
    protected void f() {
    }
    
    @Override
    protected Dialog onCreateDialog(final int n) {
        final Dialog a = this.k.a(n);
        if (a != null) {
            return a;
        }
        return super.onCreateDialog(n);
    }
}
