package com.drs.dao;
import com.drs.pojo.Buss;
import java.util.List;

public interface BussDAO {
    public void addBuss();
    List<Buss> viewAllBuss();
    Buss viewBuss(int buss_id);
    void updateBuss(int buss_id);
    void deleteBuss(int buss_id);
}
