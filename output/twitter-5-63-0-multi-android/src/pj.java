import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Iterator;
import java.util.Collection;
import com.twitter.library.api.TwitterUserMetadata;
import com.twitter.library.api.bo;
import com.twitter.library.api.TwitterSocialProof;
import com.twitter.library.api.z;
import com.twitter.library.api.TwitterUser;
import android.text.TextUtils;
import com.twitter.library.api.bc;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class pj extends i
{
    final ArrayList a;
    String e;
    int f;
    private final int h;
    private final String i;
    private final int j;
    private final boolean k;
    private final long l;
    private String m;
    
    public pj(final Context context, final ab ab, final long l, final int h, final String i) {
        super(context, pj.class.getName(), ab);
        this.a = new ArrayList();
        this.l = l;
        this.h = h;
        this.i = i;
        switch (h) {
            default: {
                throw new IllegalArgumentException("Unknown user type: " + h);
            }
            case 1:
            case 29: {
                this.j = 2;
                this.k = true;
            }
            case 0: {
                this.j = 1;
                this.k = true;
            }
            case 16: {
                this.j = 17;
                this.k = false;
            }
            case 2: {
                this.j = 4;
                this.k = false;
            }
        }
    }
    
    public final pj a(final String m) {
        this.m = m;
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final String m = this.m;
        if (!httpOperation.j()) {
            return;
        }
        final bc bc = (bc)bg.a();
        if (bc == null) {
            aa.a(0);
            return;
        }
        final ArrayList b = bc.b();
        int n;
        if (this.P().c == this.l) {
            n = 1;
        }
        else {
            n = 0;
        }
        int n2 = 0;
        switch (this.h) {
            default: {
                n2 = -1;
                break;
            }
            case 1:
            case 29: {
                n2 = 2;
                break;
            }
            case 0: {
                n2 = 1;
                break;
            }
        }
        boolean b2;
        if (this.k && !TextUtils.isEmpty((CharSequence)m) && n2 != -1) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        for (final TwitterUser twitterUser : b) {
            if (n != 0) {
                twitterUser.friendship = z.a(twitterUser.friendship, this.j);
            }
            if (b2 && twitterUser.promotedContent != null) {
                final TwitterSocialProof twitterSocialProof = (TwitterSocialProof)new bo().a(n2).a(m).f();
                if (twitterUser.metadata == null) {
                    twitterUser.metadata = new TwitterUserMetadata(twitterSocialProof, null, null, false);
                }
                else {
                    twitterUser.metadata = new TwitterUserMetadata(twitterSocialProof, null, twitterUser.metadata.c, false);
                }
            }
        }
        this.a.addAll(b);
        this.e = bc.a();
        final b w = this.W();
        this.f = this.V().a(b, this.l, this.h, -1L, this.i, this.e, true, w);
        w.a();
    }
    
    @Override
    protected f b() {
        final f m = this.M();
        final long l = this.l;
        switch (this.h) {
            case 1: {
                m.a(new Object[] { "followers", "list" });
                break;
            }
            case 29: {
                m.a("followers", "vit", "list");
                break;
            }
            case 0: {
                m.a(new Object[] { "friends", "list" });
                break;
            }
            case 16: {
                m.a(new Object[] { "friends", "list" }).a("type", "sms");
                break;
            }
            case 2: {
                m.a(new Object[] { "blocks", "list" }).a("skip_status", true);
                break;
            }
        }
        if (this.k) {
            m.a("pc", true);
        }
        m.a("include_user_entities", true).a("user_id", l);
        if (this.i != null) {
            m.a("cursor", this.i);
        }
        return m;
    }
    
    protected bg e() {
        return bg.a(21);
    }
}
