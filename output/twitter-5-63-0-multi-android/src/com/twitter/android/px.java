// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Intent;
import com.twitter.library.client.Session;
import com.twitter.library.client.ay;

class px extends ay
{
    final /* synthetic */ RemoveAccountDialogActivity a;
    
    public px(final RemoveAccountDialogActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session, final boolean b) {
        this.a.removeDialog(1);
        this.a.b = false;
        this.a.setResult(-1, new Intent().putExtra("is_last", b));
        this.a.finish();
    }
}
