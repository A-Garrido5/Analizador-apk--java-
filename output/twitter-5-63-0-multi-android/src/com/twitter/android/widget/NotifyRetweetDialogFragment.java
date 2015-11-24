// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import com.twitter.library.provider.Tweet;

public class NotifyRetweetDialogFragment extends RetweetDialogFragment
{
    public static NotifyRetweetDialogFragment a(final int n, final long n2, final Tweet tweet, final boolean b, final boolean b2, final Intent intent, final Context context) {
        final NotifyRetweetDialogFragment notifyRetweetDialogFragment = new NotifyRetweetDialogFragment();
        RetweetDialogFragment.a(n, n2, tweet, b, b2, notifyRetweetDialogFragment, context);
        notifyRetweetDialogFragment.getArguments().putParcelable("retweet_service_intent", (Parcelable)intent);
        return notifyRetweetDialogFragment;
    }
    
    @Override
    protected void a(final long n, final Tweet tweet, final boolean b) {
        this.getActivity().startService((Intent)this.getArguments().getParcelable("retweet_service_intent"));
        this.a(0, n, tweet, b);
    }
}
