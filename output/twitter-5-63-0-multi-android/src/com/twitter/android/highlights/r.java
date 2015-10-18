// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import com.twitter.internal.android.service.a;
import java.lang.ref.WeakReference;
import com.twitter.library.service.ac;

class r extends ac
{
    private WeakReference a;
    
    public r(final StoriesActivity storiesActivity) {
        this.a = new WeakReference((T)storiesActivity);
    }
    
    @Override
    public void a_(final a a) {
        final StoriesActivity storiesActivity = (StoriesActivity)this.a.get();
        if (storiesActivity == null) {
            return;
        }
        storiesActivity.e();
    }
}
