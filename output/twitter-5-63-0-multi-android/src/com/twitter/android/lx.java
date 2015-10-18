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
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.az;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.widget.TextView;
import com.twitter.android.widget.ToggleImageButton;
import com.twitter.android.widget.EngagementActionBar;
import com.twitter.android.client.c;
import android.view.View$OnClickListener;
import android.support.v4.app.Fragment;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.service.z;

class lx extends z
{
    final /* synthetic */ Context a;
    final /* synthetic */ lw b;
    
    lx(final lw b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        b(((aa)y.l().b()).a(), true, this.a, y.isCancelled());
    }
    
    @Override
    public void b(final y y) {
    }
}
