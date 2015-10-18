// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import com.twitter.util.c;
import android.os.Build$VERSION;
import android.view.View;
import com.twitter.android.moments.ui.sectionpager.k;
import android.view.LayoutInflater;
import android.view.View$OnTouchListener;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.view.PagerAdapter;
import com.twitter.android.moments.ui.sectionpager.e;
import com.twitter.util.m;
import android.widget.SeekBar;
import com.twitter.android.moments.ui.sectionpager.TouchlessViewPager;
import android.support.v4.view.ViewPager;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Intent;
import com.twitter.android.moments.viewmodels.Capsule;
import android.content.Context;
import com.twitter.android.client.TwitterFragmentActivity;

public class MomentsFullScreenPagerActivity extends TwitterFragmentActivity
{
    public static Intent a(final Context context, final Capsule capsule) {
        final Intent intent = new Intent(context, (Class)MomentsFullScreenPagerActivity.class);
        intent.putExtra("extra_capsule", (Parcelable)capsule);
        return intent;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968889);
        return super.a(bundle, bn);
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        final Capsule capsule = (Capsule)this.getIntent().getParcelableExtra("extra_capsule");
        if (capsule == null) {
            throw new IllegalArgumentException("Starting full screen pager requires a capsule");
        }
        final ViewPager viewPager = (ViewPager)this.findViewById(2131886954);
        final TouchlessViewPager touchlessViewPager = (TouchlessViewPager)this.findViewById(2131886955);
        final SeekBar seekBar = (SeekBar)this.findViewById(2131886956);
        final m m = new m();
        final e e = new e(viewPager, touchlessViewPager);
        e.a(2131558801);
        viewPager.setAdapter(e.a());
        touchlessViewPager.setAdapter(e.b());
        final i onTouchListener = new i((Context)this, m);
        e.a(onTouchListener);
        viewPager.setOnTouchListener((View$OnTouchListener)onTouchListener);
        e.a(new a((Context)this, LayoutInflater.from((Context)this), m).a(capsule));
        e.a(new k(capsule.c(), viewPager, this.getResources().getDrawable(2130839466), seekBar));
        new com.twitter.android.moments.ui.fullscreen.d(this.getResources(), m, (View)touchlessViewPager, (View)seekBar);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (Build$VERSION.SDK_INT >= 19) {
            if (!b) {
                com.twitter.util.c.b(this.getWindow().getDecorView());
                return;
            }
            com.twitter.util.c.a(this.getWindow().getDecorView());
        }
    }
}
