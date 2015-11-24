// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.content.ActivityNotFoundException;
import android.provider.MediaStore$Images$Media;
import com.twitter.library.featureswitch.d;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.app.Activity;
import com.twitter.eventreporter.b;
import com.twitter.eventreporter.EventReporter;
import android.text.TextUtils;
import com.twitter.util.k;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.media.model.EditableImage;

public class t
{
    public static void a(final EditableImage editableImage, final String s, final String s2, final long n) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(n).b("", k.a(s), editableImage.source, "image_attachment", "done");
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            twitterScribeLog.g("twitter:" + s2);
        }
        if (editableImage.enhanced) {
            twitterScribeLog.d("twitter:enhanced");
        }
        EventReporter.a(twitterScribeLog);
    }
    
    public static boolean a(final Activity activity, final int n) {
        return a((Context)activity, new u(activity), n, null);
    }
    
    public static boolean a(final Context context, final a a, final int n, final Bundle bundle) {
        try {
            final Intent intent = new Intent();
            if (d.f("extended_image_import_enabled")) {
                intent.setType("image/*").setAction("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE");
            }
            else {
                intent.setAction("android.intent.action.PICK").setData(MediaStore$Images$Media.EXTERNAL_CONTENT_URI).setType("vnd.android.cursor.dir/image");
            }
            a.a(intent, n, bundle);
            return true;
        }
        catch (ActivityNotFoundException ex) {
            com.twitter.util.t.a(context, lg.unsupported_feature);
            return false;
        }
    }
}
