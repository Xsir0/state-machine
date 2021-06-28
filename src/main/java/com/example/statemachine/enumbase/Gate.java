package com.example.statemachine.enumbase;

import com.example.statemachine.exceptions.InvalidUserActionException;
import lombok.Data;

/**
 * @ClassName Gate
 * @Description 闸机
 * @Author xsir
 * @Date 2021/6/28 上午7:46
 * @Version V1.0
 */
@Data
public class Gate {

    private GateState state;

    public Gate(GateState state){
        setState(state);
    }

    public String execute(UserAction action){

        if (null == action){
            throw new InvalidUserActionException();
        }

        return action.execute(this,state);

    }

    public String open() {
        return "opened";
    }

    public String alarm() {
        return "alarm";
    }

    public String refund() {
        return "refund";
    }

    public String close() {
        return "closed";
    }

}
