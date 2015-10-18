// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class VoipActivity$ReplyWithMessageDialogFragment extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.getActivity());
        final String[] stringArray = this.getResources().getStringArray(2131689486);
        alertDialog$Builder.setItems(stringArray, (DialogInterface$OnClickListener)new je(this, stringArray));
        final AlertDialog create = alertDialog$Builder.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
