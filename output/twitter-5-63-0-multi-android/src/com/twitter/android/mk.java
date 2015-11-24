// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.client.az;
import android.content.Context;
import android.util.SparseIntArray;

public class mk
{
    private static final SparseIntArray a;
    private final Context b;
    private final az c;
    
    static {
        (a = new SparseIntArray(4)).put(0, 5);
        mk.a.put(1, 23);
        mk.a.put(2, 24);
        mk.a.put(3, 25);
    }
    
    public mk(final Context b, final az c) {
        this.b = b;
        this.c = c;
    }
    
    public TwitterListFragment a() {
        final Bundle bundle = new Bundle();
        return (TwitterListFragment)Fragment.instantiate(this.b, this.a(bundle).getName(), bundle);
    }
    
    public Class a(final Bundle bundle) {
        bundle.putInt("type", mk.a.get(this.b()));
        bundle.putInt("empty_title", 2131296933);
        bundle.putInt("empty_desc", 2131296934);
        return MentionTimelineFragment.class;
    }
    
    int b() {
        return NotificationsBaseTimelineActivity.a(this.b, this.c);
    }
}
