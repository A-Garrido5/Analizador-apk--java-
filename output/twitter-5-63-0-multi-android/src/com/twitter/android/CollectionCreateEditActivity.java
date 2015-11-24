// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import android.text.InputFilter$LengthFilter;
import com.twitter.library.featureswitch.d;
import android.text.InputFilter;
import android.text.TextWatcher;
import com.twitter.library.api.timeline.h;
import android.content.DialogInterface;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.internal.android.widget.ToolBar;
import android.text.TextUtils;
import com.twitter.android.widget.PromptDialogFragment;
import android.view.View;
import android.content.Context;
import com.twitter.util.t;
import android.widget.EditText;
import com.twitter.ui.dialog.e;
import com.twitter.android.client.TwitterFragmentActivity;

public class CollectionCreateEditActivity extends TwitterFragmentActivity implements e
{
    private EditText a;
    private EditText b;
    private boolean c;
    private String d;
    private String e;
    private String f;
    
    private void a(final int n) {
        switch (n) {
            default: {}
            case 1:
            case 2: {
                t.a((Context)this, (View)this.a, false);
                final PromptDialogFragment j = PromptDialogFragment.b(n).d(2131296284).h(2131296810).j(2131296445);
                if (this.c) {
                    j.c(2131296462);
                }
                else {
                    j.c(2131296468);
                }
                j.a(this.getSupportFragmentManager());
            }
        }
    }
    
    private String h() {
        return this.a.getText().toString().trim();
    }
    
    private String i() {
        return this.b.getText().toString().trim();
    }
    
    private boolean j() {
        return !this.h().equals(this.e) || !this.i().equals(this.f);
    }
    
    private boolean k() {
        return !TextUtils.isEmpty((CharSequence)this.h());
    }
    
    @Override
    protected int a(final ToolBar toolBar) {
        toolBar.a(2131887428).c(this.j() && this.k());
        return 1;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968701);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        if (((aa)y.l().b()).a()) {
            this.finish();
            return;
        }
        if (this.c) {
            Toast.makeText((Context)this, 2131296474, 1).show();
        }
        else {
            Toast.makeText((Context)this, 2131296458, 1).show();
        }
        this.Q();
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        switch (n) {
            case 1: {
                if (n2 == -1) {
                    this.finish();
                    return;
                }
                break;
            }
            case 2: {
                if (n2 == -1) {
                    super.g_();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        jv.a(2131951657, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131887428) {
            jx.c(false);
            final h h = new h((Context)this, this.U(), this.h(), this.i(), null);
            String s;
            if (this.c) {
                h.a(this.d);
                s = "update";
            }
            else {
                s = "create";
            }
            this.G().a(this.U().g(), "me", null, null, "custom_timeline", s);
            int n;
            if (this.c) {
                n = 2;
            }
            else {
                n = 1;
            }
            this.a(h, n);
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        this.setTitle(2131296468);
        final Intent intent = this.getIntent();
        if (intent.hasExtra("timeline_id")) {
            this.d = intent.getStringExtra("timeline_id");
            this.c = true;
            this.e = intent.getStringExtra("timeline_name");
            this.f = intent.getStringExtra("timeline_description");
        }
        if (this.e == null) {
            this.e = "";
        }
        if (this.f == null) {
            this.f = "";
        }
        (this.a = (EditText)this.findViewById(2131886307)).setText((CharSequence)this.e);
        (this.b = (EditText)this.findViewById(2131886396)).setText((CharSequence)this.f);
        final cg cg = new cg(this);
        this.a.addTextChangedListener((TextWatcher)cg);
        this.b.addTextChangedListener((TextWatcher)cg);
        this.a.setFilters(new InputFilter[] { new InputFilter$LengthFilter(com.twitter.library.featureswitch.d.a("custom_timelines_name_max_length", 25)) });
        this.b.setFilters(new InputFilter[] { new InputFilter$LengthFilter(com.twitter.library.featureswitch.d.a("custom_timelines_description_max_length", 160)) });
    }
    
    @Override
    protected void g_() {
        if (this.j()) {
            this.a(2);
            return;
        }
        super.g_();
    }
    
    @Override
    public void onBackPressed() {
        if (this.j()) {
            this.a(1);
            return;
        }
        super.onBackPressed();
    }
}
