// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import android.content.Context;
import android.app.Dialog;
import android.os.Bundle;
import android.content.DialogInterface;
import android.annotation.TargetApi;
import android.content.DialogInterface$OnClickListener;
import android.app.DialogFragment;

@TargetApi(11)
public class ErrorDialogFragments$Honeycomb extends DialogFragment implements DialogInterface$OnClickListener
{
    public void onClick(final DialogInterface dialogInterface, final int n) {
        l.a(dialogInterface, n, this.getActivity(), this.getArguments());
    }
    
    public Dialog onCreateDialog(final Bundle bundle) {
        return l.a((Context)this.getActivity(), this.getArguments(), (DialogInterface$OnClickListener)this);
    }
}
