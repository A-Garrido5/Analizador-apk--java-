// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.library.api.conversations.DMPhoto;
import android.view.View$OnClickListener;

class dd implements View$OnClickListener
{
    final /* synthetic */ DMPhoto a;
    final /* synthetic */ cx b;
    
    dd(final cx b, final DMPhoto a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.b.d.add(this.a.mediaUrl);
        this.b.notifyDataSetChanged();
    }
}
