// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.Session;
import android.preference.PreferenceManager;
import com.twitter.library.api.r;
import com.twitter.library.scribe.TwitterScribeLog;
import android.text.TextUtils;
import com.twitter.library.client.d;
import android.os.Bundle;
import com.twitter.library.api.TwitterUser;
import android.content.Context;
import android.content.Intent;
import java.util.Collection;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.util.ArrayList;
import com.twitter.android.client.TwitterFragmentActivity;

public class EmailExploreFetchCategoryUsersActivity extends TwitterFragmentActivity
{
    private String a;
    private int b;
    private ArrayList c;
    private String d;
    private String e;
    private String f;
    
    public EmailExploreFetchCategoryUsersActivity() {
        this.b = 0;
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        switch (n) {
            case 1: {
                final Bundle c = ((aa)y.l().b()).c;
                this.c = c.getParcelableArrayList("users_list_result");
                this.f = c.getString("category_title");
                if (this.c != null && this.f != null) {
                    if (this.c.size() > 15) {
                        this.c = new ArrayList(this.c.subList(0, 15));
                    }
                    ++this.b;
                    break;
                }
                this.startActivity(new Intent((Context)this, (Class)MainActivity.class));
                this.finish();
                break;
            }
            case 2: {
                final ArrayList parcelableArrayList = ((aa)y.l().b()).c.getParcelableArrayList("users_list_result");
                if (parcelableArrayList != null && parcelableArrayList.size() == 1) {
                    this.d = parcelableArrayList.get(0).profileHeaderImageUrl;
                    this.e = parcelableArrayList.get(0).username;
                    ++this.b;
                    break;
                }
                this.startActivity(new Intent((Context)this, (Class)MainActivity.class));
                this.finish();
                break;
            }
        }
        if (this.b == 2) {
            this.startActivity(new Intent((Context)this, (Class)EmailExploreActivity.class).putExtra("category", this.a).putExtra("extra_title", this.f).putExtra("extra_header_image_url", this.d).putExtra("extra_header_image_username", this.e).putParcelableArrayListExtra("extra_sul", this.c));
            this.finish();
        }
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        final Intent intent = this.getIntent();
        this.a = intent.getStringExtra("explore_email_category");
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            this.a = "news";
            this.G().a(((TwitterScribeLog)new TwitterScribeLog(this.U().g()).b("explore_email", "category", null, "missing_category", "error")).d(this.a));
        }
        String stringExtra = intent.getStringExtra("explore_email_country");
        if (TextUtils.isEmpty((CharSequence)stringExtra)) {
            this.G().a(((TwitterScribeLog)new TwitterScribeLog(this.U().g()).b("explore_email", "category", null, "missing_country", "error")).d("nux_test"));
            stringExtra = "nux_test";
        }
        final Session u = this.U();
        final r r = new r((Context)this, u, this.a, stringExtra);
        final r r2 = new r((Context)this, u, this.a, "nux_en-u");
        this.a(r, 1);
        this.a(r2, 2);
        PreferenceManager.getDefaultSharedPreferences((Context)this).edit().remove("pref_category").remove("pref_country").apply();
    }
}
