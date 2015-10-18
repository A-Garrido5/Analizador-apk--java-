// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.accounts.Account;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.errorreporter.a;

class jc extends a
{
    private jc(final Context context, final Session session, final long n) {
        if (context == null) {
            this.a("ActiveSessionUserMissing.account_name", "Missing account");
            this.a("ActiveSessionUserMissing.reason", "Context missing");
            this.a("ActiveSessionUserMissing.additional_info", "Fragment may have been detached or destroyed");
        }
        else {
            final Account a = com.twitter.library.util.a.a(context, n);
            if (a == null || TextUtils.isEmpty((CharSequence)a.name)) {
                this.a("ActiveSessionUserMissing.account_name", "Missing account");
                this.a("ActiveSessionUserMissing.reason", "Cannot find account");
                this.a("ActiveSessionUserMissing.additional_info", "No matching user id: " + n);
            }
            else if (!a.name.equalsIgnoreCase(session.e())) {
                this.a("ActiveSessionUserMissing.account_name", a.name);
                this.a("ActiveSessionUserMissing.reason", "Session name mismatch");
                this.a("ActiveSessionUserMissing.additional_info", "Account name: " + a.name + ", Session name: " + session.e());
            }
        }
        this.a("ActiveSessionUserMissing.login_status", session.b());
    }
}
