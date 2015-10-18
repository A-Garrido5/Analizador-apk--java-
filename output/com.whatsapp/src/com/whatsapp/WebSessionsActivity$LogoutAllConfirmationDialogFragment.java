// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class WebSessionsActivity$LogoutAllConfirmationDialogFragment extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return new AlertDialog$Builder((Context)this.getActivity()).setMessage(2131230919).setNegativeButton(2131230874, null).setPositiveButton(2131231286, (DialogInterface$OnClickListener)new n3(this)).create();
    }
}
