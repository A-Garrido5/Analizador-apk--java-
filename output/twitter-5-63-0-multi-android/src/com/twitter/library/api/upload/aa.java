// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import java.util.Iterator;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.io.Closeable;
import com.twitter.library.api.MediaTag;
import java.io.Writer;
import com.twitter.library.api.bh;
import java.io.StringWriter;
import com.twitter.library.api.geo.Coordinate;
import com.twitter.library.api.geo.GeoTag;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.provider.DraftTweet;
import com.twitter.library.network.ae;
import com.twitter.library.media.model.EditableImage;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.EditableMedia;
import android.text.TextUtils;
import java.util.List;

public class aa
{
    private static String a(final List list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        return TextUtils.join((CharSequence)",", (Iterable)list);
    }
    
    private static String a(final List list, final List list2) {
        final int size = list.size();
        if (EditableMedia.a(list) != MediaType.b || CollectionUtils.a((Collection)list2) || list2.size() != size) {
            return null;
        }
        String s = "";
        final StringBuilder sb = new StringBuilder();
        sb.append("{");
        String s2;
        for (int i = 0; i < size; ++i, s = s2) {
            final List tags = list.get(i).tags;
            if (!CollectionUtils.a((Collection)tags) && b(tags) != null) {
                sb.append(s).append("\"").append(list2.get(i)).append("\":").append(b(tags));
                s2 = ",";
            }
            else {
                s2 = s;
            }
        }
        sb.append("}");
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        return sb.toString();
    }
    
    public static StringBuilder a(final ae ae, final DraftTweet draftTweet, final boolean b) {
        final StringBuilder append = ae.a(ae.b(), "1.1", "statuses", "update").append(".json");
        ae.a(append, "include_entities", true);
        ae.a(append, "include_media_features", true);
        ae.a(append, "include_cards", true);
        ae.a(append, "earned_read", true);
        ae.a(append);
        String s;
        if (draftTweet.quotedData != null) {
            s = draftTweet.statusText + " " + draftTweet.quotedData.a();
        }
        else {
            s = draftTweet.statusText;
        }
        if (s != null) {
            s = s.trim();
        }
        ae.a(append, "status", s);
        ae.a(append, "send_error_codes", true);
        if (draftTweet.repliedTweetId > 0L) {
            ae.a(append, "in_reply_to_status_id", draftTweet.repliedTweetId);
        }
        PromotedContent promotedContent;
        if (draftTweet.repliedTweetId > 0L && draftTweet.promotedContent != null) {
            promotedContent = draftTweet.promotedContent;
        }
        else if (draftTweet.quotedData != null) {
            promotedContent = draftTweet.quotedData.promotedContent;
        }
        else {
            promotedContent = null;
        }
        if (promotedContent != null && !TextUtils.isEmpty((CharSequence)promotedContent.impressionId)) {
            ae.a(append, "impression_id", promotedContent.impressionId);
            if (promotedContent.b()) {
                ae.a(append, "earned", true);
            }
        }
        final GeoTag geoTag = draftTweet.geoTag;
        if (geoTag != null && b) {
            ae.a(append, "place_id", geoTag.a().placeId);
            final Coordinate b2 = geoTag.b();
            if (b2 != null && sk.a().b()) {
                ae.a(append, "lat", b2.a());
                ae.a(append, "long", b2.b());
            }
            final String c = geoTag.c();
            if (c != null) {
                ae.a(append, "geo_search_request_id", c);
            }
        }
        final String a = a(draftTweet.b());
        if (!TextUtils.isEmpty((CharSequence)a)) {
            ae.a(append, "media_ids", a);
        }
        final String a2 = a(draftTweet.media, draftTweet.b());
        if (!TextUtils.isEmpty((CharSequence)a2)) {
            ae.a(append, "media_tags", a2);
        }
        final String cardUrl = draftTweet.cardUrl;
        if (!TextUtils.isEmpty((CharSequence)cardUrl)) {
            ae.a(append, "card_uri", cardUrl);
        }
        return append;
    }
    
    private static String b(final List list) {
        while (true) {
            try {
                final StringWriter stringWriter = new StringWriter(512);
                final JsonGenerator a = bh.a.a(stringWriter);
                try {
                    a.a();
                    for (final MediaTag mediaTag : list) {
                        a.c();
                        a.a("type", "user");
                        if (mediaTag.userId != 0L) {
                            a.a("user_id", Long.toString(mediaTag.userId));
                        }
                        if (mediaTag.screenName != null) {
                            a.a("screen_name", mediaTag.screenName);
                        }
                        a.d();
                    }
                }
                catch (IOException ex) {
                    final JsonGenerator jsonGenerator = a;
                    yh.a(jsonGenerator);
                    return null;
                    yh.a(a);
                    throw;
                    a.b();
                    a.flush();
                    final String string = stringWriter.getBuffer().toString();
                    yh.a(a);
                    return string;
                }
            }
            catch (IOException ex2) {
                continue;
            }
            break;
        }
    }
}
