package com.vito16.shop.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Vito
 * @email zhouwentao16@gmail.com
 * @date 2013-7-9
 */
@Entity
@DynamicUpdate
@Table(name = "t_product")
public class Product implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String title;//名称
    private BigDecimal point;//价格
    private Picture masterPic;//主图
    private List<Picture> slavePic;//关联图
    private String note;//描述
    private Date createTime;//创建时间
    private String code;//商品编码
    private String model;//型号
    private Long stock;//库存
    private Shop shop;//所属商铺

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Lob
    @Column(columnDefinition = "TEXT")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Column(precision=6,scale=2)
    public BigDecimal getPoint() {
        return point;
    }

    public void setPoint(BigDecimal point) {
        this.point = point;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    @ManyToOne
    @JoinColumn
    public Picture getMasterPic() {
        return masterPic;
    }

    public void setMasterPic(Picture masterPic) {
        this.masterPic = masterPic;
    }

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public List<Picture> getSlavePic() {
        return slavePic;
    }

    public void setSlavePic(List<Picture> slavePic) {
        this.slavePic = slavePic;
    }
      
    @ManyToOne
	@JoinColumn(name="shop_id")
    public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	@Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", point=" + point +
                ", masterPic=" + masterPic +
                ", slavePic=" + slavePic +
                ", note='" + note + '\'' +
                ", createTime=" + createTime +
                ", code='" + code + '\'' +
                ", model='" + model + '\'' +
                ", stock=" + stock +
                '}';
    }
}
