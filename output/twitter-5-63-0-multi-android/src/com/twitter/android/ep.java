// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.service.z;

class ep extends z
{
    final /* synthetic */ Context a;
    final /* synthetic */ DeleteConversationDialog b;
    
    ep(final DeleteConversationDialog b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (!((aa)y.l().b()).a()) {
            Toast.makeText(this.a, 2131296726, 1).show();
        }
    }
}
