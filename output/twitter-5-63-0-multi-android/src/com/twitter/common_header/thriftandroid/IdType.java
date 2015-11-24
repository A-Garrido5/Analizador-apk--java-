// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

public enum IdType
{
    a("USER_ID", 0, 1), 
    b("GUEST_ID", 1, 2), 
    c("DEVICE_ID", 2, 3);
    
    private final int value;
    
    private IdType(final String s, final int n, final int value) {
        this.value = value;
    }
    
    public int a() {
        return this.value;
    }
}
