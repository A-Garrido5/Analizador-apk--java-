// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.TextView;
import com.twitter.ui.widget.PromptView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.content.Context;
import com.twitter.util.t;
import com.twitter.android.widget.PinEntryEditText;
import com.twitter.android.widget.ea;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;

public class ManualEntryPinFragment extends AbsFragment implements View$OnClickListener, ea
{
    protected nv a;
    protected PinEntryEditText b;
    
    public void a(final String s) {
        this.a.b(s);
    }
    
    protected void a(final boolean b) {
        if (!b) {
            t.a((Context)this.getActivity(), (View)this.b, b);
            this.b.clearFocus();
            return;
        }
        this.b.requestFocus();
        ((InputMethodManager)this.getActivity().getSystemService("input_method")).toggleSoftInput(2, 1);
    }
    
    public void b() {
        this.b.setText((CharSequence)"");
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.a = (nv)activity;
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887132) {
            this.a.h();
        }
        else if (view.getId() == 2131887131) {
            this.a(true);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final Bundle arguments = this.getArguments();
        boolean b;
        if (arguments != null && arguments.getBoolean("nux_flow")) {
            b = true;
        }
        else {
            b = false;
        }
        int n;
        if (b) {
            n = 2130968973;
        }
        else {
            n = 2130968869;
        }
        final View inflate = layoutInflater.inflate(n, viewGroup, false);
        inflate.findViewById(2131887132).setOnClickListener((View$OnClickListener)this);
        final String string = this.getResources().getString(2131297420, new Object[] { this.a.i() });
        if (b) {
            ((PromptView)inflate.findViewById(2131886924)).setTitle(string);
        }
        else {
            ((TextView)inflate.findViewById(2131886924)).setText((CharSequence)string);
        }
        (this.b = (PinEntryEditText)inflate.findViewById(2131887131)).setOnFilledInputListener(this);
        this.b.setOnClickListener((View$OnClickListener)this);
        return inflate;
    }
    
    @Override
    public void onPause() {
        super.onPause();
        this.a(false);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a(true);
    }
}
