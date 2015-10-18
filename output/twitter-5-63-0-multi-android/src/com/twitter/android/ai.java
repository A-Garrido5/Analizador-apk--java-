// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import com.twitter.library.network.LoginResponse;
import com.twitter.internal.android.service.x;
import android.widget.TextView;
import com.twitter.library.service.aa;
import com.twitter.library.api.account.o;
import com.twitter.library.service.ac;

class ai extends ac
{
    final /* synthetic */ AuthenticatorActivity a;
    
    ai(final AuthenticatorActivity a) {
        this.a = a;
    }
    
    public void a(final o o) {
        final x l = o.l();
        this.a.removeDialog(1);
        if (!((aa)l.b()).a()) {
            ((TextView)this.a.findViewById(2131886292)).setText(this.a.getText(2131296357));
            return;
        }
        final LoginResponse t = o.t();
        if (t == null || t.a == null) {
            ((TextView)this.a.findViewById(2131886292)).setText(this.a.getText(2131296357));
            return;
        }
        if (!this.a.a) {
            this.a.a(t.a);
            return;
        }
        this.a.a(t.a, true);
    }
}
