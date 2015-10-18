// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.profiles;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonExtendedProfile$$JsonObjectMapper extends JsonMapper
{
    public static JsonExtendedProfile _parse(final JsonParser jsonParser) {
        JsonExtendedProfile jsonExtendedProfile = new JsonExtendedProfile();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonExtendedProfile = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonExtendedProfile, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonExtendedProfile;
    }
    
    public static void _serialize(final JsonExtendedProfile jsonExtendedProfile, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        if (jsonExtendedProfile.b != null) {
            jsonGenerator.a("birthdate");
            JsonBirthdate$$JsonObjectMapper._serialize(jsonExtendedProfile.b, jsonGenerator, true);
        }
        jsonGenerator.a("id", jsonExtendedProfile.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonExtendedProfile jsonExtendedProfile, final String s, final JsonParser jsonParser) {
        if ("birthdate".equals(s)) {
            jsonExtendedProfile.b = JsonBirthdate$$JsonObjectMapper._parse(jsonParser);
        }
        else if ("id".equals(s)) {
            jsonExtendedProfile.a = jsonParser.o();
        }
    }
    
    @Override
    public JsonExtendedProfile parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonExtendedProfile jsonExtendedProfile, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonExtendedProfile, jsonGenerator, b);
    }
}
