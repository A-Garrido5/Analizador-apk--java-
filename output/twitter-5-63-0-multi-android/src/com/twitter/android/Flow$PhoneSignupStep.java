// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.AbsFragment;
import android.os.Bundle;

class Flow$PhoneSignupStep extends Flow$Step
{
    @Override
    AbsFragment a(final Bundle arguments) {
        final PhoneEntryFragment phoneEntryFragment = new PhoneEntryFragment();
        arguments.putBoolean("is_phone_signup", true);
        phoneEntryFragment.setRetainInstance(true);
        phoneEntryFragment.setArguments(arguments);
        return phoneEntryFragment;
    }
    
    @Override
    public boolean a() {
        if (this.a != null) {
            final AbsFragment absFragment = (AbsFragment)this.a.get();
            if (absFragment != null) {
                ((PhoneEntryFragment)absFragment).b();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean a(final ht ht) {
        return ht.c != null;
    }
    
    @Override
    public Flow$Step b() {
        return new Flow$PasswordEntryStep();
    }
    
    @Override
    public boolean b(final ht ht) {
        if (this.a != null) {
            final AbsFragment absFragment = (AbsFragment)this.a.get();
            if (absFragment != null) {
                ((PhoneEntryFragment)absFragment).a(ht);
                return true;
            }
        }
        return false;
    }
}
