// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import java.util.ArrayList;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.text.TextUtils;
import com.twitter.library.service.aa;
import android.content.Context;

public class e extends y
{
    protected String a;
    
    public e(final Context context, final String a) {
        super(context);
        this.a = a;
    }
    
    @Override
    public void a(final ag ag, final aa aa) {
    }
    
    @Override
    public void a(final ag ag, final aa aa, final q q) {
        String s;
        if (!aa.a()) {
            s = this.a + ":failure";
        }
        else if (q.c() > 1) {
            s = this.a + ":retry";
        }
        else {
            s = this.a + ":success";
        }
        final ArrayList d = q.d();
        String join;
        if (d != null) {
            join = TextUtils.join((CharSequence)",", (Iterable)d);
        }
        else {
            join = "";
        }
        ScribeService.a(this.b, ((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(ag.P().c).b(new String[] { s })).c(2)).c(join));
    }
}
