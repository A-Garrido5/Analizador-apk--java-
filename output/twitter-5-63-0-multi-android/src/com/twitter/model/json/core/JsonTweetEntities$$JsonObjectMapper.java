// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonTweetEntities$$JsonObjectMapper extends JsonMapper
{
    public static JsonTweetEntities _parse(final JsonParser jsonParser) {
        JsonTweetEntities jsonTweetEntities = new JsonTweetEntities();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonTweetEntities = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonTweetEntities, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonTweetEntities;
    }
    
    public static void _serialize(final JsonTweetEntities jsonTweetEntities, final JsonGenerator jsonGenerator, final boolean b) {
        int i = 0;
        if (b) {
            jsonGenerator.c();
        }
        final JsonHashtagEntity[] d = jsonTweetEntities.d;
        if (d != null) {
            jsonGenerator.a("hashtags");
            jsonGenerator.a();
            for (final JsonHashtagEntity jsonHashtagEntity : d) {
                if (jsonHashtagEntity != null) {
                    JsonHashtagEntity$$JsonObjectMapper._serialize(jsonHashtagEntity, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        final JsonMediaEntity[] b2 = jsonTweetEntities.b;
        if (b2 != null) {
            jsonGenerator.a("media");
            jsonGenerator.a();
            for (final JsonMediaEntity jsonMediaEntity : b2) {
                if (jsonMediaEntity != null) {
                    JsonMediaEntity$$JsonObjectMapper._serialize(jsonMediaEntity, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        final JsonHashtagEntity[] e = jsonTweetEntities.e;
        if (e != null) {
            jsonGenerator.a("symbols");
            jsonGenerator.a();
            for (final JsonHashtagEntity jsonHashtagEntity2 : e) {
                if (jsonHashtagEntity2 != null) {
                    JsonHashtagEntity$$JsonObjectMapper._serialize(jsonHashtagEntity2, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        final JsonUrlEntity[] a = jsonTweetEntities.a;
        if (a != null) {
            jsonGenerator.a("urls");
            jsonGenerator.a();
            for (final JsonUrlEntity jsonUrlEntity : a) {
                if (jsonUrlEntity != null) {
                    JsonUrlEntity$$JsonObjectMapper._serialize(jsonUrlEntity, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        final JsonMentionEntity[] c = jsonTweetEntities.c;
        if (c != null) {
            jsonGenerator.a("user_mentions");
            jsonGenerator.a();
            while (i < c.length) {
                final JsonMentionEntity jsonMentionEntity = c[i];
                if (jsonMentionEntity != null) {
                    JsonMentionEntity$$JsonObjectMapper._serialize(jsonMentionEntity, jsonGenerator, true);
                }
                ++i;
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonTweetEntities jsonTweetEntities, final String s, final JsonParser jsonParser) {
        if ("hashtags".equals(s)) {
            if (jsonParser.d() != JsonToken.d) {
                jsonTweetEntities.d = null;
                return;
            }
            final ArrayList<JsonHashtagEntity> list = new ArrayList<JsonHashtagEntity>();
            while (jsonParser.a() != JsonToken.e) {
                final JsonHashtagEntity parse = JsonHashtagEntity$$JsonObjectMapper._parse(jsonParser);
                if (parse != null) {
                    list.add(parse);
                }
            }
            jsonTweetEntities.d = list.toArray(new JsonHashtagEntity[list.size()]);
        }
        else if ("media".equals(s)) {
            if (jsonParser.d() == JsonToken.d) {
                final ArrayList<JsonMediaEntity> list2 = new ArrayList<JsonMediaEntity>();
                while (jsonParser.a() != JsonToken.e) {
                    final JsonMediaEntity parse2 = JsonMediaEntity$$JsonObjectMapper._parse(jsonParser);
                    if (parse2 != null) {
                        list2.add(parse2);
                    }
                }
                jsonTweetEntities.b = list2.toArray(new JsonMediaEntity[list2.size()]);
                return;
            }
            jsonTweetEntities.b = null;
        }
        else if ("symbols".equals(s)) {
            if (jsonParser.d() == JsonToken.d) {
                final ArrayList<JsonHashtagEntity> list3 = new ArrayList<JsonHashtagEntity>();
                while (jsonParser.a() != JsonToken.e) {
                    final JsonHashtagEntity parse3 = JsonHashtagEntity$$JsonObjectMapper._parse(jsonParser);
                    if (parse3 != null) {
                        list3.add(parse3);
                    }
                }
                jsonTweetEntities.e = list3.toArray(new JsonHashtagEntity[list3.size()]);
                return;
            }
            jsonTweetEntities.e = null;
        }
        else if ("urls".equals(s)) {
            if (jsonParser.d() == JsonToken.d) {
                final ArrayList<JsonUrlEntity> list4 = new ArrayList<JsonUrlEntity>();
                while (jsonParser.a() != JsonToken.e) {
                    final JsonUrlEntity parse4 = JsonUrlEntity$$JsonObjectMapper._parse(jsonParser);
                    if (parse4 != null) {
                        list4.add(parse4);
                    }
                }
                jsonTweetEntities.a = list4.toArray(new JsonUrlEntity[list4.size()]);
                return;
            }
            jsonTweetEntities.a = null;
        }
        else if ("user_mentions".equals(s)) {
            if (jsonParser.d() == JsonToken.d) {
                final ArrayList<JsonMentionEntity> list5 = new ArrayList<JsonMentionEntity>();
                while (jsonParser.a() != JsonToken.e) {
                    final JsonMentionEntity parse5 = JsonMentionEntity$$JsonObjectMapper._parse(jsonParser);
                    if (parse5 != null) {
                        list5.add(parse5);
                    }
                }
                jsonTweetEntities.c = list5.toArray(new JsonMentionEntity[list5.size()]);
                return;
            }
            jsonTweetEntities.c = null;
        }
    }
    
    @Override
    public JsonTweetEntities parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonTweetEntities jsonTweetEntities, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonTweetEntities, jsonGenerator, b);
    }
}
