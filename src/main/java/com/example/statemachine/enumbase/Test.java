package com.example.statemachine.enumbase;

/**
 * @ClassName Test
 * @Description 测试
 * @Author xsir
 * @Date 2021/6/28 下午8:14
 * @Version V1.0
 */
public class Test {

    public static void main(String[] args) {
        Gate gate = new Gate(GateState.LOCKED);
        String execute = gate.execute(UserAction.PASS);
        System.out.println(execute);
    }

}
