// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import java.util.Iterator;
import com.twitter.library.card.property.ImageSpec;
import java.util.ArrayList;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import android.content.res.Resources;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.os.Bundle;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.NativeCardUserAction;
import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.provider.Tweet;
import com.twitter.android.card.CardActionHelper;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.library.scribe.TwitterScribeAssociation;

public abstract class j extends vp implements wd
{
    protected final TwitterScribeAssociation A;
    protected final t B;
    protected final g C;
    protected CardActionHelper D;
    protected Tweet E;
    protected DisplayMode F;
    private WeakReference a;
    private long b;
    protected final Context y;
    protected final TwitterScribeAssociation z;
    
    public j(final Activity activity, final DisplayMode f, final TwitterScribeAssociation z, final TwitterScribeAssociation a, final t b, final g c) {
        this.a = new WeakReference((T)activity);
        this.F = f;
        this.y = activity.getApplicationContext();
        this.z = z;
        this.A = a;
        this.C = c;
        (this.B = b).a(this.z);
        this.D = new CardActionHelper(this.y, this.C, this.B, this.l());
    }
    
    public void a(final long n) {
        this.a(n, (NativeCardUserAction)null);
    }
    
    @Override
    public void a(final long n, final Tweet e) {
        this.E = e;
        this.B.a(e);
    }
    
    public void a(final long n, final NativeCardUserAction nativeCardUserAction) {
        this.B.c("profile_click", this.l(), nativeCardUserAction);
        this.B.a(PromotedEvent.d, nativeCardUserAction);
        final g c = this.C;
        final Tweet e = this.E;
        TwitterScribeAssociation twitterScribeAssociation;
        if (this.A != null) {
            twitterScribeAssociation = this.A;
        }
        else {
            twitterScribeAssociation = this.z;
        }
        c.a(n, e, twitterScribeAssociation);
    }
    
    @Override
    public void a(final Bundle bundle) {
        wc.a().b(this.b, this);
    }
    
    protected void a(final CallToAction callToAction, final vc vc) {
        callToAction.setScribeElement(this.l());
        callToAction.setCardActionHandler(this.C);
        callToAction.setCardLogger(this.B);
        callToAction.a(um.a("app_url", "app_url_resolved", vc), wb.a("app_id", vc), wb.a("app_name", vc), wb.a("domain", vc), wb.a("card_url", vc));
    }
    
    protected void a(final String s, final String title) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            return;
        }
        final Resources resources = this.y.getResources();
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)activity);
        alertDialog$Builder.setTitle((CharSequence)title);
        alertDialog$Builder.setItems((CharSequence[])resources.getStringArray(2131361792), (DialogInterface$OnClickListener)new k(this, s, activity, title));
        alertDialog$Builder.create().show();
    }
    
    public void a(final String s, final String s2, final String s3, final String s4, final boolean b, final boolean b2) {
        this.B.b("click", this.l());
        this.B.a(PromotedEvent.p);
        String s5;
        String s6;
        if (!TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)s3) && bq.c(s3)) {
            s5 = null;
            s6 = s2;
        }
        else {
            s5 = s;
            s6 = null;
        }
        this.C.a(s5, s6, s4, b, b2, this.E);
    }
    
    public void a(final ArrayList list, final int n) {
        final ArrayList<ImageSpec> list2 = new ArrayList<ImageSpec>();
        for (final vj vj : list) {
            if (vj != null) {
                final ImageSpec imageSpec = new ImageSpec(vj.b, vj.c);
                imageSpec.url = vj.a;
                list2.add(imageSpec);
            }
        }
        if (list2.size() > 0) {
            this.B.b("click", this.l());
            this.B.a(PromotedEvent.p);
            this.C.a(list2, Math.min(n, -1 + list2.size()), this.z);
        }
    }
    
    public void a(final vj vj) {
        if (vj != null) {
            final ArrayList<vj> list = new ArrayList<vj>();
            list.add(vj);
            this.a(list, 0);
        }
    }
    
    public void a(final vq vq, final Bundle bundle) {
        this.b = vq.a;
        wc.a().a(vq.a, this);
    }
    
    public Activity k() {
        return (Activity)this.a.get();
    }
    
    public String l() {
        if (DisplayMode.a == this.F) {
            return "platform_forward_card";
        }
        return "platform_card";
    }
    
    public CardActionHelper m() {
        return this.D;
    }
}
