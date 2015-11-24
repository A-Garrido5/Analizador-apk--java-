// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Dialog;
import android.app.Activity;

public class VerifyMessageStoreListActivity extends DialogToastListActivity
{
    private pr q;
    
    public VerifyMessageStoreListActivity() {
        this.q = new p3(this, this);
    }
    
    protected void a() {
    }
    
    protected void e() {
    }
    
    protected Dialog onCreateDialog(final int n) {
        final Dialog a = this.q.a(n);
        if (a != null) {
            return a;
        }
        return super.onCreateDialog(n);
    }
}
