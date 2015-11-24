// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public interface Voip$SignalingCallback
{
    void sendAccept(final String p0, final String p1, final String p2, final int p3, final byte[][] p4, final int[] p5, final byte[] p6, final byte[] p7, final byte[] p8, final int p9);
    
    void sendOffer(final String p0, final String p1, final boolean p2, final byte[][] p3, final int[] p4, final byte[] p5, final byte[] p6);
    
    void sendPreAccept(final String p0, final String p1, final String p2, final int p3, final byte[] p4);
    
    void sendReject(final String p0, final String p1, final String p2);
    
    void sendRelayElection(final String p0, final String p1, final byte[] p2, final int p3);
    
    void sendRelayLatencies(final String p0, final String p1, final byte[][] p2, final int[] p3);
    
    void sendTerminate(final String p0, final String p1, final String p2);
    
    void sendTransport(final String p0, final String p1, final byte[][] p2, final int[] p3);
}
