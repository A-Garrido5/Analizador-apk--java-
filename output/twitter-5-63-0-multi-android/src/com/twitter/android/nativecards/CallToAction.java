// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.view.View;
import android.content.res.Resources;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.Session;
import com.twitter.library.client.az;
import android.text.TextUtils;
import com.twitter.library.api.PromotedEvent;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.android.card.t;
import com.twitter.android.card.g;
import com.twitter.library.provider.Tweet;
import android.view.View$OnClickListener;
import com.twitter.ui.widget.TwitterButton;

public class CallToAction extends TwitterButton implements View$OnClickListener
{
    CallToAction$State a;
    private Tweet b;
    private String c;
    private g d;
    private t e;
    private um f;
    private String g;
    private String h;
    
    public CallToAction(final Context context) {
        this(context, null);
    }
    
    public CallToAction(final Context context, final AttributeSet set) {
        this(context, set, 2130772605);
    }
    
    public CallToAction(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = CallToAction$State.a;
        this.setOnClickListener((View$OnClickListener)this);
    }
    
    private void a() {
        this.e.a("open_app", this.c);
        this.e.a(PromotedEvent.q);
        this.d.a(this.f, this.g);
    }
    
    private void a(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.e.a("open_link", this.c);
            if (!this.b.h()) {
                this.d.a(this.e.a(), this.b, s);
                return;
            }
            final Session b = az.a(this.getContext().getApplicationContext()).b();
            if (b != null) {
                this.e.b(s);
                this.d.a(b, this.b, s, false);
            }
        }
    }
    
    private void getApp() {
        this.e.a("install_app", this.c);
        this.e.a(PromotedEvent.r);
        if (this.d.b(this.g)) {
            this.e.a("open_link", this.c);
        }
        if (com.twitter.library.featureswitch.d.f("post_installed_logging_enabled")) {
            this.e.e(this.g, this.c);
        }
    }
    
    public void a(final um f, final String g, final String s, final String s2, final String h) {
        this.f = f;
        this.g = g;
        this.h = h;
        final Resources resources = this.getContext().getApplicationContext().getResources();
        String text;
        if (f != null && this.d.c(f.b(), g)) {
            this.a = CallToAction$State.b;
            if (TextUtils.isEmpty((CharSequence)s)) {
                text = resources.getString(2131296761);
            }
            else {
                text = resources.getString(2131296760, new Object[] { s });
            }
        }
        else if (!TextUtils.isEmpty((CharSequence)g)) {
            this.a = CallToAction$State.c;
            if (TextUtils.isEmpty((CharSequence)s)) {
                text = resources.getString(2131296754);
            }
            else {
                text = resources.getString(2131296755, new Object[] { s });
            }
        }
        else {
            this.a = CallToAction$State.d;
            if (TextUtils.isEmpty((CharSequence)s2)) {
                text = resources.getString(2131296778);
            }
            else {
                text = resources.getString(2131296776, new Object[] { s2 });
            }
        }
        this.setText((CharSequence)text);
    }
    
    public void onClick(final View view) {
        switch (com.twitter.android.nativecards.b.a[this.a.ordinal()]) {
            default: {}
            case 1: {
                this.a();
            }
            case 2: {
                this.getApp();
            }
            case 3: {
                this.a(this.h);
            }
        }
    }
    
    public void setCardActionHandler(final g d) {
        this.d = d;
    }
    
    public void setCardLogger(final t e) {
        this.e = e;
    }
    
    public void setScribeElement(final String c) {
        this.c = c;
    }
    
    public void setTweet(final Tweet b) {
        this.b = b;
    }
}
