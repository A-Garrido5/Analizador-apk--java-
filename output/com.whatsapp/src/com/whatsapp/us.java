// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class us implements View$OnClickListener
{
    final ConversationsFragment a;
    
    us(final ConversationsFragment a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent((Context)this.a.getActivity(), (Class)ArchivedConversationsActivity.class));
    }
}
