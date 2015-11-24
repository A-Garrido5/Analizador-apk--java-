// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.profiles;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonBirthdate$$JsonObjectMapper extends JsonMapper
{
    public static JsonBirthdate _parse(final JsonParser jsonParser) {
        JsonBirthdate jsonBirthdate = new JsonBirthdate();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonBirthdate = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonBirthdate, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonBirthdate;
    }
    
    public static void _serialize(final JsonBirthdate jsonBirthdate, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("day", jsonBirthdate.a);
        jsonGenerator.a("month", jsonBirthdate.b);
        jsonGenerator.a("year", jsonBirthdate.c);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonBirthdate jsonBirthdate, final String s, final JsonParser jsonParser) {
        if ("day".equals(s)) {
            jsonBirthdate.a = jsonParser.n();
        }
        else {
            if ("month".equals(s)) {
                jsonBirthdate.b = jsonParser.n();
                return;
            }
            if ("year".equals(s)) {
                jsonBirthdate.c = jsonParser.n();
            }
        }
    }
    
    @Override
    public JsonBirthdate parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonBirthdate jsonBirthdate, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonBirthdate, jsonGenerator, b);
    }
}
