// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.CompoundButton;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.text.TextWatcher;
import com.twitter.android.client.c;
import android.content.DialogInterface;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.internal.android.widget.ToolBar;
import android.content.Intent;
import android.text.TextUtils;
import com.twitter.android.widget.PromptDialogFragment;
import android.view.View;
import android.content.Context;
import com.twitter.util.t;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.regex.Pattern;
import com.twitter.ui.dialog.e;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class ListCreateEditActivity extends TwitterFragmentActivity implements CompoundButton$OnCheckedChangeListener, e
{
    public static final Pattern a;
    private long b;
    private TextView c;
    private TextView d;
    private CheckBox e;
    private String f;
    private String g;
    private int h;
    
    static {
        a = Pattern.compile("\\b(\\p{L})+([\\p{L}0-9_-])*");
    }
    
    private void a(final int n) {
        switch (n) {
            default: {}
            case 1:
            case 2: {
                t.a((Context)this, (View)this.c, false);
                final PromptDialogFragment j = PromptDialogFragment.b(n).d(2131296284).h(2131296810).j(2131296445);
                if (this.b > 0L) {
                    j.c(2131297154);
                }
                else {
                    j.c(2131296734);
                }
                j.a(this.getSupportFragmentManager());
            }
        }
    }
    
    private int h() {
        if (this.e.isChecked()) {
            return 1;
        }
        return 0;
    }
    
    private boolean i() {
        return !this.c.getText().toString().trim().equals(this.f) || !this.d.getText().toString().trim().equals(this.g) || this.h != this.h();
    }
    
    private boolean j() {
        return !TextUtils.isEmpty(this.c.getText());
    }
    
    private void k() {
        final Intent intent = new Intent();
        final String trim = this.c.getText().toString().trim();
        intent.putExtra("name", trim);
        final String stringExtra = this.getIntent().getStringExtra("full_name");
        if (stringExtra != null) {
            final int lastIndex = stringExtra.lastIndexOf(47);
            if (lastIndex > 0) {
                intent.putExtra("full_name", stringExtra.substring(0, lastIndex + 1) + trim);
            }
        }
        intent.putExtra("description", this.d.getText().toString().trim());
        intent.putExtra("mode", this.h());
        this.setResult(-1, intent);
        this.finish();
    }
    
    private void l() {
        if (this.b <= 0L) {
            this.G().a(this.U().g(), "me:lists:list:new_list:cancel");
        }
    }
    
    protected int a(final ToolBar toolBar) {
        toolBar.a(2131887428).c(this.i() && this.j());
        return 1;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968702);
        bn.a(false);
        bn.c(false);
        return bn;
    }
    
    public void a(final int n, final y y) {
        switch (n) {
            case 1: {
                if (!((aa)y.l().b()).a()) {
                    Toast.makeText((Context)this, 2131296733, 1).show();
                    return;
                }
                break;
            }
            case 2: {
                if (!((aa)y.l().b()).a()) {
                    Toast.makeText((Context)this, 2131296736, 1).show();
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        switch (n) {
            case 1: {
                if (n2 == -1) {
                    this.l();
                    this.finish();
                    return;
                }
                break;
            }
            case 2: {
                if (n2 == -1) {
                    this.g_();
                    this.l();
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
        if (jx.a() != 2131887428) {
            return super.a(jx);
        }
        final String replace = this.c.getText().toString().trim().replace(" ", "-");
        if (replace.length() == 0) {
            Toast.makeText((Context)this, 2131296737, 0).show();
            return true;
        }
        if (!ListCreateEditActivity.a.matcher(replace).matches()) {
            Toast.makeText((Context)this, 2131296738, 1).show();
            return true;
        }
        this.c.setText((CharSequence)replace);
        final int h = this.h();
        final c g = this.G();
        if (this.b > 0L) {
            if (!this.i()) {
                return true;
            }
            this.a(nb.a(this.getApplicationContext(), this.T().b(), this.b, this.T().b().g(), replace, h, this.d.getText().toString()), 2);
        }
        else {
            this.a(nb.a(this.getApplicationContext(), this.T().b(), this.T().b().g(), replace, h, this.d.getText().toString()), 1);
            g.a(this.U().g(), "me:lists:list:new_list:save");
        }
        this.k();
        return true;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.c = (TextView)this.findViewById(2131886307);
        this.d = (TextView)this.findViewById(2131886396);
        this.e = (CheckBox)this.findViewById(2131886597);
        final Intent intent = this.getIntent();
        if (intent.hasExtra("list_id")) {
            this.b = intent.getLongExtra("list_id", -1L);
            this.f = intent.getStringExtra("name");
            this.g = intent.getStringExtra("description");
            this.h = intent.getIntExtra("mode", 0);
            this.c.setText((CharSequence)this.f);
            this.d.setText((CharSequence)this.g);
            this.e.setChecked(this.h == 1);
            this.setTitle(2131297154);
        }
        else {
            this.f = "";
            this.g = "";
            this.h = 0;
            this.setTitle(2131296734);
        }
        final com.twitter.android.jx jx = new com.twitter.android.jx(this);
        this.c.addTextChangedListener((TextWatcher)jx);
        this.d.addTextChangedListener((TextWatcher)jx);
        this.e.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this);
        this.c.setFilters(new InputFilter[] { new InputFilter$LengthFilter(25) });
    }
    
    @Override
    protected void g_() {
        if (this.i()) {
            this.a(2);
            return;
        }
        super.g_();
        this.l();
    }
    
    @Override
    public void onBackPressed() {
        if (this.i()) {
            this.a(1);
            return;
        }
        super.onBackPressed();
        this.l();
    }
    
    public void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        this.Q();
    }
}
