/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.dispatch.tables.records;


import com.tencent.devops.model.dispatch.tables.TDispatchMachine;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDispatchMachineRecord extends UpdatableRecordImpl<TDispatchMachineRecord> implements Record9<Integer, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer> {

    private static final long serialVersionUID = 929297249;

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_ID</code>.
     */
    public TDispatchMachineRecord setMachineId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_ID</code>.
     */
    public Integer getMachineId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_IP</code>.
     */
    public TDispatchMachineRecord setMachineIp(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_IP</code>.
     */
    public String getMachineIp() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_NAME</code>.
     */
    public TDispatchMachineRecord setMachineName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_NAME</code>.
     */
    public String getMachineName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_USERNAME</code>.
     */
    public TDispatchMachineRecord setMachineUsername(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_USERNAME</code>.
     */
    public String getMachineUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_PASSWORD</code>.
     */
    public TDispatchMachineRecord setMachinePassword(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_PASSWORD</code>.
     */
    public String getMachinePassword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_CREATED_TIME</code>.
     */
    public TDispatchMachineRecord setMachineCreatedTime(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_CREATED_TIME</code>.
     */
    public LocalDateTime getMachineCreatedTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_UPDATED_TIME</code>.
     */
    public TDispatchMachineRecord setMachineUpdatedTime(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_MACHINE.MACHINE_UPDATED_TIME</code>.
     */
    public LocalDateTime getMachineUpdatedTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_MACHINE.CURRENT_VM_RUN</code>.
     */
    public TDispatchMachineRecord setCurrentVmRun(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_MACHINE.CURRENT_VM_RUN</code>.
     */
    public Integer getCurrentVmRun() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>devops_dispatch.T_DISPATCH_MACHINE.MAX_VM_RUN</code>.
     */
    public TDispatchMachineRecord setMaxVmRun(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_dispatch.T_DISPATCH_MACHINE.MAX_VM_RUN</code>.
     */
    public Integer getMaxVmRun() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, LocalDateTime, LocalDateTime, Integer, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TDispatchMachine.T_DISPATCH_MACHINE.MACHINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TDispatchMachine.T_DISPATCH_MACHINE.MACHINE_IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TDispatchMachine.T_DISPATCH_MACHINE.MACHINE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TDispatchMachine.T_DISPATCH_MACHINE.MACHINE_USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TDispatchMachine.T_DISPATCH_MACHINE.MACHINE_PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field6() {
        return TDispatchMachine.T_DISPATCH_MACHINE.MACHINE_CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field7() {
        return TDispatchMachine.T_DISPATCH_MACHINE.MACHINE_UPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TDispatchMachine.T_DISPATCH_MACHINE.CURRENT_VM_RUN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return TDispatchMachine.T_DISPATCH_MACHINE.MAX_VM_RUN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMachineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMachineIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMachineName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMachineUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMachinePassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value6() {
        return getMachineCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value7() {
        return getMachineUpdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCurrentVmRun();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getMaxVmRun();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchMachineRecord value1(Integer value) {
        setMachineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchMachineRecord value2(String value) {
        setMachineIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchMachineRecord value3(String value) {
        setMachineName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchMachineRecord value4(String value) {
        setMachineUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchMachineRecord value5(String value) {
        setMachinePassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchMachineRecord value6(LocalDateTime value) {
        setMachineCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchMachineRecord value7(LocalDateTime value) {
        setMachineUpdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchMachineRecord value8(Integer value) {
        setCurrentVmRun(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchMachineRecord value9(Integer value) {
        setMaxVmRun(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDispatchMachineRecord values(Integer value1, String value2, String value3, String value4, String value5, LocalDateTime value6, LocalDateTime value7, Integer value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TDispatchMachineRecord
     */
    public TDispatchMachineRecord() {
        super(TDispatchMachine.T_DISPATCH_MACHINE);
    }

    /**
     * Create a detached, initialised TDispatchMachineRecord
     */
    public TDispatchMachineRecord(Integer machineId, String machineIp, String machineName, String machineUsername, String machinePassword, LocalDateTime machineCreatedTime, LocalDateTime machineUpdatedTime, Integer currentVmRun, Integer maxVmRun) {
        super(TDispatchMachine.T_DISPATCH_MACHINE);

        set(0, machineId);
        set(1, machineIp);
        set(2, machineName);
        set(3, machineUsername);
        set(4, machinePassword);
        set(5, machineCreatedTime);
        set(6, machineUpdatedTime);
        set(7, currentVmRun);
        set(8, maxVmRun);
    }
}