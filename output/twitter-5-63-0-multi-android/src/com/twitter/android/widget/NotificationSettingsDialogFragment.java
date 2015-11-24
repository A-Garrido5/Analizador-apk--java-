// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.content.res.Resources;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import com.twitter.library.provider.NotificationSetting;
import com.twitter.android.samsung.model.g;
import android.accounts.AccountManager;
import android.app.Dialog;
import com.twitter.library.platform.PushService;
import android.content.IntentFilter;
import android.content.DialogInterface;
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

public final class NotificationSettingsDialogFragment extends DialogFragment
{
    private String a;
    private Account b;
    private int c;
    private String d;
    private Context e;
    private TwitterScribeItem f;
    private String g;
    private String h;
    private c i;
    
    public static NotificationSettingsDialogFragment a(final String s, final String s2, final String s3, final String s4) {
        final NotificationSettingsDialogFragment notificationSettingsDialogFragment = new NotificationSettingsDialogFragment();
        final Bundle arguments = new Bundle(4);
        arguments.putString("NotificationSettingsDialogFragment_account_name", s);
        arguments.putString("collapse_key", s2);
        arguments.putString("event_id", s3);
        arguments.putString("query", s4);
        notificationSettingsDialogFragment.setArguments(arguments);
        return notificationSettingsDialogFragment;
    }
    
    private void a(final String s) {
        this.i.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(az.a(this.e).b().g()).b("search", "universal_top", "", "recommendation", s)).a(this.f)).e(this.h));
    }
    
    @Override
    public void onAttach(final Activity e) {
        super.onAttach(e);
        this.e = (Context)e;
    }
    
    @Override
    public void onCancel(final DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.a("cancel");
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        new IntentFilter().addAction(PushService.b);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        int enabledFor = -1;
        if (bundle == null) {
            final Bundle arguments = this.getArguments();
            this.a = arguments.getString("NotificationSettingsDialogFragment_account_name");
            this.d = arguments.getString("collapse_key");
            this.g = arguments.getString("event_id");
            this.h = arguments.getString("query");
        }
        else {
            this.a = bundle.getString("NotificationSettingsDialogFragment_account_name");
            this.d = bundle.getString("collapse_key");
            this.g = bundle.getString("event_id");
            this.h = bundle.getString("query");
        }
        this.f = new TwitterScribeItem();
        this.i = com.twitter.android.client.c.a(this.e);
        final Resources resources = this.e.getResources();
        for (final Account b : AccountManager.get(this.e).getAccountsByType(com.twitter.android.samsung.model.g.a)) {
            if (b.name.equals(this.a)) {
                this.b = b;
                break;
            }
        }
        final String d = this.d;
        int n = 0;
        Label_0175: {
            switch (d.hashCode()) {
                case 956662491: {
                    if (d.equals("event_parrot")) {
                        n = 0;
                        break Label_0175;
                    }
                    break;
                }
            }
            n = enabledFor;
        }
        String string = null;
        String string2 = null;
        switch (n) {
            default: {
                string = "";
                string2 = "";
                break;
            }
            case 0: {
                string = resources.getString(2131297298);
                string2 = resources.getString(2131297523);
                enabledFor = NotificationSetting.k.enabledFor;
                this.f.b = this.g;
                this.f.x = this.h;
                this.f.c = 12;
                this.f.y = "event_parrot";
                break;
            }
        }
        this.c = PushService.b(this.e, this.b);
        final boolean b2 = enabledFor == (enabledFor & this.c);
        int n2;
        if (b2) {
            n2 = 2131297361;
        }
        else {
            n2 = 2131297363;
        }
        final String[] array = { resources.getString(2131297504, new Object[] { resources.getString(n2), string }), resources.getString(2131296445) };
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.getActivity());
        alertDialog$Builder.setTitle((CharSequence)string2).setItems((CharSequence[])array, (DialogInterface$OnClickListener)new dv(this, enabledFor, b2));
        return (Dialog)alertDialog$Builder.create();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        bundle.putString("NotificationSettingsDialogFragment_account_name", this.a);
        bundle.putString("collapse_key", this.d);
        bundle.putString("event_id", this.g);
        bundle.putString("query", this.h);
    }
}
