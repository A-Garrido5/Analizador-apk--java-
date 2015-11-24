// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.Serializable;

class EmojiPicker$EmojiWeight implements Serializable
{
    private static final long serialVersionUID = 1L;
    int code;
    float weight;
    
    public EmojiPicker$EmojiWeight(final int code, final float weight) {
        this.code = code;
        this.weight = weight;
    }
}
