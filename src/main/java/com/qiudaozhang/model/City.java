package com.qiudaozhang.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author 深圳邱道长
 * @since 2019/9/29
 */
@Entity
@Setter
@Getter
public class City {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy ="increment" )
    private Long id;

    private String name;


    @ManyToOne
    @JoinColumn(name = "pid")
    private Province province;
}
