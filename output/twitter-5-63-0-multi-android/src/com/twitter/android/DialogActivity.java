// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.AlertDialog;
import android.net.Uri;
import android.content.Intent;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Activity;
import com.twitter.library.client.az;
import android.content.Context;
import android.os.Bundle;
import com.twitter.android.client.c;

@Deprecated
public class DialogActivity extends BaseActivity
{
    c a;
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = this.getIntent();
        this.a = com.twitter.android.client.c.a((Context)this);
        if (!az.a((Context)this).b().d()) {
            DispatchActivity.a(this, intent);
            return;
        }
        final es onDismissListener = new es(this);
        final Uri data = intent.getData();
        final String action = intent.getAction();
        final String stringExtra = intent.getStringExtra("scribe_page");
        if ("twitter".equals(intent.getScheme())) {
            final String host = data.getHost();
            if ("follow".equals(host)) {
                try {
                    final et et = new et(this, Long.parseLong(data.getQueryParameter("user_id")));
                    final AlertDialog create = new AlertDialog$Builder((Context)this).setTitle(2131297007).setMessage(2131298069).setPositiveButton(2131298158, (DialogInterface$OnClickListener)et).setNegativeButton(2131297303, (DialogInterface$OnClickListener)et).create();
                    create.setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
                    create.show();
                    return;
                }
                catch (NumberFormatException ex2) {
                    this.finish();
                    return;
                }
            }
            if ("unfollow".equals(host)) {
                try {
                    final eu eu = new eu(this, Long.parseLong(data.getQueryParameter("user_id")));
                    final AlertDialog create2 = new AlertDialog$Builder((Context)this).setTitle(2131298057).setMessage(2131298059).setPositiveButton(2131298158, (DialogInterface$OnClickListener)eu).setNegativeButton(2131297303, (DialogInterface$OnClickListener)eu).create();
                    create2.setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
                    create2.show();
                    return;
                }
                catch (NumberFormatException ex3) {
                    this.finish();
                    return;
                }
            }
            this.finish();
            return;
        }
        if ("ff".equals(action)) {
            final ev ev = new ev(this, az.a((Context)this).b().g(), stringExtra);
            final AlertDialog create3 = new AlertDialog$Builder((Context)this).setTitle(2131298250).setMessage(2131297604).setPositiveButton(2131297362, (DialogInterface$OnClickListener)ev).setNegativeButton(2131296445, (DialogInterface$OnClickListener)ev).create();
            create3.setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
            create3.show();
            return;
        }
        if ("blocked_suspended".equals(action)) {
            final ew ew = new ew(this);
            final AlertDialog create4 = new AlertDialog$Builder((Context)this).setTitle(2131297924).setMessage((CharSequence)this.getString(2131297923, new Object[] { intent.getStringExtra("username") })).setPositiveButton(2131297034, (DialogInterface$OnClickListener)ew).setNegativeButton(2131296390, (DialogInterface$OnClickListener)ew).create();
            create4.setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
            create4.show();
            return;
        }
        final ex ex = new ex(this);
        final AlertDialog$Builder setNegativeButton = new AlertDialog$Builder((Context)this).setTitle(2131297883).setNegativeButton(2131296390, (DialogInterface$OnClickListener)ex);
        if ("blocked_spammer_tweet".equals(action)) {
            final AlertDialog create5 = setNegativeButton.setMessage(2131297886).setPositiveButton(2131298020, (DialogInterface$OnClickListener)ex).create();
            create5.setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
            create5.show();
            return;
        }
        if ("blocked_spammer_follow".equals(action)) {
            final AlertDialog create6 = setNegativeButton.setMessage(2131297885).setPositiveButton(2131298020, (DialogInterface$OnClickListener)ex).create();
            create6.setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
            create6.show();
            return;
        }
        if ("blocked_automated_spammer".equals(action)) {
            final AlertDialog create7 = setNegativeButton.setMessage(2131297884).create();
            create7.setOnDismissListener((DialogInterface$OnDismissListener)onDismissListener);
            create7.show();
            return;
        }
        this.finish();
    }
}
