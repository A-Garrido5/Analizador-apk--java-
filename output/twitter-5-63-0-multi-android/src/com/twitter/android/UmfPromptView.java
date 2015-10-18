// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.twitter.library.network.ae;
import android.view.View;
import android.text.format.Time;
import android.content.Intent;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import com.twitter.library.client.az;
import android.text.TextUtils;
import com.twitter.android.client.c;
import com.twitter.library.view.u;
import com.twitter.library.client.App;
import android.content.res.Resources;
import com.twitter.library.view.l;
import com.twitter.library.api.TweetEntities;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.api.Prompt;
import com.twitter.library.view.k;
import android.view.View$OnLongClickListener;
import com.twitter.ui.widget.PromptView;

public class UmfPromptView extends PromptView implements View$OnLongClickListener, k
{
    protected Prompt a;
    
    public UmfPromptView(final Context context) {
        super(context);
        this.a(null, 0);
    }
    
    public UmfPromptView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(set, 0);
    }
    
    public UmfPromptView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(set, n);
    }
    
    private CharSequence a(String a, final TweetEntities tweetEntities) {
        final Resources resources = this.getContext().getResources();
        final int color = resources.getColor(2131689621);
        final int color2 = resources.getColor(2131689601);
        if (tweetEntities != null) {
            a = (String)l.a(a, tweetEntities, this, color, color2);
        }
        return a;
    }
    
    private void a(final AttributeSet set, final int n) {
        if (App.f()) {
            this.setOnLongClickListener((View$OnLongClickListener)this);
        }
        u.a(this.getPromptSubtitle());
        u.a(this.getPromptHeader());
    }
    
    @Override
    protected void a() {
        final Context context = this.getContext();
        final c a = com.twitter.android.client.c.a(context);
        if (this.a != null) {
            final String f = this.a.f;
            if (!TextUtils.isEmpty((CharSequence)f)) {
                am.a(context, null, f.trim(), az.a(context).b().g(), null, null, null);
            }
            a.b(this.a.b);
        }
        this.g();
        super.a();
    }
    
    public void a(final MediaEntity mediaEntity) {
    }
    
    public void a(final Prompt a) {
        this.b = true;
        this.a = a;
        this.setTitle(this.a(this.a.d, this.a.l));
        this.setSubtitle(this.a(this.a.a, this.a.k));
        this.setButtonText(this.a.e);
        this.setVisibility(0);
    }
    
    public void a(final TweetClassicCard tweetClassicCard) {
    }
    
    public void a(final UrlEntity urlEntity) {
        final Context context = this.getContext();
        am.a(context, null, urlEntity, az.a(context).b().g(), null, null, null, null);
    }
    
    public void a(final TwitterPlace twitterPlace) {
    }
    
    public void a(final String s) {
        if (s.length() > 1) {
            final Context context = this.getContext();
            if (s.charAt(0) == '@') {
                context.startActivity(new Intent(context, (Class)ProfileActivity.class).putExtra("screen_name", s.substring(1)));
            }
            else {
                if (s.charAt(0) == '#') {
                    context.startActivity(new Intent(context, (Class)SearchActivity.class).putExtra("query", s).putExtra("q_source", "hashtag_click").putExtra("scribe_context", "hashtag"));
                    return;
                }
                if (s.charAt(0) == '$') {
                    context.startActivity(new Intent(context, (Class)SearchActivity.class).putExtra("query", s).putExtra("q_source", "cashtag_click").putExtra("scribe_context", "cashtag"));
                }
            }
        }
    }
    
    @Override
    protected void b() {
        if (this.a != null) {
            com.twitter.android.client.c.a(this.getContext().getApplicationContext()).c(this.a.b);
            this.a.j();
        }
        super.b();
    }
    
    public void b(final long n) {
    }
    
    public boolean d() {
        return this.a != null;
    }
    
    public boolean e() {
        if (this.a == null) {
            return true;
        }
        final Time time = new Time();
        final Time time2 = new Time(this.c);
        time2.second += this.a.i;
        time2.normalize(false);
        time.setToNow();
        return time.after(time2);
    }
    
    @Override
    public void f() {
        super.f();
        this.a = null;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.b && this.a != null) {
            com.twitter.android.client.c.a(this.getContext()).a(this.a.b);
            this.c.setToNow();
            this.b = false;
        }
    }
    
    public boolean onLongClick(final View view) {
        final Prompt a = this.a;
        if (a == null) {
            return false;
        }
        final Context context = view.getContext();
        final PackageManager packageManager = context.getPackageManager();
        while (true) {
            try {
                final int versionCode = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                final Intent putExtra = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", "\n\n--- User agent ---\n\n" + ae.a(context).h + "\n\n--- Prompt ---\n\n" + a).putExtra("android.intent.extra.SUBJECT", "Debug: Android v" + versionCode + ", " + "prompt id " + a.b).putExtra("android.intent.extra.EMAIL", new String[] { "promptbird@twitter.com" });
                if (!packageManager.queryIntentActivities(putExtra, 65536).isEmpty()) {
                    context.startActivity(putExtra);
                }
                return true;
            }
            catch (PackageManager$NameNotFoundException ex) {
                final int versionCode = 0;
                continue;
            }
            break;
        }
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final UmfPromptView$SavedState umfPromptView$SavedState = (UmfPromptView$SavedState)parcelable;
        super.onRestoreInstanceState(umfPromptView$SavedState.getSuperState());
        this.b = umfPromptView$SavedState.a;
    }
    
    public Parcelable onSaveInstanceState() {
        final UmfPromptView$SavedState umfPromptView$SavedState = new UmfPromptView$SavedState(super.onSaveInstanceState());
        umfPromptView$SavedState.b = this.a;
        umfPromptView$SavedState.a = this.b;
        return (Parcelable)umfPromptView$SavedState;
    }
}
