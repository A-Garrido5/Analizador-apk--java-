// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dialog;

import com.twitter.android.widget.PromptDialogFragment;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.android.PhoneMTFlowActivity;
import android.content.DialogInterface;
import android.content.Context;
import com.twitter.android.util.ap;

public class PhoneVerificationDialogFragmentActivity extends DialogFragmentActivity
{
    private String b() {
        return ap.a((Context)this).g();
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (-1 == n2 && n == this.a) {
            this.startActivity(new Intent((Context)this, (Class)PhoneMTFlowActivity.class));
        }
        super.a(dialogInterface, n, n2);
    }
    
    @Override
    protected void a(final Bundle bundle) {
        PromptDialogFragment.b(this.a).c(2131298098).b(this.getString(2131297418, new Object[] { this.b() })).h(2131296304).j(2131296390).k().a(this.getSupportFragmentManager());
    }
}
