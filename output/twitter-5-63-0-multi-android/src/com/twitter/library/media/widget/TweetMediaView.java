// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.util.bq;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.media.manager.k;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.util.b;
import android.graphics.Bitmap;
import android.view.View$MeasureSpec;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.util.j;
import android.graphics.RectF;
import com.twitter.internal.android.widget.FixedSizeImageView;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.MediaEntity;
import java.util.Iterator;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import com.twitter.internal.android.widget.RichImageView;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.ImageView$ScaleType;
import java.util.Collections;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;
import com.twitter.library.widget.TightTextView;
import android.graphics.drawable.Drawable;
import java.util.List;
import com.twitter.library.av.playback.PlaybackMode;
import android.widget.ImageView;
import com.twitter.library.media.util.r;
import android.view.View$OnClickListener;
import android.view.ViewGroup;

public class TweetMediaView extends ViewGroup implements View$OnClickListener, r, n, o
{
    private static boolean d;
    private com.twitter.library.media.widget.r A;
    private boolean B;
    private int C;
    private ImageView D;
    private boolean E;
    private boolean F;
    private boolean G;
    private v H;
    private PlaybackMode I;
    protected List a;
    protected MediaImageView[] b;
    protected MediaVideoView c;
    private final int e;
    private final int f;
    private final int g;
    private final Drawable h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private int n;
    private int o;
    private s p;
    private ImageView q;
    private int r;
    private int s;
    private TightTextView t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private ImageButton y;
    private int z;
    
    static {
        TweetMediaView.d = false;
    }
    
    public TweetMediaView(final Context context) {
        this(context, null);
    }
    
    public TweetMediaView(final Context context, final AttributeSet set) {
        this(context, set, kv.tweetMediaViewStyle);
    }
    
    public TweetMediaView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = Collections.emptyList();
        this.F = true;
        this.G = true;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.TweetMediaView, n, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(li.TweetMediaView_dividerSize, 0);
        this.o = obtainStyledAttributes.getDimensionPixelSize(li.TweetMediaView_cornerRadiusSize, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(li.TweetMediaView_cardBadgeSpacing, 0);
        this.z = obtainStyledAttributes.getResourceId(li.TweetMediaView_defaultDrawable, 0);
        this.C = obtainStyledAttributes.getResourceId(li.TweetMediaView_overlayDrawable, 0);
        this.h = obtainStyledAttributes.getDrawable(li.TweetMediaView_playerOverlay);
        this.e = obtainStyledAttributes.getResourceId(li.TweetMediaView_audioBadgeDrawable, 0);
        this.f = obtainStyledAttributes.getResourceId(li.TweetMediaView_gifBadgeDrawable, 0);
        this.g = obtainStyledAttributes.getResourceId(li.TweetMediaView_vineBadgeDrawable, 0);
        this.j = obtainStyledAttributes.getDimensionPixelSize(li.TweetMediaView_retryButtonSize, 0);
        this.k = obtainStyledAttributes.getDimensionPixelSize(li.TweetMediaView_mediaBorderSize, 0);
        this.l = obtainStyledAttributes.getColor(li.TweetMediaView_mediaBorderColor, 0);
        this.m = obtainStyledAttributes.getColor(li.TweetMediaView_multipleMediaBorderColor, 0);
        if (TweetMediaView.d) {
            this.y = new ImageButton(context);
            final ImageButton y = this.y;
            y.setOnClickListener((View$OnClickListener)new q(this, context, y));
            y.setVisibility(4);
            y.setImageDrawable(obtainStyledAttributes.getDrawable(li.TweetMediaView_retryButton));
            y.setBackgroundColor(this.getResources().getColor(17170445));
            y.setScaleType(ImageView$ScaleType.CENTER_CROP);
            this.addView((View)y);
        }
        obtainStyledAttributes.recycle();
    }
    
    private void a(final int v) {
        this.v = v;
        MediaImageView[] b = this.b;
        if (v != 0) {
            if (b == null) {
                b = new MediaImageView[4];
                this.b = b;
            }
            final Context context = this.getContext();
            final Resources resources = this.getResources();
            for (int i = 0; i < v; ++i) {
                MediaImageView mediaImageView = b[i];
                if (b[i] == null) {
                    final RichImageView richImageView = new RichImageView(context);
                    richImageView.setOverlayDrawable(this.C);
                    mediaImageView = new MediaImageView(context, richImageView, false);
                    final ViewGroup$LayoutParams generateDefaultLayoutParams = this.generateDefaultLayoutParams();
                    generateDefaultLayoutParams.width = -1;
                    generateDefaultLayoutParams.height = -1;
                    mediaImageView.setLayoutParams(generateDefaultLayoutParams);
                    mediaImageView.setOnClickListener((View$OnClickListener)this);
                    mediaImageView.setCroppingRectProvider(this);
                    mediaImageView.setOnImageLoadedListener(this);
                    mediaImageView.setDefaultDrawable(resources.getDrawable(this.z));
                    mediaImageView.setScaleType(BaseMediaImageView$ScaleType.b);
                    mediaImageView.setFadeIn(TweetMediaView.d);
                    mediaImageView.setImageType("tweet_media");
                    mediaImageView.setContentDescription((CharSequence)resources.getString(lg.tweet_media_image_description));
                    this.addView((View)(b[i] = mediaImageView), i);
                }
                else {
                    this.a(i, 0, 0);
                    mediaImageView.layout(0, 0, 0, 0);
                }
                mediaImageView.setFromMemoryOnly(this.u);
                mediaImageView.setVisibility(0);
            }
        }
    }
    
    private void a(final View view, final int n, final int n2, final int n3, final int n4) {
        if (view != null && view.getVisibility() != 8) {
            view.layout(n, n2, n3, n4);
        }
    }
    
    private void a(final List list) {
        final Iterator<t> iterator = list.iterator();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            int n3;
            int n4;
            if (iterator.next().b) {
                n3 = n + 1;
                n4 = n2;
            }
            else {
                final int n5 = n2 + 1;
                n3 = n;
                n4 = n5;
            }
            n2 = n4;
            n = n3;
        }
        final int min = Math.min(4, n2);
        final int min2 = Math.min(1, n);
        int n6 = 0;
        if (min <= 0) {
            n6 = min2;
        }
        this.requestLayout();
        this.b();
        this.a(min);
        this.b(n6);
    }
    
    private void b(final int w) {
        this.w = w;
        if (w != 0) {
            if (this.c == null) {
                this.c = new MediaVideoView(this.getContext(), this.H.a(), this.H.b(), this.I);
                final ViewGroup$LayoutParams generateDefaultLayoutParams = this.generateDefaultLayoutParams();
                generateDefaultLayoutParams.width = -1;
                generateDefaultLayoutParams.height = -1;
                this.c.setLayoutParams(generateDefaultLayoutParams);
                this.c.setExternalClickListener((View$OnClickListener)this);
                this.addView((View)this.c);
            }
            this.c.setVisibility(0);
        }
    }
    
    private void setBadge(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            ImageView q = this.q;
            if (q == null) {
                q = new ImageView(this.getContext());
                q.setScaleType(ImageView$ScaleType.CENTER);
                this.addView((View)q);
                this.q = q;
            }
            this.r = imageDrawable.getIntrinsicWidth();
            this.s = imageDrawable.getIntrinsicHeight();
            q.setVisibility(0);
            q.setImageDrawable(imageDrawable);
        }
        else if (this.q != null) {
            this.q.setVisibility(4);
            this.q.setImageDrawable((Drawable)null);
        }
    }
    
    private void setMediaItems(final List a) {
        if (a != null && !a.isEmpty()) {
            if (this.a.equals(a)) {
                this.e();
            }
            else {
                this.a(a);
                this.a = a;
                final Context context = this.getContext();
                final Iterator<t> iterator = a.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final t t = iterator.next();
                    int n2;
                    if (t.b) {
                        this.c.setMediaEntity((MediaEntity)t.a);
                        this.c.setTag(la.tweet_media_item, (Object)t);
                        n2 = n;
                    }
                    else {
                        final MediaImageView mediaImageView = this.b[n];
                        mediaImageView.setTag(la.tweet_media_item, (Object)t);
                        mediaImageView.a(t.a(context));
                        if (n >= this.b.length) {
                            break;
                        }
                        n2 = n + 1;
                    }
                    n = n2;
                }
                if (a.size() == 1) {
                    final t t2 = a.get(0);
                    if (this.G && t2.b()) {
                        this.setPlayerOverlay(this.h);
                    }
                    if (this.F) {
                        final String c = t2.c();
                        if (c != null) {
                            this.setBadgeText(c);
                            return;
                        }
                        if (t2.a instanceof CardInstanceData) {
                            final CardInstanceData cardInstanceData = (CardInstanceData)t2.a;
                            if (cardInstanceData.n()) {
                                this.setBadge(this.getResources().getDrawable(this.f));
                                return;
                            }
                            if (cardInstanceData.q()) {
                                this.setBadge(this.getResources().getDrawable(this.g));
                                return;
                            }
                            if (cardInstanceData.o()) {
                                this.setBadge(this.getResources().getDrawable(this.e));
                            }
                        }
                    }
                }
            }
            return;
        }
        this.b();
    }
    
    private void setPlayerOverlay(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            if (this.D == null) {
                (this.D = new FixedSizeImageView(this.getContext())).setClickable(false);
                this.D.setScaleType(ImageView$ScaleType.CENTER);
                this.addView((View)this.D);
            }
            this.D.setVisibility(0);
            this.D.setImageDrawable(imageDrawable);
            this.D.bringToFront();
        }
        else if (this.D != null) {
            this.D.setVisibility(4);
            this.D.setImageDrawable((Drawable)null);
        }
    }
    
    public static void setUserRetriesEnabled(final boolean d) {
        com.twitter.util.d.d();
        TweetMediaView.d = d;
    }
    
    public RectF a(final MediaImageView mediaImageView) {
        final t t = (t)mediaImageView.getTag(la.tweet_media_item);
        if (t.a instanceof MediaEntity) {
            final MediaEntity mediaEntity = (MediaEntity)t.a;
            final List c = mediaEntity.c();
            if (!c.isEmpty()) {
                return com.twitter.library.media.util.j.a(mediaImageView.getImageSize().e(), mediaEntity.size.e(), c);
            }
        }
        return null;
    }
    
    protected Size a(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        final int n3 = (size - this.n) / 2;
        final int n4 = (size2 - this.n) / 2;
        switch (this.v) {
            case 1: {
                this.a(0, size, size2);
                break;
            }
            case 2: {
                this.a(0, n3, size2);
                this.a(1, n3, size2);
                break;
            }
            case 3: {
                this.a(0, n3, size2);
                this.a(1, n3, n4);
                this.a(2, n3, n4);
                break;
            }
            case 4: {
                this.a(0, n3, n4);
                this.a(1, n3, n4);
                this.a(2, n3, n4);
                this.a(3, n3, n4);
                break;
            }
        }
        return Size.a(size, size2);
    }
    
    protected void a() {
        final int measuredWidth = this.getMeasuredWidth();
        final int measuredHeight = this.getMeasuredHeight();
        final int n = (measuredWidth - this.n) / 2;
        final int n2 = (measuredHeight - this.n) / 2;
        final int n3 = n + this.n;
        switch (this.v) {
            default: {}
            case 1: {
                this.a(this.b[0], 0, 0, measuredWidth, measuredHeight);
            }
            case 2: {
                this.a(this.b[0], 0, 0, n, measuredHeight);
                this.a(this.b[1], n + this.n, 0, measuredWidth, measuredHeight);
            }
            case 3: {
                this.a(this.b[0], 0, 0, n, measuredHeight);
                this.a(this.b[1], n3, 0, measuredWidth, n2);
                this.a(this.b[2], n3, n2 + this.n, measuredWidth, measuredHeight);
            }
            case 4: {
                this.a(this.b[0], 0, 0, n, n2);
                this.a(this.b[2], 0, n2 + this.n, n, measuredHeight);
                this.a(this.b[1], n3, 0, measuredWidth, n2);
                this.a(this.b[3], n3, n2 + this.n, measuredWidth, measuredHeight);
            }
        }
    }
    
    protected void a(final int n, final int n2, final int n3) {
        this.b[n].measure(View$MeasureSpec.makeMeasureSpec(n2, 1073741824), View$MeasureSpec.makeMeasureSpec(n3, 1073741824));
    }
    
    protected void a(final View view, final int n, final int n2) {
        if (view != null && view.getVisibility() != 8) {
            view.measure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
        }
    }
    
    protected void a(final MediaImageView mediaImageView, final int n, final int n2, final int n3, final int n4) {
        int n5 = 1;
        if (mediaImageView.getLeft() == n && mediaImageView.getTop() == n2 && mediaImageView.getRight() == n3 && mediaImageView.getBottom() == n4) {
            return;
        }
        final RichImageView richImageView = (RichImageView)mediaImageView.getImageView();
        richImageView.setBorderSize(this.k);
        if (this.v > n5) {
            richImageView.setBorderColor(this.m);
        }
        else {
            richImageView.setBorderColor(this.l);
        }
        if (this.o > 0) {
            int n6;
            if (n2 == 0) {
                n6 = n5;
            }
            else {
                n6 = 0;
            }
            int n7;
            if (n == 0) {
                n7 = n5;
            }
            else {
                n7 = 0;
            }
            int n8;
            if (n3 == this.getMeasuredWidth()) {
                n8 = n5;
            }
            else {
                n8 = 0;
            }
            if (n4 != this.getMeasuredHeight()) {
                n5 = 0;
            }
            float n9;
            if (this.B) {
                n9 = this.o;
            }
            else {
                n9 = 0.0f;
            }
            float n10;
            if (n6 != 0 && n7 != 0) {
                n10 = n9;
            }
            else {
                n10 = 0.0f;
            }
            float n11;
            if (n6 != 0 && n8 != 0) {
                n11 = n9;
            }
            else {
                n11 = 0.0f;
            }
            float n12;
            if (n5 != 0 && n8 != 0) {
                n12 = n9;
            }
            else {
                n12 = 0.0f;
            }
            float n13;
            if (n5 != 0 && n7 != 0) {
                n13 = n9;
            }
            else {
                n13 = 0.0f;
            }
            richImageView.a(n10, n11, n12, n13);
        }
        mediaImageView.layout(n, n2, n3, n4);
    }
    
    public void a(final MediaImageView mediaImageView, final Bitmap bitmap) {
        final boolean b = bitmap != null;
        if (b) {
            ++this.x;
        }
        else if (this.y != null && this.v == 1) {
            com.twitter.library.util.b.b((View)this.y);
        }
        if (this.A != null) {
            final t t = (t)mediaImageView.getTag(la.tweet_media_item);
            if (t.a instanceof MediaEntity) {
                this.A.a(this, (MediaEntity)t.a, b);
            }
            else {
                if (t.a instanceof EditableMedia) {
                    this.A.a(this, (EditableMedia)t.a, b);
                    return;
                }
                if (t.a instanceof CardInstanceData) {
                    this.A.a(this, new TwitterStatusCard((CardInstanceData)t.a).classicCard, b);
                }
            }
        }
    }
    
    public void a(final v h, final PlaybackMode i) {
        this.E = true;
        this.I = i;
        this.H = h;
    }
    
    protected Size b(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        this.a((View)this.c, size, size2);
        return Size.a(size, size2);
    }
    
    public void b() {
        this.a = Collections.emptyList();
        final MediaImageView[] b = this.b;
        if (b != null) {
            for (int v = this.v, i = 0; i < v; ++i) {
                final MediaImageView mediaImageView = b[i];
                mediaImageView.setVisibility(8);
                mediaImageView.a((k)null);
                mediaImageView.setTag(la.tweet_media_item, (Object)null);
            }
            this.v = 0;
            this.x = 0;
        }
        if (this.c != null) {
            this.c.setVisibility(8);
            this.c.setMediaEntity(null);
        }
        this.w = 0;
        if (this.y != null) {
            this.y.setVisibility(4);
        }
        this.setBadgeText(null);
        this.setBadge(null);
        this.setPlayerOverlay(null);
    }
    
    public void c(final boolean b) {
        if (this.B != b) {
            this.B = b;
        }
    }
    
    public boolean c() {
        return !CollectionUtils.a((Collection)this.a);
    }
    
    void d() {
        final Context context = this.getContext();
        ScribeService.a(context, new TwitterScribeLog(az.a(context).b().g()).b(new String[] { "tweet::media:photo:retry" }));
        this.e();
    }
    
    public void d(final boolean b) {
        if (this.c != null) {
            this.c.a(b);
        }
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.isClickable() && super.dispatchTouchEvent(motionEvent);
    }
    
    public void e() {
        final int v = this.v;
        if (this.x != v) {
            final MediaImageView[] b = this.b;
            if (b != null) {
                for (int i = 0; i < v; ++i) {
                    b[i].e();
                }
            }
        }
    }
    
    public void e(final boolean b) {
        this.f();
        if (this.c != null) {
            this.c.b(b);
        }
    }
    
    public void f() {
        final MediaImageView[] b = this.b;
        if (b != null) {
            for (int v = this.v, i = 0; i < v; ++i) {
                b[i].f();
            }
        }
        this.x = 0;
    }
    
    public void g() {
        this.e();
        if (this.c != null) {
            this.c.a();
        }
    }
    
    public int getImageCount() {
        return this.v;
    }
    
    public int getMediaCount() {
        return this.v + this.w;
    }
    
    public List getMediaItems() {
        if (this.a != null) {
            return Collections.unmodifiableList((List<?>)this.a);
        }
        return null;
    }
    
    public MediaVideoView getMediaVideoView() {
        return this.c;
    }
    
    public void onClick(final View view) {
        if (this.p != null) {
            final t t = (t)view.getTag(la.tweet_media_item);
            if (t != null) {
                if (t.a instanceof MediaEntity) {
                    this.p.a(this, (MediaEntity)t.a);
                }
                else {
                    if (t.a instanceof CardInstanceData) {
                        this.p.a(this, new TwitterStatusCard((CardInstanceData)t.a).classicCard);
                        return;
                    }
                    if (t.a instanceof EditableMedia) {
                        this.p.a(this, (EditableMedia)t.a);
                    }
                }
            }
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x = 0;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        if (this.w == 1 && this.c != null) {
            this.c.layout(0, 0, n5, n6);
        }
        else if (this.v > 0) {
            this.a();
        }
        this.a((View)this.q, this.i, n6 - this.i - this.s, this.r + this.i, n6 - this.i);
        this.a((View)this.y, (n5 - this.j) / 2, (n6 - this.j) / 2, (n5 + this.j) / 2, (n6 + this.j) / 2);
        if (this.D != null) {
            this.a((View)this.D, 0, 0, n5, n6);
        }
        if (this.t != null) {
            this.a(this.t, this.i, n6 - this.t.getMeasuredHeight() - this.i, this.t.getMeasuredWidth() + this.i, n6 - this.i);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        Size size;
        if (this.w == 1 && this.c != null) {
            size = this.b(n, n2);
        }
        else if (this.v > 0) {
            size = this.a(n, n2);
        }
        else {
            size = Size.a;
        }
        this.setMeasuredDimension(size.a(), size.b());
        this.a((View)this.q, this.r, this.s);
        this.a((View)this.y, this.j, this.j);
        if (this.D != null) {
            this.a((View)this.D, size.a(), size.b());
        }
        if (this.t != null) {
            this.measureChild((View)this.t, n, n2);
        }
    }
    
    public void setBadgeText(final int n) {
        this.setBadgeText(this.getResources().getString(n));
    }
    
    public void setBadgeText(final String text) {
        if (!TextUtils.isEmpty((CharSequence)text)) {
            TightTextView t = this.t;
            if (t == null) {
                t = (TightTextView)LayoutInflater.from(this.getContext()).inflate(lc.media_text_badge, (ViewGroup)this, false);
                this.addView((View)t);
                this.t = t;
            }
            t.setText(text);
            t.setVisibility(0);
        }
        else if (this.t != null) {
            this.t.setVisibility(4);
        }
    }
    
    public void setCard(final CardInstanceData cardInstanceData) {
        this.setMediaItems(com.twitter.library.media.widget.t.a(cardInstanceData));
    }
    
    public void setEditableMedia(final List list) {
        this.setMediaItems(com.twitter.library.media.widget.t.a(list));
    }
    
    public void setFromMemoryOnly(final boolean b) {
        if (this.u != b) {
            this.u = b;
            final MediaImageView[] b2 = this.b;
            if (b2 != null) {
                for (int v = this.v, i = 0; i < v; ++i) {
                    b2[i].setFromMemoryOnly(b);
                }
            }
        }
    }
    
    public void setMediaDividerSize(final int n) {
        this.n = n;
    }
    
    public void setMediaEntities(final Iterable iterable) {
        List<Object> list;
        if (iterable != null) {
            list = (List<Object>)com.twitter.library.media.util.q.a(iterable, Size.a);
        }
        else {
            list = Collections.emptyList();
        }
        this.setMediaItems(com.twitter.library.media.widget.t.a(list, bq.a() && this.E));
    }
    
    public void setMediaPlaceholder(final int n) {
        final Resources resources = this.getResources();
        final MediaImageView[] b = this.b;
        if (b != null) {
            for (int v = this.v, i = 0; i < v; ++i) {
                b[i].setDefaultDrawable(resources.getDrawable(n));
            }
        }
    }
    
    public void setOnImageLoadedListener(final com.twitter.library.media.widget.r a) {
        this.A = a;
    }
    
    public void setOnMediaClickListener(final s p) {
        this.setClickable(p != null);
        this.p = p;
    }
    
    public void setShowMediaBadge(final boolean f) {
        this.F = f;
    }
    
    public void setShowPlayerOverlay(final boolean g) {
        this.G = g;
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
