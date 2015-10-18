// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.ui.dialog;

import android.util.TypedValue;
import android.content.Context;
import android.app.Dialog;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment$InstantiationException;
import android.support.v4.app.DialogFragment;

public class BaseDialogFragment extends DialogFragment
{
    private b a;
    private c b;
    private d c;
    private e d;
    
    public static BaseDialogFragment a(final Class clazz, final int n) {
        return a(clazz, n, 0);
    }
    
    public static BaseDialogFragment a(final Class clazz, final int n, final int n2) {
        try {
            final BaseDialogFragment baseDialogFragment = clazz.newInstance();
            baseDialogFragment.d_(n);
            if (n2 != 0) {
                baseDialogFragment.setStyle(0, n2);
            }
            return baseDialogFragment;
        }
        catch (Exception ex) {
            throw new Fragment$InstantiationException("Cannot create instance of " + clazz, ex);
        }
    }
    
    protected static Object a(final Class clazz, final Object... array) {
        for (final Object o : array) {
            if (clazz.isInstance(o)) {
                return o;
            }
        }
        return null;
    }
    
    public BaseDialogFragment a(final b a) {
        this.a = a;
        this.k();
        return this;
    }
    
    public BaseDialogFragment a(final c b) {
        this.b = b;
        this.m();
        return this;
    }
    
    public BaseDialogFragment a(final d c) {
        this.c = c;
        this.l();
        return this;
    }
    
    public BaseDialogFragment a(final e d) {
        this.d = d;
        return this;
    }
    
    public void a(final FragmentManager fragmentManager) {
        this.show(fragmentManager, null);
    }
    
    protected void d_(final int n) {
        final Bundle arguments = new Bundle();
        arguments.putInt("twitter:id", n);
        this.setArguments(arguments);
    }
    
    public BaseDialogFragment k() {
        this.getArguments().putInt("twitter:forward_events", this.getArguments().getInt("twitter:forward_events") | 0x1);
        return this;
    }
    
    public View l(final int n) {
        this.n();
        return this.getDialog().findViewById(n);
    }
    
    public BaseDialogFragment l() {
        this.getArguments().putInt("twitter:forward_events", this.getArguments().getInt("twitter:forward_events") | 0x2);
        return this;
    }
    
    public BaseDialogFragment m() {
        this.getArguments().putInt("twitter:forward_events", this.getArguments().getInt("twitter:forward_events") | 0x4);
        return this;
    }
    
    protected final void m(final int n) {
        if (this.d != null) {
            this.d.a((DialogInterface)this.getDialog(), this.o(), n);
        }
    }
    
    protected void n() {
        if (this.getDialog() == null) {
            throw new IllegalStateException("Dialog has not been created yet.");
        }
    }
    
    public int o() {
        return this.getArguments().getInt("twitter:id");
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.b != null) {
            this.b.a(this.getDialog(), this.o(), bundle);
        }
    }
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        final Fragment targetFragment = this.getTargetFragment();
        if (this.d == null) {
            this.d = (e)a(e.class, targetFragment, activity);
        }
        if (this.a == null && this.p()) {
            this.a = (b)a(b.class, targetFragment, activity);
        }
        if (this.c == null && this.q()) {
            this.c = (d)a(d.class, targetFragment, activity);
        }
        if (this.b == null && this.r()) {
            this.b = (c)a(c.class, targetFragment, activity);
        }
    }
    
    @Override
    public void onCancel(final DialogInterface dialogInterface) {
        if (this.a != null) {
            this.a.a(dialogInterface, this.o());
        }
        super.onCancel(dialogInterface);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final Dialog dialog = new Dialog((Context)this.getActivity(), this.getTheme());
        final TypedValue typedValue = new TypedValue();
        dialog.getContext().getTheme().resolveAttribute(jk.dialogLayoutId, typedValue, true);
        if (typedValue.resourceId != 0) {
            dialog.setContentView(typedValue.resourceId);
        }
        return dialog;
    }
    
    @Override
    public void onDismiss(final DialogInterface dialogInterface) {
        if (this.c != null) {
            this.c.a(dialogInterface, this.o());
        }
        super.onDismiss(dialogInterface);
    }
    
    final boolean p() {
        final Bundle arguments = this.getArguments();
        return arguments != null && (0x1 & arguments.getInt("twitter:forward_events")) != 0x0;
    }
    
    final boolean q() {
        final Bundle arguments = this.getArguments();
        return arguments != null && (0x2 & arguments.getInt("twitter:forward_events")) != 0x0;
    }
    
    final boolean r() {
        final Bundle arguments = this.getArguments();
        return arguments != null && (0x4 & arguments.getInt("twitter:forward_events")) != 0x0;
    }
}
