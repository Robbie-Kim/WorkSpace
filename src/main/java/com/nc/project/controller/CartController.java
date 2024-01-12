package com.nc.project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    // 장바구니 페이지 이동
    @GetMapping("/mycart")
    public ModelAndView getCartList () {
        ModelAndView mav = new ModelAndView();


        mav.setViewName("cart/getCart.html");

        return mav;
    }

    // 장바구니 페이지에서 배송지 변경 이동
    @GetMapping("/change-addr")
    public ModelAndView changeAddr() {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("cart/changeAddr.html");

        return mav;
    }

    // 장바구니에 물건 추가 시 장바구니 화면에 전시
//    @PostMapping("/add-cart")
//    public

    // 배송지 변경 페이지에서 배송지 변경 기능




    // 장바구니에 물건 삭제

    //

}
