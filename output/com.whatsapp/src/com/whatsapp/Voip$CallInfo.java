// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class Voip$CallInfo
{
    private long bytesReceived;
    private long bytesSent;
    private long callActiveTime;
    private long callDuration;
    private String callId;
    private Voip$CallState callState;
    private boolean isCaller;
    private boolean isEndedByMe;
    private boolean isPeerInterrupted;
    private boolean isSelfInterrupted;
    private String peerId;
    
    public Voip$CallInfo(final Voip$CallState callState, final String callId, final String peerId, final boolean isCaller, final boolean isEndedByMe, final boolean isSelfInterrupted, final boolean isPeerInterrupted, final long callActiveTime, final long callDuration, final long bytesSent, final long bytesReceived) {
        this.callState = callState;
        this.callId = callId;
        this.peerId = peerId;
        this.isCaller = isCaller;
        this.isEndedByMe = isEndedByMe;
        this.isSelfInterrupted = isSelfInterrupted;
        this.isPeerInterrupted = isPeerInterrupted;
        this.callActiveTime = callActiveTime;
        this.callDuration = callDuration;
        this.bytesSent = bytesSent;
        this.bytesReceived = bytesReceived;
    }
    
    public long getBytesReceived() {
        return this.bytesReceived;
    }
    
    public long getBytesSent() {
        return this.bytesSent;
    }
    
    public long getCallActiveTime() {
        return this.callActiveTime;
    }
    
    public long getCallDuration() {
        return this.callDuration;
    }
    
    public String getCallId() {
        return this.callId;
    }
    
    public Voip$CallState getCallState() {
        return this.callState;
    }
    
    public String getPeerId() {
        return this.peerId;
    }
    
    public boolean isCaller() {
        return this.isCaller;
    }
    
    public boolean isEndedByMe() {
        return this.isEndedByMe;
    }
    
    public boolean isPeerInterrupted() {
        return this.isPeerInterrupted;
    }
    
    public boolean isSelfInterrupted() {
        return this.isSelfInterrupted;
    }
}
