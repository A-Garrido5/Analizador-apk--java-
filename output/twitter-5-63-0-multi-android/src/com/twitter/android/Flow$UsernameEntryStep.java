// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.AbsFragment;
import android.os.Bundle;

class Flow$UsernameEntryStep extends Flow$Step
{
    @Override
    AbsFragment a(final Bundle arguments) {
        final UsernameEntryFragment usernameEntryFragment = new UsernameEntryFragment();
        usernameEntryFragment.setRetainInstance(true);
        usernameEntryFragment.setArguments(arguments);
        return usernameEntryFragment;
    }
}
