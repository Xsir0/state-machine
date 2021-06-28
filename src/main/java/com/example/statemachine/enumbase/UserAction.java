package com.example.statemachine.enumbase;

/**
 * @ClassName UserAction
 * @Description 用户行为
 * @Author xsir
 * @Date 2021/6/28 上午7:45
 * @Version V1.0
 */
public enum UserAction {

    PASS{
        @Override
        public String execute(Gate gate, GateState state) {
            return state.pass(gate);
        }
    },

    INSERT_COIN{
        @Override
        public String execute(Gate gate, GateState state) {
            return state.pass(gate);
        }
    };

    public abstract String execute(Gate gate,GateState state);

}
