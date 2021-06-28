package com.example.statemachine.statebase;

/**
 * @ClassName LockedEntranceMachineState
 * @Description 关闭闸机
 * @Author xsir
 * @Date 2021/6/28 下午7:54
 * @Version V1.0
 */
public class LockedGateState implements GateState {
    @Override
    public String insertCoin(Gate gate) {
        return gate.open();
    }

    @Override
    public String pass(Gate gate) {
        return gate.alarm();
    }
}
