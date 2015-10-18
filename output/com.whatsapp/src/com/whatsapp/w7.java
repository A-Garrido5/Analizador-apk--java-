// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.view.View$OnClickListener;

class w7 implements View$OnClickListener
{
    final Conversation a;
    
    w7(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        final ActivityOptionsCompat sceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(this.a, this.a.findViewById(2131755432), this.a.getString(2131232142));
        if (Conversation.p(this.a)) {
            GroupChatInfo.a(this.a.s, this.a, sceneTransitionAnimation);
            if (!i) {
                return;
            }
        }
        if (Conversation.H(this.a)) {
            ListChatInfo.a(this.a.s, this.a, sceneTransitionAnimation);
            if (!i) {
                return;
            }
        }
        ContactInfo.a(this.a.s, this.a, sceneTransitionAnimation);
    }
}
