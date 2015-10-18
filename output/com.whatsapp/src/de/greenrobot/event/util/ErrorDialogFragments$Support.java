// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import android.content.Context;
import android.app.Dialog;
import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.support.v4.app.DialogFragment;

public class ErrorDialogFragments$Support extends DialogFragment implements DialogInterface$OnClickListener
{
    public void onClick(final DialogInterface dialogInterface, final int n) {
        l.a(dialogInterface, n, this.getActivity(), this.getArguments());
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return l.a((Context)this.getActivity(), this.getArguments(), (DialogInterface$OnClickListener)this);
    }
}
