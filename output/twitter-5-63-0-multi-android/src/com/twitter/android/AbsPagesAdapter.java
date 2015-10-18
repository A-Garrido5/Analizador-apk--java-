// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Iterator;
import android.content.Context;
import com.twitter.android.client.p;
import android.support.v4.app.Fragment;
import android.net.Uri;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import java.util.List;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.app.FragmentPagerAdapter;

public abstract class AbsPagesAdapter extends FragmentPagerAdapter implements ViewPager$OnPageChangeListener
{
    protected final ViewPager a;
    protected List b;
    protected final FragmentManager c;
    protected final FragmentActivity d;
    protected final mn e;
    protected int f;
    private final HorizontalListView g;
    
    protected AbsPagesAdapter(final FragmentActivity d, final FragmentManager c, final List b, final ViewPager a, final HorizontalListView g, final mn e) {
        super(d.getSupportFragmentManager());
        this.f = -1;
        this.d = d;
        this.c = c;
        (this.a = a).setOnPageChangeListener(this);
        this.b = b;
        this.g = g;
        this.e = e;
    }
    
    private Uri c(final int n) {
        final gm a = this.a(n);
        if (a != null) {
            return a.c;
        }
        return null;
    }
    
    public int a(final Uri uri) {
        for (int i = 0; i < this.b.size(); ++i) {
            if (uri.equals((Object)((gm)this.b.get(i)).c)) {
                return i;
            }
        }
        return -1;
    }
    
    public gm a(final int n) {
        return this.b.get(n);
    }
    
    public List a() {
        return this.b;
    }
    
    protected void a(final Fragment fragment, final int n) {
        this.b.get(n).a(fragment);
        if (n == this.a.getCurrentItem() && fragment instanceof p) {
            ((p)fragment).W();
        }
    }
    
    protected void a(final gm gm) {
        if (gm != null) {
            final Fragment c = this.c(gm);
            if (c instanceof p) {
                ((p)c).X();
            }
        }
    }
    
    public HorizontalListView b() {
        return this.g;
    }
    
    protected gm b(final int n) {
        if (n != -1) {
            return this.b.get(n);
        }
        return null;
    }
    
    protected void b(final gm gm) {
        if (gm != null) {
            final Fragment c = this.c(gm);
            if (c instanceof p) {
                if (this.d instanceof ScrollingHeaderActivity) {
                    ((ScrollingHeaderActivity)this.d).a(c);
                }
                ((p)c).W();
            }
        }
    }
    
    public Uri c() {
        return this.c(this.a.getCurrentItem());
    }
    
    protected Fragment c(final gm gm) {
        return gm.a(this.c);
    }
    
    public void d() {
        this.f = -1;
        this.notifyDataSetChanged();
    }
    
    @Override
    public int getCount() {
        return this.b.size();
    }
    
    @Override
    public Fragment getItem(final int n) {
        final gm gm = this.b.get(n);
        return Fragment.instantiate((Context)this.d, gm.a.getName(), gm.b);
    }
    
    @Override
    public long getItemId(final int n) {
        return this.b.get(n).f;
    }
    
    @Override
    public int getItemPosition(final Object o) {
        for (final gm gm : this.b) {
            if (this.c(gm) == o) {
                return this.b.indexOf(gm);
            }
        }
        return -2;
    }
    
    @Override
    public CharSequence getPageTitle(final int n) {
        return this.b.get(n).d;
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
        this.g.a(n);
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        this.g.a(n, n2);
    }
    
    @Override
    public void onPageSelected(final int n) {
        this.e.a(n);
        this.b().b(n);
    }
}
