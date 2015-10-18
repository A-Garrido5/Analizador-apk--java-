// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public class Voip$JNIUtils
{
    public static int[] findAvailableAudioSamplingRate() {
        synchronized (Voip$JNIUtils.class) {
            return VoiceService.a(new int[] { 16000, 44100, 22050, 8000, 11025 }, 1);
        }
    }
}
