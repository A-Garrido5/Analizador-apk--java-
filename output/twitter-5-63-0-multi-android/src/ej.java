import com.twitter.library.media.manager.h;
import com.twitter.library.api.MediaEntityList;
import com.twitter.library.media.util.TweetImageVariant;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.media.manager.q;
import java.util.LinkedHashMap;
import com.twitter.library.provider.Tweet;
import com.twitter.library.provider.b;
import com.twitter.library.service.ab;
import com.twitter.android.client.ce;
import android.content.Intent;
import com.twitter.android.DialogActivity;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.a;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.provider.bg;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.provider.x;
import com.twitter.library.featureswitch.d;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.resilient.c;
import android.content.Context;
import com.twitter.library.provider.DraftTweet;
import com.twitter.android.client.ah;
import com.twitter.library.client.Session;
import com.twitter.util.n;

// 
// Decompiled by Procyon v0.5.30
// 

public class ej extends ob implements n
{
    private final Session n;
    private ah r;
    private DraftTweet s;
    
    public ej(final Context context, final Session n, final long n2) {
        super(context, n, n2);
        this.n = n;
        ny.a().a(this, this.an_());
    }
    
    public ej(final Context context, final Session n, final c c) {
        super(context, n, c);
        this.n = n;
        ny.a().a(this, this.an_());
    }
    
    private void a(final long n) {
        if (this.h != null) {
            final int b = this.h.c.mentions.b();
            final int b2 = this.h.c.hashtags.b();
            String s;
            if (this.h.j > 0L) {
                s = ":composition:send_reply:";
            }
            else {
                s = ":composition:send_tweet:";
            }
            if (b > 0) {
                ScribeService.a(this.p, ((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { s + "mentions:count" })).a((long)b));
            }
            if (b2 > 0) {
                ScribeService.a(this.p, ((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { s + "hashtags:count" })).a((long)b2));
            }
        }
    }
    
    private void t() {
        if (this.s != null) {
            ob.a(this.p, this.g, this.s.draftId);
        }
    }
    
    private void w() {
        if (com.twitter.library.featureswitch.d.a("pending_tweet_ui2_3297", new String[] { "enabled" })) {
            final long g = this.g;
            final long draftId = this.s.draftId;
            final bg v = this.V();
            if (v.b(g, draftId) == null) {
                final TwitterUser a = v.a(g);
                if (a != null) {
                    x.b(v.a(a, this.s));
                    return;
                }
                ErrorReporter.a(new RuntimeException("Could not find user: " + g));
            }
        }
    }
    
    @Override
    public Runnable a(final a a) {
        super.a(a);
        return new el(this);
    }
    
    @Override
    public void a(final Context context) {
        super.a(context);
        new em(context, this.n, this.f).execute((Object[])new Void[0]);
    }
    
    @Override
    public void a(final com.twitter.internal.android.service.x x) {
        while (true) {
            boolean b = true;
            super.a(x);
            final aa aa = (aa)x.b();
            final com.twitter.android.client.x a = com.twitter.android.client.x.a(this.p);
            final ah r = this.r;
            com.twitter.android.client.c a2 = null;
            long c = 0L;
            String statusText = null;
            Label_0691: {
                Label_0671: {
                    int[] a3 = null;
                    Label_0423: {
                        try {
                            final ab p = this.P();
                            a2 = com.twitter.android.client.c.a(this.p);
                            if (aa.c() != 200) {
                                b = false;
                            }
                            a3 = ae.a(this.o);
                            c = p.c;
                            if (this.s != null) {
                                statusText = this.s.statusText;
                            }
                            else {
                                statusText = "";
                            }
                            final boolean boolean1 = aa.c.getBoolean("IsRetriedDuplicateTweet", false);
                            if (b || boolean1) {
                                this.r = a.a(this.n, this.r, statusText, 2131297332);
                                this.a(this.n);
                                this.a(c);
                            }
                            else {
                                this.t();
                                if (this.isCancelled()) {
                                    this.a(this.n);
                                    return;
                                }
                                switch (aa.c()) {
                                    default: {
                                        a2.a(c, ":composition:send_tweet:save_draft:complete");
                                        this.r = a.b(this.n, this.r, this.f, statusText, 2131297465, true);
                                        break;
                                    }
                                    case 403: {
                                        break Label_0423;
                                    }
                                    case 304: {
                                        break Label_0671;
                                    }
                                    case 1002:
                                    case 1005:
                                    case 1007:
                                    case 1008: {
                                        break Label_0691;
                                    }
                                }
                            }
                            return;
                        }
                        finally {
                            ny.a().b(this, this.an_());
                            if ((r == this.r || this.isCancelled()) && this.r != null) {
                                a.a(this.r);
                            }
                        }
                    }
                    a2.a(c, ":composition:send_tweet:save_draft:complete");
                    if (CollectionUtils.a(a3, 187)) {
                        this.r = a.b(this.n, this.r, this.f, statusText, 2131296900, true);
                        return;
                    }
                    if (CollectionUtils.a(a3, 224)) {
                        this.r = a.b(this.n, this.r, this.f, statusText, 2131297465, false);
                        this.p.startActivity(new Intent(this.p, (Class)DialogActivity.class).setAction("blocked_spammer_tweet").setFlags(268435456));
                        return;
                    }
                    if (CollectionUtils.a(a3, 223)) {
                        this.r = a.b(this.n, this.r, this.f, statusText, 2131297465, false);
                        this.p.startActivity(new Intent(this.p, (Class)DialogActivity.class).setAction("blocked_automated_spammer").setFlags(268435456));
                        return;
                    }
                    this.r = a.b(this.n, this.r, this.f, statusText, 2131297465, true);
                    ce.a(this.p).a(a3);
                    return;
                }
                a2.a(c, ":composition:send_tweet:save_draft:complete");
                return;
            }
            a2.a(c, ":composition:send_tweet:save_draft:complete");
            this.r = a.b(this.n, this.r, this.f, statusText, 2131297465, true);
        }
    }
    
    @Override
    protected void a(final b b) {
        final bg v = this.V();
        final Long b2 = v.b(this.g, this.s.draftId);
        boolean a = false;
        if (b2 != null) {
            final Tweet c = v.c(this.h.a);
            a = false;
            if (c != null) {
                a = x.a(b2, c, new ek(this, b));
            }
            v.a((long)b2, b);
        }
        if (!a) {
            super.a(b);
        }
    }
    
    @Override
    protected void a(final aa aa) {
        if (this.s == null) {
            ErrorReporter.a(new Exception("Local tweet not found for ID: " + this.f + ":" + this.g));
            aa.a(false);
            return;
        }
        if (!this.i) {
            this.w();
            this.r = com.twitter.android.client.x.a(this.p).a(this.n, this.g, this.s.draftId, this.s.statusText, 2131297331);
        }
        super.a(aa);
    }
    
    @Override
    protected void a(final LinkedHashMap linkedHashMap) {
        super.a(linkedHashMap);
        if (!this.h.c.media.c() && linkedHashMap != null) {
            final MediaEntityList media = this.h.c.media;
            if (linkedHashMap.size() != media.b()) {
                ErrorReporter.a(new Exception(String.format("The size of the local output media (%d) was not the same as the media returned from the request (%d) for draft ID (%d) and status ID (%d)", linkedHashMap.size(), media.b(), this.s.draftId, this.h.a)));
            }
            final h b = com.twitter.library.media.manager.q.a(this.p).b();
            for (int i = 0; i < media.b(); ++i) {
                final MediaEntity mediaEntity = (MediaEntity)media.a(i);
                final MediaFile mediaFile = linkedHashMap.get(mediaEntity.id);
                if (mediaFile != null) {
                    b.a(TweetImageVariant.a(mediaEntity.mediaUrl, TweetImageVariant.d, true), mediaFile.file);
                }
            }
        }
    }
    
    public void a(final nz nz) {
        if (this.r != null) {
            com.twitter.android.client.x.a(this.p).a(this.r, nz.c);
        }
    }
    
    @Override
    protected boolean a() {
        final boolean a = super.a();
        if (a) {
            this.t();
            ny.a().b(this, this.an_());
            if (this.r != null && this.isCancelled()) {
                com.twitter.android.client.x.a(this.p).a(this.r);
                this.r = null;
            }
        }
        return a;
    }
    
    @Override
    public void b(final com.twitter.internal.android.service.x x) {
        super.b(x);
        this.r = com.twitter.android.client.x.a(this.p).a(this.n, this.r, this.f, this.s.statusText, 2131297564, false);
    }
}
