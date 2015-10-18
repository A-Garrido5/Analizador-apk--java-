// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.fasterxml.jackson.core.JsonParser;

public class DMUnknownAttachment extends BaseDMAttachment
{
    private static final long serialVersionUID = -4296716874440371957L;
    
    static DMUnknownAttachment g(final JsonParser jsonParser) {
        final DMUnknownAttachment dmUnknownAttachment = new DMUnknownAttachment();
        dmUnknownAttachment.b(jsonParser);
        return dmUnknownAttachment;
    }
    
    @Override
    public String a() {
        return "unknown";
    }
}
