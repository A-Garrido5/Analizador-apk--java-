// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.AbsFragment;
import android.os.Bundle;

class Flow$NameEntryStep extends Flow$Step
{
    @Override
    AbsFragment a(final Bundle arguments) {
        final NameEntryFragment nameEntryFragment = new NameEntryFragment();
        nameEntryFragment.setRetainInstance(true);
        nameEntryFragment.setArguments(arguments);
        return nameEntryFragment;
    }
    
    @Override
    public boolean a() {
        if (this.a != null) {
            final AbsFragment absFragment = (AbsFragment)this.a.get();
            if (absFragment != null) {
                ((NameEntryFragment)absFragment).b();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Flow$Step b() {
        return new Flow$PhoneSignupStep();
    }
}
