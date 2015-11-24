// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import android.net.Uri;
import android.content.Intent;
import android.os.Build$VERSION;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.protocol.bi;
import android.content.Context;
import com.whatsapp.protocol.c6;
import com.whatsapp.util.Log;

public class VoiceService$VoiceServiceEventCallback implements Voip$EventCallback
{
    private static final String[] z;
    protected ahe bufferQueue;
    final VoiceService this$0;
    
    static {
        final String[] z2 = new String[54];
        String s = "q:)\u0017\u001f*.7*\u000e\u0018<0,\u001d;-5";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1382:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = 'K';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = 'Q';
                        break;
                    }
                    case 3: {
                        c2 = 'C';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "q;>6\u0003/\u0018>1\u0019\b:4\"\u0019.\u000e0*\u0001.,";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "q:4/\f2\u000b#&\f?-\u00026\u000e(-\"0";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "q8c3#./>7\u0004*<8,\u0003\u0018=2 \b8;";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "q!? \u0002&807\u0004)$4\u0010\u001f?8\u001a&\u0014\u000e02+\f%/4";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "q<)\u0017\u0004&->6\u0019";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "q+0/\u0001\u0004.7&\u001f\n+:&\t\u001c!%+?.$0:$%.>";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "q 0-\t'-\u0010 \u000e.8%\u0005\f\"$4'";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "q8c399)?0\u001d$:%\u000e\b/!0\u0000\u001f.)%&+*!=&\t";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "q;>6\u0003/\u0018>1\u0019\b:4\"\u0019.,";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "q)$'\u0004$\u0001?*\u0019\u000e:#,\u001f";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "q+0/\u0001\n+2&\u001d?\u000e0*\u0001.,";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "<-q\"\u001f.h?,\u0019k!?c\fk)27\u0004=-q \f'$";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "q:4/\f2\n8-\t8\u000e0*\u0001.,";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u001e\u0006\u001a\r\"\u001c\u0006q \f'$q0\u0019*<4c";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "q+0/\u0001\u0018<07\b\b 0-\n.,y";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "9-71\b8 \u000e-\u0002?!7*\u000e*<8,\u0003";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "gh";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "q)$'\u0004$\u001b%1\b*%\u00027\f9<4'";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "q\u0006>\u0010\f&8=*\u0003,\u001a07\b8\u000e>1,>,8,?.+>1\t";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "q+0/\u0001\u001f-#.\u0004%)%&?.+4*\u001b.,";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "q8c399)?0\u001d$:%\u0000\u001f.)%&+*!=&\t";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "q?8/\u0001\b:4\"\u0019.\u001b>6\u0003/\u0018>1\u0019";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "q8c3#./>7\u0004*<8,\u0003\r)8/\b/";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "q-#1\u00029\u000f07\u0005.:8-\n\u0003'\"7.*&5*\t*<40";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "q+0/\u0001\u0004.7&\u001f\u0019-2&\u0004=-5";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "q8c399)?0\u001d$:%\u0011\b8<01\u0019\u0018=2 \b8;";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "q+0/\u0001\u0004.7&\u001f\u0005)2(\b/h41\u001f$:kc";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "q+0/\u0001\u0002&%&\u001f9=!7\b/";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "q+0/\u0001\u0019-\"6\u0000.,";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "()?c\u0003$<q%\u0004%,q.\b8;0$\bk";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "q+0/\u0001\u000e&5*\u0003,";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "<-q\"\u001f.h?,\u0019k!?c\fk)27\u0004=-q \f'$";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "()=/28+#&\b%\u0017!1\b8-?7\b/";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "q+0/\u0001\u000e&5*\u0003,hy'\u00189)%*\u0002%u";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "q+0/\u0001\u0004.7&\u001f\u0018-?7";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "q+0/\u0001\u0004.7&\u001f\u0019-2&\u0004;<\u0003&\u000e.!'&\t";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = ")=\":";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "q+0/\u0001\u0019-;&\u000e?\u001a4 \b\">4'E";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = ">&2\"\u0001')3/\b";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "q 0-\t'-\u001e%\u000b.:\u0017\"\u0004'-5";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "q+0/\u0001\n+2&\u001d?\u001b4-\u0019";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "q:)\u0017\u001f*.7*\u000e\u0018<01\u0019.,";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "q8c399)?0\u001d$:%\u0010\u0019*:%\u0005\f\"$4'";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "q<#\"\u000388>1\u0019\b)?'>.&5\u0005\f\"$4'";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "q%80\u001e\"&6\u0011\b')(\n\u0003-'";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "q;4-\t\n+2&\u001d?\u000e0*\u0001.,";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "q%4'\u0004*\u001b%1\b*%\u00027\f9<\u00141\u001f$:";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "q:4/\f2\r=&\u000e?!>->.&5\u0005\f\"$4'";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "q:)\u0017\u0004&->6\u0019";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "q+0/\u0001\n+2&\u001d?\u001a4 \b\">4'";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "q:4/\f2\u000407\b%+(\u0010\b%,\u0017\"\u0004'-5";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "q%4'\u0004*\u001b%1\b*%\u00141\u001f$:";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "q;4-\t\u0004.7&\u001f\r)8/\b/";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    break Label_1382;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public VoiceService$VoiceServiceEventCallback(final VoiceService this$0) {
        this.this$0 = this$0;
        this.bufferQueue = new ahe();
    }
    
    @Override
    public void NoSamplingRatesForAudioRecord() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[19]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void audioInitError() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[10]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void audioStreamStarted() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[18]);
        VoiceService.m(this.this$0).sendEmptyMessage(2);
    }
    
    @Override
    public void callAcceptFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[11]);
    }
    
    @Override
    public void callAcceptReceived() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[50]);
    }
    
    @Override
    public void callAcceptSent() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[41]);
    }
    
    @Override
    public void callCaptureBufferFilled(final Voip$DebugTapType voip$DebugTapType, final byte[] array, final int n, final Voip$RecordingInfo[] array2) {
        if (array == null || array.length <= 0 || n <= 0 || array2 == null) {
            return;
        }
        VoiceService.a().execute(new ah1(this, array2, voip$DebugTapType, array, n));
    }
    
    @Override
    public void callCaptureEnded(final Voip$DebugTapType voip$DebugTapType, final Voip$RecordingInfo[] array) {
        VoiceService.a().execute(new yf(this, array, voip$DebugTapType));
    }
    
    @Override
    public void callEnding() {
        long l = 0L;
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[31]);
        Voip.checkStreamStatistics();
        final Voip$CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.e(VoiceService$VoiceServiceEventCallback.z[32]);
            return;
        }
        final c6 c6 = new c6(callInfo.getPeerId(), callInfo.isCaller(), Voip.a(callInfo.getCallId()));
        final bi a = App.ak.a(c6);
        final long max = Math.max(l, callInfo.getCallDuration());
        Label_0251: {
            if (a != null) {
                a.D = (int)max / 1000;
                if (callInfo.isEndedByMe()) {
                    l = 1L;
                }
                a.L = l;
                String d;
                if (VoiceService.z(this.this$0)) {
                    d = VoiceService$VoiceServiceEventCallback.z[33];
                }
                else {
                    d = null;
                }
                a.d = d;
                Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[34] + a.D + ")");
                App.ak.a(a);
                if (!App.I) {
                    break Label_0251;
                }
            }
            Log.e(VoiceService$VoiceServiceEventCallback.z[30] + c6);
        }
        atd.a(callInfo.getBytesSent(), 2);
        atd.b(callInfo.getBytesReceived(), 2);
        VoiceService.b(this.this$0, aam.a((Context)App.aq, Voip.getCallFieldStats(), callInfo.getPeerId(), VoiceService.B(this.this$0), VoiceService.f(this.this$0), VoiceService.l(this.this$0), VoiceService.g(this.this$0), VoiceService.t(this.this$0), VoiceService.u(this.this$0)));
        final float a2 = VoiceService.A(this.this$0);
        final Events$Call d2 = VoiceService.D(this.this$0);
        final float n = fcmpl(a2, 0.0f);
        Double callHistEchoLikelihood = null;
        if (n >= 0) {
            final float n2 = fcmpg(a2, 100.0f);
            callHistEchoLikelihood = null;
            if (n2 <= 0) {
                callHistEchoLikelihood = new Double(a2);
            }
        }
        d2.callHistEchoLikelihood = callHistEchoLikelihood;
        VoiceService.a(this.this$0, VoiceService.D(this.this$0));
        if (App.aB()) {
            qf.a(false);
        }
        VoiceService.a().execute(new qq(this));
    }
    
    @Override
    public void callInterrupted() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[28]);
    }
    
    @Override
    public void callOfferAckedWithRelayInfo() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[6]);
        VoiceService.r(this.this$0).removeMessages(2);
    }
    
    @Override
    public void callOfferNacked(final int n) {
        final boolean i = App.I;
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[27] + n);
        final String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            int n2 = 0;
            Label_0079: {
                Label_0116: {
                    switch (n) {
                        case 401: {
                            n2 = 3;
                            if (i) {
                                break Label_0116;
                            }
                            break Label_0079;
                        }
                        case 405: {
                            n2 = 4;
                            if (i) {
                                break;
                            }
                            break Label_0079;
                        }
                    }
                }
                n2 = 0;
            }
            App.aq.a5().post((Runnable)new a6e(this, peerJid, n2));
        }
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void callOfferReceiptReceived() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[36]);
    }
    
    @Override
    public void callOfferReceived() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[25]);
    }
    
    @Override
    public void callOfferSent() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[35]);
    }
    
    @Override
    public void callRejectReceived(final String s) {
        final boolean i = App.I;
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[38] + s + ')');
        if (VoiceService$VoiceServiceEventCallback.z[37].equals(s)) {
            VoiceService.e(this.this$0, true);
            VoiceService.r(this.this$0).removeCallbacksAndMessages((Object)null);
            VoiceService.r(this.this$0).sendEmptyMessageDelayed(3, 30000L);
            if (!i) {
                return;
            }
        }
        if (VoiceService$VoiceServiceEventCallback.z[39].equals(s)) {
            VoiceService.a(this.this$0, this.this$0.getString(2131231942, new Object[] { VoiceService.y(this.this$0) }));
            if (!i) {
                return;
            }
        }
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void callResumed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[29]);
    }
    
    @Override
    public void callStateChanged(final Voip$CallState voip$CallState, final Voip$CallInfo voip$CallInfo) {
        final boolean i = App.I;
        final Voip$CallState callState = voip$CallInfo.getCallState();
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[15] + voip$CallState + VoiceService$VoiceServiceEventCallback.z[17] + callState + ')');
        if (callState == voip$CallState) {
            return;
        }
        VoiceService.a(this.this$0, callState);
        Label_0291: {
            if (callState == Voip$CallState.ACTIVE) {
                VoiceService.r(this.this$0).removeCallbacksAndMessages((Object)null);
                if (!i) {
                    break Label_0291;
                }
            }
            if (callState == Voip$CallState.ACCEPT_RECEIVED || callState == Voip$CallState.ACCEPT_SENT) {
                VoiceService.r(this.this$0).removeCallbacksAndMessages((Object)null);
                VoiceService.r(this.this$0).sendEmptyMessageDelayed(1, 20000L);
                if (!i) {
                    break Label_0291;
                }
            }
            if (callState == Voip$CallState.RECEIVED_CALL) {
                VoiceService.r(this.this$0).removeCallbacksAndMessages((Object)null);
                VoiceService.r(this.this$0).sendEmptyMessageDelayed(0, 45000L);
                if (!i) {
                    break Label_0291;
                }
            }
            if (callState == Voip$CallState.CALLING) {
                VoiceService.r(this.this$0).removeCallbacksAndMessages((Object)null);
                VoiceService.r(this.this$0).sendEmptyMessageDelayed(0, 90000L);
                VoiceService.r(this.this$0).sendEmptyMessageDelayed(2, 15000L);
                if (!i) {
                    break Label_0291;
                }
            }
            if (callState == Voip$CallState.NONE) {
                VoiceService.r(this.this$0).removeCallbacksAndMessages((Object)null);
                if (!i) {
                    break Label_0291;
                }
            }
            aol.a(VoiceService$VoiceServiceEventCallback.z[14] + callState);
        }
        if (callState == Voip$CallState.ACCEPT_SENT && VoiceService.p(this.this$0)) {
            VoiceService.a(this.this$0, voip$CallInfo);
        }
        Label_0420: {
            switch (z2.a[callState.ordinal()]) {
                case 1: {
                    if (Build$VERSION.SDK_INT >= 16) {
                        this.this$0.startService(new Intent(VoiceService$VoiceServiceEventCallback.z[16], (Uri)null, (Context)this.this$0, (Class)VoiceService.class));
                    }
                    VoiceService.o(this.this$0);
                    if (i) {
                        break Label_0420;
                    }
                    break;
                }
                case 2: {
                    VoiceService.b(this.this$0, (Double)null);
                    VoiceService.a(this.this$0, (Double)null);
                    break;
                }
            }
        }
        Message.obtain(VoiceService.m(this.this$0), 4, voip$CallState.ordinal(), callState.ordinal(), (Object)voip$CallInfo).sendToTarget();
    }
    
    @Override
    public void callTerminateReceived() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[20]);
    }
    
    @Override
    public void errorGatheringHostCandidates() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[24]);
    }
    
    public byte[] getByteBuffer(final int n) {
        return this.bufferQueue.a(n);
    }
    
    @Override
    public void handleAcceptFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[7]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void handleOfferFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[40]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void incompatibleSrtpKeyExchange() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[4]);
    }
    
    @Override
    public void mediaStreamError() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[52]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void mediaStreamStartError() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[47]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void missingRelayInfo() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[45]);
    }
    
    @Override
    public void p2pNegotaitionFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[23]);
    }
    
    @Override
    public void p2pNegotiationSuccess() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[3]);
    }
    
    @Override
    public void p2pTransportCreateFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[21]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void p2pTransportMediaCreateFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[8]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void p2pTransportRestartSuccess() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[26]);
    }
    
    @Override
    public void p2pTransportStartFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[43]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void relayBindsFailed() {
        Log.w(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[13]);
        VoiceService.c(this.this$0, true);
        final Voip$CallInfo callInfo = Voip.getCallInfo();
        if (callInfo == null) {
            Log.e(VoiceService$VoiceServiceEventCallback.z[12]);
        }
        else if (callInfo.isCaller() || callInfo.getCallState() == Voip$CallState.ACCEPT_SENT) {
            VoiceService.a(this.this$0, callInfo);
        }
    }
    
    @Override
    public void relayCreateSuccess() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[2]);
    }
    
    @Override
    public void relayElectionSendFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[48]);
    }
    
    @Override
    public void relayLatencySendFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[51]);
    }
    
    @Override
    public void rtcpPacketReceived() {
    }
    
    @Override
    public void rxTimeout() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[49]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void rxTrafficStarted() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[42]);
        VoiceService.d(this.this$0, false);
    }
    
    @Override
    public void rxTrafficStopped() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[0]);
        VoiceService.d(this.this$0, true);
    }
    
    @Override
    public void sendAcceptFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[46]);
        this.this$0.f();
    }
    
    @Override
    public void sendOfferFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[53]);
    }
    
    @Override
    public void soundPortCreateFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[1]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void soundPortCreated() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[9]);
    }
    
    @Override
    public void transportCandSendFailed() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[44]);
    }
    
    @Override
    public void txTimeout() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[5]);
        VoiceService.a(this.this$0, (String)null);
    }
    
    @Override
    public void willCreateSoundPort() {
        Log.i(this.getClass().getName() + VoiceService$VoiceServiceEventCallback.z[22]);
    }
}
