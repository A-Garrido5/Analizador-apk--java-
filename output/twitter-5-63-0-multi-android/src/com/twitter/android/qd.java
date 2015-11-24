// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import com.twitter.ui.dialog.b;
import com.twitter.ui.dialog.d;
import com.twitter.android.widget.RetweetDialogFragment;
import android.content.Context;
import com.twitter.library.client.az;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;
import com.twitter.library.provider.Tweet;

public class qd
{
    public static void a(final int n, final Tweet tweet, final boolean b, final Fragment fragment, final qg qg, final FragmentActivity fragmentActivity) {
        final RetweetDialogFragment a = RetweetDialogFragment.a(n, az.a((Context)fragmentActivity).b().g(), tweet, tweet.h, b, (Context)fragmentActivity);
        if (fragment != null) {
            a.setTargetFragment(fragment, 0);
        }
        if (qg != null) {
            a.a(qg);
        }
        a.a(fragmentActivity.getSupportFragmentManager());
    }
    
    public static void b(final int n, final Tweet tweet, final boolean b, final Fragment fragment, final qg qg, final FragmentActivity fragmentActivity) {
        final FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        final FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        if (supportFragmentManager.findFragmentByTag("retweet_confirm_fragment") == null) {
            final RetweetDialogFragment a = RetweetDialogFragment.a(n, az.a((Context)fragmentActivity).b().g(), tweet, false, b, (Context)fragmentActivity);
            beginTransaction.add(a, "retweet_confirm_fragment");
            if (fragment != null) {
                a.setTargetFragment(fragment, 0);
            }
            if (qg != null) {
                a.a(qg);
            }
            a.a(new qe(fragmentActivity));
            a.a(new qf(fragmentActivity));
        }
        beginTransaction.commitAllowingStateLoss();
    }
}
