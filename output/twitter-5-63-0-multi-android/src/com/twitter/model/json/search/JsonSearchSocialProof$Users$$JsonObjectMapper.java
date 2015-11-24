// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSearchSocialProof$Users$$JsonObjectMapper extends JsonMapper
{
    public static JsonSearchSocialProof$Users _parse(final JsonParser jsonParser) {
        JsonSearchSocialProof$Users jsonSearchSocialProof$Users = new JsonSearchSocialProof$Users();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonSearchSocialProof$Users = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonSearchSocialProof$Users, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonSearchSocialProof$Users;
    }
    
    public static void _serialize(final JsonSearchSocialProof$Users jsonSearchSocialProof$Users, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        final JsonSearchSocialProof$Users$Name[] a = jsonSearchSocialProof$Users.a;
        if (a != null) {
            jsonGenerator.a("users");
            jsonGenerator.a();
            for (final JsonSearchSocialProof$Users$Name jsonSearchSocialProof$Users$Name : a) {
                if (jsonSearchSocialProof$Users$Name != null) {
                    JsonSearchSocialProof$Users$Name$$JsonObjectMapper._serialize(jsonSearchSocialProof$Users$Name, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonSearchSocialProof$Users jsonSearchSocialProof$Users, final String s, final JsonParser jsonParser) {
        if ("users".equals(s)) {
            if (jsonParser.d() != JsonToken.d) {
                jsonSearchSocialProof$Users.a = null;
                return;
            }
            final ArrayList<JsonSearchSocialProof$Users$Name> list = new ArrayList<JsonSearchSocialProof$Users$Name>();
            while (jsonParser.a() != JsonToken.e) {
                final JsonSearchSocialProof$Users$Name parse = JsonSearchSocialProof$Users$Name$$JsonObjectMapper._parse(jsonParser);
                if (parse != null) {
                    list.add(parse);
                }
            }
            jsonSearchSocialProof$Users.a = list.toArray(new JsonSearchSocialProof$Users$Name[list.size()]);
        }
    }
    
    @Override
    public JsonSearchSocialProof$Users parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonSearchSocialProof$Users jsonSearchSocialProof$Users, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonSearchSocialProof$Users, jsonGenerator, b);
    }
}
