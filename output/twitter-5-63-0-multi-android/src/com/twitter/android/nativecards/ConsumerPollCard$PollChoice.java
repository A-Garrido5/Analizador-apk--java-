// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

enum ConsumerPollCard$PollChoice
{
    a("NONE", 0, 0), 
    b("ONE", 1, 1), 
    c("TWO", 2, 2);
    
    public final int ordinal;
    
    private ConsumerPollCard$PollChoice(final String s, final int n, final int ordinal) {
        this.ordinal = ordinal;
    }
    
    static int a(final ConsumerPollCard$PollChoice consumerPollCard$PollChoice) {
        return consumerPollCard$PollChoice.ordinal;
    }
    
    static ConsumerPollCard$PollChoice a(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException(String.format("Could not convert ordinal %d to PollChoice", n));
            }
            case 0: {
                return ConsumerPollCard$PollChoice.a;
            }
            case 1: {
                return ConsumerPollCard$PollChoice.b;
            }
            case 2: {
                return ConsumerPollCard$PollChoice.c;
            }
        }
    }
}
