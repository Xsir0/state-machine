package com.example.statemachine.collectionbase;

import com.example.statemachine.collectionbase.events.Event;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName GateTransaction
 * @Description 闸机事务流
 * @Author xsir
 * @Date 2021/6/28 下午7:26
 * @Version V1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GateTransaction {

    private GateState currentState;

    private UserAction action;

    private GateState nextState;

    private Event event;

}
