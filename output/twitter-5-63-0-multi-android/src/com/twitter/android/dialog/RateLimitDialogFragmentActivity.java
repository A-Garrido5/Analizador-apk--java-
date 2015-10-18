// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dialog;

import com.twitter.android.widget.PromptDialogFragment;
import android.os.Bundle;
import com.twitter.android.PhoneOwnershipActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.Context;

public class RateLimitDialogFragmentActivity extends DialogFragmentActivity
{
    public static void a(final Context context) {
        context.startActivity(new Intent(context, (Class)RateLimitDialogFragmentActivity.class).setFlags(268435456));
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (-1 == n2 && n == this.a) {
            this.startActivity(new Intent((Context)this, (Class)PhoneOwnershipActivity.class));
        }
        super.a(dialogInterface, n, n2);
    }
    
    @Override
    protected void a(final Bundle bundle) {
        PromptDialogFragment.b(this.a).c(2131297508).d(2131297509).h(2131296304).j(2131296390).k().a(this.getSupportFragmentManager());
    }
}
