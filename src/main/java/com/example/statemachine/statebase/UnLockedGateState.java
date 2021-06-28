package com.example.statemachine.statebase;

/**
 * @ClassName UnlockedGateState
 * @Description 打开闸机
 * @Author xsir
 * @Date 2021/6/28 下午7:55
 * @Version V1.0
 */
public class UnLockedGateState implements GateState {
    @Override
    public String insertCoin(Gate gate) {
        return gate.refund();
    }

    @Override
    public String pass(Gate gate) {
        return gate.close();
    }
}
