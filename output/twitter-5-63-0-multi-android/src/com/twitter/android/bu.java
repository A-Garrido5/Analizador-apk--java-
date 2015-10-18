// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.twitter.library.client.r;
import com.twitter.library.network.ae;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.provider.ad;
import com.twitter.android.client.TwitterFragmentActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.twitter.library.client.Session;
import com.twitter.library.card.element.d;
import com.twitter.library.client.k;
import com.twitter.library.client.az;
import android.text.TextUtils;
import com.twitter.library.card.j;
import com.twitter.library.card.CardDebugLog;
import com.twitter.library.card.Card;
import com.twitter.android.card.a;
import com.twitter.android.card.y;
import com.twitter.android.card.w;
import com.twitter.internal.network.l;
import android.widget.Toast;
import com.twitter.library.provider.Tweet;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.os.Handler;
import com.twitter.android.card.z;
import android.support.v4.app.Fragment;
import android.view.animation.Animation;
import android.support.v4.app.FragmentActivity;
import android.content.Context;
import android.view.animation.AnimationUtils;

class bu implements Runnable
{
    final /* synthetic */ String a;
    final /* synthetic */ CardPreviewerFragment b;
    
    bu(final CardPreviewerFragment b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.d.setText((CharSequence)this.a);
        final FragmentActivity activity = this.b.getActivity();
        if (activity != null) {
            final Animation loadAnimation = AnimationUtils.loadAnimation((Context)activity, 2131034141);
            loadAnimation.setDuration(250L);
            this.b.d.setAnimation(loadAnimation);
        }
        this.b.d.setVisibility(0);
    }
}
