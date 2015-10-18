// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.core;

import com.twitter.errorreporter.ErrorReporter;
import android.text.TextUtils;
import android.os.Bundle;

class c implements h
{
    final /* synthetic */ MediaServiceClient a;
    
    c(final MediaServiceClient a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n, final Bundle bundle) {
        if (bundle != null) {
            final String string = bundle.getString("crash");
            if (!TextUtils.isEmpty((CharSequence)string)) {
                ErrorReporter.a(new MediaServiceClient$NativeCrashException(string));
            }
        }
    }
}
