// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.VoipOptions;
import android.media.audiofx.AcousticEchoCanceler;
import com.whatsapp.protocol.c6;
import com.whatsapp.fieldstats.Events$Call;
import android.media.audiofx.AutomaticGainControl;
import com.whatsapp.fieldstats.a0;
import com.whatsapp.fieldstats.n;
import com.whatsapp.util.Log;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build$VERSION;
import com.whatsapp.fieldstats.h;
import com.whatsapp.protocol.bi;
import com.whatsapp.fieldstats.r;
import java.text.SimpleDateFormat;
import com.whatsapp.messaging.af;
import android.os.ConditionVariable;

public final class Voip
{
    private static final ConditionVariable a;
    public static Voip$SignalingCallback b;
    public static Voip$CryptoCallback c;
    private static final af d;
    private static final SimpleDateFormat e;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        String s = "N#\"_\u001d^m7RQJ8&O\b\u001b+,OQX81O\u0014U9c^\u0010W!cN\u0005Z9&";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = ';';
                        break;
                    }
                    case 1: {
                        c2 = 'M';
                        break;
                    }
                    case 2: {
                        c2 = 'C';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "n\u0003\bs>l\u0003";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "n\u0003\bs>l\u0003";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "n\u0003\bs>l\u0003";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "X,/QK";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "n\u0003\bs>l\u0003";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "B4:D\\v\u0000nY\u0015\u0015\u0005\u000bb\u001cV";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        e = new SimpleDateFormat(Voip.z[6]);
        a = new ConditionVariable(true);
        d = new kt();
        Voip.b = null;
        Voip.c = null;
    }
    
    public static String a(final int n) {
        final boolean i = App.I;
        final r[] values = r.values();
        final int length = values.length;
        int j = 0;
        while (j < length) {
            final r r = values[j];
            if (r.getCode() == n) {
                return r.toString();
            }
            ++j;
            if (i) {
                break;
            }
        }
        return Voip.z[5];
    }
    
    public static final String a(final String s) {
        if (s == null) {
            return null;
        }
        return Voip.z[4] + s;
    }
    
    public static void a() {
        Voip.a.close();
    }
    
    public static void a(final Voip$CryptoCallback c) {
        nativeRegisterCryptoCallback(c);
        Voip.c = c;
    }
    
    public static void a(final Voip$SignalingCallback b) {
        nativeRegisterSignalingCallback(b);
        Voip.b = b;
    }
    
    public static boolean a(final bi bi) {
        return bi.I == 8 && !bi.a.b && bi.D == 0 && bi.L == 0L;
    }
    
    public static native void acceptCall();
    
    public static String b(final int n) {
        final boolean i = App.I;
        final h[] values = h.values();
        final int length = values.length;
        int j = 0;
        while (j < length) {
            final h h = values[j];
            if (h.getCode() == n) {
                return h.toString();
            }
            ++j;
            if (i) {
                break;
            }
        }
        return Voip.z[2];
    }
    
    public static boolean b() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean available = false;
        if (sdk_INT < 16) {
            return available;
        }
        try {
            available = NoiseSuppressor.isAvailable();
            return available;
        }
        catch (Throwable t) {
            Log.b(t);
            return false;
        }
    }
    
    public static boolean b(final bi bi) {
        return bi.I == 8 && bi.d != null;
    }
    
    public static String c(final int n) {
        final boolean i = App.I;
        final n[] values = n.values();
        final int length = values.length;
        int j = 0;
        while (j < length) {
            final n n2 = values[j];
            if (n2.getCode() == n) {
                return n2.toString();
            }
            ++j;
            if (i) {
                break;
            }
        }
        return Voip.z[3];
    }
    
    public static void c() {
        Voip.a.open();
    }
    
    public static native boolean checkStreamStatistics();
    
    public static String d(final int n) {
        final boolean i = App.I;
        final a0[] values = a0.values();
        final int length = values.length;
        int j = 0;
        while (j < length) {
            final a0 a0 = values[j];
            if (a0.getCode() == n) {
                return a0.toString();
            }
            ++j;
            if (i) {
                break;
            }
        }
        return Voip.z[1];
    }
    
    public static boolean d() {
        try {
            final Voip$CallState currentCallState = getCurrentCallState();
            final Voip$CallState none = Voip$CallState.NONE;
            boolean b = false;
            if (currentCallState != none) {
                b = true;
            }
            return b;
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            try {
                throw unsatisfiedLinkError;
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError2) {
                Log.b(Voip.z[0], unsatisfiedLinkError2);
                return false;
            }
        }
    }
    
    public static af e() {
        return Voip.d;
    }
    
    public static native void endCall();
    
    static SimpleDateFormat f() {
        return Voip.e;
    }
    
    public static boolean g() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean available = false;
        if (sdk_INT < 16) {
            return available;
        }
        try {
            available = AutomaticGainControl.isAvailable();
            return available;
        }
        catch (Throwable t) {
            Log.b(t);
            return false;
        }
    }
    
    public static native long getCallActiveTime();
    
    public static native Events$Call getCallFieldStats();
    
    public static native Voip$CallInfo getCallInfo();
    
    public static native String getCurrentCallId();
    
    public static native Voip$CallState getCurrentCallState();
    
    public static native int getElapsedTimeSinceCallStarts();
    
    public static native String getPeerJid();
    
    public static native String getStreamStatistics();
    
    public static c6 h() {
        final Voip$CallInfo callInfo = getCallInfo();
        if (callInfo == null) {
            return null;
        }
        return new c6(callInfo.getPeerId(), callInfo.isCaller(), a(callInfo.getCallId()));
    }
    
    public static void i() {
        Voip.a.block();
    }
    
    public static native boolean isCaller();
    
    public static boolean j() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean available = false;
        if (sdk_INT < 16) {
            return available;
        }
        try {
            available = AcousticEchoCanceler.isAvailable();
            return available;
        }
        catch (Throwable t) {
            Log.b(t);
            return false;
        }
    }
    
    public static boolean k() {
        return false;
    }
    
    public static native void muteCall(final boolean p0);
    
    public static native void nativeHandleCallOffer(final String p0, final String p1, final String p2, final String[] p3, final int[] p4, final byte[][] p5, final int[] p6, final byte[][] p7, final byte[][] p8, final byte[] p9, final byte[] p10, final VoipOptions p11, final boolean p12, final int p13);
    
    public static native void nativeHandleCallOfferAccept(final String p0, final String p1, final String p2, final String p3, final int p4, final byte[][] p5, final int[] p6, final byte[] p7, final byte[] p8, final byte[] p9, final int p10);
    
    public static native void nativeHandleCallOfferAck(final String p0, final String p1, final String p2, final int p3, final byte[][] p4, final byte[][] p5, final VoipOptions p6, final boolean p7, final int p8);
    
    public static native void nativeHandleCallOfferPreAccept(final String p0, final String p1, final String p2, final String p3, final int p4, final byte[] p5);
    
    public static native void nativeHandleCallOfferReceipt(final String p0, final String p1, final String p2);
    
    public static native void nativeHandleCallOfferReject(final String p0, final String p1, final String p2, final String p3);
    
    public static native void nativeHandleCallRelayElection(final String p0, final String p1, final String p2, final byte[] p3, final int p4);
    
    public static native void nativeHandleCallRelayLatency(final String p0, final String p1, final String p2, final byte[][] p3, final int[] p4);
    
    public static native void nativeHandleCallTerminate(final String p0, final String p1, final String p2, final String p3);
    
    public static native void nativeHandleCallTransport(final String p0, final String p1, final String p2, final byte[][] p3, final int[] p4);
    
    public static native void nativeRegisterCryptoCallback(final Voip$CryptoCallback p0);
    
    public static native void nativeRegisterEventCallback(final Voip$EventCallback p0);
    
    public static native void nativeRegisterSignalingCallback(final Voip$SignalingCallback p0);
    
    public static native void nativeUnregisterCryptoCallback();
    
    public static native void nativeUnregisterEventCallback();
    
    public static native void nativeUnregisterSignalingCallback();
    
    public static native void notifyAudioRouteChange(final int p0);
    
    public static native void onNetworkChange();
    
    public static native void rejectCall();
    
    public static native void setAlwaysUseBuiltInAudioEffects(final boolean p0);
    
    public static native void setAudioEnginePreference(final int p0);
    
    public static native void setAudioStreamPause(final boolean p0);
    
    public static native void setNetworkMedium(final int p0);
    
    public static native void setP2PEnabled(final boolean p0);
    
    public static native void setPeerAudioStreamPause(final boolean p0);
    
    public static native void startCall(final String p0, final String p1);
    
    public static native boolean startCallRecording(final Voip$RecordingInfo[] p0);
    
    public static native boolean stopCallRecording();
}
