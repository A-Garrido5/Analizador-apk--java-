// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Arrays;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import java.util.ArrayList;
import com.twitter.library.api.account.a;
import com.twitter.library.api.account.v;
import com.twitter.library.service.aa;
import com.twitter.library.widget.UserView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.library.api.account.h;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.api.account.p;
import android.widget.ListAdapter;
import android.widget.Toast;
import com.twitter.android.client.c;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.service.y;
import android.widget.ArrayAdapter;
import android.app.ProgressDialog;
import android.text.style.StyleSpan;
import com.twitter.library.client.Session;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.View;
import com.twitter.library.api.account.LoginVerificationRequest;
import android.view.View$OnClickListener;

class ky implements View$OnClickListener
{
    final /* synthetic */ LoginVerificationRequest a;
    final /* synthetic */ kw b;
    
    ky(final kw b, final LoginVerificationRequest a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.b.a.a.g()).b(new String[] { "login_verification::request:reject:click" });
        twitterScribeLog.a(TwitterScribeItem.b(this.a.b));
        this.b.a.aw().a(twitterScribeLog);
        new kv(this.b.a, this.b.a.getActivity().getApplicationContext(), this.a.g, this.a.b, this.a.c).execute((Object[])new Void[0]);
    }
}
