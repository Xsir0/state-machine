package com.example.statemachine.statebase;

/**
 * @ClassName GateState
 * @Description 闸机状态
 * @Author xsir
 * @Date 2021/6/28 下午7:52
 * @Version V1.0
 */
public interface GateState {

    String insertCoin(Gate gate);
    String pass(Gate gate);

}
