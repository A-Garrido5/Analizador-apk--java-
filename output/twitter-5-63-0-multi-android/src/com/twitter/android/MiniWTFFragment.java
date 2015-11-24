// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup$LayoutParams;
import android.content.Intent;
import android.content.Context;
import com.twitter.refresh.widget.d;
import com.twitter.refresh.widget.RefreshableListView;
import android.view.LayoutInflater;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.view.View;

public class MiniWTFFragment extends UsersFragment
{
    public MiniWTFFragment() {
        this.a = false;
    }
    
    private int P() {
        final ListAdapter adapter = this.Y().getAdapter();
        final int count = adapter.getCount();
        if (count == 0) {
            return 0;
        }
        final View view = adapter.getView(0, (View)null, (ViewGroup)this.Y());
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(measureSpec, measureSpec);
        final int n = 0 + view.getMeasuredHeight() * (count - 1);
        final View view2 = adapter.getView(count - 1, (View)null, (ViewGroup)this.Y());
        view2.measure(measureSpec, measureSpec);
        return n + view2.getMeasuredHeight();
    }
    
    public static MiniWTFFragment c(final int n) {
        final MiniWTFFragment miniWTFFragment = new MiniWTFFragment();
        final Bundle arguments = new Bundle();
        arguments.putBoolean("follow", true);
        arguments.putInt("type", 19);
        arguments.putInt("empty_desc", 2131296931);
        arguments.putInt("limit", n);
        arguments.putString("scribe_item", "home");
        arguments.putBoolean("sync_follow_state", false);
        arguments.putBoolean("disable_toast_error_messages", true);
        miniWTFFragment.setArguments(arguments);
        return miniWTFFragment;
    }
    
    public void b(final ListView listView, final View view, final int n, final long n2) {
        super.b(listView, view, n, n2);
        if (view.getId() == 2131887393) {
            this.aw().a(((TwitterScribeLog)new TwitterScribeLog(this.aF().g()).b(new String[] { this.m(), "who_to_follow::more:click" })).a(this.Z));
        }
    }
    
    public void d(final int b) {
        if (this.b != b) {
            this.b = b;
            if (!this.aD()) {
                final Bundle arguments = this.getArguments();
                arguments.putInt("limit", this.b);
                this.setArguments(arguments);
                return;
            }
            this.k(19);
        }
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return this.a(layoutInflater, 2130968886, viewGroup);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.i();
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        final ListView y = this.Y();
        ((RefreshableListView)y).setRefreshListener(null);
        final View inflate = LayoutInflater.from((Context)this.getActivity()).inflate(2130969224, (ViewGroup)null);
        y.setFooterDividersEnabled(false);
        y.addFooterView(inflate, (Object)new Intent((Context)this.getActivity(), (Class)RootTabbedFindPeopleActivity.class), true);
    }
    
    public void r() {
        final ListView y = this.Y();
        if (y != null) {
            final ViewGroup$LayoutParams layoutParams = y.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.P();
                y.setLayoutParams(layoutParams);
            }
        }
    }
}
