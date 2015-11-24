// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.Serializable;

public class App$Me implements Serializable
{
    private static final long serialVersionUID = -1952119322404952662L;
    public final String cc;
    public String jabber_id;
    public final String number;
    
    App$Me(final String cc, final String number) {
        this.cc = cc;
        this.number = number;
        this.jabber_id = null;
    }
}
