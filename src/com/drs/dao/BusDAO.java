package com.drs.dao;
import com.drs.pojo.Bus;
import java.util.List;

public interface BusDAO {
    public void addBus();
    List<Bus> viewAllBus();
    Bus viewBus(int bus_id);
    void updateBus(int bus_id);
    void deleteBus(int bus_id);
}
