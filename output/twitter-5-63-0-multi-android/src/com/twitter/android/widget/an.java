// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.app.Dialog;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.RadioButton;
import android.view.View;
import com.twitter.internal.network.HttpOperation;
import android.util.AttributeSet;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.preference.DialogPreference;
import android.content.Context;
import android.widget.Toast;
import com.twitter.util.c;
import android.content.SharedPreferences$Editor;
import android.text.TextUtils;
import com.twitter.library.network.a;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.g;
import com.twitter.library.network.t;
import com.twitter.library.client.az;
import java.net.URI;
import android.os.AsyncTask;

class an extends AsyncTask
{
    final /* synthetic */ DebugUrlPreference a;
    
    private an(final DebugUrlPreference a) {
        this.a = a;
    }
    
    private boolean a(final URI uri) {
        if (uri == null) {
            return true;
        }
        t t;
        if (this.a.a()) {
            t = new t(az.a(this.a.getContext()).b().h());
        }
        else {
            t = null;
        }
        return this.a.a(new g(this.a.getContext(), uri).a(HttpOperation$RequestMethod.a).a(t).a().c());
    }
    
    protected Boolean a(final String... array) {
        boolean b = true;
        final String s = array[0];
        URI a;
        boolean b2;
        if (this.a.e) {
            a = this.a.a(s);
            b2 = (a != null && this.a(this.a.a(a)) && b);
        }
        else {
            b2 = b;
            a = null;
        }
        final SharedPreferences$Editor edit = this.a.f.edit();
        final String a2 = this.a.g;
        if (!this.a.e || !b2) {
            b = false;
        }
        final SharedPreferences$Editor putBoolean = edit.putBoolean(a2, b);
        if (a != null && b2) {
            putBoolean.putString(this.a.i, a.toString());
        }
        if (!TextUtils.isEmpty((CharSequence)this.a.h)) {
            putBoolean.putString(this.a.h, s);
        }
        putBoolean.apply();
        this.a.a(Boolean.valueOf(b2));
        return b2;
    }
    
    protected void a(final Boolean b) {
        final Context context = this.a.getContext();
        if (b) {
            c.a(context, 1000L);
            return;
        }
        final Toast text = Toast.makeText(context, (CharSequence)"This is not a valid url.", 1);
        text.setGravity(48, 0, 0);
        text.show();
        this.a.a.setVisibility(8);
        this.a.b.setVisibility(0);
        this.a.c.setVisibility(0);
    }
    
    protected void onPreExecute() {
        this.a.b.setVisibility(8);
        this.a.c.setVisibility(8);
        this.a.a.setVisibility(0);
    }
}
