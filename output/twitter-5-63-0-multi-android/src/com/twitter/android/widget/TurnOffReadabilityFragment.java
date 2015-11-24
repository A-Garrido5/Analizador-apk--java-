// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Message;
import android.content.DialogInterface$OnClickListener;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.DialogFragment;

public class TurnOffReadabilityFragment extends DialogFragment
{
    private static String a;
    private static Activity b;
    
    public static TurnOffReadabilityFragment a(final String a, final Activity b) {
        final TurnOffReadabilityFragment turnOffReadabilityFragment = new TurnOffReadabilityFragment();
        TurnOffReadabilityFragment.a = a;
        TurnOffReadabilityFragment.b = b;
        return turnOffReadabilityFragment;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setRetainInstance(true);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        return (Dialog)new AlertDialog$Builder((Context)TurnOffReadabilityFragment.b).setTitle(2131297971).setMessage(2131297970).setNeutralButton((CharSequence)TurnOffReadabilityFragment.b.getResources().getString(2131296725), (DialogInterface$OnClickListener)new fi(this)).create();
    }
    
    @Override
    public void onDestroyView() {
        if (this.getDialog() != null && this.getRetainInstance()) {
            this.getDialog().setDismissMessage((Message)null);
        }
        super.onDestroyView();
    }
}
