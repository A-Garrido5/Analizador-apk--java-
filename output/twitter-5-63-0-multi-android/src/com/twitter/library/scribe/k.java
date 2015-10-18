// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import android.accounts.AccountManager;
import android.content.Context;

final class k implements l
{
    @Override
    public AccountManager a(final Context context) {
        return AccountManager.get(context);
    }
}
