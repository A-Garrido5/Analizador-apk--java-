// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import java.util.ArrayList;
import com.twitter.library.telephony.TelephonyUtil;
import java.util.Collections;
import com.twitter.library.featureswitch.d;
import java.util.List;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.EditableMedia;
import android.content.Context;

public class s
{
    protected static s a;
    
    static {
        s.a = new s();
    }
    
    @Deprecated
    public static q a(final Context context, final EditableMedia editableMedia, final boolean b) {
        return s.a.b(context, editableMedia, b);
    }
    
    public static List a(final Context context, final MediaType mediaType) {
        if (mediaType == MediaType.b) {
            int a = d.a("photos_segmented_upload_maximum_segment_size", 0);
            if (a < 1024) {
                a = 51200;
            }
            return Collections.singletonList(a);
        }
        if (mediaType == MediaType.d || mediaType == MediaType.e || mediaType == MediaType.c) {
            int i = d.a("videos_segmented_upload_segment_size_wifi", 524288);
            final int a2 = d.a("videos_segmented_upload_segment_size_cellular", 262144);
            final boolean a3 = d.a("videos_segmented_upload_segment_size_backoff_policy_enabled", true);
            final int a4 = d.a("videos_segmented_upload_minimum_segment_size", 65536);
            TelephonyUtil.d(context);
            if (!TelephonyUtil.c()) {
                i = a2;
            }
            final ArrayList<Integer> list = new ArrayList<Integer>();
            if (a3) {
                while (i >= a4) {
                    list.add(i);
                    i >>= 1;
                }
            }
            else {
                list.add(i);
            }
            return list;
        }
        throw new RuntimeException("Failed to upload unknown media type: " + mediaType.name());
    }
    
    protected q a(final Context context, final EditableMedia editableMedia) {
        return new z(context, a(context, editableMedia.e()), d.a("videos_segmented_upload_maximum_retry_per_request", 3), editableMedia);
    }
    
    protected q b(final Context context, final EditableMedia editableMedia, final boolean b) {
        switch (t.a[editableMedia.e().ordinal()]) {
            default: {
                throw new RuntimeException("Failed to upload unknown media type");
            }
            case 1: {
                return this.c(context, editableMedia, b);
            }
            case 2:
            case 3:
            case 4: {
                return this.a(context, editableMedia);
            }
        }
    }
    
    protected q c(final Context context, final EditableMedia editableMedia, final boolean b) {
        boolean b2 = true;
        final boolean a = d.a("photos_segmented_upload_enabled", b2);
        if (d.a("photos_segmented_upload_disabled_for_direct_message", b2)) {
            b2 = false;
        }
        if ((b && !a) || (!b && !b2)) {
            return new q(context, editableMedia);
        }
        return new z(context, a(context, editableMedia.e()), 2, editableMedia);
    }
}
