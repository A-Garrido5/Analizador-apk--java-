// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.bi;
import android.view.View$OnClickListener;

class v2 implements View$OnClickListener
{
    final ChatInfoActivity a;
    final String b;
    final bi c;
    
    v2(final ChatInfoActivity a, final bi c, final String b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public void onClick(final View view) {
        this.a.startActivity(MediaView.a(this.c, this.b, this.a.getBaseContext(), view));
    }
}
