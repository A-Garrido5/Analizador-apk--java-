// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Dialog;
import android.os.Bundle;
import com.twitter.library.client.Session;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.conversations.an;
import com.twitter.library.client.as;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.android.client.c;
import android.content.DialogInterface;
import com.twitter.android.widget.PromptDialogFragment;

public class DeleteConversationDialog extends PromptDialogFragment
{
    private String a;
    private String b;
    private boolean c;
    private boolean d;
    
    public static DeleteConversationDialog a(final int n, final boolean b, final boolean b2, final String s, final String s2) {
        final DeleteConversationDialog deleteConversationDialog = new DeleteConversationDialog();
        a(deleteConversationDialog, n, b, b2);
        deleteConversationDialog.a(s, s2, b, b2);
        return deleteConversationDialog;
    }
    
    private static void a(final DeleteConversationDialog deleteConversationDialog, final int n, final boolean b, final boolean b2) {
        deleteConversationDialog.d_(n);
        if (b2) {
            deleteConversationDialog.c(2131297276);
            deleteConversationDialog.d(2131296829);
            deleteConversationDialog.h(2131296786);
            deleteConversationDialog.i(2131296828);
            return;
        }
        deleteConversationDialog.c(2131297276);
        int n2;
        if (b) {
            n2 = 2131297280;
        }
        else {
            n2 = 2131297278;
        }
        deleteConversationDialog.d(n2);
        deleteConversationDialog.h(2131296786);
        deleteConversationDialog.j(2131296445);
    }
    
    private void a(final String a, final String b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static boolean a(final int n) {
        return n == -3 || n == -1;
    }
    
    @Override
    public void onCancel(final DialogInterface dialogInterface) {
        if (this.d) {
            final FragmentActivity activity = this.getActivity();
            com.twitter.android.client.c.a((Context)activity).a(az.a((Context)activity).b().g(), "messages", this.b, null, "end_conversation", "cancel");
        }
        super.onCancel(dialogInterface);
    }
    
    @Override
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final FragmentActivity activity = this.getActivity();
        final c a = com.twitter.android.client.c.a((Context)activity);
        final Session b = az.a((Context)activity).b();
        final as a2 = as.a((Context)activity);
        if (a(n)) {
            final boolean b2 = n == -3;
            a2.a(new an((Context)activity, b, this.a, b2), new ep(this, (Context)activity));
            final long g = b.g();
            if (this.d) {
                final String[] array = { "messages", this.b, null, "end_conversation", null };
                String s;
                if (b2) {
                    s = "end_conversation";
                }
                else {
                    s = "delete";
                }
                array[4] = s;
                a.a(g, array);
            }
            final String[] array2 = { "messages", this.b, null, "thread", null };
            String s2;
            if (this.c) {
                s2 = "leave_group";
            }
            else {
                s2 = "delete_thread";
            }
            array2[4] = s2;
            a.a(g, array2);
        }
        super.onClick(dialogInterface, n);
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        if (bundle != null) {
            this.a = bundle.getString("conversation_id");
            this.b = bundle.getString("scribe_section");
            this.c = bundle.getBoolean("is_group");
            this.d = bundle.getBoolean("is_trust_only");
        }
        return super.onCreateDialog(bundle);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("conversation_id", this.a);
        bundle.putString("scribe_section", this.b);
        bundle.putBoolean("is_group", this.c);
        bundle.putBoolean("is_trust_only", this.d);
    }
}
