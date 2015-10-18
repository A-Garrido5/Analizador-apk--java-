// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.tv;

import java.util.Collections;
import com.twitter.library.client.d;
import android.os.Bundle;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import java.util.List;
import com.twitter.android.ScrollingHeaderActivity;

public class TvTimelineActivity extends ScrollingHeaderActivity
{
    private long a;
    
    public String K_() {
        return "TV Timeline Subtitle";
    }
    
    public PagerAdapter a(final List list, final ViewPager viewPager) {
        return new b(this.getSupportFragmentManager(), list, viewPager);
    }
    
    public BaseAdapter a(final List list) {
        return new a(list);
    }
    
    public void a(final Drawable drawable) {
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        if (!com.twitter.library.featureswitch.d.f("android_tv_timelines_enabled")) {
            this.finish();
            return;
        }
        this.a = this.getIntent().getLongExtra("show_id", 0L);
    }
    
    public String b() {
        return "TV Timeline";
    }
    
    public List d() {
        return Collections.emptyList();
    }
}
