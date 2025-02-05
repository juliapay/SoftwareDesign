package Decorator.SlotMachine;

import java.util.HashMap;
import java.util.Map;

public abstract class StatisticsSlotMachineDecorator implements ISlotMachine {

    protected ISlotMachine decoratedSlotMachine;
    private Map<Integer, Integer> statistics= new HashMap<>();


    @Override
    public boolean play() {
        boolean result = decoratedSlotMachine.play(); // Originale play() Methode ausführen
        int[] lastResult = decoratedSlotMachine.getLastResult(); // Letztes Ergebnis abrufen

        // Zahlen in der Statistik speichern
        for (int num : lastResult) {
            statistics.put(num, statistics.getOrDefault(num, 0) + 1);
        }

        return result;
    }

    @Override
    public int[] getLastResult() {
        return decoratedSlotMachine.getLastResult();
    }
    public Map<Integer, Integer> getStatistics() {
        return statistics;
    }
}
