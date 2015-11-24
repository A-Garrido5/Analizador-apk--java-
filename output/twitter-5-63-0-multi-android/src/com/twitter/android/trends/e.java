// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import com.twitter.library.service.z;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.support.v4.view.PagerAdapter;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import android.content.Context;
import android.content.Intent;
import android.content.DialogInterface;
import com.twitter.android.client.bn;
import com.twitter.internal.android.widget.ToolBar;
import android.content.SharedPreferences$Editor;
import com.twitter.library.client.Session;
import android.text.TextUtils;
import com.twitter.library.api.UserSettings;
import android.os.Bundle;
import com.twitter.internal.android.widget.DockLayout;
import java.util.ArrayList;
import android.content.SharedPreferences;
import android.net.Uri;
import com.twitter.android.client.TwitterFragmentActivity;
import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterListFragment;
import android.view.ViewGroup;
import com.twitter.android.mn;
import com.twitter.internal.android.widget.HorizontalListView;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.AbsPagesAdapter;

class e extends AbsPagesAdapter
{
    final /* synthetic */ TrendsActivity g;
    
    public e(final TrendsActivity g, final FragmentActivity fragmentActivity, final List list, final ViewPager viewPager, final HorizontalListView horizontalListView, final mn mn) {
        this.g = g;
        super(fragmentActivity, fragmentActivity.getSupportFragmentManager(), list, viewPager, horizontalListView, mn);
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        final TwitterListFragment twitterListFragment = (TwitterListFragment)super.instantiateItem(viewGroup, n);
        this.a(twitterListFragment, n);
        return twitterListFragment;
    }
    
    @Override
    public void onPageSelected(final int f) {
        super.onPageSelected(f);
        boolean b;
        if (this.b.size() == 2) {
            b = true;
        }
        else {
            b = false;
        }
        if (this.f == -1 && b) {
            int f2;
            if (f == 0) {
                f2 = 1;
            }
            else {
                f2 = 0;
            }
            this.f = f2;
        }
        final gm b2 = this.b(this.f);
        this.a(b2);
        if (b2 != null) {
            String s;
            if (f == 0 && b) {
                s = "trends:detail_view::detail_view:navigate";
            }
            else {
                s = "trends:list_view::list_view:navigate";
            }
            this.g.G().a(this.g.U().g(), s);
        }
        this.b(this.a(f));
        if (!this.g.j) {
            this.g.i.b();
        }
        this.g.l();
        this.f = f;
        this.g.Q();
    }
}
