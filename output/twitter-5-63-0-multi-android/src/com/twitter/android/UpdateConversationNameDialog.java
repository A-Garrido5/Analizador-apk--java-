// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.c;
import com.twitter.android.widget.PromptDialogFragment;

public class UpdateConversationNameDialog extends PromptDialogFragment
{
    private String a;
    private String b;
    
    public UpdateConversationNameDialog() {
        this.d_(0);
        this.h(2131297362);
        this.j(2131296445);
        this.a(2130968720, new xl(this));
        this.a(new xm(this));
    }
    
    public static UpdateConversationNameDialog a(final String s, final String s2) {
        final UpdateConversationNameDialog updateConversationNameDialog = new UpdateConversationNameDialog();
        updateConversationNameDialog.b(s, s2);
        return updateConversationNameDialog;
    }
    
    private String c(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "";
        }
        return s.trim();
    }
    
    public void b(final String s, final String b) {
        this.a = this.c(s);
        this.b = b;
    }
    
    @Override
    public Dialog onCreateDialog(final Bundle bundle) {
        if (bundle != null) {
            this.a = bundle.getString("extra_old_name");
            this.b = bundle.getString("extra_conversation_id");
        }
        return super.onCreateDialog(bundle);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("extra_old_name", this.a);
        bundle.putString("extra_conversation_id", this.b);
    }
}
