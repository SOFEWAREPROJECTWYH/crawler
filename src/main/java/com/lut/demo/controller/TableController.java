package com.lut.demo.controller;

import com.github.pagehelper.PageInfo;
import com.lut.demo.bean.City;
import com.lut.demo.bean.CityExample;
import com.lut.demo.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TableController {
    @Autowired
    TableService tableService;

    @RequestMapping("/city/findAll")
    public PageInfo findAll(@RequestParam(name = "index",defaultValue = "1") Integer index, @RequestParam(name = "pagesize",defaultValue = "10")Integer pagesize){
        PageInfo pageInfo = new PageInfo(tableService.finAll(index,pagesize));
        return pageInfo;
    }
    @RequestMapping("/city/findCityById")
    public City findCityById(int id)
    {
        return tableService.findById(id);
    }
    @RequestMapping("/city/deleteCity")
    public int deleteById(int id)
    {
        int delete = tableService.delete(id);
        return delete;
    }
    @RequestMapping("/city/update")
    public int Update(City city)
    {
        System.out.println(city);
        return tableService.Update(city);
    }
    @RequestMapping("/city/insert")
    public int insert(City city)
    {
        return tableService.insert(city);
    }
}
