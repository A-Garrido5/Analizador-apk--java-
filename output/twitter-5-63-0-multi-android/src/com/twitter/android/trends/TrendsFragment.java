// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import com.twitter.android.xc;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import com.twitter.android.sl;
import android.os.Bundle;
import android.content.SharedPreferences$Editor;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.content.SharedPreferences;
import com.twitter.android.TimelineFragment;

public class TrendsFragment extends TimelineFragment
{
    SharedPreferences k;
    private boolean l;
    private String m;
    private int n;
    
    public void L() {
        this.l = true;
        this.A_();
    }
    
    @Override
    public void a(final int n, final com.twitter.library.service.y y) {
        this.c(y.b);
        this.c_(y.R());
        if (!((aa)y.l().b()).a()) {
            Toast.makeText(this.an, 2131298000, 1).show();
            return;
        }
        final SharedPreferences$Editor edit = this.k.edit();
        edit.putLong(this.m, System.currentTimeMillis());
        edit.apply();
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        final FragmentActivity activity = this.getActivity();
        int n;
        if (activity.getResources().getConfiguration().orientation == 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n2;
        if (n != 0) {
            n2 = 0;
        }
        else {
            n2 = this.n;
        }
        if (this.getArguments().getBoolean("orientation_shim", false)) {
            new sl((Context)activity, n2).a(this.Y());
        }
        super.onActivityCreated(bundle);
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        final FragmentActivity activity = this.getActivity();
        final Bundle arguments = this.getArguments();
        this.l = arguments.getBoolean("needs_refresh", false);
        final String string = arguments.getString("timeline_tag");
        if (string != null) {
            this.m = string + "_" + "refresh_time";
        }
        else {
            this.m = "refresh_time";
        }
        arguments.putInt("type", 16);
        this.n = this.getActivity().getResources().getDimensionPixelSize(2131558806);
        arguments.putInt("empty_title", 2131296940);
        arguments.putInt("empty_desc", 2131296941);
        arguments.putBoolean("refresh", false);
        this.j(true);
        super.onCreate(bundle);
        this.k = activity.getSharedPreferences("trends", 0);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return this.a(layoutInflater, 2130969132, viewGroup);
    }
    
    @Override
    protected boolean r() {
        if (this.l) {
            this.l = false;
            return true;
        }
        int n;
        if (System.currentTimeMillis() > 900000L + this.k.getLong(this.m, 0L)) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (!((xc)this.W).isEmpty()) {
            final boolean b = false;
            if (n == 0) {
                return b;
            }
        }
        return true;
    }
}
