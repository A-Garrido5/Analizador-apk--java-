// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.app.AlertDialog;
import android.os.Bundle;
import com.twitter.library.client.bk;
import android.view.View;
import android.widget.Toast;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.preference.DialogPreference;
import android.app.Dialog;
import com.twitter.library.api.ay;
import com.twitter.android.client.bh;
import android.text.TextUtils;
import android.os.AsyncTask;

class gb extends AsyncTask
{
    final /* synthetic */ TwitterAccessPreference a;
    
    private gb(final TwitterAccessPreference a) {
        this.a = a;
    }
    
    protected Boolean a(final String... array) {
        final String s = array[0];
        if (TextUtils.isEmpty((CharSequence)s)) {
            return false;
        }
        final ay a = TwitterAccessPreference.a(this.a.getContext().getString(2131298231) + "&carrier=" + s);
        if (a != null) {
            bh.a(this.a.getContext()).a(a, this.a.g);
        }
        boolean b = false;
        if (a != null) {
            b = true;
        }
        return b;
    }
    
    protected void a(final Boolean b) {
        if (b) {
            this.a.g.edit().putString("twitter_access_carrier", this.a.c.getText().toString()).apply();
            this.a.b("TwitterAccess set for " + this.a.c.getText());
            final Dialog dialog = this.a.getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
        else {
            this.a.b("Invalid carrier for TwitterAccess.");
            this.a.e.setVisibility(8);
            this.a.f.setVisibility(0);
            this.a.b.setVisibility(0);
        }
        this.a.setSummary((CharSequence)this.a.a(this.a.g));
    }
    
    protected void onPreExecute() {
        this.a.f.setVisibility(8);
        this.a.b.setVisibility(8);
        this.a.e.setVisibility(0);
    }
}
