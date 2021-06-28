package com.example.statemachine.collectionbase;

/**
 * @ClassName Test
 * @Description 测试
 * @Author xsir
 * @Date 2021/6/28 下午7:46
 * @Version V1.0
 */
public class Test {

    public static void main(String[] args) {
        Gate gate = new Gate(GateState.LOCKED);
        String execute = gate.execute(UserAction.INSERT_COIN);
        System.out.println(execute);
    }

}
