// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View$OnLongClickListener;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import com.twitter.library.util.bj;
import com.twitter.util.i;
import java.util.Locale;
import com.twitter.library.util.aj;
import com.twitter.library.util.t;
import com.twitter.library.view.e;
import com.twitter.library.provider.j;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.media.widget.TweetMediaView;
import com.twitter.library.api.UserSettings;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import com.twitter.android.client.bh;
import android.os.Parcelable;
import com.twitter.library.featureswitch.d;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView$BufferType;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.library.util.bl;
import com.twitter.library.api.geo.TwitterPlace$PlaceInfo;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.view.u;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.annotation.SuppressLint;
import com.twitter.library.media.util.l;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.api.PromotedContent;
import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.twitter.library.util.bi;
import android.text.TextUtils;
import com.twitter.library.util.bq;
import com.twitter.internal.android.widget.TypefacesSpan;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.LayoutInflater;
import com.twitter.library.api.CardUser;
import com.twitter.library.experiments.b;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import com.twitter.library.widget.SocialBylineView;
import com.twitter.android.client.c;
import com.twitter.ui.widget.ag;
import com.twitter.android.ta;
import com.twitter.library.view.k;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.ActivitySummary;
import com.twitter.library.view.BadgeView;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.library.api.TwitterUser;
import android.widget.RelativeLayout;
import com.twitter.library.widget.ActionButton;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.view.QuoteView;
import com.twitter.library.api.Translation;
import com.twitter.internal.android.widget.TypefacesTextView;
import java.text.SimpleDateFormat;
import com.twitter.library.media.widget.s;
import com.twitter.library.media.util.r;
import android.widget.LinearLayout;
import android.graphics.Rect;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.accessibility.AccessibilityEvent;
import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import com.twitter.library.api.Entity;
import com.twitter.library.api.UrlEntity;
import com.twitter.util.collection.CollectionUtils;
import android.graphics.Point;
import android.view.View$OnLayoutChangeListener;
import java.util.ArrayList;
import android.view.View;
import com.twitter.library.api.TweetEntities;
import java.util.Comparator;
import android.graphics.Paint;
import java.util.List;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.widget.ExploreByTouchHelper;

public class fu extends ExploreByTouchHelper
{
    final TextView a;
    final ViewGroup b;
    final TweetDetailView c;
    private final List d;
    private final Paint e;
    private final Comparator f;
    private TweetEntities g;
    
    public fu(final View view, final TweetDetailView c) {
        super(view);
        this.e = new Paint();
        this.a = c.d;
        this.b = c.B;
        this.c = c;
        this.d = new ArrayList();
        this.a.addOnLayoutChangeListener((View$OnLayoutChangeListener)new fv(this));
        this.f = new fw(this);
    }
    
    private Point a() {
        return new Point(this.a.getLeft() + this.b.getLeft() + this.c.getLeft(), this.a.getTop() + this.b.getTop() + this.c.getTop());
    }
    
    private void a(final String s, final Iterable iterable, final boolean b) {
        if (!CollectionUtils.c(iterable)) {
            final int lineStart = this.a.getLayout().getLineStart(0);
            final int lineStart2 = this.a.getLayout().getLineStart(1);
            final Iterator iterator = this.g.c().iterator();
            UrlEntity urlEntity;
            if (iterator.hasNext()) {
                urlEntity = iterator.next();
            }
            else {
                urlEntity = null;
            }
            int n;
            if (urlEntity != null) {
                n = urlEntity.start;
            }
            else {
                n = s.length();
            }
            int n2 = 0;
            final Iterator<Entity> iterator2 = iterable.iterator();
            int n3 = lineStart;
            int n4 = 0;
            int n5 = lineStart2;
            UrlEntity urlEntity2 = urlEntity;
            int n6 = n;
            while (iterator2.hasNext()) {
                final Entity entity = iterator2.next();
                if (!b) {
                    while (entity.start > n6 && urlEntity2 != null) {
                        n2 += urlEntity2.end - urlEntity2.start - (urlEntity2.displayEnd - urlEntity2.displayStart);
                        if (iterator.hasNext()) {
                            urlEntity2 = iterator.next();
                        }
                        else {
                            urlEntity2 = null;
                        }
                        if (urlEntity2 != null) {
                            n6 = urlEntity2.start;
                        }
                        else {
                            n6 = s.length();
                        }
                    }
                }
                final int n7 = n2;
                final int n8 = n6;
                final UrlEntity urlEntity3 = urlEntity2;
                final int i = entity.start - n7;
                int n9;
                if (b) {
                    n9 = i + ((UrlEntity)entity).displayUrl.length();
                }
                else {
                    n9 = entity.end - n7;
                }
                int n14;
                int n15;
                int n16;
                int n17;
                if (i >= 0 && n9 <= s.length()) {
                    int n10 = n3;
                    int n11 = n4;
                    int n12;
                    int lineStart3;
                    for (n12 = n5; i >= n12; n12 = lineStart3) {
                        ++n11;
                        lineStart3 = this.a.getLayout().getLineStart(n11 + 1);
                        n10 = n12;
                    }
                    final float measureText = this.e.measureText(s, n10, i);
                    final float measureText2 = this.e.measureText(s, i, n9);
                    final int n13 = n11 * this.a.getLineHeight();
                    this.d.add(new fx((int)measureText, n13, (int)(measureText + measureText2), n13 + this.a.getLineHeight(), i, s.substring(i, n9)));
                    if (b) {
                        final UrlEntity urlEntity4 = (UrlEntity)entity;
                        n14 = n7 + (urlEntity4.end - urlEntity4.start - (urlEntity4.displayEnd - urlEntity4.displayStart));
                        n15 = n12;
                        n16 = n10;
                        n17 = n11;
                    }
                    else {
                        n14 = n7;
                        n15 = n12;
                        n16 = n10;
                        n17 = n11;
                    }
                }
                else {
                    n14 = n7;
                    n15 = n5;
                    n16 = n3;
                    n17 = n4;
                }
                n5 = n15;
                n3 = n16;
                n4 = n17;
                n2 = n14;
                n6 = n8;
                urlEntity2 = urlEntity3;
            }
        }
    }
    
    public void a(final TweetEntities g) {
        if (this.g != g) {
            this.g = g;
            this.d.clear();
            if (this.a.getText() != null) {
                this.e.setTypeface(this.a.getTypeface());
                this.e.setTextSize(this.a.getTextSize());
                final String string = this.a.getText().toString();
                this.a(string, g.mentions, false);
                this.a(string, g.hashtags, false);
                this.a(string, g.c(), true);
                Collections.sort((List<Object>)this.d, this.f);
            }
        }
    }
    
    @Override
    protected int getVirtualViewAt(final float n, final float n2) {
        final Point a = this.a();
        final float n3 = n - a.x;
        final float n4 = n2 - a.y;
        int n5;
        if (n3 >= 0.0f && n3 <= this.a.getWidth() && n4 >= 0.0f && n4 <= this.a.getHeight()) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        if (n5 != 0) {
            int n6 = 0;
            int n7;
            while (true) {
                final int size = this.d.size();
                n7 = 0;
                if (n6 >= size) {
                    break;
                }
                if (((fx)this.d.get(n6)).a((int)n3, (int)n4)) {
                    n7 = n6 + 1;
                    break;
                }
                ++n6;
            }
            return n7;
        }
        return Integer.MIN_VALUE;
    }
    
    @Override
    protected void getVisibleVirtualViews(final List list) {
        int i = 0;
        if (this.a.getText() == null) {
            list.add(Integer.MIN_VALUE);
        }
        else {
            list.add(0);
            while (i < this.d.size()) {
                list.add(i + 1);
                ++i;
            }
        }
    }
    
    @Override
    protected boolean onPerformActionForVirtualView(final int n, final int n2, final Bundle bundle) {
        switch (n2) {
            default: {
                return false;
            }
            case 16: {
                this.c.i.a(this.d.get(n - 1).c);
                return true;
            }
        }
    }
    
    @Override
    protected void onPopulateEventForVirtualView(final int n, final AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription((CharSequence)"");
    }
    
    @Override
    protected void onPopulateNodeForVirtualView(final int n, final AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence contentDescription = "";
        Rect boundsInParent = new Rect();
        final Point a = this.a();
        if (n == 0) {
            CharSequence text = this.a.getText();
            if (text == null) {
                text = contentDescription;
            }
            final Rect rect = new Rect(a.x, a.y, 1 + (a.x + this.a.getWidth()), 1 + (a.y + this.a.getHeight()));
            contentDescription = text;
            boundsInParent = rect;
        }
        else {
            final int n2 = n - 1;
            if (n2 >= 0 && n2 < this.d.size()) {
                final fx fx = this.d.get(n2);
                final String c = fx.c;
                boundsInParent = new Rect(fx.b);
                contentDescription = c;
            }
            boundsInParent.offset(a.x, a.y);
            accessibilityNodeInfoCompat.addAction(16);
        }
        accessibilityNodeInfoCompat.setContentDescription(contentDescription);
        if (!boundsInParent.isEmpty()) {
            accessibilityNodeInfoCompat.setBoundsInParent(boundsInParent);
            return;
        }
        accessibilityNodeInfoCompat.setBoundsInParent(new Rect(0, 0, 1, 1));
    }
}
