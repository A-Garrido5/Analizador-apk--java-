// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import com.whatsapp.DialogToastActivity;
import android.content.Context;

public final class Events$Call extends b9
{
    public Double audioGetFrameUnderflowPs;
    public Double audioPutFrameOverflowPs;
    public Double avgDecodeT;
    public Double avgEncodeT;
    public Double avgPlayCbT;
    public Double avgRecordCbT;
    public Double avgRecordGetFrameT;
    public Double avgTargetBitrate;
    public Double builtinAecAvailable;
    public Double builtinAgcAvailable;
    public Double builtinNsAvailable;
    public Double callAcceptFuncT;
    public Double callAecMode;
    public Double callAecOffset;
    public Double callAecTailLength;
    public Double callAgcMode;
    public Double callAndroidAudioMode;
    public Double callAndroidRecordAudioPreset;
    public Double callAndroidRecordAudioSource;
    public Double callAudioEngineType;
    public Double callAudioRestartCount;
    public Double callAvgRtt;
    public Double callCalculatedEcOffset;
    public Double callCalculatedEcOffsetStddev;
    public Double callEchoLikelihood;
    public Double callEndFuncT;
    public Double callFromUi;
    public Double callHistEchoLikelihood;
    public Double callLastRtt;
    public Double callMaxRtt;
    public Double callMinRtt;
    public Double callNetwork;
    public Double callNsMode;
    public Double callOfferElapsedT;
    public Double callOfferReceiptDelay;
    public String callPeerAppVersion;
    public String callPeerPlatform;
    public Double callPlaybackBufferSize;
    public Double callPlaybackCallbackStopped;
    public Double callPlaybackFramesPs;
    public Double callRecordBufferSize;
    public Double callRecordCallbackStopped;
    public Double callRecordFramesPs;
    public Double callRecordSilenceRatio;
    public Double callRejectFuncT;
    public Double callRelayBindStatus;
    public Double callRelayCreateT;
    public String callRelayServer;
    public Double callResult;
    public Double callRingingT;
    public Double callRxAvgBitrate;
    public Double callRxAvgJitter;
    public Double callRxAvgLossPeriod;
    public Double callRxMaxJitter;
    public Double callRxMaxLossPeriod;
    public Double callRxMinJitter;
    public Double callRxMinLossPeriod;
    public Double callRxPktLossPct;
    public Double callRxStoppedT;
    public Double callSamplingRate;
    public Double callServerNackErrorCode;
    public Double callSetupErrorType;
    public Double callSetupT;
    public Double callSide;
    public Double callSoundPortFuncT;
    public Double callStartFuncT;
    public Double callSwAecMode;
    public Double callSwAecType;
    public Double callT;
    public Double callTermReason;
    public String callTestBucket;
    public Double callTonesDetectedInRecord;
    public Double callTonesDetectedInRingback;
    public Double callTransitionCount;
    public Double callTransport;
    public Double callTransportP2pToRelayFallbackCount;
    public Double callTransportRelayToRelayFallbackCount;
    public Double callTxAvgBitrate;
    public Double callTxAvgJitter;
    public Double callTxAvgLossPeriod;
    public Double callTxMaxJitter;
    public Double callTxMaxLossPeriod;
    public Double callTxMinJitter;
    public Double callTxMinLossPeriod;
    public Double callTxPktLossPct;
    public Double callUserRate;
    public Double callWakeupSource;
    public Double encoderCompStepdowns;
    public Double jbAvgDelay;
    public Double jbDiscards;
    public Double jbEmpties;
    public Double jbGets;
    public Double jbLastDelay;
    public Double jbMaxDelay;
    public Double jbMinDelay;
    public Double jbPuts;
    public Double longConnect;
    public Double peerCallResult;
    public Double peerLoc;
    public Double peerUserId;
    public Double peerXmppStatus;
    public Double rcMaxrtt;
    public Double rcMinrtt;
    public Double rxTotalBitrate;
    public Double rxTotalBytes;
    public Double txTotalBitrate;
    public Double txTotalBytes;
    public String userDescription;
    public Double userRating;
    public Double xmppStatus;
    
    @Override
    void updateFields(final Context context) {
        final int a = aj.a;
        a5.a(context, o.EVENT, Integer.valueOf(a3.CALL.getCode()));
        a5.a(context, o.AUDIO_GET_FRAME_UNDERFLOW_PS, this.audioGetFrameUnderflowPs);
        a5.a(context, o.AUDIO_PUT_FRAME_OVERFLOW_PS, this.audioPutFrameOverflowPs);
        a5.a(context, o.BUILTIN_AEC_AVAILABLE, this.builtinAecAvailable);
        a5.a(context, o.BUILTIN_AGC_AVAILABLE, this.builtinAgcAvailable);
        a5.a(context, o.BUILTIN_NS_AVAILABLE, this.builtinNsAvailable);
        a5.a(context, o.CALL_AEC_MODE, this.callAecMode);
        a5.a(context, o.CALL_AEC_OFFSET, this.callAecOffset);
        a5.a(context, o.CALL_AEC_TAIL_LENGTH, this.callAecTailLength);
        a5.a(context, o.CALL_AGC_MODE, this.callAgcMode);
        a5.a(context, o.CALL_ANDROID_AUDIO_MODE, this.callAndroidAudioMode);
        a5.a(context, o.CALL_ANDROID_RECORD_AUDIO_PRESET, this.callAndroidRecordAudioPreset);
        a5.a(context, o.CALL_ANDROID_RECORD_AUDIO_SOURCE, this.callAndroidRecordAudioSource);
        a5.a(context, o.CALL_AUDIO_ENGINE_TYPE, this.callAudioEngineType);
        a5.a(context, o.CALL_CALCULATED_EC_OFFSET, this.callCalculatedEcOffset);
        a5.a(context, o.CALL_CALCULATED_EC_OFFSET_STDDEV, this.callCalculatedEcOffsetStddev);
        a5.a(context, o.CALL_ECHO_LIKELIHOOD, this.callEchoLikelihood);
        a5.a(context, o.CALL_FROM_UI, this.callFromUi);
        a5.a(context, o.CALL_NETWORK, this.callNetwork);
        a5.a(context, o.CALL_NS_MODE, this.callNsMode);
        a5.a(context, o.CALL_PEER_APP_VERSION, this.callPeerAppVersion);
        a5.a(context, o.CALL_PEER_PLATFORM, this.callPeerPlatform);
        a5.a(context, o.CALL_PLAYBACK_BUFFER_SIZE, this.callPlaybackBufferSize);
        a5.a(context, o.CALL_PLAYBACK_CALLBACK_STOPPED, this.callPlaybackCallbackStopped);
        a5.a(context, o.CALL_RECORD_BUFFER_SIZE, this.callRecordBufferSize);
        a5.a(context, o.CALL_RECORD_CALLBACK_STOPPED, this.callRecordCallbackStopped);
        a5.a(context, o.CALL_RECORD_FRAMES_PS, this.callRecordFramesPs);
        a5.a(context, o.CALL_RECORD_SILENCE_RATIO, this.callRecordSilenceRatio);
        a5.a(context, o.CALL_RELAY_BIND_STATUS, this.callRelayBindStatus);
        a5.a(context, o.CALL_RELAY_SERVER, this.callRelayServer);
        a5.a(context, o.CALL_RESULT, this.callResult);
        a5.a(context, o.CALL_SAMPLING_RATE, this.callSamplingRate);
        a5.a(context, o.CALL_SERVER_NACK_ERROR_CODE, this.callServerNackErrorCode);
        a5.a(context, o.CALL_SETUP_ERROR_TYPE, this.callSetupErrorType);
        a5.a(context, o.CALL_SIDE, this.callSide);
        a5.a(context, o.CALL_SW_AEC_MODE, this.callSwAecMode);
        a5.a(context, o.CALL_SW_AEC_TYPE, this.callSwAecType);
        a5.a(context, o.CALL_TERM_REASON, this.callTermReason);
        a5.a(context, o.CALL_TEST_BUCKET, this.callTestBucket);
        a5.a(context, o.CALL_TONES_DETECTED_IN_RECORD, this.callTonesDetectedInRecord);
        a5.a(context, o.CALL_TONES_DETECTED_IN_RINGBACK, this.callTonesDetectedInRingback);
        a5.a(context, o.CALL_TRANSITION_COUNT, this.callTransitionCount);
        a5.a(context, o.CALL_TRANSPORT, this.callTransport);
        a5.a(context, o.CALL_TRANSPORT_P2P_TO_RELAY_FALLBACK_COUNT, this.callTransportP2pToRelayFallbackCount);
        a5.a(context, o.CALL_TRANSPORT_RELAY_TO_RELAY_FALLBACK_COUNT, this.callTransportRelayToRelayFallbackCount);
        a5.a(context, o.CALL_USER_RATE, this.callUserRate);
        a5.a(context, o.CALL_WAKEUP_SOURCE, this.callWakeupSource);
        a5.a(context, o.ENCODER_COMP_STEPDOWNS, this.encoderCompStepdowns);
        a5.a(context, o.LONG_CONNECT, this.longConnect);
        a5.a(context, o.PEER_CALL_RESULT, this.peerCallResult);
        a5.a(context, o.PEER_LOC, this.peerLoc);
        a5.a(context, o.PEER_USER_ID, this.peerUserId);
        a5.a(context, o.PEER_XMPP_STATUS, this.peerXmppStatus);
        a5.a(context, o.USER_DESCRIPTION, this.userDescription);
        a5.a(context, o.USER_RATING, this.userRating);
        a5.a(context, o.XMPP_STATUS, this.xmppStatus);
        if (this.avgDecodeT != null) {
            a5.a(context, a1.AVG_DECODE_T, this.avgDecodeT);
        }
        if (this.avgEncodeT != null) {
            a5.a(context, a1.AVG_ENCODE_T, this.avgEncodeT);
        }
        if (this.avgPlayCbT != null) {
            a5.a(context, a1.AVG_PLAY_CB_T, this.avgPlayCbT);
        }
        if (this.avgRecordCbT != null) {
            a5.a(context, a1.AVG_RECORD_CB_T, this.avgRecordCbT);
        }
        if (this.avgRecordGetFrameT != null) {
            a5.a(context, a1.AVG_RECORD_GET_FRAME_T, this.avgRecordGetFrameT);
        }
        if (this.avgTargetBitrate != null) {
            a5.a(context, a1.AVG_TARGET_BITRATE, this.avgTargetBitrate);
        }
        if (this.callAcceptFuncT != null) {
            a5.a(context, a1.CALL_ACCEPT_FUNC_T, this.callAcceptFuncT);
        }
        if (this.callAudioRestartCount != null) {
            a5.a(context, a1.CALL_AUDIO_RESTART_COUNT, this.callAudioRestartCount);
        }
        if (this.callAvgRtt != null) {
            a5.a(context, a1.CALL_AVG_RTT, this.callAvgRtt);
        }
        if (this.callEndFuncT != null) {
            a5.a(context, a1.CALL_END_FUNC_T, this.callEndFuncT);
        }
        if (this.callHistEchoLikelihood != null) {
            a5.a(context, a1.CALL_HIST_ECHO_LIKELIHOOD, this.callHistEchoLikelihood);
        }
        if (this.callLastRtt != null) {
            a5.a(context, a1.CALL_LAST_RTT, this.callLastRtt);
        }
        if (this.callMaxRtt != null) {
            a5.a(context, a1.CALL_MAX_RTT, this.callMaxRtt);
        }
        if (this.callMinRtt != null) {
            a5.a(context, a1.CALL_MIN_RTT, this.callMinRtt);
        }
        if (this.callOfferElapsedT != null) {
            a5.a(context, a1.CALL_OFFER_ELAPSED_T, this.callOfferElapsedT);
        }
        if (this.callOfferReceiptDelay != null) {
            a5.a(context, a1.CALL_OFFER_RECEIPT_DELAY, this.callOfferReceiptDelay);
        }
        if (this.callPlaybackFramesPs != null) {
            a5.a(context, a1.CALL_PLAYBACK_FRAMES_PS, this.callPlaybackFramesPs);
        }
        if (this.callRejectFuncT != null) {
            a5.a(context, a1.CALL_REJECT_FUNC_T, this.callRejectFuncT);
        }
        if (this.callRelayCreateT != null) {
            a5.a(context, a1.CALL_RELAY_CREATE_T, this.callRelayCreateT);
        }
        if (this.callRingingT != null) {
            a5.a(context, a1.CALL_RINGING_T, this.callRingingT);
        }
        if (this.callRxAvgBitrate != null) {
            a5.a(context, a1.CALL_RX_AVG_BITRATE, this.callRxAvgBitrate);
        }
        if (this.callRxAvgJitter != null) {
            a5.a(context, a1.CALL_RX_AVG_JITTER, this.callRxAvgJitter);
        }
        if (this.callRxAvgLossPeriod != null) {
            a5.a(context, a1.CALL_RX_AVG_LOSS_PERIOD, this.callRxAvgLossPeriod);
        }
        if (this.callRxMaxJitter != null) {
            a5.a(context, a1.CALL_RX_MAX_JITTER, this.callRxMaxJitter);
        }
        if (this.callRxMaxLossPeriod != null) {
            a5.a(context, a1.CALL_RX_MAX_LOSS_PERIOD, this.callRxMaxLossPeriod);
        }
        if (this.callRxMinJitter != null) {
            a5.a(context, a1.CALL_RX_MIN_JITTER, this.callRxMinJitter);
        }
        if (this.callRxMinLossPeriod != null) {
            a5.a(context, a1.CALL_RX_MIN_LOSS_PERIOD, this.callRxMinLossPeriod);
        }
        if (this.callRxPktLossPct != null) {
            a5.a(context, a1.CALL_RX_PKT_LOSS_PCT, this.callRxPktLossPct);
        }
        if (this.callRxStoppedT != null) {
            a5.a(context, a1.CALL_RX_STOPPED_T, this.callRxStoppedT);
        }
        if (this.callSetupT != null) {
            a5.a(context, a1.CALL_SETUP_T, this.callSetupT);
        }
        if (this.callSoundPortFuncT != null) {
            a5.a(context, a1.CALL_SOUND_PORT_FUNC_T, this.callSoundPortFuncT);
        }
        if (this.callStartFuncT != null) {
            a5.a(context, a1.CALL_START_FUNC_T, this.callStartFuncT);
        }
        if (this.callT != null) {
            a5.a(context, a1.CALL_T, this.callT);
        }
        if (this.callTxAvgBitrate != null) {
            a5.a(context, a1.CALL_TX_AVG_BITRATE, this.callTxAvgBitrate);
        }
        if (this.callTxAvgJitter != null) {
            a5.a(context, a1.CALL_TX_AVG_JITTER, this.callTxAvgJitter);
        }
        if (this.callTxAvgLossPeriod != null) {
            a5.a(context, a1.CALL_TX_AVG_LOSS_PERIOD, this.callTxAvgLossPeriod);
        }
        if (this.callTxMaxJitter != null) {
            a5.a(context, a1.CALL_TX_MAX_JITTER, this.callTxMaxJitter);
        }
        if (this.callTxMaxLossPeriod != null) {
            a5.a(context, a1.CALL_TX_MAX_LOSS_PERIOD, this.callTxMaxLossPeriod);
        }
        if (this.callTxMinJitter != null) {
            a5.a(context, a1.CALL_TX_MIN_JITTER, this.callTxMinJitter);
        }
        if (this.callTxMinLossPeriod != null) {
            a5.a(context, a1.CALL_TX_MIN_LOSS_PERIOD, this.callTxMinLossPeriod);
        }
        if (this.callTxPktLossPct != null) {
            a5.a(context, a1.CALL_TX_PKT_LOSS_PCT, this.callTxPktLossPct);
        }
        if (this.jbAvgDelay != null) {
            a5.a(context, a1.JB_AVG_DELAY, this.jbAvgDelay);
        }
        if (this.jbDiscards != null) {
            a5.a(context, a1.JB_DISCARDS, this.jbDiscards);
        }
        if (this.jbEmpties != null) {
            a5.a(context, a1.JB_EMPTIES, this.jbEmpties);
        }
        if (this.jbGets != null) {
            a5.a(context, a1.JB_GETS, this.jbGets);
        }
        if (this.jbLastDelay != null) {
            a5.a(context, a1.JB_LAST_DELAY, this.jbLastDelay);
        }
        if (this.jbMaxDelay != null) {
            a5.a(context, a1.JB_MAX_DELAY, this.jbMaxDelay);
        }
        if (this.jbMinDelay != null) {
            a5.a(context, a1.JB_MIN_DELAY, this.jbMinDelay);
        }
        if (this.jbPuts != null) {
            a5.a(context, a1.JB_PUTS, this.jbPuts);
        }
        if (this.rcMaxrtt != null) {
            a5.a(context, a1.RC_MAXRTT, this.rcMaxrtt);
        }
        if (this.rcMinrtt != null) {
            a5.a(context, a1.RC_MINRTT, this.rcMinrtt);
        }
        if (this.rxTotalBitrate != null) {
            a5.a(context, a1.RX_TOTAL_BITRATE, this.rxTotalBitrate);
        }
        if (this.rxTotalBytes != null) {
            a5.a(context, a1.RX_TOTAL_BYTES, this.rxTotalBytes);
        }
        if (this.txTotalBitrate != null) {
            a5.a(context, a1.TX_TOTAL_BITRATE, this.txTotalBitrate);
        }
        if (this.txTotalBytes != null) {
            a5.a(context, a1.TX_TOTAL_BYTES, this.txTotalBytes);
        }
        a5.a(context, o.EVENT);
        if (a != 0) {
            DialogToastActivity.h = !DialogToastActivity.h;
        }
    }
}
