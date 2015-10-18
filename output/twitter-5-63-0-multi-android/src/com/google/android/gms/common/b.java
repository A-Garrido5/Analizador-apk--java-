// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common;

import android.app.FragmentManager;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import com.google.android.gms.internal.ap;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;
import android.app.DialogFragment;

public class b extends DialogFragment
{
    private Dialog a;
    private DialogInterface$OnCancelListener b;
    
    public b() {
        this.a = null;
        this.b = null;
    }
    
    public static b a(final Dialog dialog, final DialogInterface$OnCancelListener b) {
        final b b2 = new b();
        final Dialog a = (Dialog)ap.a(dialog, "Cannot display null dialog");
        a.setOnCancelListener((DialogInterface$OnCancelListener)null);
        a.setOnDismissListener((DialogInterface$OnDismissListener)null);
        b2.a = a;
        if (b != null) {
            b2.b = b;
        }
        return b2;
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
        if (this.b != null) {
            this.b.onCancel(dialogInterface);
        }
    }
    
    public Dialog onCreateDialog(final Bundle bundle) {
        if (this.a == null) {
            this.setShowsDialog(false);
        }
        return this.a;
    }
    
    public void show(final FragmentManager fragmentManager, final String s) {
        super.show(fragmentManager, s);
    }
}
