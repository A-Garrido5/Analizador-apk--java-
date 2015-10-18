// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.AbsFragment;
import android.os.Bundle;

class Flow$EmailSignupStep extends Flow$Step
{
    @Override
    AbsFragment a(final Bundle arguments) {
        final EmailEntryFragment emailEntryFragment = new EmailEntryFragment();
        arguments.putBoolean("is_email_signup", true);
        emailEntryFragment.setRetainInstance(true);
        emailEntryFragment.setArguments(arguments);
        return emailEntryFragment;
    }
    
    @Override
    public Flow$Step b() {
        return new Flow$PasswordEntryStep();
    }
}
