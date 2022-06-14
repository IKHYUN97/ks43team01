package ks43team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ks43team01.dto.SellerBusiness;
import ks43team01.dto.User;
import ks43team01.dto.goodsSubCategory;
import ks43team01.dto.goodsTopCategory;



@Mapper
public interface UserMapper {
	
	//회원가입//	
	public int addUserInsert(User user);

	//판매자 비지니스 탑카테고리//
	public List<goodsTopCategory> getTopCategory();
	
	//판매자 비지니스 서브카테고리//
	public List<goodsSubCategory> getSubCategory(String topCategory);
	
	//로그인을위한아이디조회///
	public User getUserInfoById(String userId);
	
	//판매자으 기술분야, 스킬 , 자기소개 입력///
	public int addSellerBusiness(SellerBusiness sellerBusiness);
		
}
