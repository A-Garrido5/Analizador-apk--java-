// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Button;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface$OnDismissListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import com.twitter.library.client.Session;
import com.twitter.library.util.a;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.ay;
import com.twitter.library.client.d;
import android.os.Bundle;
import com.twitter.library.service.aa;
import android.app.Activity;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import com.twitter.library.client.AbsFragmentActivity;
import com.twitter.library.service.y;
import com.twitter.library.api.account.z;
import android.content.Context;
import com.twitter.library.api.account.p;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class pu implements DialogInterface$OnClickListener
{
    final /* synthetic */ RemoveAccountDialogActivity a;
    
    pu(final RemoveAccountDialogActivity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (p.f((Context)this.a, this.a.d)) {
            this.a.showDialog(2);
            this.a.b = true;
            this.a.a = true;
            this.a.a(new z((Context)this.a, this.a.T().b(this.a.d), this.a.d), 1);
            return;
        }
        this.a.b();
    }
}
