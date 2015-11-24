// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.content.Context;
import com.twitter.library.client.az;
import java.util.Iterator;
import com.twitter.library.media.util.ag;
import com.twitter.library.media.model.EditableMedia;
import java.util.List;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.util.t;
import com.twitter.library.media.model.EditableImage;
import com.twitter.eventreporter.b;
import com.twitter.eventreporter.EventReporter;
import com.twitter.library.scribe.TwitterScribeLog;

public class av
{
    static void a() {
        EventReporter.a(new TwitterScribeLog(d()).b("", "composition", "editor", "photo", "dismiss"));
    }
    
    static void a(final EditableImage editableImage, final String s) {
        t.a(editableImage, "composition", s, d());
    }
    
    static void a(final MediaType mediaType) {
        String s;
        if (mediaType == MediaType.d || mediaType == MediaType.e) {
            s = "video";
        }
        else {
            if (mediaType != MediaType.b) {
                return;
            }
            s = "photo";
        }
        EventReporter.a(new TwitterScribeLog(d()).b("", "composition", "editor", s, "open"));
    }
    
    static void a(final String s) {
        EventReporter.a(new TwitterScribeLog(d()).b("", "composition", s, "photo", "page"));
    }
    
    static void a(final List list, final boolean b, final boolean b2) {
        final MediaType a = EditableMedia.a(list);
        if (a != MediaType.a) {
            String s;
            if (b) {
                s = ":drafts:composition";
            }
            else {
                s = ":composition:";
            }
            String s2;
            if (a == MediaType.b) {
                s2 = "send_photo_tweet";
            }
            else if (a == MediaType.c) {
                s2 = "send_gif_tweet";
            }
            else {
                s2 = "send_video_tweet";
            }
            String s3 = null;
            Label_0063: {
                if (a != MediaType.b && list.size() == 1) {
                    s3 = list.get(0).source;
                }
                else {
                    for (final EditableMedia editableMedia : list) {
                        if (editableMedia.source.equalsIgnoreCase("twitter_camera")) {
                            s3 = editableMedia.source;
                            break Label_0063;
                        }
                    }
                    s3 = "";
                }
            }
            EventReporter.a(new TwitterScribeLog(d()).b(s, s3, s2));
            if (a == MediaType.b) {
                final int size = ag.a(list).size();
                if (size > 0) {
                    final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(d());
                    final String[] array = { s, null };
                    String s4;
                    if (b2) {
                        s4 = ":reply_with_tags";
                    }
                    else {
                        s4 = ":tweet_with_tags";
                    }
                    array[1] = s4;
                    EventReporter.a(((TwitterScribeLog)twitterScribeLog.b(array)).a((long)size));
                }
                final Iterator<EditableMedia> iterator2 = list.iterator();
                int n = 0;
                while (iterator2.hasNext()) {
                    final EditableMedia editableMedia2 = iterator2.next();
                    int n2;
                    if (editableMedia2 instanceof EditableImage && ((EditableImage)editableMedia2).filterId > 0) {
                        n2 = n + 1;
                    }
                    else {
                        n2 = n;
                    }
                    n = n2;
                }
                if (n > 0) {
                    EventReporter.a(((TwitterScribeLog)new TwitterScribeLog(d()).b(new String[] { s, ":send_filtered_photo" })).a((long)n));
                }
            }
        }
    }
    
    static void b() {
        EventReporter.a(new TwitterScribeLog(d()).b(new String[] { ":composition:image_attachment::impression" }));
    }
    
    static void c() {
        EventReporter.a(new TwitterScribeLog(d()).b("", "composition", "editor", "photo", "select"));
    }
    
    private static long d() {
        return az.a((Context)null).b().g();
    }
}
