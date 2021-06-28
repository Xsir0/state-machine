package com.example.statemachine.collectionbase.events;

/**
 * @ClassName AlarmEvent
 * @Description 告警
 * @Author xsir
 * @Date 2021/6/28 下午7:29
 * @Version V1.0
 */
public class AlarmEvent implements Event {
    @Override
    public String execute() {
        return "alarm";
    }
}
