// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import com.twitter.ui.dialog.BaseDialogFragment;
import android.app.Activity;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.conversations.ba;
import com.twitter.library.client.as;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.android.widget.PromptDialogFragment;

public class ReportConversationDialog extends PromptDialogFragment
{
    private String a;
    private String b;
    private boolean c;
    private pz d;
    
    public static ReportConversationDialog a(final int n, final boolean b, final String s, final String s2, final pz pz) {
        final ReportConversationDialog reportConversationDialog = new ReportConversationDialog();
        reportConversationDialog.d_(n);
        reportConversationDialog.c(2131297557);
        reportConversationDialog.e(2131361827);
        reportConversationDialog.a(s, s2, b, pz);
        return reportConversationDialog;
    }
    
    private void a(final Context context, final String s, final int n, final Session session) {
        as.a(context).a(new ba(context, session, this.a, s), new py(this, n, context));
    }
    
    private void a(final String a, final String b, final boolean c, final pz d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        final Fragment targetFragment = this.getTargetFragment();
        if (this.d == null) {
            this.d = (pz)BaseDialogFragment.a(pz.class, targetFragment, activity);
        }
    }
    
    @Override
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final FragmentActivity activity = this.getActivity();
        final c a = com.twitter.android.client.c.a((Context)activity);
        final Session b = az.a((Context)activity).b();
        if (n == 0) {
            a.a(b.g(), "messages", this.b, "thread", "spam", "report_as_spam");
            this.a((Context)activity, "spam", 2131297556, b);
            this.d.z();
        }
        else if (n == 1) {
            a.a(b.g(), "messages", this.b, "thread", "abusive", "report_as_spam");
            this.a((Context)activity, "abuse", 2131297555, b);
            this.d.A();
        }
        super.onClick(dialogInterface, n);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        if (bundle != null) {
            this.a = bundle.getString("conversation_id");
            this.b = bundle.getString("scribe_section");
            this.c = bundle.getBoolean("is_group");
        }
        return super.onCreateDialog(bundle);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("conversation_id", this.a);
        bundle.putString("scribe_section", this.b);
        bundle.putBoolean("is_group", this.c);
    }
}
