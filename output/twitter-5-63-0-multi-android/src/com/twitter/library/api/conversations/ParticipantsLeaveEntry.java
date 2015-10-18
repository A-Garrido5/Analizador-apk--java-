// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.Iterator;
import android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import android.content.ContentValues;
import com.fasterxml.jackson.core.JsonParser;

public class ParticipantsLeaveEntry extends BaseParticipantEntry
{
    private static final long serialVersionUID = 4878107820486361206L;
    
    public ParticipantsLeaveEntry() {
    }
    
    public ParticipantsLeaveEntry(final l l) {
        super(l);
    }
    
    public static ParticipantsLeaveEntry d(final JsonParser jsonParser) {
        return new ParticipantsLeaveEntry(BaseParticipantEntry.b(jsonParser));
    }
    
    @Override
    protected void a(final ContentValues contentValues) {
        if (!CollectionUtils.a((Collection)this.participants) && this.participants.get(0) != null) {
            contentValues.put("user_id", this.participants.get(0).a);
        }
    }
    
    @Override
    protected boolean a(final SQLiteDatabase sqLiteDatabase, final long n) {
        return !CollectionUtils.a((Collection)this.participants) && this.participants.get(0) != null && this.participants.get(0).a != n;
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
        final Iterator<ay> iterator = this.participants.iterator();
        while (iterator.hasNext()) {
            sqLiteDatabase.delete("conversation_participants", "conversation_id=? AND user_id=?", new String[] { this.conversationId, String.valueOf(iterator.next().a) });
        }
    }
    
    @Override
    protected int d() {
        return 11;
    }
}
