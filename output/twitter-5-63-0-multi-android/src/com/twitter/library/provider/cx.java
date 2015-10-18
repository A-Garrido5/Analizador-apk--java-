// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

class cx implements xx
{
    final /* synthetic */ String a;
    final /* synthetic */ TwitterDatabaseHelperMigration b;
    
    cx(final TwitterDatabaseHelperMigration b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public String a(final String s) {
        return "DROP " + this.a + " IF EXISTS " + s + ';';
    }
}
