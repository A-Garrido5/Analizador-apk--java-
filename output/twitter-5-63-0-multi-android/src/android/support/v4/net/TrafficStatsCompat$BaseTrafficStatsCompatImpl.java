// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.net;

import java.net.Socket;

class TrafficStatsCompat$BaseTrafficStatsCompatImpl implements TrafficStatsCompat$TrafficStatsCompatImpl
{
    private ThreadLocal mThreadSocketTags;
    
    TrafficStatsCompat$BaseTrafficStatsCompatImpl() {
        this.mThreadSocketTags = new TrafficStatsCompat$BaseTrafficStatsCompatImpl$1(this);
    }
    
    @Override
    public void clearThreadStatsTag() {
        this.mThreadSocketTags.get().statsTag = -1;
    }
    
    @Override
    public int getThreadStatsTag() {
        return this.mThreadSocketTags.get().statsTag;
    }
    
    @Override
    public void incrementOperationCount(final int n) {
    }
    
    @Override
    public void incrementOperationCount(final int n, final int n2) {
    }
    
    @Override
    public void setThreadStatsTag(final int statsTag) {
        this.mThreadSocketTags.get().statsTag = statsTag;
    }
    
    @Override
    public void tagSocket(final Socket socket) {
    }
    
    @Override
    public void untagSocket(final Socket socket) {
    }
}
