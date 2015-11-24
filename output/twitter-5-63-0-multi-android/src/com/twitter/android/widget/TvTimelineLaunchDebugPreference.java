// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View$OnClickListener;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;
import android.preference.DialogPreference;

public class TvTimelineLaunchDebugPreference extends DialogPreference
{
    private EditText a;
    
    public TvTimelineLaunchDebugPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.setDialogLayoutResource(2130969158);
    }
    
    public void onBindDialogView(final View view) {
        super.onBindDialogView(view);
        this.a = (EditText)view.findViewById(2131887308);
    }
    
    public void showDialog(final Bundle bundle) {
        super.showDialog(bundle);
        final AlertDialog alertDialog = (AlertDialog)this.getDialog();
        alertDialog.getButton(-1).setOnClickListener((View$OnClickListener)new fj(this));
        alertDialog.setMessage(this.getContext().getText(2131297972));
    }
}
