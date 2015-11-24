// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.proto;

import com.google.hv;
import com.google.cT;

public interface E2E$MessageOrBuilder extends cT
{
    String getConversation();
    
    hv getConversationBytes();
    
    E2E$Message$SenderKeyDistributionMessage getSenderKeyDistributionMessage();
    
    E2E$Message$SenderKeyDistributionMessageOrBuilder getSenderKeyDistributionMessageOrBuilder();
    
    boolean hasConversation();
    
    boolean hasSenderKeyDistributionMessage();
}
