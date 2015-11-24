// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public interface Voip$EventCallback
{
    void NoSamplingRatesForAudioRecord();
    
    void audioInitError();
    
    void audioStreamStarted();
    
    void callAcceptFailed();
    
    void callAcceptReceived();
    
    void callAcceptSent();
    
    void callCaptureBufferFilled(final Voip$DebugTapType p0, final byte[] p1, final int p2, final Voip$RecordingInfo[] p3);
    
    void callCaptureEnded(final Voip$DebugTapType p0, final Voip$RecordingInfo[] p1);
    
    void callEnding();
    
    void callInterrupted();
    
    void callOfferAckedWithRelayInfo();
    
    void callOfferNacked(final int p0);
    
    void callOfferReceiptReceived();
    
    void callOfferReceived();
    
    void callOfferSent();
    
    void callRejectReceived(final String p0);
    
    void callResumed();
    
    void callStateChanged(final Voip$CallState p0, final Voip$CallInfo p1);
    
    void callTerminateReceived();
    
    void errorGatheringHostCandidates();
    
    void handleAcceptFailed();
    
    void handleOfferFailed();
    
    void incompatibleSrtpKeyExchange();
    
    void mediaStreamError();
    
    void mediaStreamStartError();
    
    void missingRelayInfo();
    
    void p2pNegotaitionFailed();
    
    void p2pNegotiationSuccess();
    
    void p2pTransportCreateFailed();
    
    void p2pTransportMediaCreateFailed();
    
    void p2pTransportRestartSuccess();
    
    void p2pTransportStartFailed();
    
    void relayBindsFailed();
    
    void relayCreateSuccess();
    
    void relayElectionSendFailed();
    
    void relayLatencySendFailed();
    
    void rtcpPacketReceived();
    
    void rxTimeout();
    
    void rxTrafficStarted();
    
    void rxTrafficStopped();
    
    void sendAcceptFailed();
    
    void sendOfferFailed();
    
    void soundPortCreateFailed();
    
    void soundPortCreated();
    
    void transportCandSendFailed();
    
    void txTimeout();
    
    void willCreateSoundPort();
}
