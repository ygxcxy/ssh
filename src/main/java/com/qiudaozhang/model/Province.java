package com.qiudaozhang.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * @author 深圳邱道长
 * @since 2019/9/29
 */
@Entity
@Setter
@Getter
public class Province {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy ="increment" )
    private Long id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "pid")
    private Set<City> cities;


}
