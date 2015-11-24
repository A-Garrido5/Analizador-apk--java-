// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.provider.Tweet;
import android.content.SharedPreferences;
import com.twitter.library.api.z;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.ui.dialog.e;
import android.support.v4.app.FragmentManager;
import android.content.Context;

public class bd
{
    public static void a(final Context context, final String s, final int n, final FragmentManager fragmentManager) {
        a(context, s, n, fragmentManager, (e)null);
    }
    
    public static void a(final Context context, final String s, final int n, final FragmentManager fragmentManager, final e e) {
        final PromptDialogFragment j = PromptDialogFragment.b(n).a(context.getString(2131298048, new Object[] { s })).b(context.getString(2131298050, new Object[] { s })).h(2131296376).j(2131296445);
        if (e != null) {
            j.a(e);
        }
        j.a(fragmentManager);
    }
    
    public static boolean a(final Context context, final String s, final int n, final int n2, final FragmentManager fragmentManager, final Fragment fragment) {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        final int int1 = defaultSharedPreferences.getInt("mute_confirm_cnt", 0);
        if (int1 < 3) {
            defaultSharedPreferences.edit().putInt("mute_confirm_cnt", int1 + 1).apply();
            String s2;
            if (z.b(n)) {
                s2 = context.getString(2131297284, new Object[] { s });
            }
            else {
                s2 = context.getString(2131297285, new Object[] { s });
            }
            final PromptDialogFragment j = PromptDialogFragment.b(n2).a(context.getString(2131297287, new Object[] { s })).b(s2).h(2131297286).j(2131296445);
            if (fragment != null) {
                j.setTargetFragment(fragment, 0);
            }
            j.a(fragmentManager);
            return true;
        }
        return false;
    }
    
    public static boolean a(final Context context, final String s, final int n, final FragmentManager fragmentManager, final Fragment fragment) {
        final PromptDialogFragment j = PromptDialogFragment.b(n).b(context.getString(2131298029, new Object[] { s })).h(2131298030).j(2131296445);
        if (fragment != null) {
            j.setTargetFragment(fragment, 0);
        }
        j.a(fragmentManager);
        return true;
    }
    
    public static boolean a(final Tweet tweet) {
        return tweet != null && tweet.m() && !tweet.p() && !tweet.h;
    }
    
    public static boolean a(final Integer n) {
        int intValue;
        if (n == null) {
            intValue = 0;
        }
        else {
            intValue = n;
        }
        return z.d(intValue);
    }
    
    public static void b(final Context context, final String s, final int n, final FragmentManager fragmentManager) {
        b(context, s, n, fragmentManager, null);
    }
    
    public static void b(final Context context, final String s, final int n, final FragmentManager fragmentManager, final e e) {
        final PromptDialogFragment j = PromptDialogFragment.b(n).c(2131298089).b(context.getString(2131298091, new Object[] { s })).h(2131298158).j(2131297303);
        if (e != null) {
            j.a(e);
        }
        j.a(fragmentManager);
    }
}
