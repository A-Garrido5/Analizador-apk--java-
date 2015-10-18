// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;

final class u implements a
{
    final /* synthetic */ Activity a;
    
    u(final Activity a) {
        this.a = a;
    }
    
    @Override
    public void a(final Intent intent, final int n, final Bundle bundle) {
        this.a.startActivityForResult(intent, n);
    }
}
