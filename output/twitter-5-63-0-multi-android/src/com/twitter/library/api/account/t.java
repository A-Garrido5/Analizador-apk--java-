// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import android.accounts.AccountManagerFuture;
import com.twitter.library.provider.bg;
import com.twitter.library.service.ab;
import android.accounts.AuthenticatorException;
import java.io.IOException;
import android.accounts.OperationCanceledException;
import com.twitter.library.provider.k;
import com.twitter.library.util.af;
import com.twitter.library.service.w;
import com.twitter.library.scribe.ScribeDatabaseHelper;
import com.twitter.library.service.aa;
import android.accounts.Account;
import com.twitter.library.platform.PushService;
import com.twitter.library.util.a;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.y;

public class t extends y
{
    public t(final Context context, final Session session) {
        super(context, t.class.getName(), session);
    }
    
    protected void a(final Context context, final String s) {
        final Account a = com.twitter.library.util.a.a(context, s);
        if (a != null) {
            PushService.e(context, a);
        }
    }
    
    @Override
    protected void a_(final aa aa) {
        final ab p = this.P();
        final String e = p.e;
        final long c = p.c;
        final bg v = this.V();
        final ScribeDatabaseHelper a = ScribeDatabaseHelper.a(this.p, p.c);
        this.a(this.p, e);
        w.a(this.p, c, e, null, null);
        v.e();
        a.b();
        af.a(this.p, c);
        final AccountManagerFuture b = com.twitter.library.util.a.b(this.p, e);
        while (true) {
            Label_0164: {
                if (b == null) {
                    break Label_0164;
                }
                try {
                    final boolean booleanValue = (boolean)b.getResult();
                    final k a2 = com.twitter.library.provider.k.a(this.p);
                    a2.c(e);
                    a2.b(e);
                    aa.a(booleanValue);
                    return;
                }
                catch (OperationCanceledException ex) {
                    final boolean booleanValue = false;
                    continue;
                }
                catch (IOException ex2) {
                    final boolean booleanValue = false;
                    continue;
                }
                catch (AuthenticatorException ex3) {
                    final boolean booleanValue = false;
                    continue;
                }
            }
            final boolean booleanValue = false;
            continue;
        }
    }
}
