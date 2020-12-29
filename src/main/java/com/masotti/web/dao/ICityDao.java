package com.masotti.web.dao;
import java.util.List;

import com.masotti.web.bean.City;

public interface ICityDao {
    
    public List<City> findAll();
}