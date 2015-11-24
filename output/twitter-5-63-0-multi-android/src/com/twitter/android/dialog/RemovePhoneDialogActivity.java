// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dialog;

import com.twitter.android.widget.PromptDialogFragment;
import android.os.Bundle;
import android.content.Intent;
import android.content.DialogInterface;

public class RemovePhoneDialogActivity extends DialogFragmentActivity
{
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == this.a) {
            final Intent intent = new Intent();
            intent.putExtra("user_choice", -1 == n2);
            intent.putExtra("extra_dialog_id", n);
            this.setResult(-1, intent);
        }
        super.a(dialogInterface, n, n2);
    }
    
    @Override
    protected void a(final Bundle bundle) {
        PromptDialogFragment.b(this.a).a(bundle.getString("title")).d(2131297770).h(2131297362).j(2131296445).k().a(this.getSupportFragmentManager());
    }
}
