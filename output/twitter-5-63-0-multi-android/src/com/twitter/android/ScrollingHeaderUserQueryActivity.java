// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.model.MediaFile;
import android.text.TextUtils;
import com.twitter.library.media.util.ak;
import com.twitter.library.api.z;
import android.net.Uri;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.api.ExtendedProfile;
import com.twitter.internal.network.l;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import java.util.List;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.android.profiles.ah;
import com.twitter.library.api.TwitterUser;

public abstract class ScrollingHeaderUserQueryActivity extends ScrollingHeaderActivity implements yi
{
    protected boolean A;
    protected TwitterUser B;
    private boolean a;
    private yh b;
    private boolean c;
    private boolean d;
    protected long y;
    protected String z;
    
    private boolean d(final TwitterUser twitterUser) {
        return this.b(twitterUser) || twitterUser == null || !twitterUser.d() || twitterUser.descriptionEntities == null || twitterUser.urlEntities == null || twitterUser.structuredLocation == null;
    }
    
    private boolean e(final TwitterUser twitterUser) {
        return !this.d && !twitterUser.hasEmptyExtendedProfile && (twitterUser.extendedProfile == null || this.a(twitterUser.extendedProfile)) && pi.b();
    }
    
    private void h() {
        this.A = ah.a(this.y, this.z, this.T().b());
    }
    
    protected void A() {
        this.a = true;
        this.a(new qd((Context)this, this.U(), this.y, this.z), 1);
        this.c = true;
    }
    
    public void a(final int n, final y y) {
        switch (n) {
            default: {}
            case 1: {
                final qd qd = (qd)y;
                final l f = ((aa)y.l().b()).f();
                int a;
                if (f != null) {
                    a = f.a;
                }
                else {
                    a = -1;
                }
                int n2 = 0;
                switch (a) {
                    default: {
                        n2 = 2131298038;
                        break;
                    }
                    case 200: {
                        if (qd.a != null && (qd.a.userId == this.y || qd.a.username.equalsIgnoreCase(this.z))) {
                            this.a(qd.a);
                            n2 = 0;
                            break;
                        }
                        n2 = 2131298038;
                        break;
                    }
                    case 404: {
                        n2 = 2131298039;
                        break;
                    }
                    case 403: {
                        if (CollectionUtils.a(ae.a(qd.e), 63)) {
                            n2 = 2131297925;
                            break;
                        }
                        n2 = 2131298038;
                        break;
                    }
                }
                if (n2 > 0) {
                    Toast.makeText((Context)this, n2, 1).show();
                    if (this.B == null) {
                        this.finish();
                    }
                }
                this.a = false;
            }
        }
    }
    
    protected void a(final TwitterUser b) {
        if (b != null) {
            this.y = b.userId;
            this.z = b.username;
            this.h();
        }
        this.B = b;
    }
    
    protected boolean a(final ExtendedProfile extendedProfile) {
        return extendedProfile != null && !this.d && 300000L + extendedProfile.mUpdateTime < System.currentTimeMillis();
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        long long1 = 0L;
        if (bundle != null) {
            this.y = bundle.getLong("user_id");
            this.z = bundle.getString("username");
        }
        else {
            final Intent intent = this.getIntent();
            this.y = intent.getLongExtra("user_id", long1);
            this.z = intent.getStringExtra("screen_name");
            final Uri data = intent.getData();
            if (data != null && "twitter".equals(data.getScheme())) {
                final String queryParameter = data.getQueryParameter("user_id");
                while (true) {
                    if (queryParameter == null) {
                        break Label_0115;
                    }
                    try {
                        long1 = Long.parseLong(queryParameter);
                        final String queryParameter2 = data.getQueryParameter("screen_name");
                        this.y = long1;
                        this.z = queryParameter2;
                    }
                    catch (NumberFormatException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
        this.h();
        super.b(bundle, bn);
    }
    
    protected boolean b(final TwitterUser twitterUser) {
        boolean b = true;
        if (twitterUser != null && !this.c) {
            final long currentTimeMillis = System.currentTimeMillis();
            if (this.A) {
                if (300000L + twitterUser.lastUpdated >= currentTimeMillis) {
                    b = false;
                }
                return b;
            }
            if (300000L + twitterUser.friendshipTime < currentTimeMillis || (twitterUser.isProtected && com.twitter.library.api.z.k(twitterUser.friendship))) {
                return b;
            }
        }
        return false;
    }
    
    @Override
    public void c(final TwitterUser twitterUser) {
        if (!this.a && !this.isFinishing()) {
            if (twitterUser != null) {
                final ak a = ak.a();
                final MediaFile a2 = a.a(twitterUser.userId);
                if (a2 != null && a2.b().toString().equals(twitterUser.profileImageUrl)) {
                    a.b(twitterUser.userId);
                }
            }
            if (twitterUser != null && twitterUser.d()) {
                this.a(twitterUser);
            }
            boolean b;
            if (this.y != 0L || !TextUtils.isEmpty((CharSequence)this.z)) {
                b = true;
            }
            else {
                b = false;
            }
            if (b && this.d(twitterUser)) {
                this.A();
                return;
            }
            if (twitterUser != null && this.e(twitterUser)) {
                final pk pk = new pk((Context)this, this.U());
                pk.a = twitterUser.userId;
                this.a(pk, 200);
                this.d = true;
            }
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("user_id", this.y);
        bundle.putString("username", this.z);
    }
    
    protected void z() {
        if (this.b == null) {
            (this.b = new yh((Context)this, this.getSupportLoaderManager(), this, 1)).a(this.y, this.z, this.U().g());
            return;
        }
        this.b.b(this.y, this.z, this.U().g());
    }
}
