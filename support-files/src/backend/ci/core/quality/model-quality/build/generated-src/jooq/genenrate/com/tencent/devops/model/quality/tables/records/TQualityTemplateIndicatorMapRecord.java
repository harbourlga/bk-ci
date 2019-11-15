/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.quality.tables.records;


import com.tencent.devops.model.quality.tables.TQualityTemplateIndicatorMap;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 模板-指标关系表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TQualityTemplateIndicatorMapRecord extends UpdatableRecordImpl<TQualityTemplateIndicatorMapRecord> implements Record5<Long, Long, Long, String, String> {

    private static final long serialVersionUID = -1919739178;

    /**
     * Setter for <code>devops_quality.T_QUALITY_TEMPLATE_INDICATOR_MAP.ID</code>.
     */
    public TQualityTemplateIndicatorMapRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_TEMPLATE_INDICATOR_MAP.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_TEMPLATE_INDICATOR_MAP.TEMPLATE_ID</code>. 模版ID
     */
    public TQualityTemplateIndicatorMapRecord setTemplateId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_TEMPLATE_INDICATOR_MAP.TEMPLATE_ID</code>. 模版ID
     */
    public Long getTemplateId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_TEMPLATE_INDICATOR_MAP.INDICATOR_ID</code>. 指标ID
     */
    public TQualityTemplateIndicatorMapRecord setIndicatorId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_TEMPLATE_INDICATOR_MAP.INDICATOR_ID</code>. 指标ID
     */
    public Long getIndicatorId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_TEMPLATE_INDICATOR_MAP.OPERATION</code>. 可选操作
     */
    public TQualityTemplateIndicatorMapRecord setOperation(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_TEMPLATE_INDICATOR_MAP.OPERATION</code>. 可选操作
     */
    public String getOperation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_quality.T_QUALITY_TEMPLATE_INDICATOR_MAP.THRESHOLD</code>. 阈值
     */
    public TQualityTemplateIndicatorMapRecord setThreshold(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_QUALITY_TEMPLATE_INDICATOR_MAP.THRESHOLD</code>. 阈值
     */
    public String getThreshold() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Long, Long, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP.TEMPLATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP.INDICATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP.OPERATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP.THRESHOLD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTemplateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getIndicatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOperation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getThreshold();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityTemplateIndicatorMapRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityTemplateIndicatorMapRecord value2(Long value) {
        setTemplateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityTemplateIndicatorMapRecord value3(Long value) {
        setIndicatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityTemplateIndicatorMapRecord value4(String value) {
        setOperation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityTemplateIndicatorMapRecord value5(String value) {
        setThreshold(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQualityTemplateIndicatorMapRecord values(Long value1, Long value2, Long value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TQualityTemplateIndicatorMapRecord
     */
    public TQualityTemplateIndicatorMapRecord() {
        super(TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP);
    }

    /**
     * Create a detached, initialised TQualityTemplateIndicatorMapRecord
     */
    public TQualityTemplateIndicatorMapRecord(Long id, Long templateId, Long indicatorId, String operation, String threshold) {
        super(TQualityTemplateIndicatorMap.T_QUALITY_TEMPLATE_INDICATOR_MAP);

        set(0, id);
        set(1, templateId);
        set(2, indicatorId);
        set(3, operation);
        set(4, threshold);
    }
}