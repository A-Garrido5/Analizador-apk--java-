// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.Serializable;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.Externalizable;

public abstract class BaseConversationEntry extends f implements Externalizable
{
    private static final long serialVersionUID = 3682610414758044297L;
    public boolean affectsReadableCursor;
    public boolean affectsSort;
    
    protected BaseConversationEntry() {
    }
    
    protected BaseConversationEntry(final long n, final String s, final long n2, final long n3, final boolean b) {
        this(n, s, n2, n3, b, b);
    }
    
    protected BaseConversationEntry(final long n, final String s, final long n2, final long n3, final boolean affectsSort, final boolean affectsReadableCursor) {
        super(n, s, n2, n3);
        this.affectsSort = affectsSort;
        this.affectsReadableCursor = affectsReadableCursor;
    }
    
    BaseConversationEntry(final e e) {
        super(e);
        this.affectsSort = e.a;
        this.affectsReadableCursor = e.b;
    }
    
    public static void a(final SQLiteDatabase sqLiteDatabase, final String s, final long n) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("last_readable_event_id", n);
        sqLiteDatabase.update("conversations", contentValues, "conversation_id=? AND last_readable_event_id < ?", new String[] { s, String.valueOf(n) });
    }
    
    public static void a(final SQLiteDatabase sqLiteDatabase, final String s, final long n, final long n2) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("sort_event_id", n);
        contentValues.put("sort_timestamp", n2);
        sqLiteDatabase.update("conversations", contentValues, "conversation_id=? AND sort_event_id < ?", new String[] { s, String.valueOf(n) });
    }
    
    protected void a(final ContentValues contentValues) {
    }
    
    protected void a(final SQLiteDatabase sqLiteDatabase) {
    }
    
    @Override
    public final void a(final SQLiteDatabase sqLiteDatabase, final long n, final boolean b, final boolean b2) {
        super.a(sqLiteDatabase, n, b, b2);
        if (this.a(sqLiteDatabase, n)) {
            this.a(sqLiteDatabase);
            final ContentValues contentValues = new ContentValues();
            contentValues.put("entry_id", this.id);
            contentValues.put("sort_entry_id", this.id);
            contentValues.put("conversation_id", this.conversationId);
            contentValues.put("created", this.date);
            contentValues.put("entry_type", this.d());
            contentValues.put("data", this.c());
            if (-1L != this.senderId) {
                contentValues.put("user_id", this.senderId);
            }
            this.a(contentValues);
            int n2;
            if (b2) {
                n2 = 5;
            }
            else {
                n2 = 4;
            }
            sqLiteDatabase.insertWithOnConflict("conversation_entries", "entry_id", contentValues, n2);
        }
        if (this.affectsSort) {
            a(sqLiteDatabase, this.conversationId, this.id, this.date);
        }
        if (this.affectsReadableCursor) {
            a(sqLiteDatabase, this.conversationId, this.id);
        }
    }
    
    protected boolean a(final SQLiteDatabase sqLiteDatabase, final long n) {
        return true;
    }
    
    public byte[] c() {
        return com.twitter.util.f.a(this);
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
    }
}
