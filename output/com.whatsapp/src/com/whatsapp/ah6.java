// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.cq;
import android.view.WindowManager$LayoutParams;
import android.content.DialogInterface$OnCancelListener;
import android.widget.ImageButton;
import android.text.TextWatcher;
import android.text.InputFilter;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import android.widget.EditText;

public class ah6 extends ahw
{
    private final int c;
    private String d;
    private final String e;
    private n7 f;
    private final zt g;
    private EditText h;
    private final int i;
    private TextView j;
    private final Context k;
    private final int l;
    private boolean m;
    private final Activity n;
    private final int o;
    
    public ah6(final Activity n, final int o, final String e, final zt g, final int i, final int c, final int l) {
        super(n, 2130903150);
        this.m = true;
        this.n = n;
        this.k = n.getBaseContext();
        this.g = g;
        this.o = o;
        this.i = i;
        this.c = c;
        this.l = l;
        this.e = e;
    }
    
    static Context a(final ah6 ah6) {
        return ah6.k;
    }
    
    static String a(final ah6 ah6, final String d) {
        return ah6.d = d;
    }
    
    static boolean a(final ah6 ah6, final boolean m) {
        return ah6.m = m;
    }
    
    static int b(final ah6 ah6) {
        return ah6.l;
    }
    
    static n7 c(final ah6 ah6) {
        return ah6.f;
    }
    
    static zt d(final ah6 ah6) {
        return ah6.g;
    }
    
    static EditText e(final ah6 ah6) {
        return ah6.h;
    }
    
    static int f(final ah6 ah6) {
        return ah6.i;
    }
    
    static Activity g(final ah6 ah6) {
        return ah6.n;
    }
    
    static TextView h(final ah6 ah6) {
        return ah6.j;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((TextView)this.findViewById(2131755544)).setText(this.o);
        this.setTitle(this.o);
        ((Button)this.findViewById(2131755546)).setOnClickListener((View$OnClickListener)new awn(this));
        ((Button)this.findViewById(2131755547)).setOnClickListener((View$OnClickListener)new w8(this));
        this.j = (TextView)this.findViewById(2131755550);
        alm.a(this.h = (EditText)this.findViewById(2131755549));
        if (this.i > 0) {
            this.j.setVisibility(0);
            this.h.setFilters(new InputFilter[] { new aw8(this.i) });
        }
        this.h.addTextChangedListener((TextWatcher)new ahd(this));
        alm.a((TextView)this.h);
        final WindowManager$LayoutParams attributes = this.getWindow().getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        this.getWindow().setAttributes(attributes);
        (this.f = new n7(this.n)).a(new a2q(this));
        ((ImageButton)this.findViewById(2131755548)).setOnClickListener((View$OnClickListener)new kk(this));
        this.setOnCancelListener((DialogInterface$OnCancelListener)new w4(this));
        this.getWindow().setSoftInputMode(5);
    }
    
    public void onStart() {
        super.onStart();
        String s;
        if (this.d != null) {
            s = this.d;
        }
        else {
            s = this.e;
        }
        if (this.c != 0) {
            this.h.setHint(this.c);
        }
        this.h.setText(cq.c(s, this.k));
        if (s != null) {
            this.h.selectAll();
        }
    }
    
    public void onStop() {
        super.onStop();
        if (this.m) {
            this.d = this.h.getText().toString();
        }
    }
}
