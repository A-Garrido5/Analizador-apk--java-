// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform.notifications;

import com.twitter.library.api.conversations.q;
import com.twitter.library.api.conversations.y;
import java.util.ArrayList;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.library.api.conversations.DMTweet;
import com.twitter.library.api.conversations.DMMessageEntry;
import java.util.List;
import android.text.TextUtils;
import com.twitter.library.api.bh;
import com.twitter.errorreporter.a;
import com.twitter.library.api.Entity;
import java.io.IOException;
import com.twitter.library.api.ah;
import com.fasterxml.jackson.core.JsonToken;
import com.twitter.library.api.w;
import com.twitter.library.api.EntityList;
import com.fasterxml.jackson.core.JsonParser;

public class NotificationParser
{
    public static EntityList a(final JsonParser jsonParser) {
        w w = null;
        while (true) {
        Label_0104_Outer:
            while (true) {
                ah ah = null;
            Label_0194:
                while (true) {
                    Label_0142: {
                        try {
                            w = new w();
                            JsonToken jsonToken = jsonParser.d();
                            if (jsonToken == JsonToken.d) {
                                Block_6: {
                                    while (jsonToken != null && jsonToken != JsonToken.e) {
                                        jsonToken = jsonParser.a();
                                        if (jsonToken == JsonToken.b) {
                                            break Block_6;
                                        }
                                    }
                                    break;
                                }
                                final JsonToken a = jsonParser.a();
                                ah = new ah();
                                for (jsonToken = a; jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                                    switch (c.a[jsonToken.ordinal()]) {
                                        case 2: {
                                            if ("user_id".equals(jsonParser.e())) {
                                                ah.a(jsonParser.i());
                                                break;
                                            }
                                            break;
                                        }
                                        case 3: {
                                            break Label_0142;
                                        }
                                    }
                                }
                                break Label_0194;
                            }
                            break;
                        }
                        catch (IOException ex) {
                            return EntityList.a();
                        }
                    }
                    final String e = jsonParser.e();
                    if ("screen_name".equals(e)) {
                        ah.a(jsonParser.g());
                        continue;
                    }
                    if ("name".equals(e)) {
                        ah.b(jsonParser.g());
                        continue;
                    }
                    continue;
                }
                w.a((Entity)ah.f());
                continue Label_0104_Outer;
            }
        }
        return (EntityList)w.f();
    }
    
    public static d a(final String s, final a a) {
        long i = 0L;
        long j = 0L;
        long k = -1L;
        boolean b = false;
        String g = "";
        String g2 = "";
        EntityList list = EntityList.a();
        try {
            final JsonParser a2 = bh.a.a(s);
            if (a2.a() == null) {
                return null;
            }
            for (JsonToken jsonToken = a2.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = a2.a()) {
                final String e = a2.e();
                switch (c.a[jsonToken.ordinal()]) {
                    case 1: {
                        if (e.equals("possibly_sensitive")) {
                            b = true;
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if (e.equals("id")) {
                            i = a2.i();
                            break;
                        }
                        if (e.equals("original_id")) {
                            j = a2.i();
                            break;
                        }
                        if (e.equals("created_at")) {
                            k = a2.i();
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if (e.equals("text")) {
                            g = a2.g();
                            break;
                        }
                        if (e.equals("image_url")) {
                            g2 = a2.g();
                            break;
                        }
                        break;
                    }
                    case 4: {
                        if (e.equals("mention_entities")) {
                            list = a(a2);
                            break;
                        }
                        a2.c();
                        break;
                    }
                    case 5: {
                        a2.c();
                        break;
                    }
                }
            }
            a2.close();
            String s2;
            if (i == 0L) {
                s2 = "Missing id";
            }
            else if (k == -1L) {
                s2 = "Missing created_at";
            }
            else if (TextUtils.isEmpty((CharSequence)g)) {
                s2 = "Missing text";
            }
            else {
                s2 = null;
            }
            if (s2 != null) {
                a.a(new NotificationParser$NotificationParseException("Invalid tweet - " + s2));
                return null;
            }
            return new d(i, j, k, g, g2, b, list);
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static e a(final JsonParser jsonParser, final a a) {
        long i = 0L;
        String g = null;
        String g2 = null;
        String g3 = null;
        String g4 = null;
        String g5 = null;
        boolean b = false;
        boolean b2 = false;
        try {
            for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                final String e = jsonParser.e();
                switch (c.a[jsonToken.ordinal()]) {
                    case 2: {
                        if ("id".equals(e)) {
                            i = jsonParser.i();
                            break;
                        }
                        break;
                    }
                    case 3: {
                        if ("screen_name".equals(e)) {
                            g = jsonParser.g();
                            break;
                        }
                        if ("full_name".equals(e)) {
                            g2 = jsonParser.g();
                            break;
                        }
                        if ("bio".equals(e)) {
                            g3 = jsonParser.g();
                            break;
                        }
                        if ("profile_image_url".equals(e)) {
                            g4 = jsonParser.g();
                            break;
                        }
                        if ("profile_banner_url".equals(e)) {
                            g5 = jsonParser.g();
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if ("protected".equals(e)) {
                            b = true;
                            break;
                        }
                        if ("following".equals(e)) {
                            b2 = true;
                            break;
                        }
                        break;
                    }
                    case 4:
                    case 5: {
                        jsonParser.c();
                        break;
                    }
                }
            }
        }
        catch (IOException ex) {
            return null;
        }
        String s;
        if (i == 0L) {
            s = "Invalid id";
        }
        else if (TextUtils.isEmpty((CharSequence)g)) {
            s = "Invalid screen_name";
        }
        else if (TextUtils.isEmpty((CharSequence)g4)) {
            s = "Invalid profile_image_url";
        }
        else {
            s = null;
        }
        if (s != null) {
            a.a(new NotificationParser$NotificationParseException("Invalid user - " + s));
            return null;
        }
        if (g2 == null) {
            a.a(new NotificationParser$NotificationParseException("Valid user - Missing full_name"));
        }
        return new e(i, g, g2, g3, g4, g5, b, b2);
    }
    
    public static f a(final String s, final a a, final boolean b) {
        try {
            final JsonParser a2 = bh.a.a(s);
            if (a2.a() == null) {
                return null;
            }
            JsonToken jsonToken = a2.a();
            List b2 = null;
            e a3 = null;
            e a4 = null;
            e a5 = null;
            while (jsonToken != null && jsonToken != JsonToken.c) {
                final String e = a2.e();
                switch (c.a[jsonToken.ordinal()]) {
                    case 5: {
                        if ("recipient".equals(e)) {
                            a5 = a(a2, a);
                            break;
                        }
                        if ("sender".equals(e)) {
                            a4 = a(a2, a);
                            break;
                        }
                        if ("original_sender".equals(e)) {
                            a3 = a(a2, a);
                            break;
                        }
                        a2.c();
                        break;
                    }
                    case 4: {
                        if (b && "context".equals(e)) {
                            b2 = b(a2, a);
                            break;
                        }
                        a2.c();
                        break;
                    }
                }
                jsonToken = a2.a();
            }
            if (a5 == null) {
                a.a(new NotificationParser$NotificationParseException("Missing recipient from users"));
                return null;
            }
            return new f(a5, a4, a3, b2);
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static DMMessageEntry b(final String s, final a a, final boolean b) {
        try {
            final JsonParser a2 = bh.a.a(s);
            for (JsonToken jsonToken = a2.a(); jsonToken != null && jsonToken != JsonToken.c; jsonToken = a2.a()) {
                switch (c.a[jsonToken.ordinal()]) {
                    case 5: {
                        for (JsonToken jsonToken2 = a2.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = a2.a()) {
                            final String e = a2.e();
                            switch (c.a[jsonToken2.ordinal()]) {
                                case 4: {
                                    a2.c();
                                    break;
                                }
                                case 5: {
                                    if ("message".equals(e)) {
                                        return DMMessageEntry.a(a2, b);
                                    }
                                    a2.c();
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case 4: {
                        a2.c();
                        break;
                    }
                }
            }
            a.a(new NotificationParser$NotificationParseException("Invalid event data"));
            return null;
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static DMTweet b(final String s, final a a) {
        while (true) {
            final DMTweet dmTweet = new DMTweet();
            while (true) {
                e a3;
                try {
                    final JsonParser a2 = bh.a.a(s);
                    if (a2.a() == null) {
                        return null;
                    }
                    JsonToken jsonToken = a2.a();
                    a3 = null;
                    while (jsonToken != null && jsonToken != JsonToken.c) {
                        final String e = a2.e();
                        switch (c.a[jsonToken.ordinal()]) {
                            case 2:
                            case 3: {
                                if (e.equals("id")) {
                                    dmTweet.tweetId = a2.o();
                                    break;
                                }
                                if (e.equals("url")) {
                                    dmTweet.url = a2.r();
                                    break;
                                }
                                if (e.equals("display_url")) {
                                    dmTweet.displayUrl = a2.r();
                                    break;
                                }
                                if (e.equals("expanded_url")) {
                                    dmTweet.expandedUrl = a2.r();
                                    break;
                                }
                                break;
                            }
                            case 4: {
                                a2.c();
                                break;
                            }
                            case 5: {
                                if (e.equals("status")) {
                                    for (JsonToken jsonToken2 = a2.a(); jsonToken2 != null && jsonToken2 != JsonToken.c; jsonToken2 = a2.a()) {
                                        final String e2 = a2.e();
                                        switch (c.a[jsonToken2.ordinal()]) {
                                            case 4: {
                                                a2.c();
                                                break;
                                            }
                                            case 5: {
                                                if (e2.equals("user")) {
                                                    a3 = a(a2, a);
                                                    break;
                                                }
                                                a2.c();
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
                                a2.c();
                                break;
                            }
                        }
                        jsonToken = a2.a();
                    }
                    if (dmTweet.tweetId <= 0L) {
                        final String s2 = "Invalid tweet id";
                        if (s2 != null) {
                            a.a(new NotificationParser$NotificationParseException("Invalid dm tweet data - " + s2));
                            return null;
                        }
                        final QuotedTweetData quotedTweetData = new QuotedTweetData();
                        quotedTweetData.userName = a3.c;
                        quotedTweetData.userHandle = a3.b;
                        dmTweet.quotedTweetData = quotedTweetData;
                        return dmTweet;
                    }
                }
                catch (IOException ex) {
                    return null;
                }
                if (a3 == null) {
                    final String s2 = "Invalid tweet owner";
                    continue;
                }
                final String s2 = null;
                continue;
            }
        }
    }
    
    public static List b(final JsonParser jsonParser, final a a) {
        ArrayList<NotificationContextUser> list = null;
    Label_0257_Outer:
        while (true) {
            while (true) {
            Label_0362:
                while (true) {
                    String s = null;
                    String s2 = null;
                    Label_0351: {
                        try {
                            JsonToken jsonToken = jsonParser.d();
                            list = new ArrayList<NotificationContextUser>();
                            while (jsonToken != null && jsonToken != JsonToken.e) {
                                if (jsonToken == JsonToken.b) {
                                    JsonToken a2 = jsonParser.a();
                                    s = null;
                                    s2 = null;
                                    while (a2 != null && a2 != JsonToken.c) {
                                        String g2 = null;
                                        String s3 = null;
                                        switch (c.a[a2.ordinal()]) {
                                            case 3: {
                                                final String e = jsonParser.e();
                                                if ("screen_name".equals(e)) {
                                                    final String g = jsonParser.g();
                                                    g2 = s;
                                                    s3 = g;
                                                    break;
                                                }
                                                if ("image_url".equals(e)) {
                                                    g2 = jsonParser.g();
                                                    s3 = s2;
                                                    break;
                                                }
                                                break Label_0351;
                                            }
                                            case 4:
                                            case 5: {
                                                jsonParser.c();
                                                g2 = s;
                                                s3 = s2;
                                                break;
                                            }
                                            default: {
                                                break Label_0351;
                                            }
                                        }
                                        final JsonToken a3 = jsonParser.a();
                                        final String s4 = g2;
                                        a2 = a3;
                                        s2 = s3;
                                        s = s4;
                                    }
                                    String s5 = "";
                                    if (s2 == null) {
                                        s5 += "Missing screen_name";
                                    }
                                    if (s == null) {
                                        final StringBuilder append = new StringBuilder().append(s5);
                                        if (s5.length() <= 0) {
                                            break Label_0362;
                                        }
                                        final String s6 = ", ";
                                        s5 = append.append(s6).append("Missing image_url").toString();
                                    }
                                    if (s5.isEmpty()) {
                                        list.add(new NotificationContextUser(s2, s));
                                    }
                                    else {
                                        a.a(new NotificationParser$NotificationParseException("Invalid users.context entry - " + s5));
                                    }
                                }
                                jsonToken = jsonParser.a();
                            }
                        }
                        catch (IOException ex) {
                            list = null;
                        }
                        break;
                    }
                    String g2 = s;
                    String s3 = s2;
                    continue Label_0257_Outer;
                }
                final String s6 = "";
                continue;
            }
        }
        return list;
    }
    
    public static y c(final String s, final a a) {
        try {
            final JsonParser a2 = bh.a.a(s);
            a2.a();
            return q.a(a2);
        }
        catch (IOException ex) {
            a.a(new NotificationParser$NotificationParseException("Invalid event data"));
            return null;
        }
    }
    
    public static List d(final String s, final a a) {
        try {
            final JsonParser a2 = bh.a.a(s);
            a2.a();
            final ArrayList<com.twitter.library.platform.notifications.a> list = new ArrayList<com.twitter.library.platform.notifications.a>();
            JsonToken jsonToken = a2.d();
            if (jsonToken == JsonToken.d) {
                while (jsonToken != null && jsonToken != JsonToken.e) {
                    jsonToken = a2.a();
                    if (jsonToken == JsonToken.b) {
                        final JsonToken a3 = a2.a();
                        String g = null;
                        jsonToken = a3;
                        String g2 = null;
                        while (jsonToken != null && jsonToken != JsonToken.c) {
                            switch (c.a[jsonToken.ordinal()]) {
                                case 3: {
                                    final String e = a2.e();
                                    if ("id".equals(e)) {
                                        g = a2.g();
                                        break;
                                    }
                                    if ("scribe_target".equals(e)) {
                                        g2 = a2.g();
                                        break;
                                    }
                                    break;
                                }
                            }
                            jsonToken = a2.a();
                        }
                        list.add(new com.twitter.library.platform.notifications.a(g, g2));
                    }
                }
                goto Label_0224;
            }
            goto Label_0224;
        }
        catch (IOException ex2) {
            a.a(new NotificationParser$NotificationParseException("Invalid actions data"));
        }
        catch (Exception ex) {
            a.a(ex);
            goto Label_0219;
        }
    }
}
