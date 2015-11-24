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
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.aa;
import com.twitter.library.widget.UserView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.api.account.h;
import android.content.Intent;
import android.widget.ListAdapter;
import com.twitter.library.api.account.LoginVerificationRequest;
import android.widget.Toast;
import com.twitter.android.client.c;
import com.twitter.android.widget.PromptDialogFragment;
import android.widget.ArrayAdapter;
import android.app.ProgressDialog;
import android.text.style.StyleSpan;
import com.twitter.library.client.Session;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.library.service.y;
import com.twitter.library.api.account.v;
import com.twitter.library.api.account.p;
import com.twitter.library.api.account.q;
import android.content.Context;
import android.os.AsyncTask;

class kv extends AsyncTask
{
    final /* synthetic */ LoginVerificationFragment a;
    private final Context b;
    private final String c;
    private final String d;
    private final String e;
    
    public kv(final LoginVerificationFragment a, final Context context, final String c, final String d, final String e) {
        this.a = a;
        this.b = context.getApplicationContext();
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public q a(final Void... array) {
        return p.a(this.b, this.c, this.d, this.e);
    }
    
    public void a(final q q) {
        if (q == null) {
            this.a.e();
            this.a.aw().a(this.a.a.g(), "login_verification::request:reject:error");
            this.a.f(this.c);
            return;
        }
        this.a.a(new v((Context)this.a.getActivity(), this.a.a, q), 2, 0);
    }
    
    protected void onPreExecute() {
        this.a.a(this.a.getString(2131297225));
    }
}
