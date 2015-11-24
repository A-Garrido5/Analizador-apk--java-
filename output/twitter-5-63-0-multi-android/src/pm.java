import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class pm extends i
{
    public final int a;
    public long e;
    public int f;
    public boolean h;
    public long[] i;
    public int j;
    public boolean k;
    public int l;
    public TwitterUser[] m;
    
    public pm(final Context context, final Session session, final int a) {
        super(context, pm.class.getName(), session);
        this.h = true;
        this.k = true;
        this.a = a;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (!httpOperation.j()) {
            return;
        }
        final ArrayList list = (ArrayList)bg.a();
        long n;
        if (this.e > 0L) {
            n = this.e;
        }
        else {
            n = this.P().c;
        }
        int l;
        if (this.h) {
            final b w = this.W();
            final com.twitter.library.provider.bg v = this.V();
            final int a = this.a;
            String s;
            if (this.f == 0) {
                s = "-1";
            }
            else {
                s = null;
            }
            l = v.a(list, n, a, -1L, s, null, true, w);
            w.a();
        }
        else {
            l = list.size();
        }
        this.l = l;
        this.m = list.toArray(new TwitterUser[list.size()]);
    }
    
    @Override
    protected f b() {
        final long e = this.e;
        final int a = this.a;
        if (this.h && a != 10 && a != 9 && a != 19 && a != 20 && a != 21 && a != 33) {
            throw new IllegalArgumentException("Unsupported type");
        }
        final f a2 = this.M().a(new Object[] { "users", "recommendations" }).a("connections", this.k);
        if (e > 0L) {
            a2.a("user_id", e);
        }
        switch (a) {
            default: {
                throw new IllegalArgumentException("Invalid userType: " + a);
            }
            case 10: {
                a2.a("display_location", "st-component");
                break;
            }
            case 20: {
                a2.a("display_location", "profile-cluster-follow");
                break;
            }
            case 6: {
                a2.a("display_location", "categories-cluster-follow");
                break;
            }
            case 7: {
                a2.a("display_location", "contacts-cluster-follow");
                break;
            }
            case 1: {
                a2.a("display_location", "followers-cluster-follow");
                break;
            }
            case 0: {
                a2.a("display_location", "following-cluster-follow");
                break;
            }
            case 9: {
                a2.a("display_location", "wtf-component");
                break;
            }
            case 19: {
                a2.a("display_location", "welcome-flow-recommendations");
                break;
            }
            case 21: {
                a2.a("display_location", "wtf-people-tab");
                break;
            }
            case 11: {
                a2.a("display_location", "tweet-detail-favorited-by-cluster-follow");
                break;
            }
            case 12: {
                a2.a("display_location", "tweet-detail-retweeted-by-cluster-follow");
                break;
            }
            case 8: {
                a2.a("display_location", "activity-source-cluster-follow");
                break;
            }
            case 13: {
                a2.a("display_location", "activity-target-cluster-follow");
                break;
            }
            case 33: {
                a2.a("display_location", "pop-geo");
                break;
            }
        }
        final int j = this.j;
        if (j > 0) {
            a2.a("limit", j);
        }
        final long[] i = this.i;
        if (i != null && i.length > 0) {
            a2.a("excluded", i);
        }
        return a2.a("pc", 1L).a("include_user_entities", true);
    }
    
    protected bg e() {
        return bg.a(7);
    }
}
