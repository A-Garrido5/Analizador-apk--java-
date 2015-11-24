// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

public class NumberParseException extends Exception
{
    private NumberParseException$ErrorType errorType;
    private String message;
    
    public NumberParseException(final NumberParseException$ErrorType errorType, final String message) {
        super(message);
        this.message = message;
        this.errorType = errorType;
    }
    
    public NumberParseException$ErrorType a() {
        return this.errorType;
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(String.valueOf(this.errorType));
        final String value2 = String.valueOf(String.valueOf(this.message));
        return new StringBuilder(14 + value.length() + value2.length()).append("Error type: ").append(value).append(". ").append(value2).toString();
    }
}
