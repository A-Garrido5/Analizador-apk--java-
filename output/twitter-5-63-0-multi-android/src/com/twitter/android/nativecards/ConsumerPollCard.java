// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.view.View;
import android.os.Bundle;
import java.text.ParseException;
import com.twitter.android.card.h;
import android.content.Context;
import com.twitter.android.card.v;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import com.twitter.library.client.az;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import android.widget.TextView;
import com.twitter.ui.widget.TwitterButton;
import android.widget.LinearLayout;
import java.text.DateFormat;
import android.view.View$OnClickListener;

public final class ConsumerPollCard extends j implements View$OnClickListener, uz, vy
{
    private static final DateFormat a;
    private final long b;
    private final ConsumerPollCard$Configuration c;
    private final LinearLayout d;
    private final TwitterButton e;
    private final TwitterButton f;
    private final TextView g;
    private long h;
    private String i;
    private vx j;
    private ConsumerPollCard$PollChoice k;
    private boolean l;
    private Date m;
    private String n;
    
    static {
        (a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)).setTimeZone(TimeZone.getTimeZone("UTC"));
    }
    
    public ConsumerPollCard(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g, final ConsumerPollCard$Configuration c) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.k = ConsumerPollCard$PollChoice.a;
        this.b = az.a(this.y).b().g();
        this.c = c;
        this.d = (LinearLayout)LayoutInflater.from(this.y).inflate(c.layoutId, (ViewGroup)new FrameLayout(this.y), false);
        this.e = (TwitterButton)this.d.findViewById(2131886989);
        this.f = (TwitterButton)this.d.findViewById(2131886990);
        this.g = (TextView)this.d.findViewById(2131886991);
    }
    
    public ConsumerPollCard(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final ConsumerPollCard$Configuration consumerPollCard$Configuration) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity), consumerPollCard$Configuration);
    }
    
    private void a(final ConsumerPollCard$PollChoice consumerPollCard$PollChoice) {
        if (consumerPollCard$PollChoice != ConsumerPollCard$PollChoice.a && this.j != null && this.i != null) {
            final ul ul = new ul();
            ul.a("tweet_id", Long.toString(this.h));
            ul.a("selected_choice", Integer.toString(ConsumerPollCard$PollChoice.a(consumerPollCard$PollChoice)));
            this.j.a(this.i, ul);
        }
    }
    
    private void a(final ConsumerPollCard$PollChoice consumerPollCard$PollChoice, final boolean b) {
        String text;
        if (consumerPollCard$PollChoice == ConsumerPollCard$PollChoice.a) {
            if (b) {
                text = "open";
            }
            else {
                text = "closed";
            }
        }
        else {
            text = "voted";
        }
        this.g.setText((CharSequence)text);
    }
    
    private void b(final ConsumerPollCard$PollChoice consumerPollCard$PollChoice) {
        TwitterButton twitterButton;
        if (consumerPollCard$PollChoice == ConsumerPollCard$PollChoice.b) {
            twitterButton = this.e;
        }
        else {
            if (consumerPollCard$PollChoice != ConsumerPollCard$PollChoice.c) {
                throw new IllegalArgumentException(String.format("Invalid poll choice: %s", consumerPollCard$PollChoice));
            }
            twitterButton = this.f;
        }
        if (!twitterButton.getText().toString().endsWith(" \u2713")) {
            twitterButton.setText((CharSequence)((Object)twitterButton.getText() + " \u2713"));
        }
        this.e();
    }
    
    private void b(final ConsumerPollCard$PollChoice consumerPollCard$PollChoice, final boolean b) {
        if (!b) {
            this.e();
        }
        if (consumerPollCard$PollChoice != ConsumerPollCard$PollChoice.a) {
            this.b(consumerPollCard$PollChoice);
        }
        this.a(consumerPollCard$PollChoice, b);
    }
    
    private void e() {
        this.e.setEnabled(false);
        this.f.setEnabled(false);
    }
    
    public void a() {
    }
    
    public void a(final long n, final vc vc) {
        boolean l = true;
        if (this.e != null) {
            final String a = wb.a("choice1_label", vc);
            if (a != null) {
                this.e.setText((CharSequence)a);
                this.e.setOnClickListener((View$OnClickListener)this);
            }
        }
        if (this.f != null) {
            final String a2 = wb.a("choice2_label", vc);
            if (a2 != null) {
                this.f.setText((CharSequence)a2);
                this.f.setOnClickListener((View$OnClickListener)this);
            }
        }
        if (this.i == null) {
            this.i = wb.a("api", vc);
        }
        if (this.m != null) {
            return;
        }
        final String a3 = wb.a("end_datetime_utc", vc);
        Label_0175: {
            if (a3 == null) {
                break Label_0175;
            }
        Label_0169_Outer:
            while (true) {
                while (true) {
                Label_0207:
                    while (true) {
                        try {
                            this.m = ConsumerPollCard.a.parse(a3);
                            if (this.m != null) {
                                if (!Boolean.valueOf(l).equals(up.a("is_open_for_votes", vc)) || System.currentTimeMillis() >= this.m.getTime()) {
                                    break Label_0207;
                                }
                                this.l = l;
                            }
                            this.b(this.k, this.l);
                            return;
                        }
                        catch (ParseException ex) {
                            System.console().writer().println(ex.toString());
                            continue Label_0169_Outer;
                        }
                        break;
                    }
                    l = false;
                    continue;
                }
            }
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        uy.a().b(this.h, this);
        if (this.j != null) {
            this.j.c();
            this.j.b();
        }
        if (this.n != null && this.k != ConsumerPollCard$PollChoice.a) {
            bundle.putInt(this.n, ConsumerPollCard$PollChoice.a(this.k));
        }
    }
    
    public void a(final vc vc) {
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.h = vq.b;
        if (this.j == null) {
            this.j = new vx(us.a(), us.a().a(this.y), this.h, this);
        }
        this.j.a();
        uy.a().a(this.h, this);
        this.n = String.format("consumerpollcard_choice_%d_%d", this.b, this.h);
        if (bundle != null) {
            this.k = ConsumerPollCard$PollChoice.a(bundle.getInt(this.n, ConsumerPollCard$PollChoice.a.ordinal));
        }
        this.b(this.k, this.l);
    }
    
    public View d() {
        return (View)this.d;
    }
    
    public void onClick(final View view) {
        if (this.l && this.k == ConsumerPollCard$PollChoice.a) {
            ConsumerPollCard$PollChoice k;
            if (view == this.e) {
                k = ConsumerPollCard$PollChoice.b;
            }
            else if (view == this.f) {
                k = ConsumerPollCard$PollChoice.c;
            }
            else {
                k = ConsumerPollCard$PollChoice.a;
            }
            if (k != ConsumerPollCard$PollChoice.a) {
                this.a(this.k = k);
                this.b(k);
                this.a(k, this.l);
            }
        }
    }
}
