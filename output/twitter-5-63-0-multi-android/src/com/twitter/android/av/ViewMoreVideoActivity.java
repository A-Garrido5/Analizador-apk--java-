// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.os.Parcelable;
import com.twitter.library.client.d;
import com.twitter.android.kg;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.TwitterFragmentActivity;

public class ViewMoreVideoActivity extends TwitterFragmentActivity
{
    private Tweet a;
    private boolean b;
    private TwitterScribeAssociation c;
    
    private void h() {
        final Session b = az.a((Context)this).b();
        final String a = TwitterScribeLog.a(this.c, null, null, "impression");
        String s;
        if (this.getResources().getConfiguration().orientation == 2) {
            s = "2";
        }
        else {
            s = "1";
        }
        final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(b.g());
        twitterScribeLog.b(new String[] { a });
        twitterScribeLog.i(s);
        ScribeService.a((Context)this, twitterScribeLog);
        this.b = true;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968590);
        bn.d(!kg.a((Context)this));
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        (this.c = new TwitterScribeAssociation()).b("video_timeline");
        this.a = (Tweet)this.getIntent().getParcelableExtra("tw");
        final long longExtra = this.getIntent().getLongExtra("search_id", -1L);
        if (this.a != null && longExtra != -1L) {
            this.setTitle(this.a.a());
            this.b(this.getString(2131298119));
            if (bundle == null) {
                final Bundle arguments = new Bundle();
                arguments.putLong("search_id", longExtra);
                arguments.putParcelable("tw", (Parcelable)this.a);
                arguments.putParcelable("association", (Parcelable)this.c);
                final ViewMoreVideoFragment viewMoreVideoFragment = new ViewMoreVideoFragment();
                viewMoreVideoFragment.i(!kg.a((Context)this));
                viewMoreVideoFragment.setArguments(arguments);
                this.getSupportFragmentManager().beginTransaction().replace(2131886241, viewMoreVideoFragment, ViewMoreVideoFragment.class.getName()).commit();
            }
            else {
                this.b = bundle.getBoolean("scribe_event_sent", false);
            }
            if (!this.b) {
                this.h();
            }
            return;
        }
        Toast.makeText((Context)this, (CharSequence)this.getString(2131298118), 1).show();
        this.finish();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("scribe_event_sent", this.b);
    }
}
