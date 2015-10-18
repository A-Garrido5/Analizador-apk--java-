// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.search.verification.client.SearchActionVerificationClientActivity;

public class VoiceMessagingActivity extends SearchActionVerificationClientActivity
{
    @Override
    public Class getServiceClass() {
        return VoiceMessagingService.class;
    }
}
