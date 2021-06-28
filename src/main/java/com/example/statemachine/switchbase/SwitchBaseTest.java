package com.example.statemachine.switchbase;

/**
 * @ClassName SwitchBaseTest
 * @Description 测试基于switch的状态机
 * @Author xsir
 * @Date 2021/6/28 上午7:37
 * @Version V1.0
 */
public class SwitchBaseTest {

    void case1(){
        Gate operation = new Gate(GateState.LOCKED);
        String execute = operation.execute(UserAction.INSERT_COIN);
        GateState state = operation.getState();
    }
    void case2(){}

    void case3(){}

    void case4(){}

}
