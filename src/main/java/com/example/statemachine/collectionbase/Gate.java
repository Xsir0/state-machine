package com.example.statemachine.collectionbase;

import com.example.statemachine.collectionbase.events.AlarmEvent;
import com.example.statemachine.collectionbase.events.CloseEvent;
import com.example.statemachine.collectionbase.events.OpenEvent;
import com.example.statemachine.collectionbase.events.RefundEvent;
import com.example.statemachine.exceptions.InvalidUserActionException;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName Gate
 * @Description 闸机
 * @Author xsir
 * @Date 2021/6/28 下午7:32
 * @Version V1.0
 */
@Data
public class Gate {

    List<GateTransaction> gateTransactionList = Arrays.asList(
            GateTransaction.builder()
                    .currentState(GateState.LOCKED)
                    .action(UserAction.INSERT_COIN)
                    .nextState(GateState.UNLOCKED)
                    .event(new OpenEvent())
                    .build(),
            GateTransaction.builder()
                    .currentState(GateState.LOCKED)
                    .action(UserAction.PASS)
                    .nextState(GateState.LOCKED)
                    .event(new AlarmEvent())
                    .build(),
            GateTransaction.builder()
                    .currentState(GateState.UNLOCKED)
                    .action(UserAction.INSERT_COIN)
                    .nextState(GateState.UNLOCKED)
                    .event(new RefundEvent())
                    .build(),
            GateTransaction.builder()
                    .currentState(GateState.LOCKED)
                    .action(UserAction.PASS)
                    .nextState(GateState.LOCKED)
                    .event(new CloseEvent())
                    .build()
    );

    private GateState state;

    public Gate(GateState state){
        setState(state);
    }

    public String execute(UserAction action){
        Optional<GateTransaction> first = gateTransactionList.stream().filter(transaction -> {
            return transaction.getAction().equals(action) && transaction.getCurrentState().equals(state);
        }).findFirst();

        if (!first.isPresent()){
            throw new InvalidUserActionException();
        }
        GateTransaction gateTransaction = first.get();
        return gateTransaction.getEvent().execute();

    }

}
