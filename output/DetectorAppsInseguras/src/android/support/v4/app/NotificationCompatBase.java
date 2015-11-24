// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Bundle;
import android.app.PendingIntent;

class NotificationCompatBase
{
    public abstract static class Action
    {
        protected abstract PendingIntent getActionIntent();
        
        protected abstract Bundle getExtras();
        
        protected abstract int getIcon();
        
        protected abstract RemoteInputCompatBase.RemoteInput[] getRemoteInputs();
        
        protected abstract CharSequence getTitle();
        
        public interface Factory
        {
            Action build(final int p0, final CharSequence p1, final PendingIntent p2, final Bundle p3, final RemoteInputCompatBase.RemoteInput[] p4);
            
            Action[] newArray(final int p0);
        }
    }
    
    public abstract static class UnreadConversation
    {
        abstract long getLatestTimestamp();
        
        abstract String[] getMessages();
        
        abstract String getParticipant();
        
        abstract String[] getParticipants();
        
        abstract PendingIntent getReadPendingIntent();
        
        abstract RemoteInputCompatBase.RemoteInput getRemoteInput();
        
        abstract PendingIntent getReplyPendingIntent();
        
        public interface Factory
        {
            UnreadConversation build(final String[] p0, final RemoteInputCompatBase.RemoteInput p1, final PendingIntent p2, final PendingIntent p3, final String[] p4, final long p5);
        }
    }
}
