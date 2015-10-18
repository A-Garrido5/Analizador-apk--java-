// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.io.ObjectOutput;
import java.io.EOFException;
import java.io.OptionalDataException;
import java.io.ObjectInput;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;

public class JoinConversationEntry extends BaseConversationEntry
{
    private static final long serialVersionUID = 9211336333993680331L;
    public List participants;
    
    public JoinConversationEntry() {
    }
    
    protected JoinConversationEntry(final long n, final String s, final long n2, final long n3, final List participants, final boolean b) {
        super(n, s, n2, n3, b);
        this.participants = participants;
    }
    
    public static JoinConversationEntry b(final JsonParser jsonParser) {
        long o = -1L;
        JsonToken jsonToken = jsonParser.a();
        String r = null;
        boolean q = false;
        final ArrayList<Long> list = new ArrayList<Long>();
        long o2 = o;
        long o3 = o;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (ar.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    final String e = jsonParser.e();
                    if ("id".equals(e)) {
                        o3 = jsonParser.o();
                        break;
                    }
                    if ("conversation_id".equals(e)) {
                        r = jsonParser.r();
                        break;
                    }
                    if ("time".equals(e)) {
                        o2 = jsonParser.o();
                        break;
                    }
                    if ("sender_id".equals(e)) {
                        o = jsonParser.o();
                        break;
                    }
                    break;
                }
                case 3: {
                    if ("affects_sort".equals(jsonParser.e())) {
                        q = jsonParser.q();
                        break;
                    }
                    break;
                }
                case 4: {
                    jsonParser.c();
                    break;
                }
                case 5: {
                    if ("participants".equals(jsonParser.e())) {
                        final Iterator<ay> iterator = s.a(jsonParser).iterator();
                        while (iterator.hasNext()) {
                            list.add(iterator.next().a);
                        }
                        break;
                    }
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return new JoinConversationEntry(o3, r, o2, o, list, q);
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
    }
    
    @Override
    protected int d() {
        return 17;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        try {
            this.participants = (List)objectInput.readObject();
        }
        catch (OptionalDataException ex) {}
        catch (EOFException ex2) {}
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.participants);
    }
}
