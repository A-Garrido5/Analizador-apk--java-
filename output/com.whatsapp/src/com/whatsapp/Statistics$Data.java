// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.Serializable;

public class Statistics$Data implements Serializable
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    final long last_reset;
    long rx_google_drive_bytes;
    long rx_media_bytes;
    long rx_media_msgs;
    long rx_message_service_bytes;
    long rx_offline_delay;
    long rx_offline_msgs;
    long rx_text_msgs;
    long rx_voip_bytes;
    long rx_voip_calls;
    long tx_google_drive_bytes;
    long tx_media_bytes;
    long tx_media_msgs;
    long tx_message_service_bytes;
    long tx_text_msgs;
    long tx_voip_bytes;
    long tx_voip_calls;
    
    static {
        final String[] z2 = new String[25];
        String s = "bq#<(-w8/o!\u007f:$<n>";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0657:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'O';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = '\u001e';
                        break;
                    }
                    case 2: {
                        c2 = 'V';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "b1v\u001e +nv\u000b..r%ro";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "b|/<*1>$-,'w -+";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "bm3&;n>";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "bw8+ /w8/o!\u007f:$<n>";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "b1v\u0007)$r?&*bS3;<#y3;ub";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "b|/<*1>%-!62v";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "b|/<*1>%-!62v";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "b1v\u0005*1m7/*bM3:9+}3ro";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "bs%-,b\u007f -=#y3h+'r71f";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "b1v\u000f -y:-o\u0006l?>*x>";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "b|/<*1>$-,'w -+";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "b|/<*1>$-,'w -+b";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "b|/<*1>$-,'w -+";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0016{.<o\u000f{%;.%{%ro";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "b|/<*1>%-!62v";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "bm3&;b6";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "b1v\u001c 6\u007f:h\u000b#j7ro";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "b|/<*17zh";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "b1v\u0005*&w7h\u0002'm%)('mlh";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "bl3+*+h3,oj";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "b|/<*17";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "bl3+*+h3,oj";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "bl3+*+h3,";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "b|/<*1>%-!62v";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    break Label_0657;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    Statistics$Data(final boolean b) {
        this.rx_text_msgs = 0L;
        this.tx_text_msgs = 0L;
        this.rx_media_msgs = 0L;
        this.tx_media_msgs = 0L;
        this.rx_offline_msgs = 0L;
        this.rx_offline_delay = 0L;
        this.rx_media_bytes = 0L;
        this.tx_media_bytes = 0L;
        this.rx_message_service_bytes = 0L;
        this.tx_message_service_bytes = 0L;
        this.rx_voip_calls = 0L;
        this.tx_voip_calls = 0L;
        this.rx_voip_bytes = 0L;
        this.tx_voip_bytes = 0L;
        this.rx_google_drive_bytes = 0L;
        this.tx_google_drive_bytes = 0L;
        if (b) {
            this.last_reset = System.currentTimeMillis();
            if (!App.I) {
                return;
            }
        }
        this.last_reset = Long.MIN_VALUE;
    }
    
    public long getIncomingVoipCalls() {
        return this.rx_voip_calls;
    }
    
    public long getLastReset() {
        return this.last_reset;
    }
    
    public long getMediaBytesReceived() {
        return this.rx_media_bytes;
    }
    
    public long getMediaBytesSent() {
        return this.tx_media_bytes;
    }
    
    public long getMessageBytesReceived() {
        return this.rx_message_service_bytes;
    }
    
    public long getMessageBytesSent() {
        return this.tx_message_service_bytes;
    }
    
    public long getOutgoingVoipCalls() {
        return this.tx_voip_calls;
    }
    
    public long getTotalBytesReceived() {
        return this.rx_media_bytes + this.rx_message_service_bytes + this.rx_voip_bytes + this.rx_google_drive_bytes;
    }
    
    public long getTotalBytesReceivedFromGoogleDrive() {
        return this.rx_google_drive_bytes;
    }
    
    public long getTotalBytesSent() {
        return this.tx_media_bytes + this.tx_message_service_bytes + this.tx_voip_bytes + this.tx_google_drive_bytes;
    }
    
    public long getTotalBytesSentToGoogleDrive() {
        return this.tx_google_drive_bytes;
    }
    
    public long getTotalMessagesReceived() {
        return this.rx_text_msgs + this.rx_media_msgs;
    }
    
    public long getTotalMessagesSent() {
        return this.tx_text_msgs + this.tx_media_msgs;
    }
    
    public long getTotalVoipBytes() {
        return this.rx_voip_bytes + this.tx_voip_bytes;
    }
    
    public long getTotalVoipCalls() {
        return this.tx_voip_calls + this.rx_voip_calls;
    }
    
    public long getVoipBytesReceived() {
        return this.rx_voip_bytes;
    }
    
    public long getVoipBytesSent() {
        return this.tx_voip_bytes;
    }
    
    @Override
    public String toString() {
        return Statistics$Data.z[14] + this.tx_text_msgs + Statistics$Data.z[3] + this.rx_text_msgs + Statistics$Data.z[23] + Statistics$Data.z[19] + this.tx_media_msgs + Statistics$Data.z[16] + this.tx_media_bytes + Statistics$Data.z[18] + this.rx_media_msgs + Statistics$Data.z[20] + this.rx_media_bytes + Statistics$Data.z[21] + Statistics$Data.z[5] + this.rx_offline_msgs + Statistics$Data.z[22] + this.rx_offline_delay + Statistics$Data.z[9] + Statistics$Data.z[8] + this.tx_message_service_bytes + Statistics$Data.z[6] + this.rx_message_service_bytes + Statistics$Data.z[13] + Statistics$Data.z[1] + this.tx_voip_calls + Statistics$Data.z[0] + this.rx_voip_calls + Statistics$Data.z[4] + this.tx_voip_bytes + Statistics$Data.z[24] + this.rx_voip_bytes + Statistics$Data.z[11] + Statistics$Data.z[10] + this.tx_google_drive_bytes + Statistics$Data.z[7] + this.rx_google_drive_bytes + Statistics$Data.z[12] + Statistics$Data.z[17] + this.getTotalBytesSent() + Statistics$Data.z[15] + this.getTotalBytesReceived() + Statistics$Data.z[2];
    }
}
