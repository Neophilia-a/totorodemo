package com.totoro.tororodemo.skill.stateMachine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 功能：状态机
 *
 * @author toroto
 * @date 2025/4/18/周五
 */
public class StateMachine {
 
    private Map<String,String> translatedTransitionsMap = new HashMap<>();
 
    private Set<String> translatedTransitions = new HashSet<>();

    private static final String DEFAULT_DELIMITER = "->";

    public StateMachine(Transition[] transitions){
        for (Transition transition : transitions) {
            translatedTransitions.add(transition.getFrom() + DEFAULT_DELIMITER +
                    transition.getEvent() + DEFAULT_DELIMITER
                    + transition.getTo());

            if(translatedTransitionsMap.containsKey(transition.getFrom() + DEFAULT_DELIMITER + transition.getEvent())){
                throw new RuntimeException("Duplicate transition found: " +
                        transition.getFrom() +
                        DEFAULT_DELIMITER +
                        transition.getEvent());
            }
            translatedTransitionsMap.put(transition.getFrom() + DEFAULT_DELIMITER + transition.getEvent(),
                    transition.getTo());
 
        }
    }
 
    public String getNextState(String from, String event){
        System.out.println(TradeStatusEnum.valueOf(from).getDesc() + DEFAULT_DELIMITER + TradeStatusEnum.valueOf(translatedTransitionsMap.get(from + DEFAULT_DELIMITER + event)).getDesc());
        return translatedTransitionsMap.get(from + DEFAULT_DELIMITER + event);
    }
 
    public boolean checkTransitions(String from, String event){
        return translatedTransitions.contains(from + DEFAULT_DELIMITER + event);
    }
 
}