// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.app.Activity;
import java.io.Serializable;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.android.DMActivity;
import android.content.Intent;
import com.twitter.android.MainActivity;
import com.twitter.android.composer.au;
import com.twitter.library.api.ar;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import android.os.Bundle;
import java.util.ArrayList;
import com.twitter.library.featureswitch.d;
import android.os.Parcelable;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import com.twitter.android.qg;

public class RetweetDialogFragment extends PromptDialogFragment
{
    private qg a;
    
    public static RetweetDialogFragment a(final int n, final long n2, final Tweet tweet, final boolean b, final boolean b2, final Context context) {
        final RetweetDialogFragment retweetDialogFragment = new RetweetDialogFragment();
        a(n, n2, tweet, b, b2, retweetDialogFragment, context);
        return retweetDialogFragment;
    }
    
    protected static void a(final int n, final long n2, final Tweet tweet, final boolean b, final boolean b2, final RetweetDialogFragment retweetDialogFragment, final Context context) {
        int n3 = 2131298004;
        retweetDialogFragment.d_(n);
        final Bundle arguments = retweetDialogFragment.getArguments();
        arguments.putBoolean("undo", b);
        arguments.putParcelable("tweet", (Parcelable)tweet);
        arguments.putLong("user_id", n2);
        arguments.putBoolean("add_main", b2);
        if (d.a("rtwc_compose_android_2874", "blocking_tweet", "not_blocking_tweet")) {
            final ArrayList<String> list = new ArrayList<String>(3);
            final ArrayList<Integer> list2 = new ArrayList<Integer>(3);
            if (b) {
                n3 = 2131298017;
            }
            list.add(context.getString(n3));
            list2.add(0);
            if (!b) {
                list.add(context.getString(2131297506));
                list2.add(1);
            }
            retweetDialogFragment.a(list.toArray(new CharSequence[list.size()]));
            arguments.putIntegerArrayList("actions", (ArrayList)list2);
            return;
        }
        int n4;
        int n5;
        if (b) {
            n4 = 2131298025;
            n5 = 2131298016;
        }
        else {
            n4 = 2131297565;
            n5 = n3;
        }
        retweetDialogFragment.c(n3).i(2131297505).j(2131296445).h(n5).d(n4);
    }
    
    protected void a(final int n, final long n2, final Tweet tweet, final boolean b) {
        final qg a = this.a;
        if (a == null) {
            return;
        }
        switch (n) {
            default: {}
            case 0: {
                a.a(n2, tweet, b);
            }
            case 1: {
                a.b(n2, tweet, b);
            }
            case 2: {
                a.c(n2, tweet, b);
            }
            case 3: {
                a.d(n2, tweet, b);
            }
            case 4: {
                a.a();
            }
        }
    }
    
    protected void a(final long n, final Tweet tweet, final boolean b) {
        final FragmentActivity activity = this.getActivity();
        final Session b2 = az.a((Context)activity).b(n);
        ar ar;
        if (b) {
            ar = new ol((Context)activity, b2, tweet.D, tweet.H, tweet.m());
        }
        else {
            long e;
            if (tweet.f != b2.g()) {
                e = tweet.E;
            }
            else {
                e = 0L;
            }
            ar = new oq((Context)activity, b2, tweet.D, e, tweet.j);
        }
        as.a((Context)activity).a(ar, new es((Context)activity, n, tweet, b, this.a));
    }
    
    protected void a(final long n, final Tweet tweet, final boolean b, final boolean b2) {
        final FragmentActivity activity = this.getActivity();
        final String e = az.a((Context)activity).b(n).e();
        final Intent p4 = au.a((Context)activity).a(e).b(tweet).a(tweet.j).p();
        if (b2) {
            MainActivity.a(p4, (Context)activity, e);
        }
        else {
            ((Context)activity).startActivity(p4);
        }
        this.a(1, n, tweet, b);
    }
    
    public void a(final qg a) {
        this.a = a;
    }
    
    protected void b(final long n, final Tweet tweet, final boolean b) {
        final FragmentActivity activity = this.getActivity();
        ((Context)activity).startActivity(new Intent((Context)activity, (Class)DMActivity.class).putExtra("quoted_tweet", (Serializable)new QuotedTweetData(tweet)));
        this.a(4, n, tweet, b);
    }
    
    protected void k(final int n) {
        if (this.a == null) {
            return;
        }
        final Bundle arguments = this.getArguments();
        this.a(n, arguments.getLong("user_id"), (Tweet)arguments.getParcelable("tweet"), arguments.getBoolean("undo"));
    }
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        if (this.a == null) {
            final Fragment targetFragment = this.getTargetFragment();
            if (targetFragment != null) {
                if (targetFragment instanceof qg) {
                    this.a = (qg)targetFragment;
                }
            }
            else if (activity instanceof qg) {
                this.a = (qg)activity;
            }
        }
        this.k(3);
    }
    
    @Override
    public void onCancel(final DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.k(2);
    }
    
    @Override
    public void onClick(final DialogInterface dialogInterface, int intValue) {
        final Bundle arguments = this.getArguments();
        final long long1 = arguments.getLong("user_id");
        final Tweet tweet = (Tweet)arguments.getParcelable("tweet");
        final boolean boolean1 = arguments.getBoolean("undo");
        final ArrayList integerArrayList = arguments.getIntegerArrayList("actions");
        if (integerArrayList != null) {
            intValue = (int)integerArrayList.get(intValue);
        }
        switch (intValue) {
            default: {}
            case -1:
            case 0: {
                this.a(long1, tweet, boolean1);
            }
            case -3:
            case 1: {
                this.a(long1, tweet, boolean1, arguments.getBoolean("add_main", false));
            }
            case -2: {
                this.a(2, long1, tweet, boolean1);
            }
            case 4: {
                this.b(long1, tweet, boolean1);
            }
        }
    }
}
