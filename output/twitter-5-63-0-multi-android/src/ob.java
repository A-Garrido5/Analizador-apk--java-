import com.twitter.internal.network.j;
import com.twitter.library.api.upload.ah;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.service.m;
import com.twitter.library.service.r;
import com.twitter.library.service.ab;
import com.twitter.library.util.InvalidDataException;
import com.twitter.library.api.MentionEntity;
import java.util.HashSet;
import com.twitter.library.service.z;
import com.twitter.library.client.as;
import com.twitter.library.network.ae;
import java.util.List;
import com.twitter.library.api.upload.o;
import com.twitter.library.media.util.MediaException;
import com.twitter.library.provider.f;
import com.twitter.library.api.upload.y;
import com.twitter.library.api.upload.u;
import com.twitter.library.api.upload.MediaProcessorFactory$MediaUsage;
import com.twitter.library.featureswitch.d;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.Iterator;
import com.twitter.library.api.bd;
import java.util.ArrayList;
import com.twitter.library.client.az;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.internal.network.l;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.aa;
import com.twitter.library.provider.x;
import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.library.util.bk;
import com.twitter.library.resilient.g;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import com.twitter.library.resilient.c;
import com.twitter.library.provider.DraftTweet;
import java.util.LinkedHashMap;
import com.twitter.library.api.bp;
import java.util.Map;
import com.twitter.library.resilient.a;
import com.twitter.library.api.upload.ag;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class ob extends ag implements a
{
    public static final long a;
    public static final long e;
    private static final Map n;
    protected final long f;
    protected final long g;
    protected bp h;
    protected final boolean i;
    private LinkedHashMap r;
    private DraftTweet s;
    private final c t;
    private final nw u;
    private String v;
    
    static {
        a = TimeUnit.HOURS.toMillis(11L);
        e = TimeUnit.MINUTES.toMillis(45L);
        n = new ConcurrentHashMap(5);
    }
    
    public ob(final Context context, final Session session, final long f) {
        super(context, ob.class.getName(), session);
        this.f = f;
        this.g = session.g();
        (this.t = com.twitter.library.resilient.g.a(context).a(this, 1, this.g)).b("draftId", this.f);
        this.i = (this.t.b() + ob.a < bk.a());
        this.g(2);
        this.u = new nw(2, this.an_(), 2, true);
        this.c(context);
    }
    
    public ob(final Context context, final Session session, final c t) {
        super(context, ob.class.getName(), session);
        this.t = t;
        this.f = t.a("draftId", 0L);
        this.g = session.g();
        this.i = (this.t.b() + ob.a < bk.a());
        this.u = new nw(2, this.an_(), 2, true);
        this.c(context);
        this.g(2);
    }
    
    protected static void a(final Context context, final long n, final long n2) {
        final bg a = bg.a(context, n);
        final Long b = a.b(n, n2);
        if (b != null) {
            a.a((long)b, (b)null);
            x.a(b);
        }
    }
    
    private void a(final aa aa, final DraftTweet draftTweet, final boolean b, final bp bp) {
        String s;
        if (this.b(aa)) {
            s = "success";
        }
        else if (b) {
            s = "retry";
        }
        else {
            s = "failure";
        }
        String s2;
        if (draftTweet != null && !draftTweet.media.isEmpty()) {
            s2 = "has_media";
        }
        else {
            s2 = "no_media";
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.g).b(new String[] { "app:twitter_service:tweet:create", s })).g(s2);
        if (bp != null) {
            final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
            twitterScribeItem.a = bp.a;
            twitterScribeItem.c = 0;
            twitterScribeLog.a(twitterScribeItem);
        }
        final l f = aa.f();
        if (f != null) {
            TwitterScribeLog.a(this.p, twitterScribeLog, f);
            twitterScribeLog.a(aa.e().i().toString(), f);
        }
        ScribeService.a(this.p, twitterScribeLog);
    }
    
    public static boolean a(final Context context, final long n) {
        final Context applicationContext = context.getApplicationContext();
        final ob ob = ob.n.get(n);
        if (ob != null) {
            return ob.a();
        }
        ErrorReporter.a(new Exception("Tweet request not found for pending tweet with draft ID: " + n));
        a(applicationContext, az.a(applicationContext).b().g(), n);
        return false;
    }
    
    private boolean a(final aa aa, final com.twitter.library.api.bg bg) {
        if (aa.a()) {
            return false;
        }
        aa.c();
        final int o = this.O();
        if (o != 3 && o != 4) {
            return false;
        }
        final ArrayList list = (ArrayList)bg.a();
        if (list == null) {
            return false;
        }
        final Iterator<bd> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().a == 187) {
                return true;
            }
        }
        return false;
    }
    
    private boolean a(final aa aa, final DraftTweet draftTweet) {
        if (this.isCancelled()) {
            return false;
        }
        boolean b;
        if (bk.a() - draftTweet.a() > ob.e) {
            b = true;
        }
        else {
            b = false;
        }
        if (!CollectionUtils.a((Collection)draftTweet.b()) && !b) {
            return true;
        }
        o o;
        if (com.twitter.library.featureswitch.d.a("android_sru_improvement_3199", new String[] { "sru_async" })) {
            o = new com.twitter.library.api.upload.a(this.v, this.p, this.P(), draftTweet.media, MediaProcessorFactory$MediaUsage.a);
        }
        else {
            o = (u)new u(this.v, this.p, this.P(), draftTweet.media).a(new com.twitter.library.api.upload.l(this.p)).g(6);
        }
        this.v = o.an_();
        this.u.a(this.v);
        final aa b2 = o.b();
        this.t();
        this.r = o.az_();
        if (b2.a()) {
            List list;
            if (this.r != null) {
                list = new ArrayList(this.r.keySet());
            }
            else {
                list = null;
            }
            draftTweet.a(list, bk.a());
            com.twitter.library.provider.f.a(this.p, this.g).a(this.f, draftTweet.b(), draftTweet.a());
            return true;
        }
        if (b2.f() == null && b2.c() == 0) {
            aa.a(1005, new MediaException("Failed to upload image"));
            return false;
        }
        aa.a(b2);
        return false;
    }
    
    private void b(final aa aa, final com.twitter.library.api.bg bg) {
        final ab p2 = this.P();
        final long c = p2.c;
        final boolean a = aa.a();
        final boolean a2 = this.a(aa, bg);
        aa.c.putBoolean("IsRetriedDuplicateTweet", a2);
        if (!a && !a2) {
            this.a("custom_errors", ae.a((List)bg.a()));
            return;
        }
        bp h;
        if (a) {
            h = (bp)bg.a();
        }
        else {
            h = null;
        }
        this.h = h;
        if (this.h != null) {
            final long a3 = this.h.a();
            this.o.putLong("status_id", a3);
            if (this.isCancelled()) {
                as.a(this.p).a(new op(this.p, this.P(), a3), (z)null);
            }
            else {
                this.a(this.r);
                final bg v = this.V();
                final b w = this.W();
                v.a(this.h, c, w);
                this.a(w);
                if (!this.h.c.mentions.c()) {
                    final HashSet<Long> set = new HashSet<Long>(this.h.c.mentions.b());
                    final Iterator iterator = this.h.c.mentions.iterator();
                    while (iterator.hasNext()) {
                        set.add(iterator.next().userId);
                    }
                    this.b(new com.twitter.library.api.search.a(this.p, p2, CollectionUtils.c(set)));
                }
            }
            return;
        }
        ErrorReporter.a(new com.twitter.library.service.a(c, this.l.b()).a(new InvalidDataException("Received null user.")));
    }
    
    private void c(final Context context) {
        this.a(new com.twitter.library.service.l().a(new r(1)).a(new m(context)).a(new com.twitter.library.api.upload.f()).a(new com.twitter.library.service.u(com.twitter.library.service.u.c, com.twitter.library.service.u.d, (int)TimeUnit.HOURS.toMillis(24L))));
    }
    
    private void t() {
        final LinkedHashMap r = this.r;
        this.r = null;
        if (r != null) {
            final Iterator<MediaFile> iterator = r.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
            }
        }
    }
    
    @Override
    public Runnable a(final com.twitter.internal.android.service.a a) {
        ob.n.put(this.f, this);
        if (!this.isCancelled()) {
            this.c(100);
        }
        return null;
    }
    
    protected StringBuilder a(final DraftTweet draftTweet) {
        final ab p = this.P();
        final sl a = sk.a();
        boolean b = false;
        if (p != null) {
            final Session c = az.a(this.p).c(p.a);
            b = false;
            if (c != null) {
                final boolean a2 = a.a(c);
                b = false;
                if (a2) {
                    final boolean c2 = a.c(c);
                    b = false;
                    if (c2) {
                        b = true;
                    }
                }
            }
        }
        return com.twitter.library.api.upload.aa.a(this.q, draftTweet, b);
    }
    
    @Override
    public void a(final Context context) {
        com.twitter.library.provider.f.a(this.p, this.g).a(this.f, 2, null);
    }
    
    @Override
    public void a(final com.twitter.internal.android.service.x x) {
        super.a(x);
        if (this.f > 0L) {
            com.twitter.library.provider.f.a(this.p, this.P().c).a(this.f, 0, null);
        }
        nz a;
        if (!this.isCancelled()) {
            final nz b = nz.b(this.an_(), 2);
            this.a((aa)x.b(), this.s, false, this.h);
            a = b;
        }
        else {
            a = nz.a(this.an_(), 2);
        }
        ny.a().a(a);
        this.t();
        if (this.s != null) {
            this.s.c();
        }
        ob.n.remove(this.f);
    }
    
    protected void a(final Session session) {
        final f a = com.twitter.library.provider.f.a(this.p, session.g());
        final b b = new b(this.p.getContentResolver());
        a.a(new long[] { this.f }, b, true);
        b.a();
    }
    
    protected void a(final b b) {
        if (b != null) {
            b.a();
        }
    }
    
    @Override
    protected void a(final aa aa) {
        int a = 1;
        this.t.d();
        this.c(250);
        this.s = this.h();
        if (this.s == null) {
            ErrorReporter.a(new Exception("Local draft not found for " + this.f));
            aa.a(-1, "Local draft not found for " + this.f);
            return;
        }
        this.c(1000);
        int n;
        if (!this.s.media.isEmpty()) {
            n = a;
        }
        else {
            n = 0;
        }
        final nw u = this.u;
        int n2;
        if (n != 0) {
            n2 = 2;
        }
        else {
            n2 = a;
        }
        u.a(n2);
        final com.twitter.library.api.bg a2 = com.twitter.library.api.bg.a(37);
        if (n != 0) {
            a = (this.a(aa, this.s) ? 1 : 0);
        }
        final StringBuilder a3 = this.a(this.s);
        if (a != 0 && !this.isCancelled()) {
            (this.l = new ah(this.p, this.P()).a(a2)).a(a3);
            this.u();
            this.l.a(this.l.c().c(), aa);
            this.v();
        }
        this.b(aa, a2);
    }
    
    protected void a(final LinkedHashMap linkedHashMap) {
    }
    
    protected boolean a() {
        this.u.a(nz.a(this.an_(), 2));
        return this.cancel(true);
    }
    
    @Override
    public String an_() {
        return Long.toString(this.f);
    }
    
    @Override
    public int ay_() {
        return 2;
    }
    
    public DraftTweet b() {
        return this.s;
    }
    
    @Override
    public void b(final Context context) {
        as.a(context).a(this);
    }
    
    @Override
    public void b(final com.twitter.internal.android.service.x x) {
        super.b(x);
        this.g(3);
        this.a((aa)x.b(), this.s, true, this.h);
        final l f = ((aa)x.b()).f();
        if (f != null && f.a == 400) {
            this.s.a(null, 0L);
        }
    }
    
    protected boolean b(final aa aa) {
        return aa.a() || aa.c() == 403;
    }
    
    @Override
    public void c(final int n) {
        this.u.a(nz.a(this.an_(), 2, n));
    }
    
    @Override
    public c e() {
        return this.t;
    }
    
    @Override
    public boolean g() {
        return this.i;
    }
    
    protected DraftTweet h() {
        com.twitter.util.d.c();
        return com.twitter.library.provider.f.a(this.p, this.P().c).a(this.f);
    }
}
