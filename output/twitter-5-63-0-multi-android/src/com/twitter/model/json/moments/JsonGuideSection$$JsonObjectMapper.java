// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.moments;

import java.util.ArrayList;
import com.twitter.library.api.moments.MomentGuideSectionType;
import java.util.Iterator;
import java.util.List;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import com.bluelinelabs.logansquare.JsonMapper;

public final class JsonGuideSection$$JsonObjectMapper extends JsonMapper
{
    protected static final a JSON_MOMENT_GUIDE_SECTION_TYPE_CONVERTER;
    
    static {
        JSON_MOMENT_GUIDE_SECTION_TYPE_CONVERTER = new a();
    }
    
    public static JsonGuideSection _parse(final JsonParser jsonParser) {
        JsonGuideSection jsonGuideSection = new JsonGuideSection();
        if (jsonParser.d() == null) {
            jsonParser.a();
        }
        if (jsonParser.d() != JsonToken.b) {
            jsonParser.c();
            jsonGuideSection = null;
        }
        else {
            while (jsonParser.a() != JsonToken.c) {
                final String e = jsonParser.e();
                jsonParser.a();
                parseField(jsonGuideSection, e, jsonParser);
                jsonParser.c();
            }
        }
        return jsonGuideSection;
    }
    
    public static void _serialize(final JsonGuideSection jsonGuideSection, final JsonGenerator jsonGenerator, final boolean b) {
        if (b) {
            jsonGenerator.c();
        }
        if (jsonGuideSection.b != null) {
            JsonGuideSection$$JsonObjectMapper.JSON_MOMENT_GUIDE_SECTION_TYPE_CONVERTER.serialize(jsonGuideSection.b, "module_type", true, jsonGenerator);
        }
        final List c = jsonGuideSection.c;
        if (c != null) {
            jsonGenerator.a("moments");
            jsonGenerator.a();
            for (final JsonMomentModule jsonMomentModule : c) {
                if (jsonMomentModule != null) {
                    JsonMomentModule$$JsonObjectMapper._serialize(jsonMomentModule, jsonGenerator, true);
                }
            }
            jsonGenerator.b();
        }
        jsonGenerator.a("title", jsonGuideSection.a);
        if (b) {
            jsonGenerator.d();
        }
    }
    
    public static void parseField(final JsonGuideSection jsonGuideSection, final String s, final JsonParser jsonParser) {
        if ("module_type".equals(s)) {
            jsonGuideSection.b = (MomentGuideSectionType)JsonGuideSection$$JsonObjectMapper.JSON_MOMENT_GUIDE_SECTION_TYPE_CONVERTER.parse(jsonParser);
        }
        else if ("moments".equals(s)) {
            if (jsonParser.d() == JsonToken.d) {
                final ArrayList<JsonMomentModule> c = new ArrayList<JsonMomentModule>();
                while (jsonParser.a() != JsonToken.e) {
                    final JsonMomentModule parse = JsonMomentModule$$JsonObjectMapper._parse(jsonParser);
                    if (parse != null) {
                        c.add(parse);
                    }
                }
                jsonGuideSection.c = c;
                return;
            }
            jsonGuideSection.c = null;
        }
        else if ("title".equals(s)) {
            jsonGuideSection.a = jsonParser.a((String)null);
        }
    }
    
    @Override
    public JsonGuideSection parse(final JsonParser jsonParser) {
        return _parse(jsonParser);
    }
    
    public void serialize(final JsonGuideSection jsonGuideSection, final JsonGenerator jsonGenerator, final boolean b) {
        _serialize(jsonGuideSection, jsonGenerator, b);
    }
}
