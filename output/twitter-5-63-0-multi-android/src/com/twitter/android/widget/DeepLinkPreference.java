// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.content.ActivityNotFoundException;
import android.widget.Toast;
import com.twitter.android.client.am;
import android.text.TextUtils;
import com.twitter.library.client.az;
import android.content.DialogInterface;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;
import android.preference.DialogPreference;

public class DeepLinkPreference extends DialogPreference
{
    private EditText a;
    
    public DeepLinkPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.setDialogLayoutResource(2130968710);
    }
    
    protected void onBindDialogView(final View view) {
        super.onBindDialogView(view);
        this.a = (EditText)view.findViewById(2131886626);
        final int length = this.a.getText().length();
        this.a.setSelection(length, length);
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        super.onClick(dialogInterface, n);
        if (n != -1) {
            return;
        }
        final Context context = this.getContext();
        final String trim = this.a.getText().toString().trim();
        final long g = az.a(context).b().g();
        if (TextUtils.isEmpty((CharSequence)trim)) {
            return;
        }
        try {
            am.a(context, trim, g);
        }
        catch (ActivityNotFoundException ex) {
            Toast.makeText(context, (CharSequence)"Not a valid URI", 0).show();
        }
    }
}
