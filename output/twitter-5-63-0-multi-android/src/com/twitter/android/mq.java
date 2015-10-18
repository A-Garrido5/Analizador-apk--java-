// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.client.az;
import android.content.res.Resources;
import android.content.Context;
import android.util.SparseIntArray;

public class mq
{
    private static final SparseIntArray a;
    private final Context b;
    private final Resources c;
    private final az d;
    
    static {
        (a = new SparseIntArray(4)).put(0, 0);
        mq.a.put(1, 2);
        mq.a.put(2, 3);
        mq.a.put(3, 4);
    }
    
    public mq(final Context b, final Resources c, final az d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    int a() {
        return NotificationsBaseTimelineActivity.a(this.b, this.d);
    }
    
    public TwitterListFragment a(final boolean b) {
        final Bundle bundle = new Bundle();
        return (TwitterListFragment)Fragment.instantiate(this.b, this.a(bundle, b).getName(), bundle);
    }
    
    public Class a(final Bundle bundle, final boolean b) {
        bundle.putInt("activity_type", mq.a.get(this.a()));
        bundle.putBoolean("prompt_host", true);
        bundle.putBoolean("activity_mention_only", b);
        bundle.putBoolean("horizontal_padding_enabled", false);
        bundle.putInt("bg_color", this.c.getColor(2131689637));
        return ActivityFragment.class;
    }
}
