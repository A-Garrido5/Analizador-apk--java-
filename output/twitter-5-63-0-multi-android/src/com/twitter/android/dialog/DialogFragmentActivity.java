// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.content.DialogInterface;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.b;
import com.twitter.android.BaseFragmentActivity;

public abstract class DialogFragmentActivity extends BaseFragmentActivity implements b, e
{
    protected int a;
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n) {
        this.finish();
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        this.finish();
    }
    
    protected abstract void a(final Bundle p0);
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = this.getIntent();
        this.a = intent.getIntExtra("extra_dialog_id", 0);
        if (bundle == null) {
            this.a(intent.getExtras());
        }
    }
}
