// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.Editable;
import com.twitter.library.util.h;

class gt extends h
{
    final /* synthetic */ EditProfileOnboardingActivity a;
    
    gt(final EditProfileOnboardingActivity a) {
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        this.a.w();
    }
}
