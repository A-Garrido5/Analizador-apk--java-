// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.AbsFragment;
import android.os.Bundle;

class Flow$PasswordEntryStep extends Flow$Step
{
    @Override
    AbsFragment a(final Bundle arguments) {
        final PasswordEntryFragment passwordEntryFragment = new PasswordEntryFragment();
        passwordEntryFragment.setRetainInstance(true);
        passwordEntryFragment.setArguments(arguments);
        return passwordEntryFragment;
    }
    
    @Override
    public boolean a() {
        if (this.a != null && this.a.get() != null) {
            ((PasswordEntryFragment)this.a.get()).b();
            return true;
        }
        return false;
    }
    
    @Override
    public Flow$Step b() {
        return new Flow$AddEmailStep();
    }
}
