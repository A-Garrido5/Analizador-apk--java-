// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.Iterator;
import com.twitter.library.client.Session;
import android.view.View;
import com.twitter.library.client.az;
import com.twitter.library.api.QuotedTweetData;
import java.util.HashMap;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;
import com.twitter.library.provider.Tweet;
import java.util.Map;
import android.widget.LinearLayout;

public class EngagementActionBar extends LinearLayout
{
    private static final int[] a;
    private Map b;
    private Tweet c;
    private View$OnClickListener d;
    
    static {
        a = new int[] { 2131886229, 2131886230, 2131886231, 2131886232, 2131886228, 2131886108 };
    }
    
    public EngagementActionBar(final Context context) {
        super(context, (AttributeSet)null);
        this.b = new HashMap();
    }
    
    public EngagementActionBar(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = new HashMap();
    }
    
    public EngagementActionBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = new HashMap();
    }
    
    public static boolean a(final QuotedTweetData quotedTweetData, final long n) {
        return quotedTweetData.statusId > 0L && (quotedTweetData.userId == n || quotedTweetData.isShareable);
    }
    
    public static boolean a(final Tweet tweet) {
        final boolean q = tweet.q();
        return tweet.w() && !q;
    }
    
    public static boolean a(final Tweet tweet, final long n) {
        return tweet.E > 0L && (tweet.f == n || !tweet.P);
    }
    
    public static boolean b(final Tweet tweet, final long n) {
        return tweet.f == n && !tweet.g;
    }
    
    public void a() {
        if (this.c != null) {
            final Session b = az.a(this.getContext()).b();
            final boolean b2 = this.c.f == b.g();
            final boolean enabled = this.c.E > 0L;
            for (final View view : this.b.values()) {
                switch (view.getId()) {
                    default: {
                        continue;
                    }
                    case 2131886108: {
                        int visibility;
                        if (a(this.c)) {
                            visibility = 0;
                        }
                        else {
                            visibility = 8;
                        }
                        view.setVisibility(visibility);
                        continue;
                    }
                    case 2131886229: {
                        final ToggleImageButton toggleImageButton = (ToggleImageButton)view;
                        if (!enabled || (b2 && !this.c.g)) {
                            toggleImageButton.setEnabled(false);
                            continue;
                        }
                        toggleImageButton.setToggledOn(this.c.h);
                        toggleImageButton.setVisibility(0);
                        toggleImageButton.setEnabled(!this.c.P);
                        continue;
                    }
                    case 2131886230: {
                        final ToggleImageButton toggleImageButton2 = (ToggleImageButton)view;
                        if (!enabled) {
                            toggleImageButton2.setEnabled(false);
                            continue;
                        }
                        toggleImageButton2.setToggledOn(this.c.e);
                        continue;
                    }
                    case 2131886231: {
                        view.setEnabled(a(this.c, b.g()));
                        continue;
                    }
                    case 2131886232: {
                        int visibility2;
                        if (b(this.c, b.g())) {
                            visibility2 = 0;
                        }
                        else {
                            visibility2 = 8;
                        }
                        view.setVisibility(visibility2);
                        continue;
                    }
                    case 2131886228: {
                        view.setEnabled(enabled);
                        continue;
                    }
                }
            }
        }
    }
    
    public void b() {
        final Iterator<View> iterator = this.b.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().setSoundEffectsEnabled(false);
        }
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        for (final int n : EngagementActionBar.a) {
            final View viewById = this.findViewById(n);
            if (viewById != null) {
                this.b.put(n, viewById);
            }
        }
    }
    
    public void setOnClickListener(final View$OnClickListener view$OnClickListener) {
        final Iterator<View> iterator = this.b.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().setOnClickListener(view$OnClickListener);
        }
        this.d = view$OnClickListener;
    }
    
    public void setTweet(final Tweet c) {
        this.c = c;
        this.a();
    }
}
