// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

public enum ErrorCode
{
    a("NO_ERROR", 0, 0, -1, 0), 
    b("PROTOCOL_ERROR", 1, 1, 1, 1), 
    c("INVALID_STREAM", 2, 1, 2, -1), 
    d("UNSUPPORTED_VERSION", 3, 1, 4, -1), 
    e("STREAM_IN_USE", 4, 1, 8, -1), 
    f("STREAM_ALREADY_CLOSED", 5, 1, 9, -1), 
    g("INTERNAL_ERROR", 6, 2, 6, 2), 
    h("FLOW_CONTROL_ERROR", 7, 3, 7, -1), 
    i("STREAM_CLOSED", 8, 5, -1, -1), 
    j("FRAME_TOO_LARGE", 9, 6, 11, -1), 
    k("REFUSED_STREAM", 10, 7, 3, -1), 
    l("CANCEL", 11, 8, 5, -1), 
    m("COMPRESSION_ERROR", 12, 9, -1, -1), 
    n("INVALID_CREDENTIALS", 13, -1, 10, -1);
    
    public final int httpCode;
    public final int spdyGoAwayCode;
    public final int spdyRstCode;
    
    private ErrorCode(final String s, final int n, final int httpCode, final int spdyRstCode, final int spdyGoAwayCode) {
        this.httpCode = httpCode;
        this.spdyRstCode = spdyRstCode;
        this.spdyGoAwayCode = spdyGoAwayCode;
    }
    
    public static ErrorCode a(final int n) {
        for (final ErrorCode errorCode : values()) {
            if (errorCode.spdyRstCode == n) {
                return errorCode;
            }
        }
        return null;
    }
    
    public static ErrorCode b(final int n) {
        for (final ErrorCode errorCode : values()) {
            if (errorCode.httpCode == n) {
                return errorCode;
            }
        }
        return null;
    }
    
    public static ErrorCode c(final int n) {
        for (final ErrorCode errorCode : values()) {
            if (errorCode.spdyGoAwayCode == n) {
                return errorCode;
            }
        }
        return null;
    }
}
