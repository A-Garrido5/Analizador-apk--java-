// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.timeline;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonSuggestsInfo$$JsonObjectMapper extends JsonMapper
{
    public static JsonSuggestsInfo _parse(final JsonParser jsonParser) {
        JsonSuggestsInfo jsonSuggestsInfo = new JsonSuggestsInfo();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonSuggestsInfo = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonSuggestsInfo, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonSuggestsInfo;
    }
    
    public static void _serialize(final JsonSuggestsInfo jsonSuggestsInfo, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("controller_data", jsonSuggestsInfo.b);
        jsonGenerator.a("scribe_component", jsonSuggestsInfo.d);
        jsonGenerator.a("source_data", jsonSuggestsInfo.c);
        jsonGenerator.a("suggestion_type", jsonSuggestsInfo.a);
        jsonGenerator.a("type_id", jsonSuggestsInfo.e);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonSuggestsInfo jsonSuggestsInfo, final String s, final JsonParser jsonParser) {
        if ("controller_data".equals(s)) {
            jsonSuggestsInfo.b = jsonParser.a((String)null);
        }
        else {
            if ("scribe_component".equals(s)) {
                jsonSuggestsInfo.d = jsonParser.a((String)null);
                return;
            }
            if ("source_data".equals(s)) {
                jsonSuggestsInfo.c = jsonParser.a((String)null);
                return;
            }
            if ("suggestion_type".equals(s)) {
                jsonSuggestsInfo.a = jsonParser.a((String)null);
                return;
            }
            if ("type_id".equals(s)) {
                jsonSuggestsInfo.e = jsonParser.a((String)null);
            }
        }
    }
    
    @Override
    public JsonSuggestsInfo parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonSuggestsInfo jsonSuggestsInfo, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonSuggestsInfo, jsonGenerator, b);
    }
}
