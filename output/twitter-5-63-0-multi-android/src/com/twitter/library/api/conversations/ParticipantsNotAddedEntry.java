// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

public class ParticipantsNotAddedEntry extends BaseConversationEntry
{
    private static final long serialVersionUID = -3996883232527885666L;
    public List notAddedUserNames;
    
    public ParticipantsNotAddedEntry() {
    }
    
    public ParticipantsNotAddedEntry(final long n, final String s, final long n2, final List notAddedUserNames, final boolean b) {
        super(n, s, n2, -1L, b);
        this.notAddedUserNames = notAddedUserNames;
    }
    
    @Override
    protected void b(final SQLiteDatabase sqLiteDatabase, final long n) {
    }
    
    @Override
    protected int d() {
        return 18;
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        this.notAddedUserNames = (List)objectInput.readObject();
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.notAddedUserNames);
    }
}
