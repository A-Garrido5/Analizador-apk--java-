// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

public enum PollCard$Configuration
{
    a("TWO_CHOICE_WITH_RESULTS", 0, "2427656750:poll_choice2_r", 2, 2130968921, 0, 2, 2, false), 
    b("TWO_CHOICE_WITH_MESSAGE", 1, "2427656750:poll_choice2_m", 2, 2130968921, 0, 1, 2, true), 
    c("FOUR_CHOICE_WITH_MESSAGE", 2, "2427656750:poll_choice4_m", 4, 2130968922, 0, 1, 1, true), 
    d("FOUR_CHOICE_WITH_RESULTS", 3, "2427656750:poll_choice4_r", 4, 2130968922, 0, 2, 2, true);
    
    public final int choiceCount;
    public final int completedState;
    public final int initialState;
    public final boolean isForwardTitleBarVisible;
    public final int layoutId;
    public final String name;
    public final int postVoteState;
    
    private PollCard$Configuration(final String s, final int n, final String name, final int choiceCount, final int layoutId, final int initialState, final int postVoteState, final int completedState, final boolean isForwardTitleBarVisible) {
        this.name = name;
        this.choiceCount = choiceCount;
        this.layoutId = layoutId;
        this.initialState = initialState;
        this.postVoteState = postVoteState;
        this.completedState = completedState;
        this.isForwardTitleBarVisible = isForwardTitleBarVisible;
    }
}
