package com.vito16.shop.controller;

import com.vito16.shop.common.Constants;
import com.vito16.shop.common.Page;
import com.vito16.shop.model.Picture;
import com.vito16.shop.model.Product;
import com.vito16.shop.model.User;
import com.vito16.shop.service.PictureService;
import com.vito16.shop.service.ProductService;
import com.vito16.shop.service.ShopService;
import com.vito16.shop.util.AdminUtil;
import com.vito16.shop.util.Image;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

/**
 * 管理员商品
 * @author champion
 * @version 2017/6/1
 */
@Controller
@RequestMapping(value = "/shop")
public class ShopController {

    private static final Logger logger = LoggerFactory.getLogger(ShopController.class);

    @Autowired
    private ShopService shopService;
    @Autowired
    private ProductService productService;

    @RequestMapping(value="/{shopId}",method = RequestMethod.GET)    
    public ModelAndView admin(ModelAndView model,@PathVariable Integer shopId , HttpSession session, 
    		HttpServletRequest request,HttpServletResponse response) {
        Page<Product> page = new Page<Product>(request);
        
        productService.findByShopId(page,shopId);
        model.addObject("page", page);
        model.setViewName("admin/product/productAdmin");
        return model;
    }
    @RequestMapping(value="/create",method = RequestMethod.POST)    
    public ModelAndView create(ModelAndView model, HttpSession session, 
    		HttpServletRequest request,HttpServletResponse response,@Valid User user){
    	
    	
    	
    	return model;
    }
    
    
}
