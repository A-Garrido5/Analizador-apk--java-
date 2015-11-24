// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import android.database.Cursor;
import com.twitter.library.provider.ad;
import com.twitter.library.provider.cn;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import com.twitter.library.provider.bc;
import com.twitter.library.scribe.TwitterScribeItem;
import java.util.ArrayList;
import com.twitter.library.client.Session;
import com.twitter.library.api.Recap$Metadata;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.content.Context;
import android.os.AsyncTask;

class jf extends AsyncTask
{
    private final Context a;
    private final TwitterScribeAssociation b;
    private final Recap$Metadata c;
    private final long d;
    private final String e;
    
    public jf(final Context context, final String e, final TwitterScribeAssociation b, final Session session, final Recap$Metadata c) {
        this.a = context.getApplicationContext();
        this.e = e;
        this.b = b;
        this.c = c;
        this.d = session.g();
    }
    
    protected ArrayList a(final Void... array) {
        final ArrayList<TwitterScribeItem> list = new ArrayList<TwitterScribeItem>();
        final Cursor query = this.a.getContentResolver().query(ae.a(ContentUris.withAppendedId(bc.b, this.d), this.d), cn.a, "t_data_type=? AND t_entity_id=?", new String[] { String.valueOf(1), String.valueOf(this.c.entityId) }, (String)null);
        if (query == null) {
            return list;
        }
        try {
            if (query.moveToFirst()) {
                do {
                    list.add(TwitterScribeItem.a(this.a, new ad(query).a(), this.b, null));
                } while (query.moveToNext());
            }
            return list;
        }
        finally {
            query.close();
        }
    }
    
    protected void a(final ArrayList list) {
        if (!CollectionUtils.a((Collection)list)) {
            com.twitter.android.client.c.a(this.a).a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.d).b(this.e, null, this.c.scribeComponent, null, "impression")).a(this.b)).b(list));
        }
    }
}
