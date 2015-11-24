// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.util.k;
import com.twitter.library.client.Session;
import com.twitter.android.composer.au;
import android.view.View;
import com.twitter.library.api.timeline.f;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.l;
import android.widget.Toast;
import android.content.res.Resources;
import com.twitter.library.util.aj;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.util.bq;
import android.support.v4.app.FragmentActivity;
import android.os.Parcelable;
import android.os.Bundle;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.client.as;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.widget.TextView;
import com.twitter.android.widget.ToggleImageButton;
import com.twitter.android.widget.EngagementActionBar;
import com.twitter.android.client.c;
import android.view.View$OnClickListener;
import android.support.v4.app.Fragment;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.timeline.g;

class lv extends g
{
    final /* synthetic */ Tweet a;
    final /* synthetic */ MediaActionBarFragment b;
    
    lv(final MediaActionBarFragment b, final Context context, final Tweet a) {
        this.b = b;
        this.a = a;
        super(context);
    }
    
    @Override
    protected void a(final long n, final boolean b, final int n2) {
        if (this.b.isAdded()) {
            this.b.a(this.a, b, n2);
        }
    }
}
