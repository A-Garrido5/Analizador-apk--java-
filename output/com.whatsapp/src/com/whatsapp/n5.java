// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.gdrive.SettingsGoogleDrive;
import android.view.View;
import android.view.View$OnClickListener;

class n5 implements View$OnClickListener
{
    final ConversationsFragment a;
    
    n5(final ConversationsFragment a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(new Intent((Context)this.a.getActivity(), (Class)SettingsGoogleDrive.class));
    }
}
