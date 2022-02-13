package com.drs.dao;
import com.drs.pojo.Buss;
import java.util.List;

public interface BussDAO {
    public void addBus();
    List<Buss> viewAllBus();
    Buss viewBus(int buss_id);
    void updateBus(int buss_id);
    void deleteBus(int buss_id);
}
