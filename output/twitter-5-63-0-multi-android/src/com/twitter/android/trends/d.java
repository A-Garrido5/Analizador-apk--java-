// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.app.FragmentActivity;
import com.twitter.internal.android.widget.HorizontalListView;
import java.util.List;
import com.twitter.android.widget.PromptDialogFragment;
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
import com.twitter.internal.android.service.a;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.api.account.ab;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class d extends z
{
    final /* synthetic */ TrendsActivity a;
    
    private d(final TrendsActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (y instanceof ab) {
            final com.twitter.library.service.ab p = y.P();
            if (p != null && p.c == this.a.U().g()) {
                if (!y.X()) {
                    Toast.makeText((Context)this.a, 2131297968, 1).show();
                    return;
                }
                this.a.a(this.a.U().j());
                this.a.Q();
                final Fragment a = this.a.e.get(this.a.f.getCurrentItem()).a(this.a.getSupportFragmentManager());
                if (a != null && a instanceof TrendsFragment) {
                    ((TrendsFragment)a).L();
                }
            }
            return;
        }
        super.a(y);
    }
}
