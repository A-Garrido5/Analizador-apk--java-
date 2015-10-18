// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewTreeObserver$OnPreDrawListener;
import android.net.Uri;
import com.twitter.errorreporter.ErrorReporter;
import android.app.Dialog;
import android.content.Intent;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import com.twitter.library.util.bj;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.support.v4.view.GestureDetectorCompat;
import android.os.Parcelable;
import com.twitter.library.provider.ae;
import com.twitter.library.widget.aj;
import com.twitter.library.view.z;
import android.app.Activity;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.composer.au;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.timeline.ah;
import android.text.TextUtils;
import android.database.Cursor;
import android.support.v4.content.Loader;
import java.util.HashSet;
import android.content.DialogInterface;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.os.AsyncTask$Status;
import com.twitter.library.widget.StatusToolBar;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.api.PromotedEvent;
import android.view.View$OnSystemUiVisibilityChangeListener;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.twitter.library.media.manager.UserImageRequest;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView$BufferType;
import com.twitter.library.media.util.ag;
import com.twitter.library.media.util.q;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.client.c;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.api.timeline.i;
import java.util.Set;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.widget.SlidingPanel;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.Session;
import android.widget.TextView;
import android.support.v4.view.ViewPager;
import com.twitter.library.widget.TweetView;
import android.view.animation.Animation;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.ui.dialog.e;
import android.view.View$OnClickListener;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.TwitterFragmentActivity;
import android.view.LayoutInflater;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.card.property.Vector2F;
import java.util.Iterator;
import com.twitter.library.media.manager.j;
import com.twitter.internal.android.util.Size;
import com.twitter.library.card.property.ImageSpec;
import java.util.Collections;
import com.twitter.library.network.a;
import com.twitter.library.media.util.l;
import com.twitter.library.network.t;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.k;
import com.twitter.library.provider.Tweet;
import java.util.List;
import android.util.SparseArray;
import java.util.ArrayList;
import android.support.v4.view.PagerAdapter;

class ig extends PagerAdapter
{
    final /* synthetic */ GalleryActivity a;
    private final ArrayList b;
    private final SparseArray c;
    private ik d;
    private List e;
    
    public ig(final GalleryActivity a) {
        this.a = a;
        this.b = new ArrayList();
        this.c = new SparseArray();
    }
    
    public Tweet a(final int n) {
        if (this.e == null || this.e.size() <= n) {
            return null;
        }
        return this.e.get(n).a;
    }
    
    public void a() {
        final SparseArray c = this.c;
        for (int i = 0; i < c.size(); ++i) {
            final ik ik = (ik)c.valueAt(i);
            ik.a.a((k)null);
            ik.b = true;
        }
    }
    
    public void a(final ik ik) {
        final ii ii = this.e.get(ik.c);
        ii.b.a(new ih(this, ik));
        ik.a.a(ii.b);
    }
    
    public void a(final Tweet tweet, final MediaEntity mediaEntity, final boolean b) {
        if (mediaEntity != null) {
            t t;
            if (b) {
                t = new t(this.a.o.h());
            }
            else {
                t = null;
            }
            this.a(Collections.singletonList(new ii(tweet, (k)l.a(mediaEntity).a(t))));
        }
    }
    
    public void a(final List e) {
        this.e = e;
        this.d = null;
        this.notifyDataSetChanged();
    }
    
    public ik b(final int n) {
        return (ik)this.c.get(n, (Object)null);
    }
    
    public void b() {
        final SparseArray c = this.c;
        for (int i = 0; i < c.size(); ++i) {
            this.a((ik)c.valueAt(i));
        }
    }
    
    public void b(final List list) {
        final ArrayList<ii> list2 = new ArrayList<ii>(list.size());
        for (final ImageSpec imageSpec : list) {
            final Vector2F size = imageSpec.size;
            list2.add(new ii(null, j.a(imageSpec.url, Size.a(size.x, size.y))));
        }
        this.a(list2);
    }
    
    public void c() {
        this.d = null;
        this.a.f = -1;
    }
    
    @Override
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        final ik ik = (ik)o;
        final MediaImageView a = ik.a;
        a.a((k)null);
        this.b.add(a);
        this.c.remove(n);
        viewGroup.removeView((View)a);
        ik.b = true;
    }
    
    @Override
    public void finishUpdate(final ViewGroup viewGroup) {
        final ik d = this.d;
        if (d != null && d.b) {
            this.a(d);
        }
    }
    
    @Override
    public int getCount() {
        if (this.e == null) {
            return 0;
        }
        return this.e.size();
    }
    
    @Override
    public int getItemPosition(final Object o) {
        if (((ik)o).c < this.getCount()) {
            return -1;
        }
        return -2;
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int c) {
        MediaImageView a;
        if (this.b.isEmpty()) {
            a = (MediaImageView)LayoutInflater.from(viewGroup.getContext()).inflate(2130968956, viewGroup, false);
        }
        else {
            a = this.b.remove(0);
        }
        final ik ik = new ik();
        ik.c = c;
        ik.a = a;
        this.c.append(c, (Object)ik);
        ik.d = this.e.get(c).b;
        this.a(ik);
        viewGroup.addView((View)a);
        return ik;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return view == ((ik)o).a;
    }
    
    @Override
    public void setPrimaryItem(final ViewGroup viewGroup, final int n, final Object o) {
        ik d = (ik)o;
        if (d == null || d.c >= this.getCount()) {
            d = null;
        }
        this.d = d;
    }
}
