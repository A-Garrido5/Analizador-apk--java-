// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.search;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonHighlightTimeRange$$JsonObjectMapper extends JsonMapper
{
    public static JsonHighlightTimeRange _parse(final JsonParser jsonParser) {
        JsonHighlightTimeRange jsonHighlightTimeRange = new JsonHighlightTimeRange();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonHighlightTimeRange = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonHighlightTimeRange, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonHighlightTimeRange;
    }
    
    public static void _serialize(final JsonHighlightTimeRange jsonHighlightTimeRange, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        jsonGenerator.a("since", jsonHighlightTimeRange.a);
        jsonGenerator.a("until", jsonHighlightTimeRange.b);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonHighlightTimeRange jsonHighlightTimeRange, final String s, final JsonParser jsonParser) {
        if ("since".equals(s)) {
            jsonHighlightTimeRange.a = jsonParser.o();
        }
        else if ("until".equals(s)) {
            jsonHighlightTimeRange.b = jsonParser.o();
        }
    }
    
    @Override
    public JsonHighlightTimeRange parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonHighlightTimeRange jsonHighlightTimeRange, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonHighlightTimeRange, jsonGenerator, b);
    }
}
