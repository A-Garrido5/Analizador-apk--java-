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
import com.twitter.library.api.b;
import com.twitter.library.client.u;
import com.twitter.library.util.bj;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.client.bf;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.util.t;
import com.twitter.library.util.bq;
import com.twitter.library.client.App;
import com.twitter.android.client.c;
import com.twitter.library.client.bd;
import com.twitter.library.network.LoginVerificationRequiredResponse;
import android.text.TextUtils;
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
import android.view.View;
import android.text.Editable;
import com.twitter.internal.android.widget.PopupEditText;
import android.view.View$OnFocusChangeListener;
import com.twitter.android.util.k;

class km extends k implements View$OnFocusChangeListener
{
    final /* synthetic */ LoginActivity a;
    
    km(final LoginActivity a, final PopupEditText popupEditText) {
        this.a = a;
        super(popupEditText);
        popupEditText.setOnFocusChangeListener((View$OnFocusChangeListener)this);
    }
    
    private void c() {
        if (this.b.d()) {
            this.a.G().a(this.a.U().g(), String.format("login:identifier:%s:typeahead:impression", this.a.e));
        }
    }
    
    @Override
    public void a(final int n) {
        super.a(n);
        this.a.G().a(this.a.U().g(), String.format("login:identifier:%s:typeahead:select", this.a.e));
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        super.afterTextChanged(editable);
        this.c();
    }
    
    @Override
    public void onClick(final View view) {
        super.onClick(view);
        this.c();
    }
    
    public void onFocusChange(final View view, final boolean b) {
        if (view == this.b) {
            if (!this.a()) {
                this.b.b();
                return;
            }
            this.b.a();
            this.c();
        }
    }
}
