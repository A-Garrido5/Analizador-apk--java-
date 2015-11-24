// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import com.twitter.library.util.bq;
import java.io.Serializable;
import android.support.v4.app.Fragment;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.dialog.TakeoverDialogFragment;

public class ShareTweetEmptyOverlay extends TakeoverDialogFragment
{
    public static void a(final QuotedTweetData quotedTweetData, final Fragment fragment) {
        ((ShareTweetEmptyOverlay)((ShareTweetEmptyOverlay)TakeoverDialogFragment.a(ShareTweetEmptyOverlay.class)).a(quotedTweetData).c(2131297795).d(2131297794).b(2130839196)).a(fragment);
    }
    
    public ShareTweetEmptyOverlay a(final QuotedTweetData quotedTweetData) {
        this.getArguments().putSerializable("quoted_tweet", (Serializable)quotedTweetData);
        return this;
    }
    
    @Override
    protected void a() {
        super.a();
        this.a(new String[] { "messages:share_tweet_no_followers::impression" });
    }
    
    @Override
    protected void b() {
        super.b();
        this.getActivity().finish();
        this.a(new String[] { "messages:share_tweet_no_followers::cancel" });
    }
    
    @Override
    protected void c() {
        super.c();
        bq.a((Context)this.getActivity(), (QuotedTweetData)this.getArguments().getSerializable("quoted_tweet"), false);
        this.a(new String[] { "messages:share_tweet_no_followers::share_tweet" });
    }
}
