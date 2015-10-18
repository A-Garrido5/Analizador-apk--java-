// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import com.google.android.gms.internal.ap;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;

public class SupportErrorDialogFragment extends DialogFragment
{
    private Dialog a;
    private DialogInterface$OnCancelListener b;
    
    public SupportErrorDialogFragment() {
        this.a = null;
        this.b = null;
    }
    
    public static SupportErrorDialogFragment a(final Dialog dialog, final DialogInterface$OnCancelListener b) {
        final SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        final Dialog a = (Dialog)ap.a(dialog, "Cannot display null dialog");
        a.setOnCancelListener((DialogInterface$OnCancelListener)null);
        a.setOnDismissListener((DialogInterface$OnDismissListener)null);
        supportErrorDialogFragment.a = a;
        if (b != null) {
            supportErrorDialogFragment.b = b;
        }
        return supportErrorDialogFragment;
    }
    
    @Override
    public void onCancel(final DialogInterface dialogInterface) {
        if (this.b != null) {
            this.b.onCancel(dialogInterface);
        }
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        if (this.a == null) {
            this.setShowsDialog(false);
        }
        return this.a;
    }
    
    @Override
    public void show(final FragmentManager fragmentManager, final String s) {
        super.show(fragmentManager, s);
    }
}
