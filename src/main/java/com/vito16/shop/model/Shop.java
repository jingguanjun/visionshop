package com.vito16.shop.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author championjing@163.com
 * @date 2013-7-9
 */
@Entity
@Table(name = "t_shop")
public class Shop implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;//名称
    private Picture masterPic;//主图
    private String note;//描述
    private Date createTime;//创建时间
    private String region;
    private List<Product> prodects;//店铺的商品
	private User user;//店主

    public Shop(){
    	
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
       
    @OneToMany(mappedBy="shop")
    public List<Product> getProdects() {
		return prodects;
	}

	public void setProdects(List<Product> prodects) {
		this.prodects = prodects;
	}

	@Lob
    @Column(columnDefinition = "TEXT")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    
//
//    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    public List<Picture> getSlavePic() {
//        return slavePic;
//    }
//
//    public void setSlavePic(List<Picture> slavePic) {
//        this.slavePic = slavePic;
//    }
    @ManyToOne
    @JoinColumn
    public Picture getMasterPic() {
		return masterPic;
	}

	public void setMasterPic(Picture masterPic) {
		this.masterPic = masterPic;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
		
	@ManyToOne
	@JoinColumn(name="user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
    public String toString() {
        return "Product{" +
                "id=" + id +               
                ", masterPic=" + masterPic +
                ", note='" + note + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
