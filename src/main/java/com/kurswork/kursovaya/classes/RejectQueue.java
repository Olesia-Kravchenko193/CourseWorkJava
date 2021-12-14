package com.kurswork.kursovaya.classes;


import java.util.ArrayList;

public class RejectQueue {

    private int lastProcessId;
    private  ArrayList<Process> queue;
    private int queueLastSize;

    public RejectQueue() {
        this.queue = new ArrayList<>();
        this.lastProcessId = 1 ;
        this.queueLastSize = queue.size();

    }


    public int getLastProcessId() {
        return lastProcessId;
    }


    public void add(Process process){
        Process fullProcess = new Process(getLastProcessId(),process.getMemory(),process.getPriority(),process.getTimeIn(),process.getBurstTime(),process.getState());
        queue.add(fullProcess);
        lastProcessId++;
    }

    public boolean isNeadDefragmentation(){
        //проверяет нужна ли дефрагментация
        //дефрагментация нужна если очередь отказов увелисилась колличество ядер * 3  процессов
        if(queue.size() - queueLastSize > Configuration.coreQuantity*3){
            queueLastSize = queue.size();
            return  true;
        }

        return false;
    }

    public ArrayList getRejectQueue(){
        return queue;
    }

    @Override
    public String toString() {
        return "RejectQueue{" +
                "lastProcessId=" + lastProcessId +
                ", queue=" + queue +
                '}';
    }
}
