// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.media.model.ImageFile;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.featureswitch.d;
import com.twitter.library.media.model.MediaFile;
import android.content.Context;

public class MediaProcessorFactory
{
    public static i a(final Context context, final MediaFile mediaFile, final MediaProcessorFactory$MediaUsage mediaProcessorFactory$MediaUsage, final long n) {
        switch (j.b[mediaFile.type.ordinal()]) {
            default: {
                return new v(mediaFile);
            }
            case 1: {
                switch (j.a[mediaProcessorFactory$MediaUsage.ordinal()]) {
                    default: {
                        final int a = d.a("photo_upload_default_quality", 80);
                        final int a2 = d.a("photo_upload_fallback_quality", 80);
                        final int a3 = d.a("photo_upload_default_resolution", 1024);
                        final int a4 = d.a("photo_upload_fallback_resolution", 1024);
                        return new g(context, new int[] { a3, a4, a4 }, new int[] { a, a2, a2 }, TelephonyUtil.a(3145728), (ImageFile)mediaFile, n);
                    }
                    case 1: {
                        return new g(context, new int[] { 400, 200, 200 }, new int[] { 80, 80, 80 }, TelephonyUtil.a(716800), (ImageFile)mediaFile, n);
                    }
                    case 2: {
                        return new g(context, new int[] { 1500, 1500, 1500 }, new int[] { 80, 80, 80 }, TelephonyUtil.a(3145728), (ImageFile)mediaFile, n);
                    }
                }
                break;
            }
        }
    }
}
