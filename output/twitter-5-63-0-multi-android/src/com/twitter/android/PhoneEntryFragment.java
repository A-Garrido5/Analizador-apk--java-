// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import com.twitter.android.util.al;
import com.twitter.android.util.ap;
import android.text.TextUtils;
import android.content.Context;
import android.widget.AutoCompleteTextView;
import com.twitter.util.q;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.ui.widget.PromptView;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;

public class PhoneEntryFragment extends AbsFragment implements View$OnClickListener, ni
{
    private EditText a;
    private TextView b;
    private PromptView c;
    private TwitterButton d;
    private TwitterButton e;
    private TwitterButton f;
    private mo g;
    private ng h;
    private nh i;
    private ht j;
    
    private void b(final String text) {
        if (!q.a(text)) {
            this.b.setVisibility(0);
            this.b.setText((CharSequence)text);
            return;
        }
        this.b.setVisibility(8);
    }
    
    public void a(final int title) {
        this.c.setTitle(title);
    }
    
    public void a(final ht j) {
        final String c = j.c;
        if (this.aD()) {
            this.b(c);
            this.j = null;
            return;
        }
        this.j = j;
    }
    
    public void a(final String text) {
        this.a.setText((CharSequence)text);
        this.a.requestFocus();
        xi.a((AutoCompleteTextView)this.a, (Context)this.getActivity());
    }
    
    public void a(final boolean b) {
        if (b) {
            this.d.setVisibility(0);
            this.e.setVisibility(0);
            this.f.setVisibility(0);
            this.d.setOnClickListener((View$OnClickListener)this);
            this.e.setOnClickListener((View$OnClickListener)this);
            this.f.setOnClickListener((View$OnClickListener)this);
            return;
        }
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f.setVisibility(8);
    }
    
    public void b() {
        final String string = this.a.getText().toString();
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.b(this.getString(2131297817));
            return;
        }
        final al a = ap.a((Context)this.getActivity());
        if (a.a(a.a(string)) != null) {
            this.b((String)null);
            this.h.a(string);
            this.h.b(true);
            return;
        }
        this.b(this.getString(2131297817));
    }
    
    public void b(final int subtitle) {
        this.c.setSubtitle(subtitle);
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.g = (mo)activity;
        this.h = (ng)activity;
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131887110: {
                this.g.b();
            }
            case 2131887111: {
                this.h.R_();
            }
            case 2131887112: {
                this.h.f();
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.i = new nh(this, ap.a(this.an));
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968960, viewGroup, false);
        this.a = (EditText)inflate.findViewById(2131887108);
        this.c = (PromptView)inflate.findViewById(2131887107);
        this.b = (TextView)inflate.findViewById(2131887109);
        this.d = (TwitterButton)inflate.findViewById(2131887110);
        this.e = (TwitterButton)inflate.findViewById(2131887111);
        this.f = (TwitterButton)inflate.findViewById(2131887112);
        this.i.a(this.getArguments());
        return inflate;
    }
    
    @Override
    public void onResume() {
        super.onResume();
        if (this.j != null) {
            this.a(this.j);
        }
    }
}
