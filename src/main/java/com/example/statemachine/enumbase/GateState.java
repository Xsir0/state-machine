package com.example.statemachine.enumbase;

/**
 * @ClassName GateState
 * @Description 闸机状态
 * @Author xsir
 * @Date 2021/6/28 上午7:41
 * @Version V1.0
 */
public enum  GateState {

    LOCKED{
        @Override
        public String insertCoin(Gate gate) {
            gate.setState(UNLOCKED);
            return gate.open();
        }

        @Override
        public String pass(Gate gate) {
            gate.setState(this);
            return gate.alarm();
        }
    },
    UNLOCKED{
        @Override
        public String insertCoin(Gate gate) {
            gate.setState(this);
            return gate.refund();
        }

        @Override
        public String pass(Gate gate) {
            gate.setState(LOCKED);
            return gate.close();
        }
    };

    public abstract String insertCoin(Gate gate);
    public abstract String pass(Gate gate);

}
