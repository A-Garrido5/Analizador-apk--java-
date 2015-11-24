// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class UpdateConversationNameEntry extends BaseConversationEntry
{
    private static final long serialVersionUID = -933519782683923897L;
    public String newConversationName;
    
    public UpdateConversationNameEntry() {
        this(new bh());
    }
    
    UpdateConversationNameEntry(final bh bh) {
        super(bh);
        this.newConversationName = bh.g;
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
        final String[] array = { this.conversationId };
        final ContentValues contentValues = new ContentValues();
        contentValues.put("title", this.newConversationName);
        sqLiteDatabase.update("conversations", contentValues, "conversation_id=?", array);
    }
    
    @Override
    protected int d() {
        return 8;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.newConversationName = (String)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.newConversationName);
    }
}
