// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import android.support.v4.app.Fragment;
import android.content.Intent;
import com.twitter.library.api.TwitterLocation;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.android.client.TwitterFragmentActivity;

public class TrendsLocationsActivity extends TwitterFragmentActivity implements h
{
    private TrendsLocationFragment a;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.b(14);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        this.d(false);
    }
    
    @Override
    public void a(final TwitterLocation twitterLocation) {
        this.setResult(-1, new Intent().putExtra("woeid", twitterLocation.d()).putExtra("loc_name", twitterLocation.a()));
        this.finish();
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        final Fragment fragmentByTag = this.getSupportFragmentManager().findFragmentByTag("trends_location_fragment");
        if (fragmentByTag != null) {
            this.a = (TrendsLocationFragment)fragmentByTag;
        }
        else {
            this.a = new TrendsLocationFragment();
            this.getSupportFragmentManager().beginTransaction().add(2131886241, this.a, "trends_location_fragment").commit();
        }
        this.a.a(this);
    }
    
    @Override
    protected void onDestroy() {
        this.a.a((h)null);
        super.onDestroy();
    }
}
