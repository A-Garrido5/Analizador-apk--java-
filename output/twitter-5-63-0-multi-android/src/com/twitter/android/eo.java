// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.content.DialogInterface$OnClickListener;

class eo implements DialogInterface$OnClickListener
{
    final /* synthetic */ EditText a;
    final /* synthetic */ DebugSettingsActivity b;
    
    eo(final DebugSettingsActivity b, final EditText a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        sv.a((Context)this.b, this.a.getText().toString());
        this.b.startActivity(new Intent((Context)this.b, (Class)FlowActivity.class).putExtra("phone100_signup_first_step_password", true));
    }
}
