// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.annotation;

public enum JsonObject$FieldDetectionPolicy
{
    ANNOTATIONS_ONLY("ANNOTATIONS_ONLY", 0), 
    NONPRIVATE_FIELDS("NONPRIVATE_FIELDS", 1), 
    NONPRIVATE_FIELDS_AND_ACCESSORS("NONPRIVATE_FIELDS_AND_ACCESSORS", 2);
    
    private JsonObject$FieldDetectionPolicy(final String s, final int n) {
    }
}
