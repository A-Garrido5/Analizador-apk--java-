// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.az;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.util.t;
import android.view.View;
import android.app.Activity;
import android.text.Editable;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import android.content.Context;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import android.support.v4.app.Fragment;

public class PhoneOwnershipCompleteFragment extends Fragment implements TextWatcher, View$OnClickListener
{
    private EditText a;
    private Button b;
    private TextView c;
    private String d;
    private boolean e;
    private Context f;
    private c g;
    private Session h;
    private nu i;
    private boolean j;
    private final Runnable k;
    
    public PhoneOwnershipCompleteFragment() {
        this.d = null;
        this.e = false;
        this.j = true;
        this.k = new nt(this);
    }
    
    private void a() {
        if (!TextUtils.isEmpty((CharSequence)this.d)) {
            this.i.b(this.d);
            this.c.setText(2131297406);
            this.c.setEnabled(false);
        }
    }
    
    private void b() {
        this.i.a(this.d, this.a.getText().toString());
    }
    
    public void afterTextChanged(final Editable editable) {
        int enabled = 1;
        if (this.j) {
            final c g = this.g;
            final long g2 = this.h.g();
            final String[] array = { "unlock_account", null };
            array[enabled] = "enter_code::code:input";
            g.a(g2, array);
            this.j = false;
        }
        final Button b = this.b;
        if (TextUtils.isEmpty((CharSequence)this.d) || TextUtils.isEmpty((CharSequence)editable)) {
            enabled = 0;
        }
        b.setEnabled((boolean)(enabled != 0));
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        try {
            this.i = (nu)activity;
        }
        catch (ClassCastException ex) {
            throw new ClassCastException(activity.toString() + " must implement OnPhoneOwnershipCompleteListener");
        }
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887124) {
            this.g.a(this.h.g(), new String[] { "unlock_account", "enter_code::verify:click" });
            t.a((Context)this.getActivity(), (View)this.a, false);
            this.b();
        }
        else if (view.getId() == 2131887122) {
            this.g.a(this.h.g(), new String[] { "unlock_account", "enter_code::resend:click" });
            this.a();
        }
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968965, viewGroup, false);
        this.f = this.getActivity().getApplicationContext();
        this.g = com.twitter.android.client.c.a((Context)this.getActivity());
        this.h = az.a((Context)this.getActivity()).b();
        this.getActivity().setTitle(2131297416);
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            this.d = arguments.getString("phone_number");
            this.e = arguments.getBoolean("is_numeric");
        }
        (this.a = (EditText)inflate.findViewById(2131887120)).addTextChangedListener((TextWatcher)this);
        (this.b = (Button)inflate.findViewById(2131887124)).setOnClickListener((View$OnClickListener)this);
        (this.c = (TextView)inflate.findViewById(2131887122)).setOnClickListener((View$OnClickListener)this);
        final TextView textView = (TextView)inflate.findViewById(2131887119);
        String substring;
        if (this.d == null || this.d.length() < 2) {
            substring = "";
        }
        else {
            substring = this.d.substring(-2 + this.d.length());
        }
        textView.setText((CharSequence)this.getString(2131297402, substring));
        this.a.post(this.k);
        this.g.a(this.h.g(), new String[] { "unlock_account", "enter_code:::impression" });
        return inflate;
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
}
