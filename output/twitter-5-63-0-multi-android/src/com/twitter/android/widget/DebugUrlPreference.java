// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.app.Dialog;
import android.app.AlertDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import android.widget.RadioButton;
import android.view.View;
import com.twitter.internal.network.HttpOperation;
import java.net.URI;
import android.util.AttributeSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.preference.DialogPreference;

public abstract class DebugUrlPreference extends DialogPreference implements View$OnClickListener, RadioGroup$OnCheckedChangeListener
{
    protected LinearLayout a;
    protected RadioGroup b;
    protected Button c;
    protected EditText d;
    protected boolean e;
    private final SharedPreferences f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    
    public DebugUrlPreference(final Context context, final AttributeSet set, final String g, final String h, final String i, final String j, final String k, final String l) {
        super(context, set);
        this.setDialogLayoutResource(2130968758);
        this.e = false;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        final SharedPreferences sharedPreferences = context.getSharedPreferences("debug_prefs", 0);
        String string;
        if (sharedPreferences.getBoolean(g, false)) {
            string = sharedPreferences.getString(i, "Production");
        }
        else {
            string = "Production";
        }
        this.setSummary((CharSequence)string);
        this.f = sharedPreferences;
    }
    
    protected abstract URI a(final String p0);
    
    protected URI a(final URI uri) {
        return uri;
    }
    
    protected void a(final Boolean b) {
    }
    
    protected boolean a() {
        return false;
    }
    
    protected boolean a(final HttpOperation httpOperation) {
        return httpOperation.j();
    }
    
    protected void onBindDialogView(final View view) {
        super.onBindDialogView(view);
        final SharedPreferences f = this.f;
        final RadioButton radioButton = (RadioButton)view.findViewById(2131886724);
        radioButton.setText((CharSequence)this.j);
        ((TextView)view.findViewById(2131886725)).setText((CharSequence)this.k);
        final boolean boolean1 = f.getBoolean(this.g, false);
        if (boolean1) {
            radioButton.setChecked(true);
        }
        else {
            ((RadioButton)view.findViewById(2131886723)).setChecked(true);
        }
        final RadioGroup b = (RadioGroup)view.findViewById(2131886722);
        b.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)this);
        this.b = b;
        this.a = (LinearLayout)view.findViewById(2131886727);
        final EditText d = (EditText)view.findViewById(2131886726);
        if (!TextUtils.isEmpty((CharSequence)this.l)) {
            d.setHint((CharSequence)this.l);
        }
        if (!TextUtils.isEmpty((CharSequence)this.h) && f.contains(this.h)) {
            d.setText((CharSequence)f.getString(this.h, ""));
        }
        else if (f.contains(this.i)) {
            d.setText((CharSequence)f.getString(this.i, ""));
        }
        else if (!TextUtils.isEmpty((CharSequence)this.l)) {
            d.setText((CharSequence)this.l);
        }
        d.setEnabled(boolean1);
        this.d = d;
        this.e = boolean1;
    }
    
    public void onCheckedChanged(final RadioGroup radioGroup, final int n) {
        final boolean b = n == 2131886724;
        this.d.setEnabled(b);
        this.e = b;
    }
    
    public void onClick(final View view) {
        final String string = this.d.getText().toString();
        if (!TextUtils.isEmpty((CharSequence)string)) {
            new an(this, null).execute((Object[])new String[] { string });
        }
    }
    
    protected void showDialog(final Bundle bundle) {
        super.showDialog(bundle);
        final Dialog dialog = this.getDialog();
        if (dialog instanceof AlertDialog) {
            (this.c = ((AlertDialog)dialog).getButton(-1)).setOnClickListener((View$OnClickListener)this);
        }
    }
}
