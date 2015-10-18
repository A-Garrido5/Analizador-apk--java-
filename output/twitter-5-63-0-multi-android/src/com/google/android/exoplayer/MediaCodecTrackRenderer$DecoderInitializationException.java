// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.exoplayer;

import android.annotation.TargetApi;
import android.media.MediaCodec$CodecException;

public class MediaCodecTrackRenderer$DecoderInitializationException extends Exception
{
    public final String decoderName;
    public final String diagnosticInfo;
    
    public MediaCodecTrackRenderer$DecoderInitializationException(final String decoderName, final ae ae, final Throwable t) {
        super("Decoder init failed: " + decoderName + ", " + ae, t);
        this.decoderName = decoderName;
        String a;
        if (ai.a >= 21) {
            a = a(t);
        }
        else {
            a = null;
        }
        this.diagnosticInfo = a;
    }
    
    @TargetApi(21)
    private static String a(final Throwable t) {
        if (t instanceof MediaCodec$CodecException) {
            return ((MediaCodec$CodecException)t).getDiagnosticInfo();
        }
        return null;
    }
}
