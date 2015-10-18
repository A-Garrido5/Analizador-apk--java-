// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.RadioButton;
import android.view.View;
import android.widget.Toast;
import android.app.Dialog;
import android.util.AttributeSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.preference.DialogPreference;

public class PromptbirdPreference extends DialogPreference implements View$OnClickListener, RadioGroup$OnCheckedChangeListener
{
    RadioGroup a;
    Button b;
    private EditText c;
    private EditText d;
    private CheckBox e;
    private boolean f;
    private final SharedPreferences g;
    
    public PromptbirdPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.setDialogLayoutResource(2130969011);
        final SharedPreferences sharedPreferences = context.getSharedPreferences("debug_prefs", 0);
        this.setSummary((CharSequence)this.a(sharedPreferences));
        this.g = sharedPreferences;
    }
    
    private String a(final SharedPreferences sharedPreferences) {
        if (sharedPreferences.getBoolean("pb_force_campaign_enabled", false)) {
            return "Forced campaign " + sharedPreferences.getString("pb_force_campaign_id", "Force campaign Disabled");
        }
        return "Force campaign Disabled";
    }
    
    private void a() {
        final Dialog dialog = this.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
    
    private void a(final String s) {
        final Toast text = Toast.makeText(this.getContext(), (CharSequence)s, 1);
        text.setGravity(48, 0, 0);
        text.show();
    }
    
    protected void onBindDialogView(final View view) {
        super.onBindDialogView(view);
        final SharedPreferences g = this.g;
        final boolean boolean1 = g.getBoolean("pb_force_campaign_enabled", false);
        if (boolean1) {
            ((RadioButton)view.findViewById(2131887208)).setChecked(true);
        }
        else {
            ((RadioButton)view.findViewById(2131887207)).setChecked(true);
        }
        final RadioGroup a = (RadioGroup)view.findViewById(2131887206);
        a.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)this);
        this.a = a;
        final EditText c = (EditText)view.findViewById(2131887209);
        if (g.contains("pb_force_campaign_id")) {
            c.setText((CharSequence)g.getString("pb_force_campaign_id", ""));
        }
        final EditText d = (EditText)view.findViewById(2131887210);
        if (g.contains("pb_force_campaign_cookie")) {
            d.setText((CharSequence)g.getString("pb_force_campaign_cookie", ""));
        }
        final CheckBox e = (CheckBox)view.findViewById(2131887211);
        if (g.contains("pb_force_campaign_sticky")) {
            e.setChecked(g.getBoolean("pb_force_campaign_sticky", false));
        }
        c.setEnabled(boolean1);
        d.setEnabled(boolean1);
        e.setEnabled(boolean1);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = boolean1;
    }
    
    public void onCheckedChanged(final RadioGroup radioGroup, final int n) {
        final boolean b = n == 2131887208;
        this.c.setEnabled(b);
        this.d.setEnabled(b);
        this.e.setEnabled(b);
        this.f = b;
    }
    
    public void onClick(final View view) {
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        final String string = this.c.getText().toString();
        final String string2 = this.d.getText().toString();
        final Boolean value = this.e.isChecked();
        if (!this.f) {
            this.g.edit().putBoolean("pb_force_campaign_enabled", false).putString("pb_force_campaign_id", string).putString("pb_force_campaign_cookie", string2).putBoolean("pb_force_campaign_sticky", (boolean)value).apply();
            final String a = this.a(this.g);
            this.setSummary((CharSequence)a);
            this.a(a);
            this.a();
            return;
        }
        this.g.edit().putBoolean("pb_force_campaign_enabled", true).putString("pb_force_campaign_id", string).putString("pb_force_campaign_cookie", string2).putBoolean("pb_force_campaign_sticky", (boolean)value).apply();
        final String a2 = this.a(this.g);
        this.setSummary((CharSequence)a2);
        this.a(a2);
        this.a();
    }
    
    protected void showDialog(final Bundle bundle) {
        super.showDialog(bundle);
        final Dialog dialog = this.getDialog();
        if (dialog instanceof AlertDialog) {
            (this.b = ((AlertDialog)dialog).getButton(-1)).setOnClickListener((View$OnClickListener)this);
        }
    }
}
