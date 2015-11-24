// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.media;

public class VireoNativeException extends Exception
{
    private int errorCode;
    private String message;
    
    public VireoNativeException(final int n) {
        switch (n) {
            default: {
                this.message = "Vireo: Unspecified error";
            }
            case 1: {
                this.message = "Vireo: Exception thrown";
            }
            case 2: {
                this.message = "Vireo: No audio or video data";
            }
            case 3: {
                this.message = "Vireo: Mismatch in input/output settings";
            }
            case 4: {
                this.message = "Vireo: Mismatch in input/output sample count";
            }
            case 5: {
                this.message = "Vireo: Invalid arguments";
            }
            case 6: {
                this.message = "Vireo: File not found";
            }
            case 7: {
                this.message = "Vireo: Native library not available";
            }
        }
    }
    
    @Override
    public String getMessage() {
        return super.getMessage() + ", errorCode : " + this.errorCode + ", message : " + this.message;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
