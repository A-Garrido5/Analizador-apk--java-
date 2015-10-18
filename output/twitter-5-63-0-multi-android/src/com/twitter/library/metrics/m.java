// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import com.twitter.library.scribe.performance.PerformanceScribeLog;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.util.q;
import android.content.Context;

public class m implements it
{
    private final Context a;
    
    public m(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    @Override
    public void a(final ih ih) {
        final im w = ih.w();
        if (w != ih.l) {
            final PerformanceScribeLog a = l.a(ih);
            if (q.a.nextInt(10000) < w.a()) {
                ScribeService.a(this.a, a, false);
            }
        }
    }
    
    @Override
    public int hashCode() {
        return m.class.getName().hashCode();
    }
}
