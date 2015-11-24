// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.util.CategoryListItem;
import android.widget.ListView;
import android.support.v4.app.FragmentActivity;
import com.twitter.ui.widget.PromptView;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import com.twitter.library.api.j;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.util.SparseBooleanArray;
import java.util.Collection;
import com.twitter.library.scribe.TwitterScribeItem;
import java.util.ArrayList;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.android.client.TwitterListFragment;

public class InterestPickerFragment extends TwitterListFragment implements AdapterView$OnItemClickListener
{
    private FollowFlowController a;
    private ArrayList b;
    private int[] c;
    private jp d;
    private jr e;
    
    public InterestPickerFragment() {
        this.e = new js(null);
    }
    
    private TwitterScribeItem a(final String b, final int g) {
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.b = b;
        twitterScribeItem.g = g;
        twitterScribeItem.a = 0L;
        return twitterScribeItem;
    }
    
    private void a(final ArrayList list) {
        if (list != null) {
            this.d.addAll((Collection)list);
        }
    }
    
    private int[] s() {
        int i = 0;
        final int[] array = new int[this.e()];
        final SparseBooleanArray checkedItemPositions = this.Y().getCheckedItemPositions();
        int n = 0;
        while (i < checkedItemPositions.size()) {
            if (checkedItemPositions.valueAt(i)) {
                final int n2 = n + 1;
                array[n] = checkedItemPositions.keyAt(i);
                n = n2;
            }
            ++i;
        }
        return array;
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        this.c(y.b);
        final aa aa = (aa)y.l().b();
        this.e.aa_();
        switch (n) {
            default: {}
            case 1: {
                if (aa.a()) {
                    this.b = ((j)y).f();
                    this.d.clear();
                    this.a(this.b);
                    this.d.notifyDataSetChanged();
                    return;
                }
                this.a.a(this.getActivity());
            }
        }
    }
    
    public void a(final jr e) {
        this.e = e;
    }
    
    public int e() {
        return this.Y().getCheckedItemCount();
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.d == null) {
            this.d = new jp((Context)this.getActivity(), this.b);
        }
        this.Y().setAdapter((ListAdapter)this.d);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Bundle arguments = this.getArguments();
        if (bundle != null) {
            this.b = bundle.getParcelableArrayList("fetched_list");
            this.c = bundle.getIntArray("checked_list");
            this.a = (FollowFlowController)bundle.getParcelable("state_flow_controller");
        }
        else {
            this.b = new ArrayList();
            this.c = new int[0];
            this.a = (FollowFlowController)arguments.getParcelable("flow_controller");
        }
        if (this.a == null) {
            this.a = new FollowFlowController((String)null);
        }
        if (this.b.size() == 0) {
            this.a(new j((Context)this.getActivity(), this.aF()), 1, 3);
        }
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.e.aa_();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("fetched_list", this.b);
        bundle.putParcelable("state_flow_controller", (Parcelable)this.a);
        bundle.putIntArray("checked_list", this.s());
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        final FragmentActivity activity = this.getActivity();
        final ListView y = this.Y();
        final PromptView promptView = new PromptView((Context)activity);
        promptView.setIsHeader(true);
        int title;
        if (this.a.e()) {
            title = 2131298217;
        }
        else {
            title = 2131298216;
        }
        promptView.setTitle(title);
        y.setHeaderDividersEnabled(false);
        y.addHeaderView((View)promptView, (Object)null, false);
        y.setChoiceMode(2);
        y.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        for (int i = 0; i < this.c.length; ++i) {
            y.setItemChecked(this.c[i], true);
        }
        if (this.c.length > 0) {
            this.e.aa_();
        }
    }
    
    public void r() {
        final int[] s = this.s();
        final String[] array = new String[s.length];
        final ArrayList<TwitterScribeItem> list = new ArrayList<TwitterScribeItem>();
        for (int i = 0; i < s.length; ++i) {
            final int n = s[i];
            final CategoryListItem categoryListItem = this.b.get(n - 1);
            array[i] = categoryListItem.b();
            list.add(this.a(categoryListItem.a(), n));
        }
        this.aw().a(new TwitterScribeLog(this.aF().g()).a(list).b(this.a.f(), "interest_picker", "", "", "selected").a((long)s.length));
        this.a.b(array);
    }
}
