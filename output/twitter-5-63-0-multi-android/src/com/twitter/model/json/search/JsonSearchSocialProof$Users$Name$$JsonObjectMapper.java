// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSearchSocialProof$Users$Name$$JsonObjectMapper extends JsonMapper
{
    public static JsonSearchSocialProof$Users$Name _parse(final JsonParser jsonParser) {
        JsonSearchSocialProof$Users$Name jsonSearchSocialProof$Users$Name = new JsonSearchSocialProof$Users$Name();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonSearchSocialProof$Users$Name = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonSearchSocialProof$Users$Name, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonSearchSocialProof$Users$Name;
    }
    
    public static void _serialize(final JsonSearchSocialProof$Users$Name jsonSearchSocialProof$Users$Name, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("name", jsonSearchSocialProof$Users$Name.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonSearchSocialProof$Users$Name jsonSearchSocialProof$Users$Name, final String s, final JsonParser jsonParser) {
        if ("name".equals(s)) {
            jsonSearchSocialProof$Users$Name.a = jsonParser.a((String)null);
        }
    }
    
    @Override
    public JsonSearchSocialProof$Users$Name parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonSearchSocialProof$Users$Name jsonSearchSocialProof$Users$Name, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonSearchSocialProof$Users$Name, jsonGenerator, b);
    }
}
