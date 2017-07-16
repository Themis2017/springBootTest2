package com.njxxx.sercvices;

import com.njxxx.dao.DistrictAirDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 10195 on 2017/7/16.
 */
@Service
public class NormalService {
    @Autowired
    private DistrictAirDAO districtAirDAO;

}
