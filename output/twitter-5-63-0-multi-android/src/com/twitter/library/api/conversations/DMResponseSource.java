// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

public enum DMResponseSource
{
    a("USER_INBOX", 0, "user_inbox"), 
    b("USER_EVENTS", 1, "user_events"), 
    c("CONVERSATION_TIMELINE", 2, "conversation_timeline"), 
    d("USER_REQUESTS", 3, "user_requests"), 
    e("MESSAGE_CREATE", 4, "message_create"), 
    f("ADD_PARTICIPANTS", 5, "add_participants");
    
    private final String mName;
    
    private DMResponseSource(final String s, final int n, final String mName) {
        this.mName = mName;
    }
    
    public static DMResponseSource a(final String s) {
        for (final DMResponseSource dmResponseSource : values()) {
            if (dmResponseSource.mName.equals(s)) {
                return dmResponseSource;
            }
        }
        return null;
    }
}
