/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<WorkRequest> workRequestList2;

    public WorkQueue() {
        workRequestList = new ArrayList();
        workRequestList2 = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    public ArrayList<WorkRequest> getWorkRequestList2() {
        return workRequestList2;
    }
}