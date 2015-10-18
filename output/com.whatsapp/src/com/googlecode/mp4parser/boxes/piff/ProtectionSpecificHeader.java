// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.Hex;
import java.util.HashMap;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.Map;

public class ProtectionSpecificHeader
{
    protected static Map<UUID, Class<? extends ProtectionSpecificHeader>> uuidRegistry;
    ByteBuffer data;
    
    static {
        (ProtectionSpecificHeader.uuidRegistry = new HashMap<UUID, Class<? extends ProtectionSpecificHeader>>()).put(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"), PlayReadyHeader.class);
    }
    
    public static ProtectionSpecificHeader createFor(final UUID uuid, final ByteBuffer byteBuffer) {
        final Class<? extends ProtectionSpecificHeader> clazz = ProtectionSpecificHeader.uuidRegistry.get(uuid);
        ProtectionSpecificHeader protectionSpecificHeader = new ProtectionSpecificHeader();
        Label_0033: {
            if (clazz == null) {
                break Label_0033;
            }
            try {
                protectionSpecificHeader = (ProtectionSpecificHeader)clazz.newInstance();
                protectionSpecificHeader.parse(byteBuffer);
                return protectionSpecificHeader;
            }
            catch (InstantiationException ex) {
                throw new RuntimeException(ex);
            }
            catch (IllegalAccessException ex2) {
                throw new RuntimeException(ex2);
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof ProtectionSpecificHeader && this.getClass().equals(o.getClass()) && this.data.equals(((ProtectionSpecificHeader)o).data);
    }
    
    public ByteBuffer getData() {
        return this.data;
    }
    
    public void parse(final ByteBuffer data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ProtectionSpecificHeader");
        sb.append("{data=");
        final ByteBuffer duplicate = this.getData().duplicate();
        duplicate.rewind();
        final byte[] array = new byte[duplicate.limit()];
        duplicate.get(array);
        sb.append(Hex.encodeHex(array));
        sb.append('}');
        return sb.toString();
    }
}
