// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

public enum ConsumerPollCard$Configuration
{
    a("TWO_CHOICE_TEXT_ONLY", 0, "poll2choice_text_only", 2, 2130968913);
    
    public final int choiceCount;
    public final int layoutId;
    public final String modelName;
    
    private ConsumerPollCard$Configuration(final String s, final int n, final String modelName, final int choiceCount, final int layoutId) {
        this.modelName = modelName;
        this.choiceCount = choiceCount;
        this.layoutId = layoutId;
    }
}
