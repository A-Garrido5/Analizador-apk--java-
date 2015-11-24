// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import com.twitter.library.service.z;
import android.widget.ListAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.app.FragmentActivity;
import com.twitter.internal.android.widget.HorizontalListView;
import java.util.List;
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
import com.twitter.android.client.TwitterListFragment;
import com.twitter.internal.android.widget.DockLayout;
import com.twitter.android.mn;
import android.support.v4.view.ViewPager;
import java.util.ArrayList;
import android.content.SharedPreferences;
import android.net.Uri;
import com.twitter.ui.dialog.e;
import com.twitter.android.client.TwitterFragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class c implements AdapterView$OnItemClickListener
{
    final /* synthetic */ TrendsActivity a;
    
    c(final TrendsActivity a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int currentItem, final long n) {
        if (currentItem == this.a.f.getCurrentItem()) {
            this.a.h();
            return;
        }
        this.a.f.setCurrentItem(currentItem);
        if (currentItem == 0 && this.a.e.size() == 2) {
            this.a.G().a(this.a.U().g(), "trends:detail_view::detail_view:click");
            return;
        }
        this.a.G().a(this.a.U().g(), "trends:list_view::list_view:click");
    }
}
