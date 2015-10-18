// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import com.twitter.android.moments.viewmodels.MomentTweetPage;
import com.twitter.android.moments.ui.sectionpager.d;
import com.twitter.android.moments.viewmodels.MomentPage;
import com.twitter.android.moments.viewmodels.Capsule;
import android.view.LayoutInflater;
import android.content.Context;

class j
{
    public static d a(final Context context, final LayoutInflater layoutInflater, final Capsule capsule, final MomentPage momentPage) {
        if (momentPage.c()) {
            return new l(context, capsule);
        }
        final MomentTweetPage momentTweetPage = (MomentTweetPage)momentPage;
        switch (k.a[momentTweetPage.b().ordinal()]) {
            default: {
                return new m(context);
            }
            case 1: {
                return new n(context, layoutInflater, momentTweetPage, null);
            }
        }
    }
}
