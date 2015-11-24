// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.ArrayList;

class FlowActivity$1 extends ArrayList
{
    final /* synthetic */ FlowActivity this$0;
    final /* synthetic */ boolean val$startFromPasswordStep;
    
    FlowActivity$1(final FlowActivity this$0, final boolean val$startFromPasswordStep) {
        this.this$0 = this$0;
        this.val$startFromPasswordStep = val$startFromPasswordStep;
        Flow$Step flow$Step;
        if (this.val$startFromPasswordStep) {
            flow$Step = new Flow$PasswordEntryStep();
        }
        else {
            flow$Step = new Flow$NameEntryStep();
        }
        this.add((Flow$PasswordEntryStep)flow$Step);
    }
}
