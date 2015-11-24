// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.content.Context;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class BottomSheet$BottomSheetFragment extends DialogFragment implements l
{
    private static Object a(final Class clazz, final Object... array) {
        for (final Object o : array) {
            if (clazz.isInstance(o)) {
                return o;
            }
        }
        return null;
    }
    
    final boolean a() {
        final Bundle arguments = this.getArguments();
        return arguments != null && (0x1 & arguments.getInt("forward_events")) != 0x0;
    }
    
    @Override
    public boolean a(final int n, final BottomSheetItem bottomSheetItem) {
        final l l = (l)a(l.class, this.getTargetFragment(), this.getActivity());
        return l != null && l.a(n, bottomSheetItem);
    }
    
    final boolean b() {
        final Bundle arguments = this.getArguments();
        return arguments != null && (0x2 & arguments.getInt("forward_events")) != 0x0;
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        ((BottomSheet)this.getDialog()).a(this);
    }
    
    @Override
    public void onCancel(final DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (this.a()) {
            final j j = (j)a(j.class, this.getTargetFragment(), this.getActivity());
            if (j != null) {
                j.a(((BottomSheet)dialogInterface).a());
            }
        }
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        super.onCreateDialog(bundle);
        return h.a(this.getArguments()).a((Context)this.getActivity()).a();
    }
    
    @Override
    public void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.b()) {
            final k k = (k)a(k.class, this.getTargetFragment(), this.getActivity());
            if (k != null) {
                k.a(((BottomSheet)dialogInterface).a());
            }
        }
    }
}
