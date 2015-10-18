// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.accounts.Account;
import java.util.Comparator;

public class a implements Comparator
{
    public int a(final Account account, final Account account2) {
        return account.name.compareToIgnoreCase(account2.name);
    }
    
    @Override
    public boolean equals(final Object o) {
        return false;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
}
