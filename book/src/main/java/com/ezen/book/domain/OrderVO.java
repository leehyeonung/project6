package com.ezen.book.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class OrderVO {
	private int  order_num;
	private int  order_mem_num;
	private int  order_sta;
	private int  order_sum;
	private String  order_date;
	private String  order_add;
	private String  order_cell_num;
	private String  order_recepient;
}
