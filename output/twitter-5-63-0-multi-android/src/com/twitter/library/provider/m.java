// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.content.UriMatcher;

final class m extends UriMatcher
{
    m(final int n) {
        super(n);
        this.addURI(GlobalDatabaseProvider.a, "user_values", 1);
        this.addURI(GlobalDatabaseProvider.a, "user_values/#", 2);
        this.addURI(GlobalDatabaseProvider.a, "activity_states", 3);
        this.addURI(GlobalDatabaseProvider.a, "activity_states/*", 4);
        this.addURI(GlobalDatabaseProvider.a, "account_settings", 5);
        this.addURI(GlobalDatabaseProvider.a, "account_settings/*", 6);
    }
}
