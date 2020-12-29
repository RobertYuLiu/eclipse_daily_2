package com.masotti.web.service;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;

import com.masotti.web.bean.City;
import com.masotti.web.dao.ICityDao;

@ManagedBean
public class CityService implements ICityService {
    
    @Inject
    private ICityDao cityDao;
    
    @Override
    public List<City> getCities() {

        return cityDao.findAll();
    }
}