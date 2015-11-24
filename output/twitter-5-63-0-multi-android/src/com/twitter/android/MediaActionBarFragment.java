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
import android.content.Context;
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

public class MediaActionBarFragment extends Fragment implements View$OnClickListener, qg
{
    private c a;
    private EngagementActionBar b;
    private ToggleImageButton c;
    private TextView d;
    private ToggleImageButton e;
    private TextView f;
    private TwitterScribeAssociation g;
    private az h;
    private Tweet i;
    private String j;
    private String k;
    private String l;
    private TwitterScribeItem m;
    private Context n;
    private boolean o;
    private as p;
    
    protected static Dialog a(final TwitterFragmentActivity twitterFragmentActivity, final long n, final int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 1: {
                return (Dialog)new AlertDialog$Builder((Context)twitterFragmentActivity).setTitle((CharSequence)twitterFragmentActivity.getString(2131297994)).setMessage((CharSequence)twitterFragmentActivity.getString(2131297993)).setPositiveButton((CharSequence)twitterFragmentActivity.getString(2131298158), (DialogInterface$OnClickListener)new lw(twitterFragmentActivity, n)).setNegativeButton((CharSequence)twitterFragmentActivity.getString(2131297303), (DialogInterface$OnClickListener)null).create();
            }
        }
    }
    
    public static MediaActionBarFragment a(final TwitterFragmentActivity twitterFragmentActivity, final int n, final TwitterScribeAssociation twitterScribeAssociation, final String s, final String s2, final String s3) {
        MediaActionBarFragment mediaActionBarFragment = (MediaActionBarFragment)twitterFragmentActivity.getSupportFragmentManager().findFragmentById(n);
        if (mediaActionBarFragment == null) {
            mediaActionBarFragment = new MediaActionBarFragment();
            final Bundle arguments = new Bundle();
            arguments.putParcelable("association", (Parcelable)twitterScribeAssociation);
            arguments.putString("page", s);
            arguments.putString("section", s2);
            arguments.putString("component", s3);
            mediaActionBarFragment.setArguments(arguments);
            twitterFragmentActivity.getSupportFragmentManager().beginTransaction().add(n, mediaActionBarFragment).commit();
        }
        return mediaActionBarFragment;
    }
    
    private void a(final int n, final FragmentActivity fragmentActivity, final Tweet tweet) {
        int n2 = 0;
        switch (n) {
            default: {
                return;
            }
            case 2131886228: {
                n2 = 3;
                break;
            }
            case 2131886230: {
                n2 = 1;
                this.c.a();
                break;
            }
            case 2131886229: {
                n2 = 2;
                break;
            }
            case 2131886231: {
                bq.a((Context)fragmentActivity, tweet, false);
                this.a("share", tweet);
                return;
            }
        }
        kg.a(fragmentActivity, n2, tweet.a());
    }
    
    private void a(final Tweet tweet, final boolean e, final int t) {
        tweet.e = e;
        tweet.t = t;
        this.a(tweet);
    }
    
    private void a(final String s, final Tweet tweet) {
        this.a.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.h.b().g()).a(this.n, tweet, this.g, null).b(new String[] { ScribeLog.a(this.j, this.k, this.l, "tweet", s) })).a(this.g)).a(this.m));
    }
    
    private void b(final Tweet tweet) {
        int n = 2131689637;
        final Resources resources = this.getResources();
        final int t = tweet.t;
        final int p = tweet.p;
        final TextView d = this.d;
        String b;
        if (t > 0) {
            b = aj.b(resources, t);
        }
        else {
            b = "";
        }
        d.setText((CharSequence)b);
        final TextView d2 = this.d;
        int n2;
        if (tweet.e) {
            n2 = 2131689548;
        }
        else {
            n2 = n;
        }
        d2.setTextColor(resources.getColor(n2));
        final TextView f = this.f;
        String b2;
        if (p > 0) {
            b2 = aj.b(resources, p);
        }
        else {
            b2 = "";
        }
        f.setText((CharSequence)b2);
        final TextView f2 = this.f;
        if (tweet.h) {
            n = 2131689607;
        }
        f2.setTextColor(resources.getColor(n));
    }
    
    private static void b(final boolean b, final boolean b2, final Context context, final boolean b3) {
        if (!b && !b3) {
            int n;
            if (b2) {
                n = 2131297995;
            }
            else {
                n = 2131298005;
            }
            Toast.makeText(context, n, 1).show();
        }
    }
    
    private void c(final Tweet tweet) {
        if (tweet.e) {
            this.a(tweet, false);
            this.p.a(new l(this.n, this.h.b(), tweet.D).a(tweet.j), new lu(this, this.n, tweet));
            this.a("unfavorite", tweet);
            return;
        }
        this.a(tweet, true);
        this.p.a(new f(this.n, this.h.b(), tweet.D, tweet.E).a(tweet.j), new lv(this, this.n, tweet));
        this.a("favorite", tweet);
    }
    
    public void a() {
    }
    
    public void a(final long n, final Tweet tweet, final boolean b) {
        if (this.isAdded()) {
            if (!b) {
                this.a("retweet", this.i);
                this.e.setToggledOn(true);
                this.i.g = true;
                return;
            }
            this.a("unretweet", this.i);
            this.e.setToggledOn(false);
            this.i.g = false;
        }
    }
    
    public void a(final long n, final boolean b, final boolean b2, final boolean b3) {
        b(b, b2, this.n, b3);
    }
    
    public void a(final Tweet tweet) {
        this.i = tweet;
        this.b.setTweet(tweet);
        this.b.setOnClickListener((View$OnClickListener)this);
        this.b(tweet);
    }
    
    void a(final Tweet tweet, final boolean b) {
        if (b) {
            this.a(tweet, true, 1 + tweet.t);
            return;
        }
        this.a(tweet, false, Math.max(-1 + tweet.t, 0));
    }
    
    public void b(final long n, final Tweet tweet, final boolean b) {
        this.a("quote", this.i);
    }
    
    public void c(final long n, final Tweet tweet, final boolean b) {
        this.a.a(this.h.b().g(), this.j, this.k, "retweet_dialog::dismiss");
    }
    
    public void d(final long n, final Tweet tweet, final boolean b) {
        if (!this.o) {
            this.a.a(this.h.b().g(), this.j, this.k, "retweet_dialog::impression");
            this.o = true;
        }
    }
    
    public void onClick(final View view) {
        final Tweet i = this.i;
        final int id = view.getId();
        final TwitterFragmentActivity twitterFragmentActivity = (TwitterFragmentActivity)this.getActivity();
        final Session b = this.h.b();
        if (kg.a((Context)this.getActivity())) {
            this.a(id, twitterFragmentActivity, i);
        }
        else {
            if (id == 2131886228) {
                au.a((Context)twitterFragmentActivity).a(i).a(b.e()).b((Context)twitterFragmentActivity);
                this.a("reply", i);
                return;
            }
            if (id == 2131886230) {
                this.c(i);
                return;
            }
            if (id == 2131886229) {
                qd.a(0, i, false, this, this, twitterFragmentActivity);
                return;
            }
            if (id == 2131886231) {
                bq.a((Context)twitterFragmentActivity, i, true);
                this.a("share", i);
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final FragmentActivity activity = this.getActivity();
        this.n = ((Context)activity).getApplicationContext();
        this.a = com.twitter.android.client.c.a((Context)activity);
        this.h = az.a((Context)activity);
        this.p = as.a((Context)activity);
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            this.j = com.twitter.util.k.a(arguments.getString("page"));
            this.k = com.twitter.util.k.a(arguments.getString("section"));
            this.l = com.twitter.util.k.a(arguments.getString("component"));
            this.g = (TwitterScribeAssociation)arguments.getParcelable("association");
            this.m = (TwitterScribeItem)arguments.getParcelable("item");
        }
        if (bundle != null) {
            this.o = bundle.getBoolean("dialog_impression_scribed");
        }
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return layoutInflater.inflate(2130968871, viewGroup, false);
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("dialog_impression_scribed", this.o);
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.b = (EngagementActionBar)view.findViewById(2131886227);
        this.c = (ToggleImageButton)view.findViewById(2131886230);
        this.d = (TextView)view.findViewById(2131886883);
        this.e = (ToggleImageButton)view.findViewById(2131886229);
        this.f = (TextView)view.findViewById(2131886882);
        if (this.i != null) {
            this.a(this.i);
        }
    }
}
