// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.content.res.Resources;
import android.app.AlertDialog$Builder;
import com.twitter.library.provider.NotificationSetting;
import com.twitter.android.samsung.model.g;
import android.accounts.AccountManager;
import android.app.Dialog;
import com.twitter.library.platform.PushService;
import android.content.IntentFilter;
import android.app.Activity;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeLog;
import android.os.Bundle;
import com.twitter.android.client.c;
import com.twitter.library.scribe.TwitterScribeItem;
import android.content.Context;
import android.accounts.Account;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class dv implements DialogInterface$OnClickListener
{
    final /* synthetic */ int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ NotificationSettingsDialogFragment c;
    
    dv(final NotificationSettingsDialogFragment c, final int a, final boolean b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (n == 0) {
            if (this.a != -1) {
                NotificationSettingsDialogFragment.a(this.c, this.a);
                this.c.i.a(this.c.b, this.c.c);
                final NotificationSettingsDialogFragment c = this.c;
                String s;
                if (this.b) {
                    s = "unsubscribe";
                }
                else {
                    s = "subscribe";
                }
                c.a(s);
            }
        }
        else if (1 == n) {
            this.c.a("cancel");
        }
    }
}
