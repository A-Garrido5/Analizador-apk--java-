// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.util.logging.Level;
import java.lang.reflect.Modifier;
import com.coremedia.iso.IsoTypeReader;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.logging.Logger;
import java.util.Map;

public class ObjectDescriptorFactory
{
    protected static Map<Integer, Map<Integer, Class<? extends BaseDescriptor>>> descriptorRegistry;
    protected static Logger log;
    
    static {
        ObjectDescriptorFactory.log = Logger.getLogger(ObjectDescriptorFactory.class.getName());
        ObjectDescriptorFactory.descriptorRegistry = new HashMap<Integer, Map<Integer, Class<? extends BaseDescriptor>>>();
        final HashSet<Class<DecoderSpecificInfo>> set = new HashSet<Class<DecoderSpecificInfo>>();
        set.add(DecoderSpecificInfo.class);
        set.add(SLConfigDescriptor.class);
        set.add(BaseDescriptor.class);
        set.add(ExtensionDescriptor.class);
        set.add(ObjectDescriptorBase.class);
        set.add(ProfileLevelIndicationDescriptor.class);
        set.add(AudioSpecificConfig.class);
        set.add(ExtensionProfileLevelDescriptor.class);
        set.add(ESDescriptor.class);
        set.add(DecoderConfigDescriptor.class);
        for (final Class<? extends BaseDescriptor> clazz : set) {
            final Descriptor descriptor = clazz.getAnnotation(Descriptor.class);
            final int[] tags = descriptor.tags();
            final int objectTypeIndication = descriptor.objectTypeIndication();
            Map<Integer, Class<? extends BaseDescriptor>> map = ObjectDescriptorFactory.descriptorRegistry.get(objectTypeIndication);
            if (map == null) {
                map = new HashMap<Integer, Class<? extends BaseDescriptor>>();
            }
            for (int length = tags.length, i = 0; i < length; ++i) {
                map.put(tags[i], clazz);
            }
            ObjectDescriptorFactory.descriptorRegistry.put(objectTypeIndication, map);
        }
    }
    
    public static BaseDescriptor createFrom(final int n, final ByteBuffer byteBuffer) throws IOException {
        final int uInt8 = IsoTypeReader.readUInt8(byteBuffer);
        Map<Integer, Class<? extends BaseDescriptor>> map = ObjectDescriptorFactory.descriptorRegistry.get(n);
        if (map == null) {
            map = ObjectDescriptorFactory.descriptorRegistry.get(-1);
        }
        final Class<BaseDescriptor> clazz = map.get(uInt8);
        BaseDescriptor baseDescriptor;
        if (clazz == null || clazz.isInterface() || Modifier.isAbstract(clazz.getModifiers())) {
            ObjectDescriptorFactory.log.warning("No ObjectDescriptor found for objectTypeIndication " + Integer.toHexString(n) + " and tag " + Integer.toHexString(uInt8) + " found: " + clazz);
            baseDescriptor = new UnknownDescriptor();
        }
        else {
            try {
                baseDescriptor = clazz.newInstance();
            }
            catch (Exception ex) {
                ObjectDescriptorFactory.log.log(Level.SEVERE, "Couldn't instantiate BaseDescriptor class " + clazz + " for objectTypeIndication " + n + " and tag " + uInt8, ex);
                throw new RuntimeException(ex);
            }
        }
        baseDescriptor.parse(uInt8, byteBuffer);
        return baseDescriptor;
    }
}
