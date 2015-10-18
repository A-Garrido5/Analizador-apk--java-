// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.library.media.model.EditableMedia;
import android.database.Cursor;
import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.util.f;
import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import android.content.Context;

public class bc extends bd
{
    private final long e;
    
    public bc(final Context context, final Session session, final long e) {
        super(context, bc.class.getName(), session);
        this.e = e;
        this.a(false);
    }
    
    @Override
    protected void a(final aa aa) {
        final bg v = this.V();
        final b w = this.W();
        final Cursor g = v.g(this.e);
        if (g != null) {
            if (g.moveToNext()) {
                final DMLocalMessageEntry dmLocalMessageEntry = (DMLocalMessageEntry)com.twitter.util.f.a(g.getBlob(5));
                dmLocalMessageEntry.id = g.getLong(0);
                dmLocalMessageEntry.senderId = g.getLong(2);
                dmLocalMessageEntry.conversationId = g.getString(1);
                v.a(dmLocalMessageEntry, 1, w);
                w.a();
                EditableMedia editableImage;
                if (dmLocalMessageEntry.attachment == null || !"photo".equals(dmLocalMessageEntry.attachment.a())) {
                    editableImage = null;
                }
                else {
                    editableImage = ((DMPhoto)dmLocalMessageEntry.attachment).editableImage;
                }
                DMTweet dmTweet;
                if (dmLocalMessageEntry.attachment != null && "tweet".equals(dmLocalMessageEntry.attachment.a())) {
                    dmTweet = (DMTweet)dmLocalMessageEntry.attachment;
                }
                else {
                    dmTweet = null;
                }
                this.a(dmLocalMessageEntry, editableImage, aa, dmTweet);
            }
            g.close();
        }
    }
    
    @Override
    public boolean b() {
        return true;
    }
}
