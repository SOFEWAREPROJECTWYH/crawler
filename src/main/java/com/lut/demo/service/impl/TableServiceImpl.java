package com.lut.demo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lut.demo.bean.City;
import com.lut.demo.bean.CityExample;
import com.lut.demo.dao.CityMapper;
import com.lut.demo.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TableServiceImpl implements TableService {
    @Autowired
    CityMapper cityMapper;

    @Override
    public List<City> finAll(int index, int pagesize) {
        PageHelper.startPage(index, pagesize);
        List<City> cities = cityMapper.selectByExample(new CityExample());
        return cities;
    }

    @Override
    public City findById(int id) {
        City city = cityMapper.selectByPrimaryKey(id);
        return city;
    }

    @Override
    public int Update(City city) {
        return cityMapper.updateByPrimaryKey(city);
    }

    @Override
    public int delete(int id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(City city) {
        return cityMapper.insert(city);
    }
}
