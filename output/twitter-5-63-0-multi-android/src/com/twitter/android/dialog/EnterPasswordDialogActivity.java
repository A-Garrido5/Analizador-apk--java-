// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.dialog;

import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.content.Context;
import com.twitter.util.t;
import com.twitter.android.widget.PromptDialogFragment;
import android.content.Intent;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.widget.TextView;
import android.os.Bundle;
import android.app.Dialog;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.ui.dialog.c;

public class EnterPasswordDialogActivity extends DialogFragmentActivity implements c
{
    private String b;
    private TwitterEditText c;
    
    @Override
    public void a(final Dialog dialog, final int n, final Bundle bundle) {
        if (n == this.a) {
            final TextView textView = (TextView)dialog.findViewById(2131886728);
            (this.c = (TwitterEditText)dialog.findViewById(2131886729)).setTypeface(Typeface.DEFAULT);
            textView.setText((CharSequence)this.getString(2131297690, new Object[] { this.b }));
            this.a(true);
        }
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == this.a) {
            final Intent intent = new Intent();
            intent.putExtra("user_choice", -1 == n2);
            intent.putExtra("password_input", this.c.getText().toString());
            intent.putExtra("extra_dialog_id", n);
            this.setResult(-1, intent);
            this.a(false);
        }
        super.a(dialogInterface, n, n2);
    }
    
    @Override
    protected void a(final Bundle bundle) {
        PromptDialogFragment.b(this.a).c(2131297691).h(2131297362).j(2131296445).a(2130968759, this).m().k().a(this.getSupportFragmentManager());
    }
    
    protected void a(final boolean b) {
        if (!b) {
            t.a((Context)this, (View)this.c, b);
            this.c.clearFocus();
            return;
        }
        this.c.requestFocus();
        ((InputMethodManager)this.getSystemService("input_method")).toggleSoftInput(2, 1);
    }
    
    public void onCreate(final Bundle bundle) {
        this.b = this.getIntent().getExtras().getString("phone");
        super.onCreate(bundle);
    }
}
