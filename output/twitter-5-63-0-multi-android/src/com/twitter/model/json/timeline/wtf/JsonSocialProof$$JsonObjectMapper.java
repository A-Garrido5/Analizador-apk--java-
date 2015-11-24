// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.timeline.wtf;

import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSocialProof$$JsonObjectMapper extends JsonMapper
{
    public static JsonSocialProof _parse(final JsonParser jsonParser) {
        JsonSocialProof jsonSocialProof = new JsonSocialProof();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonSocialProof = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonSocialProof, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonSocialProof;
    }
    
    public static void _serialize(final JsonSocialProof jsonSocialProof, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("proof_type", jsonSocialProof.a);
        final String[] b2 = jsonSocialProof.b;
        if (b2 != null) {
            jsonGenerator.a("user_ids");
            jsonGenerator.a();
            for (int length = b2.length, i = 0; i < length; ++i) {
                jsonGenerator.b(b2[i]);
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonSocialProof jsonSocialProof, final String s, final JsonParser jsonParser) {
        if ("proof_type".equals(s)) {
            jsonSocialProof.a = jsonParser.a((String)null);
        }
        else if ("user_ids".equals(s)) {
            if (jsonParser.d() == JsonToken.d) {
                final ArrayList<String> list = new ArrayList<String>();
                while (jsonParser.a() != JsonToken.e) {
                    final String a = jsonParser.a((String)null);
                    if (a != null) {
                        list.add(a);
                    }
                }
                jsonSocialProof.b = list.toArray(new String[list.size()]);
                return;
            }
            jsonSocialProof.b = null;
        }
    }
    
    @Override
    public JsonSocialProof parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonSocialProof jsonSocialProof, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonSocialProof, jsonGenerator, b);
    }
}
