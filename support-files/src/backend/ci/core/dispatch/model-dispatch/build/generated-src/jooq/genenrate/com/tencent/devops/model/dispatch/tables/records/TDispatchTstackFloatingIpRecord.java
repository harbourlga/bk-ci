/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.dispatch.tables.records;


import com.tencent.devops.model.dispatch.tables.TDispatchTstackFloatingIp;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDispatchTstackFloatingIpRecord extends UpdatableRecordImpl<TDispatchTstackFloatingIpRecord> implements Record1<String> {

    private static final long serialVersionUID = 844560953;

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_TSTACK_FLOATING_IP.FLOATING_IP</code>.
     */
    public TDispatchTstackFloatingIpRecord setFloatingIp(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_TSTACK_FLOATING_IP.FLOATING_IP</code>.
     */
    public String getFloatingIp() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TDispatchTstackFloatingIp.T_DISPATCH_TSTACK_FLOATING_IP.FLOATING_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFloatingIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackFloatingIpRecord value1(String value) {
        setFloatingIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchTstackFloatingIpRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TDispatchTstackFloatingIpRecord
     */
    public TDispatchTstackFloatingIpRecord() {
        super(TDispatchTstackFloatingIp.T_DISPATCH_TSTACK_FLOATING_IP);
    }

    /**
     * Create a detached, initialised TDispatchTstackFloatingIpRecord
     */
    public TDispatchTstackFloatingIpRecord(String floatingIp) {
        super(TDispatchTstackFloatingIp.T_DISPATCH_TSTACK_FLOATING_IP);

        set(0, floatingIp);
    }
}