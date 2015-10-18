// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.text.TextUtils;
import android.accounts.Account;
import com.twitter.library.client.Session;
import com.twitter.errorreporter.a;

class i extends a
{
    public i(final String s, final Session session, final Account[] array, final boolean b) {
        this.a("MissingUser.from_push", b);
        if (TextUtils.isEmpty((CharSequence)s)) {
            this.a("MissingUser.additional_info", "empty user name");
        }
        else {
            this.a("MissingUser.account_name", s);
            if (!s.equalsIgnoreCase(session.e())) {
                this.a("MissingUser.additional_info", "session name mismatch");
            }
        }
        if (array != null && array.length > 0) {
            final StringBuilder sb = new StringBuilder();
            for (int length = array.length, i = 0; i < length; ++i) {
                sb.append(array[i].name);
                sb.append(";");
            }
            this.a("MissingUser.accounts", sb.toString());
            return;
        }
        this.a("MissingUser.accounts", "no twitter account");
    }
}
