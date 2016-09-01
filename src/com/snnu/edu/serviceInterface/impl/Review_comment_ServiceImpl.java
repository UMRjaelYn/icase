package com.snnu.edu.serviceInterface.impl;

import java.util.List;

import com.snnu.edu.dao.BaseDao;
import com.snnu.edu.entity.Review_Comment;

@SuppressWarnings("unchecked")
public class Review_comment_ServiceImpl {

	public   boolean saveOrUpdateUsers(Review_Comment review_comment){
		try {
			BaseDao.saveOrUpdateObj(review_comment);
			return true;
		} catch (Exception e) {
			e.printStackTrace();			
		}		
		return false;
		
	}
	
	public  boolean delUserInfo(Review_Comment review_comment){
		try {
			BaseDao.deleteObj(review_comment);
			return true;
		} catch (Exception e) {
			e.printStackTrace();		
		}		
		return false;		
	}
	
	public  Review_Comment getUserById(String id){
		return (Review_Comment)BaseDao.getObject("from Review_Comment where id='"+id+"'");
	}
		
	public  List<Review_Comment>findWithPage(){
		return (List<Review_Comment>)BaseDao.findWithPage("from Review_Comment ");
	} 

}
