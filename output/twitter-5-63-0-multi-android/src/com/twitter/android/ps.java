// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Bundle;
import com.twitter.library.client.Session;
import com.twitter.library.client.ay;

class ps extends ay
{
    final /* synthetic */ RemoveAccountActivity a;
    
    ps(final RemoveAccountActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session, final boolean b) {
        if (this.a.a != null) {
            final Bundle bundle = new Bundle();
            bundle.putBoolean("booleanResult", true);
            this.a.a.onResult(bundle);
        }
    }
}
