// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.d;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.InvalidDataException;
import java.util.Collection;
import java.util.Collections;
import com.twitter.library.api.bp;
import java.util.List;
import java.util.ArrayList;
import com.twitter.internal.android.service.x;
import java.util.Locale;
import com.twitter.library.network.ae;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.provider.bg;
import com.twitter.library.api.ar;

class b implements Runnable
{
    final /* synthetic */ a a;
    
    b(final a a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final com.twitter.library.provider.b a = this.a.W();
        this.a.f = this.a.i.b(this.a.P().c, this.a.e, this.a.g, a);
        a.a();
    }
}
