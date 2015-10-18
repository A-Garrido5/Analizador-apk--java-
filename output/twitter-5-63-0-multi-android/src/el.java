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
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.resilient.c;
import android.content.Context;
import com.twitter.library.provider.DraftTweet;
import com.twitter.android.client.ah;
import com.twitter.library.client.Session;
import com.twitter.util.n;
import com.twitter.android.client.x;
import com.twitter.util.d;

// 
// Decompiled by Procyon v0.5.30
// 

class el implements Runnable
{
    final /* synthetic */ ej a;
    
    el(final ej a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        d.c();
        this.a.s = this.a.h();
        if (!this.a.isCancelled() && this.a.s != null && !this.a.i) {
            this.a.w();
            this.a.r = x.a(this.a.p).a(this.a.n, this.a.g, this.a.s.draftId, this.a.s.statusText, 2131297331);
        }
    }
}
