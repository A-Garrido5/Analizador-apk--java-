// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.h264.model;

import java.io.OutputStream;
import com.googlecode.mp4parser.h264.write.CAVLCWriter;
import java.io.InputStream;
import java.io.IOException;
import com.googlecode.mp4parser.h264.read.CAVLCReader;

public class SeqParameterSet extends BitstreamElement
{
    public int bit_depth_chroma_minus8;
    public int bit_depth_luma_minus8;
    public ChromaFormat chroma_format_idc;
    public boolean constraint_set_0_flag;
    public boolean constraint_set_1_flag;
    public boolean constraint_set_2_flag;
    public boolean constraint_set_3_flag;
    public boolean constraint_set_4_flag;
    public boolean constraint_set_5_flag;
    public boolean delta_pic_order_always_zero_flag;
    public boolean direct_8x8_inference_flag;
    public boolean entropy_coding_mode_flag;
    public boolean field_pic_flag;
    public int frame_crop_bottom_offset;
    public int frame_crop_left_offset;
    public int frame_crop_right_offset;
    public int frame_crop_top_offset;
    public boolean frame_cropping_flag;
    public boolean frame_mbs_only_flag;
    public boolean gaps_in_frame_num_value_allowed_flag;
    public int level_idc;
    public int log2_max_frame_num_minus4;
    public int log2_max_pic_order_cnt_lsb_minus4;
    public boolean mb_adaptive_frame_field_flag;
    public int num_ref_frames;
    public int num_ref_frames_in_pic_order_cnt_cycle;
    public int[] offsetForRefFrame;
    public int offset_for_non_ref_pic;
    public int offset_for_top_to_bottom_field;
    public int pic_height_in_map_units_minus1;
    public int pic_order_cnt_type;
    public int pic_width_in_mbs_minus1;
    public int profile_idc;
    public boolean qpprime_y_zero_transform_bypass_flag;
    public boolean residual_color_transform_flag;
    public ScalingMatrix scalingMatrix;
    public int seq_parameter_set_id;
    public VUIParameters vuiParams;
    public int weighted_bipred_idc;
    public boolean weighted_pred_flag;
    
    private static VUIParameters ReadVUIParameters(final CAVLCReader cavlcReader) throws IOException {
        final VUIParameters vuiParameters = new VUIParameters();
        vuiParameters.aspect_ratio_info_present_flag = cavlcReader.readBool("VUI: aspect_ratio_info_present_flag");
        if (vuiParameters.aspect_ratio_info_present_flag) {
            vuiParameters.aspect_ratio = AspectRatio.fromValue((int)cavlcReader.readNBit(8, "VUI: aspect_ratio"));
            if (vuiParameters.aspect_ratio == AspectRatio.Extended_SAR) {
                vuiParameters.sar_width = (int)cavlcReader.readNBit(16, "VUI: sar_width");
                vuiParameters.sar_height = (int)cavlcReader.readNBit(16, "VUI: sar_height");
            }
        }
        vuiParameters.overscan_info_present_flag = cavlcReader.readBool("VUI: overscan_info_present_flag");
        if (vuiParameters.overscan_info_present_flag) {
            vuiParameters.overscan_appropriate_flag = cavlcReader.readBool("VUI: overscan_appropriate_flag");
        }
        vuiParameters.video_signal_type_present_flag = cavlcReader.readBool("VUI: video_signal_type_present_flag");
        if (vuiParameters.video_signal_type_present_flag) {
            vuiParameters.video_format = (int)cavlcReader.readNBit(3, "VUI: video_format");
            vuiParameters.video_full_range_flag = cavlcReader.readBool("VUI: video_full_range_flag");
            vuiParameters.colour_description_present_flag = cavlcReader.readBool("VUI: colour_description_present_flag");
            if (vuiParameters.colour_description_present_flag) {
                vuiParameters.colour_primaries = (int)cavlcReader.readNBit(8, "VUI: colour_primaries");
                vuiParameters.transfer_characteristics = (int)cavlcReader.readNBit(8, "VUI: transfer_characteristics");
                vuiParameters.matrix_coefficients = (int)cavlcReader.readNBit(8, "VUI: matrix_coefficients");
            }
        }
        vuiParameters.chroma_loc_info_present_flag = cavlcReader.readBool("VUI: chroma_loc_info_present_flag");
        if (vuiParameters.chroma_loc_info_present_flag) {
            vuiParameters.chroma_sample_loc_type_top_field = cavlcReader.readUE("VUI chroma_sample_loc_type_top_field");
            vuiParameters.chroma_sample_loc_type_bottom_field = cavlcReader.readUE("VUI chroma_sample_loc_type_bottom_field");
        }
        vuiParameters.timing_info_present_flag = cavlcReader.readBool("VUI: timing_info_present_flag");
        if (vuiParameters.timing_info_present_flag) {
            vuiParameters.num_units_in_tick = (int)cavlcReader.readNBit(32, "VUI: num_units_in_tick");
            vuiParameters.time_scale = (int)cavlcReader.readNBit(32, "VUI: time_scale");
            vuiParameters.fixed_frame_rate_flag = cavlcReader.readBool("VUI: fixed_frame_rate_flag");
        }
        final boolean bool = cavlcReader.readBool("VUI: nal_hrd_parameters_present_flag");
        if (bool) {
            vuiParameters.nalHRDParams = readHRDParameters(cavlcReader);
        }
        final boolean bool2 = cavlcReader.readBool("VUI: vcl_hrd_parameters_present_flag");
        if (bool2) {
            vuiParameters.vclHRDParams = readHRDParameters(cavlcReader);
        }
        if (bool || bool2) {
            vuiParameters.low_delay_hrd_flag = cavlcReader.readBool("VUI: low_delay_hrd_flag");
        }
        vuiParameters.pic_struct_present_flag = cavlcReader.readBool("VUI: pic_struct_present_flag");
        if (cavlcReader.readBool("VUI: bitstream_restriction_flag")) {
            vuiParameters.bitstreamRestriction = new VUIParameters.BitstreamRestriction();
            vuiParameters.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag = cavlcReader.readBool("VUI: motion_vectors_over_pic_boundaries_flag");
            vuiParameters.bitstreamRestriction.max_bytes_per_pic_denom = cavlcReader.readUE("VUI max_bytes_per_pic_denom");
            vuiParameters.bitstreamRestriction.max_bits_per_mb_denom = cavlcReader.readUE("VUI max_bits_per_mb_denom");
            vuiParameters.bitstreamRestriction.log2_max_mv_length_horizontal = cavlcReader.readUE("VUI log2_max_mv_length_horizontal");
            vuiParameters.bitstreamRestriction.log2_max_mv_length_vertical = cavlcReader.readUE("VUI log2_max_mv_length_vertical");
            vuiParameters.bitstreamRestriction.num_reorder_frames = cavlcReader.readUE("VUI num_reorder_frames");
            vuiParameters.bitstreamRestriction.max_dec_frame_buffering = cavlcReader.readUE("VUI max_dec_frame_buffering");
        }
        return vuiParameters;
    }
    
    public static SeqParameterSet read(final InputStream inputStream) throws IOException {
        final CAVLCReader cavlcReader = new CAVLCReader(inputStream);
        final SeqParameterSet set = new SeqParameterSet();
        set.profile_idc = (int)cavlcReader.readNBit(8, "SPS: profile_idc");
        set.constraint_set_0_flag = cavlcReader.readBool("SPS: constraint_set_0_flag");
        set.constraint_set_1_flag = cavlcReader.readBool("SPS: constraint_set_1_flag");
        set.constraint_set_2_flag = cavlcReader.readBool("SPS: constraint_set_2_flag");
        set.constraint_set_3_flag = cavlcReader.readBool("SPS: constraint_set_3_flag");
        set.constraint_set_4_flag = cavlcReader.readBool("SPS: constraint_set_4_flag");
        set.constraint_set_5_flag = cavlcReader.readBool("SPS: constraint_set_5_flag");
        cavlcReader.readNBit(2, "SPS: reserved_zero_2bits");
        set.level_idc = (int)cavlcReader.readNBit(8, "SPS: level_idc");
        set.seq_parameter_set_id = cavlcReader.readUE("SPS: seq_parameter_set_id");
        if (set.profile_idc == 100 || set.profile_idc == 110 || set.profile_idc == 122 || set.profile_idc == 144) {
            set.chroma_format_idc = ChromaFormat.fromId(cavlcReader.readUE("SPS: chroma_format_idc"));
            if (set.chroma_format_idc == ChromaFormat.YUV_444) {
                set.residual_color_transform_flag = cavlcReader.readBool("SPS: residual_color_transform_flag");
            }
            set.bit_depth_luma_minus8 = cavlcReader.readUE("SPS: bit_depth_luma_minus8");
            set.bit_depth_chroma_minus8 = cavlcReader.readUE("SPS: bit_depth_chroma_minus8");
            set.qpprime_y_zero_transform_bypass_flag = cavlcReader.readBool("SPS: qpprime_y_zero_transform_bypass_flag");
            if (cavlcReader.readBool("SPS: seq_scaling_matrix_present_lag")) {
                readScalingListMatrix(cavlcReader, set);
            }
        }
        else {
            set.chroma_format_idc = ChromaFormat.YUV_420;
        }
        set.log2_max_frame_num_minus4 = cavlcReader.readUE("SPS: log2_max_frame_num_minus4");
        set.pic_order_cnt_type = cavlcReader.readUE("SPS: pic_order_cnt_type");
        if (set.pic_order_cnt_type == 0) {
            set.log2_max_pic_order_cnt_lsb_minus4 = cavlcReader.readUE("SPS: log2_max_pic_order_cnt_lsb_minus4");
        }
        else if (set.pic_order_cnt_type == 1) {
            set.delta_pic_order_always_zero_flag = cavlcReader.readBool("SPS: delta_pic_order_always_zero_flag");
            set.offset_for_non_ref_pic = cavlcReader.readSE("SPS: offset_for_non_ref_pic");
            set.offset_for_top_to_bottom_field = cavlcReader.readSE("SPS: offset_for_top_to_bottom_field");
            set.num_ref_frames_in_pic_order_cnt_cycle = cavlcReader.readUE("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            set.offsetForRefFrame = new int[set.num_ref_frames_in_pic_order_cnt_cycle];
            for (int i = 0; i < set.num_ref_frames_in_pic_order_cnt_cycle; ++i) {
                set.offsetForRefFrame[i] = cavlcReader.readSE("SPS: offsetForRefFrame [" + i + "]");
            }
        }
        set.num_ref_frames = cavlcReader.readUE("SPS: num_ref_frames");
        set.gaps_in_frame_num_value_allowed_flag = cavlcReader.readBool("SPS: gaps_in_frame_num_value_allowed_flag");
        set.pic_width_in_mbs_minus1 = cavlcReader.readUE("SPS: pic_width_in_mbs_minus1");
        set.pic_height_in_map_units_minus1 = cavlcReader.readUE("SPS: pic_height_in_map_units_minus1");
        if (!(set.frame_mbs_only_flag = cavlcReader.readBool("SPS: frame_mbs_only_flag"))) {
            set.mb_adaptive_frame_field_flag = cavlcReader.readBool("SPS: mb_adaptive_frame_field_flag");
        }
        set.direct_8x8_inference_flag = cavlcReader.readBool("SPS: direct_8x8_inference_flag");
        set.frame_cropping_flag = cavlcReader.readBool("SPS: frame_cropping_flag");
        if (set.frame_cropping_flag) {
            set.frame_crop_left_offset = cavlcReader.readUE("SPS: frame_crop_left_offset");
            set.frame_crop_right_offset = cavlcReader.readUE("SPS: frame_crop_right_offset");
            set.frame_crop_top_offset = cavlcReader.readUE("SPS: frame_crop_top_offset");
            set.frame_crop_bottom_offset = cavlcReader.readUE("SPS: frame_crop_bottom_offset");
        }
        if (cavlcReader.readBool("SPS: vui_parameters_present_flag")) {
            set.vuiParams = ReadVUIParameters(cavlcReader);
        }
        cavlcReader.readTrailingBits();
        return set;
    }
    
    private static HRDParameters readHRDParameters(final CAVLCReader cavlcReader) throws IOException {
        final HRDParameters hrdParameters = new HRDParameters();
        hrdParameters.cpb_cnt_minus1 = cavlcReader.readUE("SPS: cpb_cnt_minus1");
        hrdParameters.bit_rate_scale = (int)cavlcReader.readNBit(4, "HRD: bit_rate_scale");
        hrdParameters.cpb_size_scale = (int)cavlcReader.readNBit(4, "HRD: cpb_size_scale");
        hrdParameters.bit_rate_value_minus1 = new int[1 + hrdParameters.cpb_cnt_minus1];
        hrdParameters.cpb_size_value_minus1 = new int[1 + hrdParameters.cpb_cnt_minus1];
        hrdParameters.cbr_flag = new boolean[1 + hrdParameters.cpb_cnt_minus1];
        for (int i = 0; i <= hrdParameters.cpb_cnt_minus1; ++i) {
            hrdParameters.bit_rate_value_minus1[i] = cavlcReader.readUE("HRD: bit_rate_value_minus1");
            hrdParameters.cpb_size_value_minus1[i] = cavlcReader.readUE("HRD: cpb_size_value_minus1");
            hrdParameters.cbr_flag[i] = cavlcReader.readBool("HRD: cbr_flag");
        }
        hrdParameters.initial_cpb_removal_delay_length_minus1 = (int)cavlcReader.readNBit(5, "HRD: initial_cpb_removal_delay_length_minus1");
        hrdParameters.cpb_removal_delay_length_minus1 = (int)cavlcReader.readNBit(5, "HRD: cpb_removal_delay_length_minus1");
        hrdParameters.dpb_output_delay_length_minus1 = (int)cavlcReader.readNBit(5, "HRD: dpb_output_delay_length_minus1");
        hrdParameters.time_offset_length = (int)cavlcReader.readNBit(5, "HRD: time_offset_length");
        return hrdParameters;
    }
    
    private static void readScalingListMatrix(final CAVLCReader cavlcReader, final SeqParameterSet set) throws IOException {
        set.scalingMatrix = new ScalingMatrix();
        for (int i = 0; i < 8; ++i) {
            if (cavlcReader.readBool("SPS: seqScalingListPresentFlag")) {
                set.scalingMatrix.ScalingList4x4 = new ScalingList[8];
                set.scalingMatrix.ScalingList8x8 = new ScalingList[8];
                if (i < 6) {
                    set.scalingMatrix.ScalingList4x4[i] = ScalingList.read(cavlcReader, 16);
                }
                else {
                    set.scalingMatrix.ScalingList8x8[i - 6] = ScalingList.read(cavlcReader, 64);
                }
            }
        }
    }
    
    private void writeHRDParameters(final HRDParameters hrdParameters, final CAVLCWriter cavlcWriter) throws IOException {
        cavlcWriter.writeUE(hrdParameters.cpb_cnt_minus1, "HRD: cpb_cnt_minus1");
        cavlcWriter.writeNBit(hrdParameters.bit_rate_scale, 4, "HRD: bit_rate_scale");
        cavlcWriter.writeNBit(hrdParameters.cpb_size_scale, 4, "HRD: cpb_size_scale");
        for (int i = 0; i <= hrdParameters.cpb_cnt_minus1; ++i) {
            cavlcWriter.writeUE(hrdParameters.bit_rate_value_minus1[i], "HRD: ");
            cavlcWriter.writeUE(hrdParameters.cpb_size_value_minus1[i], "HRD: ");
            cavlcWriter.writeBool(hrdParameters.cbr_flag[i], "HRD: ");
        }
        cavlcWriter.writeNBit(hrdParameters.initial_cpb_removal_delay_length_minus1, 5, "HRD: initial_cpb_removal_delay_length_minus1");
        cavlcWriter.writeNBit(hrdParameters.cpb_removal_delay_length_minus1, 5, "HRD: cpb_removal_delay_length_minus1");
        cavlcWriter.writeNBit(hrdParameters.dpb_output_delay_length_minus1, 5, "HRD: dpb_output_delay_length_minus1");
        cavlcWriter.writeNBit(hrdParameters.time_offset_length, 5, "HRD: time_offset_length");
    }
    
    private void writeVUIParameters(final VUIParameters vuiParameters, final CAVLCWriter cavlcWriter) throws IOException {
        boolean b = true;
        cavlcWriter.writeBool(vuiParameters.aspect_ratio_info_present_flag, "VUI: aspect_ratio_info_present_flag");
        if (vuiParameters.aspect_ratio_info_present_flag) {
            cavlcWriter.writeNBit(vuiParameters.aspect_ratio.getValue(), 8, "VUI: aspect_ratio");
            if (vuiParameters.aspect_ratio == AspectRatio.Extended_SAR) {
                cavlcWriter.writeNBit(vuiParameters.sar_width, 16, "VUI: sar_width");
                cavlcWriter.writeNBit(vuiParameters.sar_height, 16, "VUI: sar_height");
            }
        }
        cavlcWriter.writeBool(vuiParameters.overscan_info_present_flag, "VUI: overscan_info_present_flag");
        if (vuiParameters.overscan_info_present_flag) {
            cavlcWriter.writeBool(vuiParameters.overscan_appropriate_flag, "VUI: overscan_appropriate_flag");
        }
        cavlcWriter.writeBool(vuiParameters.video_signal_type_present_flag, "VUI: video_signal_type_present_flag");
        if (vuiParameters.video_signal_type_present_flag) {
            cavlcWriter.writeNBit(vuiParameters.video_format, 3, "VUI: video_format");
            cavlcWriter.writeBool(vuiParameters.video_full_range_flag, "VUI: video_full_range_flag");
            cavlcWriter.writeBool(vuiParameters.colour_description_present_flag, "VUI: colour_description_present_flag");
            if (vuiParameters.colour_description_present_flag) {
                cavlcWriter.writeNBit(vuiParameters.colour_primaries, 8, "VUI: colour_primaries");
                cavlcWriter.writeNBit(vuiParameters.transfer_characteristics, 8, "VUI: transfer_characteristics");
                cavlcWriter.writeNBit(vuiParameters.matrix_coefficients, 8, "VUI: matrix_coefficients");
            }
        }
        cavlcWriter.writeBool(vuiParameters.chroma_loc_info_present_flag, "VUI: chroma_loc_info_present_flag");
        if (vuiParameters.chroma_loc_info_present_flag) {
            cavlcWriter.writeUE(vuiParameters.chroma_sample_loc_type_top_field, "VUI: chroma_sample_loc_type_top_field");
            cavlcWriter.writeUE(vuiParameters.chroma_sample_loc_type_bottom_field, "VUI: chroma_sample_loc_type_bottom_field");
        }
        cavlcWriter.writeBool(vuiParameters.timing_info_present_flag, "VUI: timing_info_present_flag");
        if (vuiParameters.timing_info_present_flag) {
            cavlcWriter.writeNBit(vuiParameters.num_units_in_tick, 32, "VUI: num_units_in_tick");
            cavlcWriter.writeNBit(vuiParameters.time_scale, 32, "VUI: time_scale");
            cavlcWriter.writeBool(vuiParameters.fixed_frame_rate_flag, "VUI: fixed_frame_rate_flag");
        }
        cavlcWriter.writeBool(vuiParameters.nalHRDParams != null && b, "VUI: ");
        if (vuiParameters.nalHRDParams != null) {
            this.writeHRDParameters(vuiParameters.nalHRDParams, cavlcWriter);
        }
        cavlcWriter.writeBool(vuiParameters.vclHRDParams != null && b, "VUI: ");
        if (vuiParameters.vclHRDParams != null) {
            this.writeHRDParameters(vuiParameters.vclHRDParams, cavlcWriter);
        }
        if (vuiParameters.nalHRDParams != null || vuiParameters.vclHRDParams != null) {
            cavlcWriter.writeBool(vuiParameters.low_delay_hrd_flag, "VUI: low_delay_hrd_flag");
        }
        cavlcWriter.writeBool(vuiParameters.pic_struct_present_flag, "VUI: pic_struct_present_flag");
        if (vuiParameters.bitstreamRestriction == null) {
            b = false;
        }
        cavlcWriter.writeBool(b, "VUI: ");
        if (vuiParameters.bitstreamRestriction != null) {
            cavlcWriter.writeBool(vuiParameters.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag, "VUI: motion_vectors_over_pic_boundaries_flag");
            cavlcWriter.writeUE(vuiParameters.bitstreamRestriction.max_bytes_per_pic_denom, "VUI: max_bytes_per_pic_denom");
            cavlcWriter.writeUE(vuiParameters.bitstreamRestriction.max_bits_per_mb_denom, "VUI: max_bits_per_mb_denom");
            cavlcWriter.writeUE(vuiParameters.bitstreamRestriction.log2_max_mv_length_horizontal, "VUI: log2_max_mv_length_horizontal");
            cavlcWriter.writeUE(vuiParameters.bitstreamRestriction.log2_max_mv_length_vertical, "VUI: log2_max_mv_length_vertical");
            cavlcWriter.writeUE(vuiParameters.bitstreamRestriction.num_reorder_frames, "VUI: num_reorder_frames");
            cavlcWriter.writeUE(vuiParameters.bitstreamRestriction.max_dec_frame_buffering, "VUI: max_dec_frame_buffering");
        }
    }
    
    @Override
    public String toString() {
        return "SeqParameterSet{ \n        pic_order_cnt_type=" + this.pic_order_cnt_type + ", \n        field_pic_flag=" + this.field_pic_flag + ", \n        delta_pic_order_always_zero_flag=" + this.delta_pic_order_always_zero_flag + ", \n        weighted_pred_flag=" + this.weighted_pred_flag + ", \n        weighted_bipred_idc=" + this.weighted_bipred_idc + ", \n        entropy_coding_mode_flag=" + this.entropy_coding_mode_flag + ", \n        mb_adaptive_frame_field_flag=" + this.mb_adaptive_frame_field_flag + ", \n        direct_8x8_inference_flag=" + this.direct_8x8_inference_flag + ", \n        chroma_format_idc=" + this.chroma_format_idc + ", \n        log2_max_frame_num_minus4=" + this.log2_max_frame_num_minus4 + ", \n        log2_max_pic_order_cnt_lsb_minus4=" + this.log2_max_pic_order_cnt_lsb_minus4 + ", \n        pic_height_in_map_units_minus1=" + this.pic_height_in_map_units_minus1 + ", \n        pic_width_in_mbs_minus1=" + this.pic_width_in_mbs_minus1 + ", \n        bit_depth_luma_minus8=" + this.bit_depth_luma_minus8 + ", \n        bit_depth_chroma_minus8=" + this.bit_depth_chroma_minus8 + ", \n        qpprime_y_zero_transform_bypass_flag=" + this.qpprime_y_zero_transform_bypass_flag + ", \n        profile_idc=" + this.profile_idc + ", \n        constraint_set_0_flag=" + this.constraint_set_0_flag + ", \n        constraint_set_1_flag=" + this.constraint_set_1_flag + ", \n        constraint_set_2_flag=" + this.constraint_set_2_flag + ", \n        constraint_set_3_flag=" + this.constraint_set_3_flag + ", \n        constraint_set_4_flag=" + this.constraint_set_4_flag + ", \n        constraint_set_5_flag=" + this.constraint_set_5_flag + ", \n        level_idc=" + this.level_idc + ", \n        seq_parameter_set_id=" + this.seq_parameter_set_id + ", \n        residual_color_transform_flag=" + this.residual_color_transform_flag + ", \n        offset_for_non_ref_pic=" + this.offset_for_non_ref_pic + ", \n        offset_for_top_to_bottom_field=" + this.offset_for_top_to_bottom_field + ", \n        num_ref_frames=" + this.num_ref_frames + ", \n        gaps_in_frame_num_value_allowed_flag=" + this.gaps_in_frame_num_value_allowed_flag + ", \n        frame_mbs_only_flag=" + this.frame_mbs_only_flag + ", \n        frame_cropping_flag=" + this.frame_cropping_flag + ", \n        frame_crop_left_offset=" + this.frame_crop_left_offset + ", \n        frame_crop_right_offset=" + this.frame_crop_right_offset + ", \n        frame_crop_top_offset=" + this.frame_crop_top_offset + ", \n        frame_crop_bottom_offset=" + this.frame_crop_bottom_offset + ", \n        offsetForRefFrame=" + this.offsetForRefFrame + ", \n        vuiParams=" + this.vuiParams + ", \n        scalingMatrix=" + this.scalingMatrix + ", \n        num_ref_frames_in_pic_order_cnt_cycle=" + this.num_ref_frames_in_pic_order_cnt_cycle + '}';
    }
    
    @Override
    public void write(final OutputStream outputStream) throws IOException {
        boolean b = true;
        final CAVLCWriter cavlcWriter = new CAVLCWriter(outputStream);
        cavlcWriter.writeNBit(this.profile_idc, 8, "SPS: profile_idc");
        cavlcWriter.writeBool(this.constraint_set_0_flag, "SPS: constraint_set_0_flag");
        cavlcWriter.writeBool(this.constraint_set_1_flag, "SPS: constraint_set_1_flag");
        cavlcWriter.writeBool(this.constraint_set_2_flag, "SPS: constraint_set_2_flag");
        cavlcWriter.writeBool(this.constraint_set_3_flag, "SPS: constraint_set_3_flag");
        cavlcWriter.writeNBit(0L, 4, "SPS: reserved");
        cavlcWriter.writeNBit(this.level_idc, 8, "SPS: level_idc");
        cavlcWriter.writeUE(this.seq_parameter_set_id, "SPS: seq_parameter_set_id");
        if (this.profile_idc == 100 || this.profile_idc == 110 || this.profile_idc == 122 || this.profile_idc == 144) {
            cavlcWriter.writeUE(this.chroma_format_idc.getId(), "SPS: chroma_format_idc");
            if (this.chroma_format_idc == ChromaFormat.YUV_444) {
                cavlcWriter.writeBool(this.residual_color_transform_flag, "SPS: residual_color_transform_flag");
            }
            cavlcWriter.writeUE(this.bit_depth_luma_minus8, "SPS: ");
            cavlcWriter.writeUE(this.bit_depth_chroma_minus8, "SPS: ");
            cavlcWriter.writeBool(this.qpprime_y_zero_transform_bypass_flag, "SPS: qpprime_y_zero_transform_bypass_flag");
            cavlcWriter.writeBool(this.scalingMatrix != null && b, "SPS: ");
            if (this.scalingMatrix != null) {
                for (int i = 0; i < 8; ++i) {
                    if (i < 6) {
                        cavlcWriter.writeBool(this.scalingMatrix.ScalingList4x4[i] != null && b, "SPS: ");
                        if (this.scalingMatrix.ScalingList4x4[i] != null) {
                            this.scalingMatrix.ScalingList4x4[i].write(cavlcWriter);
                        }
                    }
                    else {
                        cavlcWriter.writeBool(this.scalingMatrix.ScalingList8x8[i - 6] != null && b, "SPS: ");
                        if (this.scalingMatrix.ScalingList8x8[i - 6] != null) {
                            this.scalingMatrix.ScalingList8x8[i - 6].write(cavlcWriter);
                        }
                    }
                }
            }
        }
        cavlcWriter.writeUE(this.log2_max_frame_num_minus4, "SPS: log2_max_frame_num_minus4");
        cavlcWriter.writeUE(this.pic_order_cnt_type, "SPS: pic_order_cnt_type");
        if (this.pic_order_cnt_type == 0) {
            cavlcWriter.writeUE(this.log2_max_pic_order_cnt_lsb_minus4, "SPS: log2_max_pic_order_cnt_lsb_minus4");
        }
        else if (this.pic_order_cnt_type == (b ? 1 : 0)) {
            cavlcWriter.writeBool(this.delta_pic_order_always_zero_flag, "SPS: delta_pic_order_always_zero_flag");
            cavlcWriter.writeSE(this.offset_for_non_ref_pic, "SPS: offset_for_non_ref_pic");
            cavlcWriter.writeSE(this.offset_for_top_to_bottom_field, "SPS: offset_for_top_to_bottom_field");
            cavlcWriter.writeUE(this.offsetForRefFrame.length, "SPS: ");
            for (int j = 0; j < this.offsetForRefFrame.length; ++j) {
                cavlcWriter.writeSE(this.offsetForRefFrame[j], "SPS: ");
            }
        }
        cavlcWriter.writeUE(this.num_ref_frames, "SPS: num_ref_frames");
        cavlcWriter.writeBool(this.gaps_in_frame_num_value_allowed_flag, "SPS: gaps_in_frame_num_value_allowed_flag");
        cavlcWriter.writeUE(this.pic_width_in_mbs_minus1, "SPS: pic_width_in_mbs_minus1");
        cavlcWriter.writeUE(this.pic_height_in_map_units_minus1, "SPS: pic_height_in_map_units_minus1");
        cavlcWriter.writeBool(this.frame_mbs_only_flag, "SPS: frame_mbs_only_flag");
        if (!this.frame_mbs_only_flag) {
            cavlcWriter.writeBool(this.mb_adaptive_frame_field_flag, "SPS: mb_adaptive_frame_field_flag");
        }
        cavlcWriter.writeBool(this.direct_8x8_inference_flag, "SPS: direct_8x8_inference_flag");
        cavlcWriter.writeBool(this.frame_cropping_flag, "SPS: frame_cropping_flag");
        if (this.frame_cropping_flag) {
            cavlcWriter.writeUE(this.frame_crop_left_offset, "SPS: frame_crop_left_offset");
            cavlcWriter.writeUE(this.frame_crop_right_offset, "SPS: frame_crop_right_offset");
            cavlcWriter.writeUE(this.frame_crop_top_offset, "SPS: frame_crop_top_offset");
            cavlcWriter.writeUE(this.frame_crop_bottom_offset, "SPS: frame_crop_bottom_offset");
        }
        if (this.vuiParams == null) {
            b = false;
        }
        cavlcWriter.writeBool(b, "SPS: ");
        if (this.vuiParams != null) {
            this.writeVUIParameters(this.vuiParams, cavlcWriter);
        }
        cavlcWriter.writeTrailingBits();
    }
}
