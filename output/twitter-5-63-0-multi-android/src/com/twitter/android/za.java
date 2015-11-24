// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri;
import android.view.View;
import android.content.Intent;
import com.twitter.library.client.bh;
import android.text.TextWatcher;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.client.Session$LoginStatus;
import com.twitter.library.client.az;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import com.twitter.library.client.bd;
import com.twitter.library.client.Session;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.os.Handler;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import com.twitter.android.widget.ProgressDialogFragment;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

class za implements Runnable
{
    final /* synthetic */ VerifyLoginActivity a;
    
    private za(final VerifyLoginActivity a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.isFinishing()) {
            return;
        }
        this.a.a = this.a.T().a(this.a.m, this.a.c.a, this.a.c.b, null, this.a.n);
    }
}
