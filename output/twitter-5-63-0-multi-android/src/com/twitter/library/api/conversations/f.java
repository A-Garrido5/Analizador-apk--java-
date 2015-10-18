// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.database.sqlite.SQLiteDatabase;
import com.twitter.model.json.dms.JsonUpdateConversationNameEntry;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.twitter.library.api.ab;

public abstract class f implements ab
{
    public String conversationId;
    public long date;
    public long id;
    public long senderId;
    
    protected f() {
    }
    
    protected f(final long n, final String s, final long n2) {
        this(n, s, n2, -1L);
    }
    
    protected f(final long id, final String conversationId, final long date, final long senderId) {
        this.id = id;
        this.conversationId = conversationId;
        this.date = date;
        this.senderId = senderId;
    }
    
    f(final h h) {
        this.id = h.c;
        this.conversationId = h.d;
        this.date = h.e;
        this.senderId = h.f;
    }
    
    protected static f a(final JsonParser jsonParser) {
        String s = null;
        JsonToken a = jsonParser.a();
        f f = null;
        while (a != null && a != JsonToken.c) {
            String g = null;
            f f2 = null;
            switch (com.twitter.library.api.conversations.g.a[a.ordinal()]) {
                default: {
                    g = s;
                    f2 = f;
                    break;
                }
                case 1: {
                    if ("message".equals(s)) {
                        final DMMessageEntry a2 = DMMessageEntry.a(jsonParser, false);
                        final String s2 = s;
                        f2 = a2;
                        g = s2;
                        break;
                    }
                    if ("conversation_create".equals(s)) {
                        final ConversationCreateEntry b = ConversationCreateEntry.b(jsonParser);
                        final String s3 = s;
                        f2 = b;
                        g = s3;
                        break;
                    }
                    if ("user_typing".equals(s)) {
                        final bl b2 = bl.b(jsonParser);
                        final String s4 = s;
                        f2 = b2;
                        g = s4;
                        break;
                    }
                    if ("remove_conversation".equals(s)) {
                        final al b3 = al.b(jsonParser);
                        final String s5 = s;
                        f2 = b3;
                        g = s5;
                        break;
                    }
                    if ("join_conversation".equals(s)) {
                        final JoinConversationEntry b4 = JoinConversationEntry.b(jsonParser);
                        final String s6 = s;
                        f2 = b4;
                        g = s6;
                        break;
                    }
                    if ("message_delete".equals(s)) {
                        final ao b5 = ao.b(jsonParser);
                        final String s7 = s;
                        f2 = b5;
                        g = s7;
                        break;
                    }
                    if ("conversation_name_update".equals(s)) {
                        final JsonUpdateConversationNameEntry jsonUpdateConversationNameEntry = (JsonUpdateConversationNameEntry)wx.d(jsonParser, JsonUpdateConversationNameEntry.class);
                        f f3;
                        if (jsonUpdateConversationNameEntry != null) {
                            f3 = (f)new bh(jsonUpdateConversationNameEntry).f();
                        }
                        else {
                            f3 = f;
                        }
                        final String s8 = s;
                        f2 = f3;
                        g = s8;
                        break;
                    }
                    if ("participants_join".equals(s)) {
                        final ParticipantsJoinEntry d = ParticipantsJoinEntry.d(jsonParser);
                        final String s9 = s;
                        f2 = d;
                        g = s9;
                        break;
                    }
                    if ("participants_leave".equals(s)) {
                        final ParticipantsLeaveEntry d2 = ParticipantsLeaveEntry.d(jsonParser);
                        final String s10 = s;
                        f2 = d2;
                        g = s10;
                        break;
                    }
                    if ("conversation_read".equals(s)) {
                        final as c = as.c(jsonParser);
                        final String s11 = s;
                        f2 = c;
                        g = s11;
                        break;
                    }
                    if ("mark_all_as_read".equals(s)) {
                        final at c2 = at.c(jsonParser);
                        final String s12 = s;
                        f2 = c2;
                        g = s12;
                        break;
                    }
                    if ("disable_notifications".equals(s)) {
                        final be a3 = be.a(jsonParser, true);
                        final String s13 = s;
                        f2 = a3;
                        g = s13;
                        break;
                    }
                    if ("enable_notifications".equals(s)) {
                        final be a4 = be.a(jsonParser, false);
                        final String s14 = s;
                        f2 = a4;
                        g = s14;
                        break;
                    }
                    if ("message_mark_as_spam".equals(s)) {
                        final bk a5 = bk.a(jsonParser, true);
                        final String s15 = s;
                        f2 = a5;
                        g = s15;
                        break;
                    }
                    if ("message_unmark_as_spam".equals(s)) {
                        final bk a6 = bk.a(jsonParser, false);
                        final String s16 = s;
                        f2 = a6;
                        g = s16;
                        break;
                    }
                    jsonParser.c();
                    g = s;
                    f2 = f;
                    break;
                }
                case 2: {
                    g = jsonParser.g();
                    f2 = f;
                    break;
                }
                case 3: {
                    jsonParser.c();
                    g = s;
                    f2 = f;
                    break;
                }
            }
            final JsonToken a7 = jsonParser.a();
            final String s17 = g;
            a = a7;
            f = f2;
            s = s17;
        }
        return f;
    }
    
    @Override
    public long a() {
        return this.id;
    }
    
    public void a(final SQLiteDatabase sqLiteDatabase, final long n, final boolean b, final boolean b2) {
        if (b) {
            this.b(sqLiteDatabase, n);
        }
    }
    
    @Override
    public String b() {
        return String.valueOf(this.id);
    }
    
    protected abstract void b(final SQLiteDatabase p0, final long p1);
    
    protected abstract int d();
}
