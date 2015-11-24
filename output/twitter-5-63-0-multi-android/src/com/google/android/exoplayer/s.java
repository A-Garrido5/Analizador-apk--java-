// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.util.Log;
import android.media.MediaCodecInfo$CodecCapabilities;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.HashMap;
import android.annotation.TargetApi;

@TargetApi(16)
public class s
{
    private static final HashMap a;
    
    static {
        a = new HashMap();
    }
    
    private static Pair a(final u u, final v v) {
        final String a = u.a;
        final int a2 = v.a();
        final boolean b = v.b();
        for (int i = 0; i < a2; ++i) {
            final MediaCodecInfo a3 = v.a(i);
            final String name = a3.getName();
            if (!a3.isEncoder() && name.startsWith("OMX.") && (b || !name.endsWith(".secure"))) {
                final String[] supportedTypes = a3.getSupportedTypes();
                for (int j = 0; j < supportedTypes.length; ++j) {
                    final String s = supportedTypes[j];
                    if (s.equalsIgnoreCase(a)) {
                        final MediaCodecInfo$CodecCapabilities capabilitiesForType = a3.getCapabilitiesForType(s);
                        final boolean a4 = v.a(u.a, capabilitiesForType);
                        if (!b) {
                            final HashMap a5 = com.google.android.exoplayer.s.a;
                            u u2;
                            if (u.b) {
                                u2 = new u(a, false);
                            }
                            else {
                                u2 = u;
                            }
                            a5.put(u2, Pair.create((Object)name, (Object)capabilitiesForType));
                            if (a4) {
                                final HashMap a6 = com.google.android.exoplayer.s.a;
                                u u3;
                                if (u.b) {
                                    u3 = u;
                                }
                                else {
                                    u3 = new u(a, true);
                                }
                                a6.put(u3, Pair.create((Object)(name + ".secure"), (Object)capabilitiesForType));
                            }
                        }
                        else {
                            final HashMap a7 = com.google.android.exoplayer.s.a;
                            u u4;
                            if (u.b == a4) {
                                u4 = u;
                            }
                            else {
                                u4 = new u(a, a4);
                            }
                            a7.put(u4, Pair.create((Object)name, (Object)capabilitiesForType));
                        }
                        if (com.google.android.exoplayer.s.a.containsKey(u)) {
                            return com.google.android.exoplayer.s.a.get(u);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static c a(final String s, final boolean b) {
        final Pair b2 = b(s, b);
        if (b2 == null) {
            return null;
        }
        return new c((String)b2.first, a((MediaCodecInfo$CodecCapabilities)b2.second));
    }
    
    private static boolean a(final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        return ai.a >= 19 && b(mediaCodecInfo$CodecCapabilities);
    }
    
    private static Pair b(final String s, final boolean b) {
        while (true) {
            final Pair a2;
            synchronized (s.class) {
                final u u = new u(s, b);
                Pair a;
                if (s.a.containsKey(u)) {
                    a = s.a.get(u);
                }
                else {
                    v v;
                    if (ai.a >= 21) {
                        v = new x(b);
                    }
                    else {
                        v = new w(null);
                    }
                    a = a(u, v);
                    if (b && a == null && ai.a >= 21) {
                        a2 = a(u, new w(null));
                        if (a2 != null) {
                            Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + s + ". Assuming: " + (String)a2.first);
                        }
                        return a2;
                    }
                }
                return a;
            }
            return a2;
        }
    }
    
    @TargetApi(19)
    private static boolean b(final MediaCodecInfo$CodecCapabilities mediaCodecInfo$CodecCapabilities) {
        return mediaCodecInfo$CodecCapabilities.isFeatureSupported("adaptive-playback");
    }
}
