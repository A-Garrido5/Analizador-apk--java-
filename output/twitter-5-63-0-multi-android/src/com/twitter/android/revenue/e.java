// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue;

import android.view.View;
import android.widget.AbsListView;
import java.util.Iterator;
import com.twitter.android.xb;
import com.twitter.library.client.az;
import com.twitter.library.client.as;
import android.content.Context;
import java.util.HashSet;
import java.util.HashMap;
import android.os.Looper;
import android.graphics.Rect;
import java.util.Set;
import android.os.Handler;
import java.util.Map;
import com.twitter.android.client.bv;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.provider.Tweet;

class e implements Runnable
{
    final /* synthetic */ Tweet a;
    final /* synthetic */ d b;
    
    e(final d b, final Tweet a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.b.a(wm.a(PromotedEvent.aG, this.a.j).a());
        final String impressionId = this.a.j.impressionId;
        d.a.put(impressionId, impressionId);
        this.b.a(this.a.Q);
    }
}
