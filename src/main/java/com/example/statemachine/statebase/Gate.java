package com.example.statemachine.statebase;

import com.example.statemachine.exceptions.InvalidUserActionException;
import lombok.Data;

import java.util.Objects;

/**
 * @ClassName Gate
 * @Description 闸机
 * @Author xsir
 * @Date 2021/6/28 下午7:56
 * @Version V1.0
 */
@Data
public class Gate {

    LockedGateState locked = new LockedGateState();
    UnLockedGateState unlocked = new UnLockedGateState();

    private GateState state;


    public Gate(GateState state){
        setState(state);
    }

    public String execute(UserAction action){

        if (Objects.isNull(action)){
            throw new InvalidUserActionException();
        }
        if (UserAction.PASS.equals(action)){
            return state.pass(this);
        }
            return state.insertCoin(this);
    }

    public String open() {
        setState(unlocked);
        return "opened";
    }

    public String alarm() {
        setState(locked);
        return "alarm";
    }

    public String refund() {
        setState(unlocked);
        return "refund";
    }

    public String close() {
        setState(locked);
        return "closed";
    }



}
