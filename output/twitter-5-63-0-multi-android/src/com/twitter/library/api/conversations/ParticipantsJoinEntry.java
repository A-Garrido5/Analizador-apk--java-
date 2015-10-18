// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.content.ContentValues;
import android.database.Cursor;
import java.util.Iterator;
import com.twitter.library.provider.bg;
import java.util.ArrayList;
import java.util.HashSet;
import android.database.sqlite.SQLiteDatabase;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;

public class ParticipantsJoinEntry extends BaseParticipantEntry
{
    private static final long serialVersionUID = -155587558613762949L;
    public List addedUserNames;
    public String senderName;
    
    public ParticipantsJoinEntry() {
    }
    
    public ParticipantsJoinEntry(final l l) {
        super(l);
    }
    
    public static ParticipantsJoinEntry d(final JsonParser jsonParser) {
        return new ParticipantsJoinEntry(BaseParticipantEntry.b(jsonParser));
    }
    
    @Override
    protected void a(final SQLiteDatabase sqLiteDatabase) {
        final HashSet<Long> set = new HashSet<Long>(this.participants.size());
        final Iterator<ay> iterator = this.participants.iterator();
        while (iterator.hasNext()) {
            set.add(iterator.next().a);
        }
        final String[] array = { "name" };
        this.addedUserNames = new ArrayList();
        final Cursor query = sqLiteDatabase.query("users", array, "user_id=?", new String[] { String.valueOf(this.senderId) }, (String)null, (String)null, (String)null);
        if (query != null) {
            if (query.moveToNext()) {
                this.senderName = query.getString(0);
            }
            query.close();
        }
        final Cursor query2 = sqLiteDatabase.query("users", array, "user_id " + bg.a((Iterable)set), (String[])null, (String)null, (String)null, (String)null);
        if (query2 != null) {
            while (query2.moveToNext()) {
                this.addedUserNames.add(query2.getString(0));
            }
            query2.close();
        }
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
        final ContentValues contentValues = new ContentValues();
        for (final ay ay : this.participants) {
            contentValues.clear();
            contentValues.put("conversation_id", this.conversationId);
            contentValues.put("user_id", ay.a);
            contentValues.put("join_time", ay.b);
            contentValues.put("participant_type", 1);
            sqLiteDatabase.insertWithOnConflict("conversation_participants", (String)null, contentValues, 4);
        }
    }
    
    @Override
    protected int d() {
        return 10;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.senderName = (String)objectInput.readObject();
        this.addedUserNames = (List)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.senderName);
        objectOutput.writeObject(this.addedUserNames);
    }
}
