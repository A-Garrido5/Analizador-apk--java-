// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.api.TwitterUser;
import android.content.Context;
import android.widget.Toast;
import com.twitter.util.collection.CollectionUtils;
import java.util.List;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;

public abstract class UserQueryActivity extends ListFragmentActivity implements yi
{
    private yh a;
    protected long b;
    protected String c;
    boolean d;
    
    @Override
    public void a(final int n, final y y) {
        switch (n) {
            case 1: {
                this.d = false;
                int n2 = 0;
                switch (((aa)y.l().b()).c()) {
                    default: {
                        n2 = 2131298038;
                        break;
                    }
                    case 200: {
                        final TwitterUser a = ((qd)y).a;
                        if (a != null) {
                            this.a(a);
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
                        if (CollectionUtils.a(ae.a(((qd)y).e), 63)) {
                            n2 = 2131297925;
                            break;
                        }
                        n2 = 2131298038;
                        break;
                    }
                }
                if (n2 > 0) {
                    Toast.makeText((Context)this, n2, 1).show();
                    this.finish();
                    return;
                }
                break;
            }
        }
    }
    
    protected void a(final TwitterUser twitterUser) {
        if (twitterUser != null) {
            this.b = twitterUser.userId;
            this.c = twitterUser.username;
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        if (bundle != null) {
            this.b = bundle.getLong("user_id");
            this.c = bundle.getString("username");
        }
        else {
            final Intent intent = this.getIntent();
            this.b = intent.getLongExtra("user_id", 0L);
            this.c = intent.getStringExtra("screen_name");
        }
        super.b(bundle, bn);
    }
    
    @Override
    public void c(final TwitterUser twitterUser) {
        if (!this.d && !this.isFinishing()) {
            if (twitterUser != null && twitterUser.d()) {
                this.a(twitterUser);
                return;
            }
            if (this.b != 0L || !TextUtils.isEmpty((CharSequence)this.c)) {
                this.i();
            }
        }
    }
    
    protected void h() {
        if (this.a == null) {
            (this.a = new yh((Context)this, this.getSupportLoaderManager(), this, 1)).a(this.b, this.c, this.U().g());
            return;
        }
        this.a.b(this.b, this.c, this.U().g());
    }
    
    protected void i() {
        if (!this.d) {
            this.d = true;
            this.a(new qd((Context)this, this.U(), this.b, this.c), 1);
        }
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("user_id", this.b);
        bundle.putString("username", this.c);
    }
}
