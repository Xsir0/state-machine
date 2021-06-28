package com.example.statemachine.statebase;

/**
 * @ClassName Test
 * @Description 测试
 * @Author xsir
 * @Date 2021/6/28 下午8:02
 * @Version V1.0
 */
public class Test {

    public static void main(String[] args) {
        Gate gate = new Gate(new LockedGateState());

        String execute = gate.execute(UserAction.INSERT_COIN);
        System.out.println(execute);

    }

}
