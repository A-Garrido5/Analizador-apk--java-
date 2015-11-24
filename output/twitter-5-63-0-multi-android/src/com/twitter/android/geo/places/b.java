// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.geo.places;

import java.util.ArrayList;
import com.twitter.library.client.Session;
import com.twitter.library.client.as;
import android.view.View;
import android.widget.LinearLayout;
import com.twitter.android.client.bn;
import com.twitter.library.api.TwitterTopic;
import android.widget.ListView;
import android.widget.BaseAdapter;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.view.View$MeasureSpec;
import android.content.res.Resources;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.support.v4.view.ViewPager;
import android.support.v4.app.Fragment;
import java.util.List;
import com.twitter.library.api.geo.TwitterPlace;
import java.io.Serializable;
import com.twitter.android.EventGridFragment;
import com.twitter.library.api.geo.TwitterPlace$PlaceType;
import com.twitter.util.q;
import android.os.Bundle;
import com.twitter.android.mn;
import android.net.Uri;
import com.twitter.android.rp;
import android.view.View$OnClickListener;
import com.twitter.android.ScrollingHeaderActivity;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.content.Context;
import android.widget.Toast;
import android.text.TextUtils;
import android.widget.TextView;
import android.support.annotation.IdRes;
import com.twitter.library.widget.AspectRatioFrameLayout;
import android.widget.ImageView;
import android.view.ViewGroup;

class b implements k
{
    private final PlaceLandingActivity a;
    private final ViewGroup b;
    private final ImageView c;
    private final AspectRatioFrameLayout d;
    
    public b(final PlaceLandingActivity a, final ViewGroup b) {
        this.a = a;
        this.b = b;
        this.d = (AspectRatioFrameLayout)b.findViewById(2131886252);
        this.c = (ImageView)b.findViewById(2131887134);
    }
    
    private void a(@IdRes final int n, final CharSequence text) {
        final TextView textView = (TextView)this.b.findViewById(n);
        if (!TextUtils.isEmpty(text)) {
            textView.setVisibility(0);
            textView.setText(text);
            return;
        }
        textView.setVisibility(8);
        textView.setText((CharSequence)null);
    }
    
    @Override
    public void a() {
        Toast.makeText((Context)this.a, 2131297441, 1).show();
    }
    
    @Override
    public void a(final int currentItem) {
        this.a.l.setCurrentItem(currentItem);
        this.a.e.a(currentItem);
    }
    
    @Override
    public void a(final Bitmap bitmap) {
        this.a.a(bitmap);
    }
    
    public void a(final Drawable imageDrawable) {
        this.c.setImageDrawable(imageDrawable);
    }
    
    @Override
    public void a(final CharSequence charSequence) {
        this.a(2131887135, charSequence);
    }
    
    @Override
    public void a(final boolean b) {
        this.a.a(b);
        if (!b) {
            ((PlaceTimelineFragment)this.a.k.get(0).a(this.a.getSupportFragmentManager())).L();
        }
    }
    
    public AspectRatioFrameLayout b() {
        return this.d;
    }
    
    @Override
    public void b(final CharSequence charSequence) {
        this.a(2131887136, charSequence);
    }
    
    @Override
    public void c(final CharSequence charSequence) {
        this.a(2131887137, charSequence);
    }
}
