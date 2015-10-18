// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.EditText;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import android.support.v4.app.DialogFragment;

public class RelatedTweetsFeedbackDialogFragment extends DialogFragment implements DialogInterface$OnClickListener
{
    private Context a;
    private EditText b;
    private String c;
    private CharSequence[] d;
    private Bundle e;
    private er f;
    
    public RelatedTweetsFeedbackDialogFragment(final Context a, final Bundle e, final int n) {
        this.a = a;
        this.e = e;
        this.d = a.getResources().getStringArray(n);
    }
    
    public void a(final er f) {
        this.f = f;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        switch (n) {
            default: {
                if (n >= 0) {
                    this.c = this.d[n].toString();
                    break;
                }
                break;
            }
            case -1: {
                if (this.f != null) {
                    this.f.a(this.c, this.b.getText().toString(), this.e);
                    return;
                }
                break;
            }
            case -2: {
                if (this.f != null) {
                    this.f.y_();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a);
        (this.b = new EditText(this.a)).setHint(2131298242);
        alertDialog$Builder.setTitle(2131298245).setSingleChoiceItems(this.d, -1, (DialogInterface$OnClickListener)this).setPositiveButton(2131297909, (DialogInterface$OnClickListener)this).setNegativeButton(2131296445, (DialogInterface$OnClickListener)this).setView((View)this.b);
        return (Dialog)alertDialog$Builder.create();
    }
}
