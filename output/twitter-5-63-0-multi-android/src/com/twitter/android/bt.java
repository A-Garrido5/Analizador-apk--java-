// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import com.twitter.library.client.r;
import com.twitter.library.network.ae;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.provider.ad;
import com.twitter.android.client.TwitterFragmentActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
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
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.provider.Tweet;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;
import android.os.Handler;
import com.twitter.android.card.z;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View$OnClickListener;

class bt implements View$OnClickListener
{
    final /* synthetic */ CardPreviewerFragment a;
    
    bt(final CardPreviewerFragment a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.b();
    }
}
