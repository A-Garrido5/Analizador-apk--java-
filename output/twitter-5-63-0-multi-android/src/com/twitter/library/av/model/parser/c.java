// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model.parser;

import java.io.Closeable;
import com.twitter.library.api.bh;
import java.io.InputStream;
import com.twitter.library.av.model.VideoCta;
import java.util.Map;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import com.twitter.library.av.model.Video;
import com.fasterxml.jackson.core.JsonParser;
import android.content.Context;

public class c extends e
{
    public c(final Context context, final int n) {
        super(context, n);
    }
    
    protected static Video[] b(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final ArrayList<Video> list = new ArrayList<Video>();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (d.a[jsonToken.ordinal()]) {
                case 1: {
                    list.add(c(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return list.toArray(new Video[list.size()]);
    }
    
    protected static Video c(final JsonParser jsonParser) {
        JsonToken a = jsonParser.a();
        long i = 0L;
        boolean b = true;
        String s = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        while (a != null && a != JsonToken.c) {
            String g = null;
            Label_0080: {
                switch (d.a[a.ordinal()]) {
                    case 1:
                    case 2: {
                        jsonParser.c();
                        g = s4;
                        break Label_0080;
                    }
                    case 5: {
                        final String g2 = jsonParser.g();
                        if ("uuid".equalsIgnoreCase(s4)) {
                            s3 = g2;
                        }
                        if ("video_type".equalsIgnoreCase(s4)) {
                            s2 = g2;
                        }
                        if ("source".equalsIgnoreCase(s4)) {
                            s = g2;
                            g = s4;
                            break Label_0080;
                        }
                        break;
                    }
                    case 3: {
                        if ("controllable".equalsIgnoreCase(s4)) {
                            b = (jsonParser.h() > 0);
                        }
                        if ("owner_id".equalsIgnoreCase(s4)) {
                            i = jsonParser.i();
                            g = s4;
                            break Label_0080;
                        }
                        break;
                    }
                    case 4: {
                        g = jsonParser.g();
                        break Label_0080;
                    }
                }
                g = s4;
            }
            final JsonToken a2 = jsonParser.a();
            final String s5 = g;
            a = a2;
            s4 = s5;
        }
        if (s == null) {
            throw new IOException("video playlist item has no stream");
        }
        return new Video(s3, s2, i, s, b, null, null);
    }
    
    public void a(final JsonParser jsonParser) {
        String g = null;
        final JsonToken a = jsonParser.a();
        int int1 = 0;
        JsonToken a2 = a;
        Video[] b = null;
        int n = 0;
        while (a2 != null) {
            Label_0064: {
                switch (com.twitter.library.av.model.parser.d.a[a2.ordinal()]) {
                    case 1: {
                        if ("android".equalsIgnoreCase(g) && n == 0) {
                            break;
                        }
                        if (g.toLowerCase().startsWith("android-v")) {
                        Label_0144_Outer:
                            while (true) {
                                final String replace = g.toLowerCase().replace("android-v", "");
                                while (true) {
                                    while (true) {
                                        try {
                                            int1 = Integer.parseInt(replace, 10);
                                            if (int1 >= n && this.b() >= int1) {
                                                final int n2 = 1;
                                                if (n2 != 0) {
                                                    this.d = false;
                                                    this.c = false;
                                                    n = int1;
                                                    break Label_0064;
                                                }
                                                break;
                                            }
                                        }
                                        catch (NumberFormatException ex) {
                                            jsonParser.c();
                                            continue Label_0144_Outer;
                                        }
                                        break;
                                    }
                                    final int n2 = 0;
                                    continue;
                                }
                            }
                            jsonParser.c();
                            break;
                        }
                        jsonParser.c();
                        break;
                    }
                    case 2: {
                        if ("videos".equalsIgnoreCase(g)) {
                            b = b(jsonParser);
                            break;
                        }
                        jsonParser.c();
                        break;
                    }
                    case 3: {
                        if ("play_on_phone".equalsIgnoreCase(g)) {
                            this.d = (jsonParser.h() == 0);
                            break;
                        }
                        if ("play_on_tablet".equalsIgnoreCase(g)) {
                            this.c = (jsonParser.h() == 0);
                            break;
                        }
                        break;
                    }
                    case 4: {
                        g = jsonParser.g();
                        break;
                    }
                }
            }
            a2 = jsonParser.a();
        }
        this.a = b;
    }
    
    @Override
    protected void a(final InputStream inputStream) {
        JsonParser a = null;
        try {
            a = bh.a(inputStream);
            this.a(a);
        }
        finally {
            yh.a(a);
        }
    }
}
