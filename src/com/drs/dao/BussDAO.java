package com.drs.dao;
import com.drs.pojo.Buss;
import java.util.List;

public interface BussDAO {
    public void addBus();
    List<Buss> viewAllBus();
    Buss viewBus(int bus_id);
    void updateBus(int bus_id);
    void deleteBus(int bus_id);
}
