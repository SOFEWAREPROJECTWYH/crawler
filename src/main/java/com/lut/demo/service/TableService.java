package com.lut.demo.service;

import com.lut.demo.bean.City;
import com.lut.demo.bean.CityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TableService {
    public List<City> finAll(int index,int pagesize);
    public City findById(int id);
    public int Update(City city);
    public int delete(int id);
    public int insert(City city);

}
