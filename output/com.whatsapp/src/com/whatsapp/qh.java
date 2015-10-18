// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.WindowManager$LayoutParams;
import android.text.TextWatcher;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.app.Dialog;

public class qh extends Dialog
{
    private String a;
    EditText b;
    private ad3 c;
    private String d;
    final InputMethodManager e;
    private int f;
    
    private void a() {
        if (!this.e.isFullscreenMode()) {
            this.e.toggleSoftInput(2, 0);
        }
    }
    
    static void a(final qh qh) {
        qh.a();
    }
    
    static ad3 b(final qh qh) {
        return qh.c;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        this.setContentView(2130903149);
        ((TextView)this.findViewById(2131755544)).setText(this.f);
        ((Button)this.findViewById(2131755546)).setOnClickListener((View$OnClickListener)new w9(this, null));
        ((Button)this.findViewById(2131755547)).setOnClickListener((View$OnClickListener)new be(this));
        (this.b = (EditText)this.findViewById(2131755545)).setText((CharSequence)this.d);
        alm.a((TextView)this.b);
        this.b.addTextChangedListener((TextWatcher)new z0(this));
        final WindowManager$LayoutParams attributes = this.getWindow().getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        this.getWindow().setAttributes(attributes);
    }
    
    public void onStart() {
        super.onStart();
        this.a();
        this.b.setText((CharSequence)App.S.c(this.a).a(this.getContext()));
    }
}
