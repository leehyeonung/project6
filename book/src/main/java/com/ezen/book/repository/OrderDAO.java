package com.ezen.book.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ezen.book.domain.OrderVO;
import com.ezen.book.domain.PagingVO;



@Repository
public interface OrderDAO {



	int searchTotalCount(PagingVO pvo);



	List<OrderVO> selectBuyList(int mem_num);

	List<OrderVO> selectOrderList(int mem_num);

	


}
