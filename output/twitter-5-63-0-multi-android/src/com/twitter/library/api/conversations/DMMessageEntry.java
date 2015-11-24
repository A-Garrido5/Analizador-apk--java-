// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.twitter.library.api.bh;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.TweetEntities;

public class DMMessageEntry extends BaseConversationEntry
{
    private static final long serialVersionUID = 8402364781755369923L;
    public BaseDMAttachment attachment;
    public TweetEntities entities;
    public boolean isSpam;
    public long messageId;
    public String requestId;
    public long sortId;
    public String text;
    public int type;
    
    public DMMessageEntry() {
    }
    
    public DMMessageEntry(final long n, final long messageId, final String s, final String requestId, final long n2, final long n3, final String text, final TweetEntities entities, final BaseDMAttachment attachment, final boolean isSpam, final boolean b, final boolean b2, final int type) {
        super(n, s, n2, n3, b, b2);
        this.messageId = messageId;
        this.sortId = -1L;
        this.requestId = requestId;
        this.text = text;
        this.entities = entities;
        this.attachment = attachment;
        this.isSpam = isSpam;
        this.type = type;
    }
    
    public static DMMessageEntry a(final JsonParser jsonParser, final boolean b) {
        JsonToken jsonToken = jsonParser.a();
        final ac ac = new ac();
        ac.d(b);
        Object o = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (com.twitter.library.api.conversations.ab.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    final String e = jsonParser.e();
                    if ("id".equals(e)) {
                        ac.a(jsonParser.o());
                        break;
                    }
                    if ("conversation_id".equals(e)) {
                        ac.a(jsonParser.r());
                        break;
                    }
                    if ("request_id".equals(e)) {
                        ac.c(jsonParser.r());
                        break;
                    }
                    break;
                }
                case 6: {
                    final String e2 = jsonParser.e();
                    if ("marked_as_spam".equals(e2)) {
                        ac.c(jsonParser.q());
                        break;
                    }
                    if ("affects_sort".equals(e2)) {
                        final boolean q = jsonParser.q();
                        ac.a(q).b(q);
                        break;
                    }
                    break;
                }
                case 3: {
                    o = jsonParser.g();
                    break;
                }
                case 4: {
                    if ("message_data".equals(o)) {
                        for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                            switch (com.twitter.library.api.conversations.ab.a[jsonToken2.ordinal()]) {
                                case 1:
                                case 2: {
                                    final String e3 = jsonParser.e();
                                    if ("id".equals(e3)) {
                                        ac.b(jsonParser.o());
                                        break;
                                    }
                                    if ("time".equals(e3)) {
                                        ac.c(jsonParser.o());
                                        break;
                                    }
                                    if ("text".equals(e3)) {
                                        ac.b(jsonParser.r());
                                        break;
                                    }
                                    if ("sender_id".equals(e3)) {
                                        ac.d(jsonParser.o());
                                        break;
                                    }
                                    break;
                                }
                                case 3: {
                                    o = jsonParser.g();
                                    break;
                                }
                                case 4: {
                                    if ("entities".equals(o)) {
                                        ac.a(bh.a(jsonParser));
                                        break;
                                    }
                                    if ("attachment".equals(o)) {
                                        ac.a(BaseDMAttachment.a(jsonParser));
                                        break;
                                    }
                                    jsonParser.c();
                                    break;
                                }
                                case 5: {
                                    jsonParser.c();
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 5: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return ac.a();
    }
    
    private long b(final SQLiteDatabase sqLiteDatabase) {
        final Cursor query = sqLiteDatabase.query("conversation_entries", new String[] { "sort_entry_id" }, "entry_id=?", new String[] { String.valueOf(this.id) }, (String)null, (String)null, (String)null);
        if (query != null) {
            try {
                long long1;
                if (query.moveToFirst()) {
                    long1 = query.getLong(0);
                }
                else {
                    long1 = -1L;
                }
                return long1;
            }
            finally {
                query.close();
            }
        }
        return -1L;
    }
    
    @Override
    protected void a(final ContentValues contentValues) {
        contentValues.put("request_id", this.requestId);
        if (this.sortId != -1L) {
            contentValues.put("sort_entry_id", this.sortId);
        }
    }
    
    @Override
    protected void a(final SQLiteDatabase sqLiteDatabase) {
        if (this.requestId != null) {
            if (this.sortId == -1L) {
                this.sortId = this.b(sqLiteDatabase);
            }
            sqLiteDatabase.delete("conversation_entries", "request_id=? AND entry_type=1", new String[] { this.requestId });
        }
    }
    
    public boolean a(final String s) {
        return this.attachment != null && this.attachment.a().equals(s);
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
        if (this.senderId == n && this.affectsReadableCursor) {
            at.a(sqLiteDatabase, this.conversationId, this.id);
        }
    }
    
    public int d() {
        return this.type;
    }
    
    public boolean f() {
        return this.a("tweet") && ((DMTweet)this.attachment).quotedTweetData != null;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.messageId = objectInput.readLong();
        this.text = (String)objectInput.readObject();
        this.entities = (TweetEntities)objectInput.readObject();
        this.attachment = (BaseDMAttachment)objectInput.readObject();
        this.requestId = (String)objectInput.readObject();
        this.isSpam = objectInput.readBoolean();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeLong(this.messageId);
        objectOutput.writeObject(this.text);
        objectOutput.writeObject(this.entities);
        objectOutput.writeObject(this.attachment);
        objectOutput.writeObject(this.requestId);
        objectOutput.writeBoolean(this.isSpam);
    }
}
