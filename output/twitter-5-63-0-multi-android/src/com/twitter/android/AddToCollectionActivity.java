// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import android.content.Context;
import com.twitter.library.featureswitch.d;
import com.twitter.internal.android.widget.ToolBar;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.RadioGroup;
import com.twitter.android.client.TwitterFragmentActivity;

public class AddToCollectionActivity extends TwitterFragmentActivity implements ci
{
    private RadioGroup a;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(0);
        bn.a(false);
        bn.c(2130968647);
        return bn;
    }
    
    @Override
    public void a(final String s) {
        this.setResult(-1, new Intent().putExtra("result_timeline_id", s));
        this.finish();
    }
    
    public boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951627, toolBar);
        if (com.twitter.library.featureswitch.d.f("custom_timelines_create_enabled")) {
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
        this.setTitle(2131297480);
        (this.a = (RadioGroup)this.findViewById(2131887262)).setVisibility(8);
        if (bundle == null) {
            final Intent intent = this.getIntent();
            final CollectionsListFragment collectionsListFragment = new CollectionsListFragment();
            intent.putExtra("list_type", 0);
            intent.putExtra("chmode", 1);
            collectionsListFragment.a(intent).h(true);
            collectionsListFragment.a(this);
            this.getSupportFragmentManager().beginTransaction().add(2131886241, collectionsListFragment).commit();
            this.G().a(this.U().g(), "tweet", "custom_timeline_list", null, null, "impression");
        }
    }
}
