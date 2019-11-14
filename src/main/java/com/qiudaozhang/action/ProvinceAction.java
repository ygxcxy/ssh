package com.qiudaozhang.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.qiudaozhang.model.City;
import com.qiudaozhang.model.Province;
import com.qiudaozhang.service.CityService;
import com.qiudaozhang.service.ProvinceService;
import lombok.Getter;
import lombok.Setter;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author 深圳邱道长
 * @since 2019/9/29
 */
@Controller
@Scope("prototype")
@Namespace("/province")
@Getter
@Setter
public class ProvinceAction extends ActionSupport implements ModelDriven<Province> {

    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private CityService cityService;


    private List<Province> provinces;

    private Province province = new Province();


    private City city  = new City();

    private Long id;

    @Action(value = "list",results = {@Result(location = "/province/list.jsp")})
    public String list(){
        provinces = provinceService.findAll();
        return SUCCESS;
    }


    @Action(value = "del",results = {@Result(type = "redirectAction",location = "list")})
    public String del(){
        provinceService.delById(province.getId());
        return SUCCESS;
    }


    @Action(value = "toAdd",results = {@Result(  location = "/province/add.jsp")})
    public String toAdd(){
        return SUCCESS;
    }


    @Action(value = "add",results = {@Result(type = "redirectAction",location = "list")})
    public String add(){
        provinceService.save(province);
        return SUCCESS;
    }

    @Action(value = "cities",results = {@Result(location = "/province/cities.jsp")})
    public String findCities(){
        province = provinceService.findById(province.getId());
        return SUCCESS;
    }


    @Action(value = "addCity",results = {@Result(type = "redirectAction",location = "list")})
    public String addCity(){
        cityService.save(city);
        return SUCCESS;
    }


    @Override
    public Province getModel() {
        return province;
    }
}
