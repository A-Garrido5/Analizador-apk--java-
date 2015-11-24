// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.eventreporter;

public class EventReporter$EventSubscriberException extends RuntimeException
{
    private static final long serialVersionUID = -58482851662074747L;
    public final b event;
    
    public EventReporter$EventSubscriberException(final b event) {
        super(String.format("An event was reported during a test and no subscribers responded: %s", event));
        this.event = event;
    }
}
