// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class sh implements DialogInterface$OnClickListener
{
    final ConversationsFragment$EmailConversationMediaChoiceDialogFragment a;
    final a_9 b;
    
    sh(final ConversationsFragment$EmailConversationMediaChoiceDialogFragment a, final a_9 b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.dismiss();
        Conversation.a(this.a.getActivity(), (gu)this.a.getActivity(), this.b, false);
    }
}
