// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.library.featureswitch.d;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.bn;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup$OnCheckedChangeListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class ProfileCollectionsListActivity extends TwitterFragmentActivity implements RadioGroup$OnCheckedChangeListener
{
    private int a;
    private long b;
    private String c;
    private ia d;
    private RadioGroup e;
    private RadioButton f;
    private RadioButton g;
    
    private void a(final hz[] array, final Intent intent, final int n, final int n2, final String s) {
        final Bundle bundle = new Bundle();
        bundle.putInt("shim_size", this.a);
        bundle.putInt("list_type", n);
        array[n2] = new hz(bundle, CollectionsListFragment.class, s);
        ((CollectionsListFragment)array[n2].a(this)).a(intent).h(true);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(0);
        bn.a(false);
        bn.c(2130968647);
        bn.e(true);
        return bn;
    }
    
    public boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951627, toolBar);
        int n;
        if (this.b == this.U().g() && com.twitter.library.featureswitch.d.f("custom_timelines_create_enabled")) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            toolBar.a(2131887414).b(true);
        }
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        if (jx.a() == 2131887414) {
            this.startActivity(new Intent((Context)this, (Class)CollectionCreateEditActivity.class));
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.e = (RadioGroup)this.findViewById(2131887262);
        this.f = (RadioButton)this.findViewById(2131887263);
        this.g = (RadioButton)this.findViewById(2131887264);
        this.setTitle(2131297480);
        this.e.setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)this);
        this.f.setText(2131297481);
        this.g.setText(2131297483);
        if (bundle == null) {
            this.c = "timelines_created";
            this.b = this.getIntent().getLongExtra("user_id", this.U().g());
        }
        else {
            this.c = bundle.getString("state_current_tag");
            this.b = bundle.getLong("user_id");
        }
        if (com.twitter.library.featureswitch.d.f("custom_timelines_follow_enabled")) {
            this.a = this.getResources().getDimensionPixelSize(2131558806);
        }
        else {
            this.e.setVisibility(8);
        }
        if (this.d == null) {
            final hz[] array = new hz[2];
            this.a(array, intent, 0, 0, "timelines_created");
            if (com.twitter.library.featureswitch.d.f("custom_timelines_follow_enabled")) {
                this.a(array, intent, 1, 1, "timelines_following");
            }
            this.d = new ia(this, 2131886241, array);
        }
        this.d.a(this.c);
        if (bundle == null) {
            this.G().a(this.U().g(), "profile", "custom_timeline_list", null, null, "impression");
        }
    }
    
    public void onCheckedChanged(final RadioGroup radioGroup, final int n) {
        if (n == 2131887263) {
            this.d.a(0);
        }
        else if (n == 2131887264) {
            this.d.a(1);
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("user_id", this.b);
        if (this.d != null) {
            bundle.putString("state_current_tag", this.d.a());
        }
    }
}
