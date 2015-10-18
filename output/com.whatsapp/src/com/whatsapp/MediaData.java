// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.File;
import java.io.Serializable;

public class MediaData implements Serializable
{
    private static final long serialVersionUID = -3211751283609594L;
    public boolean autodownloadRetryEnabled;
    public transient boolean dedupeDownload;
    public transient ds downloader;
    public int faceX;
    public int faceY;
    public File file;
    public long fileSize;
    public transient boolean forward;
    public long progress;
    public boolean transcoded;
    public transient wm transcoder;
    public boolean transferred;
    public transient boolean transferring;
    public long trimFrom;
    public long trimTo;
    public transient a9 uploader;
    
    public MediaData() {
        this.transferring = false;
        this.transferred = false;
    }
    
    public MediaData(final MediaData mediaData) {
        this.transferring = false;
        this.transferred = false;
        this.transferred = mediaData.transferred;
        this.file = mediaData.file;
        this.fileSize = mediaData.fileSize;
        this.faceX = mediaData.faceX;
        this.faceY = mediaData.faceY;
    }
}
