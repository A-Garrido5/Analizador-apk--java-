// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.os.Bundle;

public class DiskCleanupPromptActivity extends BaseFragmentActivity
{
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130969117);
        this.findViewById(2131887284).setVisibility(8);
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        final fh fh = new fh(this);
        new AlertDialog$Builder((Context)this).setMessage(2131296946).setPositiveButton(2131296411, (DialogInterface$OnClickListener)fh).setNegativeButton(2131297667, (DialogInterface$OnClickListener)fh).setCancelable(false).create().show();
    }
}
