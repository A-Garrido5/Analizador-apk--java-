// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CheckBox;
import android.view.ViewGroup;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.app.AlertDialog;
import com.twitter.android.BaseActivity;

@Deprecated
public class DataChargesActivity extends BaseActivity
{
    private AlertDialog a;
    private int b;
    
    private void a(final int n) {
        final Intent intent = new Intent((Context)this, (Class)StartupWidgetPreferencesActivity.class);
        intent.setFlags(276856832);
        intent.putExtra("appWidgetId", n);
        this.startActivityForResult(intent, 0);
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n2 == -1) {
            this.setResult(-1, intent);
            this.finish();
        }
    }
    
    public void onBackPressed() {
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.b = this.getIntent().getExtras().getInt("appWidgetId", -1);
        if (!i.c((Context)this)) {
            final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
            alertDialog$Builder.setCancelable(false);
            alertDialog$Builder.setPositiveButton(17039370, (DialogInterface$OnClickListener)new a(this));
            alertDialog$Builder.setNegativeButton(17039360, (DialogInterface$OnClickListener)new b(this));
            alertDialog$Builder.setView(this.getLayoutInflater().inflate(2130969209, (ViewGroup)null));
            alertDialog$Builder.setTitle(17039380);
            alertDialog$Builder.setIconAttribute(16843605);
            (this.a = alertDialog$Builder.create()).show();
            final CheckBox checkBox = (CheckBox)this.a.findViewById(2131886660);
            checkBox.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)new c(this));
            checkBox.setChecked(true);
            return;
        }
        this.a(this.b);
    }
    
    @Override
    protected void onDestroy() {
        if (this.a != null && this.a.isShowing()) {
            this.a.dismiss();
        }
        super.onDestroy();
    }
    
    protected void onUserLeaveHint() {
        i.b((Context)this);
        final Intent intent = new Intent((Context)this, (Class)TwitterWidgetProvider.class);
        intent.setAction(TwitterWidgetProvider.b);
        intent.putExtra("appWidgetId", this.b);
        this.setResult(-1, intent);
        this.finish();
    }
}
