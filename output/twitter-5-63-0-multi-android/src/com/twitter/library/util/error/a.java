// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util.error;

import java.util.Map;
import java.util.ArrayList;
import com.crashlytics.android.t;
import android.content.Context;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.List;
import com.twitter.errorreporter.c;
import java.util.Iterator;
import com.twitter.errorreporter.b;
import com.twitter.library.featureswitch.d;
import com.twitter.library.featureswitch.n;

class a implements n
{
    final /* synthetic */ CrashlyticsErrorLogger a;
    
    a(final CrashlyticsErrorLogger a) {
        this.a = a;
    }
    
    @Override
    public void a(final long n) {
        Label_0180: {
            Label_0168: {
                synchronized (this.a) {
                    this.a.d = d.c(n);
                    if (!this.a.d) {
                        break Label_0180;
                    }
                    this.a.e = d.f("error_logging_enabled");
                    if (!this.a.e) {
                        break Label_0168;
                    }
                    final Iterator<b> iterator = this.a.b.iterator();
                    while (iterator.hasNext()) {
                        this.a.a(iterator.next());
                    }
                }
                if (this.a.f > 0) {
                    this.a.a(new b(new CrashlyticsErrorLogger$DroppedLogsException("Dropped: " + this.a.f + " logs.")));
                }
            }
            this.a.b.clear();
        }
    }
    // monitorexit(crashlyticsErrorLogger)
}
