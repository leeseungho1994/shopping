package com.care.shopping.mypagedao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.care.shopping.mypagedto.MyPageDTO;

@Repository
public interface MyPageDAO {
	@Select("select * from mypage where id=#{id} and pw=#{pw}")
	public MyPageDTO loginCheck(@Param("id") String id,  @Param("pw") String pw); 
}
