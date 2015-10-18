// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.conversations.bi;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.android.client.c;
import android.widget.EditText;
import android.content.DialogInterface;
import com.twitter.ui.dialog.e;

class xm implements e
{
    final /* synthetic */ UpdateConversationNameDialog a;
    
    xm(final UpdateConversationNameDialog a) {
        this.a = a;
    }
    
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n2 == -1) {
            final String a = this.a.c(((EditText)this.a.getDialog().findViewById(2131886633)).getText().toString());
            if (!a.equals(this.a.a)) {
                final FragmentActivity activity = this.a.getActivity();
                final c a2 = c.a((Context)activity);
                final Session b = az.a((Context)activity).b();
                a2.a(b.g(), "messages:thread::edit_name:save");
                as.a((Context)activity).a(new bi((Context)activity, b, this.a.b, a), new xn(this, (Context)activity));
            }
        }
    }
}
