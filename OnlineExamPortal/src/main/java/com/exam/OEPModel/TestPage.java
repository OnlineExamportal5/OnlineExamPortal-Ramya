
  package com.exam.OEPModel;
  
  import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;
  
  
  @Entity
  
  @Table(name="Tests")
  public class TestPage implements Serializable
  {
	  private static final long serialVersionUID=1L;
  
  @Id
  
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int TestId;
  
 // @NotNull(message="coursetype cannot be null")
 // @Column(name="COURSE_TYPE")
  private String courseType;
  
  @ManyToOne
  @JoinColumn(name="user_Id") 
  private User user;
  
  public int getTestId() { return TestId; }
  
  public void setTestId(int testId) { this.TestId = testId; }
  
  public String getCourseType() { return courseType; }
  
  public void setCourseType(String courseType) { this.courseType = courseType; }
  
  public User getUser() { return user; }
  
  public void setUser(User user) { this.user = user; }
  
  
  
  public TestPage() {
	super();
}
  

public TestPage(String courseType) {
	super();
	this.courseType = courseType;
}

@Override public String toString() { return "Test [TestId=" + TestId +
  ", courseType=" + courseType + ", user=" + user + "]"; }
  
  
 }
 