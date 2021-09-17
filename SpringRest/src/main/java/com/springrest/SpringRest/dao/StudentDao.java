package com.springrest.SpringRest.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.springrest.SpringRest.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{
	
	  @Query(value="select * from student s where s.user_name= :username", nativeQuery=true)
	  public List<Student> getByUserName(@Param("username") String username);
	  
	  @Modifying
	  @Query(value = "update student set is_deleted = 0 where user_id =:user_id",nativeQuery = true)
	  void softDelete(@Param("user_id")String user_id);

}
