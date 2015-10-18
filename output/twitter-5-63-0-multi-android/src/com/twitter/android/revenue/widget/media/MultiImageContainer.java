// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.widget.media;

import java.util.Iterator;
import android.view.View;
import com.twitter.library.media.manager.j;
import com.twitter.internal.android.widget.RichImageView;
import com.twitter.library.media.widget.MediaImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.ArrayList;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import java.util.Collections;
import android.util.AttributeSet;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.widget.LinearLayout;

public class MultiImageContainer extends LinearLayout
{
    private static final int[] b;
    private static final int[] c;
    protected Context a;
    private final boolean d;
    private final boolean e;
    private final Drawable f;
    private List g;
    
    static {
        (b = new int[5])[0] = 2130969023;
        MultiImageContainer.b[1] = 2130969025;
        MultiImageContainer.b[2] = 2130969024;
        MultiImageContainer.b[3] = 2130969022;
        MultiImageContainer.b[4] = 2130969021;
        (c = new int[5])[0] = 2131886995;
        MultiImageContainer.c[1] = 2131886996;
        MultiImageContainer.c[2] = 2131886997;
        MultiImageContainer.c[3] = 2131886998;
        MultiImageContainer.c[4] = 2131887234;
    }
    
    public MultiImageContainer(final Context context) {
        this(context, null);
    }
    
    public MultiImageContainer(final Context a, final AttributeSet set) {
        super(a, set);
        this.g = Collections.emptyList();
        this.setOrientation(1);
        this.a = a;
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes(set, pa.MultiImageContainer, 0, 0);
        this.d = obtainStyledAttributes.getBoolean(1, false);
        this.e = obtainStyledAttributes.getBoolean(2, false);
        this.f = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }
    
    public void a() {
        this.removeAllViews();
        this.b();
    }
    
    public void a(final List list) {
        this.a(list, Collections.emptyList(), 0);
    }
    
    public void a(final List list, final List list2, int n) {
        if (this.g.size() > 0) {
            this.a();
            this.g.clear();
        }
        if (!list.isEmpty() && list.size() <= 5) {
            this.g = new ArrayList(list.size());
            if (n == 0) {
                n = MultiImageContainer.b[-1 + list.size()];
            }
            final LinearLayout linearLayout = (LinearLayout)LayoutInflater.from(this.a).inflate(n, (ViewGroup)null);
            int n2;
            if (list2.size() == list.size()) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            for (int i = 0; i < list.size(); ++i) {
                final int n3 = MultiImageContainer.c[i];
                final MediaImageView mediaImageView = (MediaImageView)linearLayout.findViewById(n3);
                final String s = list.get(i);
                if (mediaImageView != null && s != null) {
                    this.g.add(mediaImageView);
                    mediaImageView.setFromMemoryOnly(false);
                    mediaImageView.setFadeIn(this.d);
                    mediaImageView.setTag((Object)n3);
                    if (n2 != 0) {
                        final Float n4 = list2.get(i);
                        if (n4 != null && n4 > 0.0f) {
                            mediaImageView.setAspectRatio(n4);
                        }
                    }
                    if (this.f != null) {
                        mediaImageView.setDefaultDrawable(this.f);
                    }
                    if (this.e) {
                        ((RichImageView)mediaImageView.findViewById(2131886127)).a(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    mediaImageView.a(j.a(s));
                }
            }
            this.addView((View)linearLayout);
        }
    }
    
    public void b() {
        for (final MediaImageView mediaImageView : this.g) {
            if (mediaImageView != null) {
                mediaImageView.b();
            }
        }
    }
    
    public void setFromMemoryOnly(final boolean fromMemoryOnly) {
        for (final MediaImageView mediaImageView : this.g) {
            if (mediaImageView != null) {
                mediaImageView.setFromMemoryOnly(fromMemoryOnly);
            }
        }
    }
}
