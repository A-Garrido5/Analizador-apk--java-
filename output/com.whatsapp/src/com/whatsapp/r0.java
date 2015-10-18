// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Comparator;

class r0 implements Comparator
{
    final bi a;
    
    r0(final bi a) {
        this.a = a;
    }
    
    public int a(final EmojiPicker$EmojiWeight emojiPicker$EmojiWeight, final EmojiPicker$EmojiWeight emojiPicker$EmojiWeight2) {
        return Float.compare(emojiPicker$EmojiWeight2.weight, emojiPicker$EmojiWeight.weight);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.a((EmojiPicker$EmojiWeight)o, (EmojiPicker$EmojiWeight)o2);
    }
}
