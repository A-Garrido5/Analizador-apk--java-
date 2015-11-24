// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;
import com.twitter.ui.dialog.e;
import com.twitter.android.widget.PromptDialogFragment;
import android.widget.EditText;
import android.os.Bundle;
import android.app.Dialog;
import com.twitter.ui.dialog.c;

class xl implements c
{
    final /* synthetic */ UpdateConversationNameDialog a;
    
    xl(final UpdateConversationNameDialog a) {
        this.a = a;
    }
    
    @Override
    public void a(final Dialog dialog, final int n, final Bundle bundle) {
        final EditText editText = (EditText)dialog.findViewById(2131886633);
        editText.setText((CharSequence)this.a.a);
        editText.selectAll();
        editText.requestFocus();
    }
}
