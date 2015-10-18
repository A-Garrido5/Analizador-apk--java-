// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.accounts.AccountAuthenticatorResponse;
import com.twitter.library.client.bh;
import com.twitter.library.util.a;
import android.view.View$OnFocusChangeListener;
import android.widget.TextView;
import android.widget.ImageButton;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import com.twitter.library.client.as;
import com.twitter.android.util.AppEventTrack;
import com.twitter.android.util.AppEventTrack$EventType;
import android.app.Activity;
import android.content.DialogInterface;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;
import com.twitter.internal.android.widget.PopupEditText;
import com.twitter.library.api.b;
import com.twitter.library.client.u;
import com.twitter.library.util.bj;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.client.bf;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.View;
import com.twitter.util.t;
import com.twitter.library.util.bq;
import com.twitter.library.client.App;
import com.twitter.library.client.bd;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import android.net.Uri;
import com.twitter.library.client.Session;
import com.twitter.android.util.ak;
import android.content.Context;
import android.content.Intent;
import com.twitter.library.featureswitch.d;
import android.widget.Button;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.ui.dialog.e;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.android.client.TwitterFragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import com.twitter.android.client.c;
import com.twitter.library.util.h;

class ki extends h
{
    final /* synthetic */ c a;
    final /* synthetic */ LoginActivity b;
    private boolean c;
    private boolean d;
    
    ki(final LoginActivity b, final c a) {
        this.b = b;
        this.a = a;
        this.c = false;
        final boolean empty = TextUtils.isEmpty((CharSequence)this.b.g.getText());
        boolean d = false;
        if (!empty) {
            d = true;
        }
        this.d = d;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        if (this.d && !this.c) {
            this.a.a(this.b.U().g(), "login:::username:edit");
            this.c = true;
        }
    }
}
