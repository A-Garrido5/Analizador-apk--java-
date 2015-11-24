// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.AbsFragment;
import android.os.Bundle;

class Flow$AddEmailStep extends Flow$Step
{
    @Override
    AbsFragment a(final Bundle arguments) {
        final EmailEntryFragment emailEntryFragment = new EmailEntryFragment();
        emailEntryFragment.setRetainInstance(true);
        emailEntryFragment.setArguments(arguments);
        return emailEntryFragment;
    }
    
    @Override
    public boolean a() {
        if (this.a != null && this.a.get() != null) {
            ((EmailEntryFragment)this.a.get()).a((String)null);
            return true;
        }
        return false;
    }
    
    @Override
    public Flow$Step b() {
        return new Flow$UsernameEntryStep();
    }
}
