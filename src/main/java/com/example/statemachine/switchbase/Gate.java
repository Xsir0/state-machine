package com.example.statemachine.switchbase;

import com.example.statemachine.exceptions.InvalidUserActionException;
import lombok.Data;

/**
 * @ClassName Operation
 * @Description 操作
 * @Author xsir
 * @Date 2021/6/28 上午7:04
 * @Version V1.0
 */
@Data
public class Gate {

    // 当前闸机状态
    private GateState state;

    // 初始化闸机状态
    public Gate(GateState state){
        this.state = state;
    }

    //  用户行为
    public String execute(UserAction action){

        if (null == action){
            throw new InvalidUserActionException();
        }

        if (GateState.LOCKED.equals(state)){
            switch (action){
                case INSERT_COIN:
                    setState(GateState.UNLOCKED);
                    return open();
                case PASS:
                    return alarm();
            }
        }

        if (GateState.UNLOCKED.equals(state)){
            switch (action){
                case INSERT_COIN:
                    return refund();
                case PASS:
                    setState(GateState.LOCKED);
                    return close();
            }
        }
        throw new InvalidUserActionException();
    }

    private String refund() {
        return "refund";
    }

    private String close() {
        return "closed";
    }

    private String alarm() {
        return "alarm";
    }

    private String open() {
        return "opened";
    }

}
