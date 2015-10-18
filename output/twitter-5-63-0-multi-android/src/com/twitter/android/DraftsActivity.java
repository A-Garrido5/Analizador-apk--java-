// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.Fragment;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.provider.DraftTweet;
import android.content.Intent;
import android.content.Context;
import com.twitter.android.client.TwitterFragmentActivity;

public class DraftsActivity extends TwitterFragmentActivity
{
    public static Intent a(final Context context, final boolean b) {
        return a(context, b, null, 0L);
    }
    
    public static Intent a(final Context context, final boolean b, final String s, final long n) {
        return new Intent(context, (Class)DraftsActivity.class).putExtra("start_composer", b).putExtra("account_name", s).putExtra("excluded_draft_id", n);
    }
    
    public static DraftTweet a(final Intent intent) {
        return (DraftTweet)intent.getSerializableExtra("selected_draft");
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.a(0);
        bn.a(false);
        return bn;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        this.setTitle(2131296898);
        if (bundle == null) {
            final DraftsFragment draftsFragment = new DraftsFragment();
            draftsFragment.setArguments(TwitterListFragment.a(this.getIntent(), false));
            this.getSupportFragmentManager().beginTransaction().add(2131886241, draftsFragment).commit();
        }
    }
}
